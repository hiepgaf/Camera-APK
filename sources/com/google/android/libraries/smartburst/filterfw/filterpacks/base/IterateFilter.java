package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterpacks.base.ArrayLengthFilter;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map.Entry;

/* compiled from: PG */
public class IterateFilter extends MetaFilter {
    public int mIndex = 0;
    public int mInputArraySize = 0;
    public Object mInputsArray = null;
    public HashMap mOutputs = new HashMap();

    public IterateFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected void assignInputs() {
        this.mCurrentGraph = this.mGraphProvider.getFilterGraph(this.mInputFrames);
        for (Entry entry : this.mInputFrames.entrySet()) {
            GraphInputSource graphInput;
            Object obj;
            Frame create;
            if (((String) entry.getKey()).equals(ArrayLengthFilter.INPUT_PORT_ARRAY)) {
                if (this.mInputsArray == null) {
                    initializeInputsAndOutputs(((Frame) entry.getValue()).asFrameValues().getValues());
                }
                if (this.mInputArraySize > 0) {
                    graphInput = this.mCurrentGraph.getGraphInput("elem");
                    obj = Array.get(this.mInputsArray, this.mIndex);
                    create = Frame.create(FrameType.single(), null);
                    create.asFrameValue().setValue(obj);
                    obj = 1;
                } else {
                    obj = null;
                    create = null;
                    graphInput = null;
                }
            } else {
                graphInput = this.mCurrentGraph.getGraphInput((String) entry.getKey());
                create = (Frame) entry.getValue();
                obj = null;
            }
            if (create != null) {
                if (graphInput == null) {
                    String str = (String) entry.getKey();
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 67);
                    stringBuilder.append("Input port '");
                    stringBuilder.append(str);
                    stringBuilder.append("' could not be mapped to any input in the filter graph!");
                    throw new RuntimeException(stringBuilder.toString());
                }
                graphInput.pushFrame(create);
                if (obj != null) {
                    create.release();
                }
            }
        }
    }

    protected void assignOutputs() {
        for (OutputPort name : getConnectedOutputPorts()) {
            String name2 = name.getName();
            GraphOutputTarget graphOutput = this.mCurrentGraph.getGraphOutput(name2);
            Frame pullFrame = graphOutput.pullFrame();
            if (pullFrame == null) {
                name2 = graphOutput.getName();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(name2).length() + 23);
                stringBuilder.append("Output '");
                stringBuilder.append(name2);
                stringBuilder.append("' has no frame!");
                Log.w("IterateFilter", stringBuilder.toString());
            } else {
                setOutputForPortAtIndex(pullFrame.asFrameValue().getValue(), name2, this.mIndex);
                pullFrame.release();
            }
        }
        this.mIndex++;
    }

    protected void clearInputs() {
        for (Frame release : this.mInputFrames.values()) {
            release.release();
        }
        this.mInputFrames.clear();
    }

    public Signature getSignature() {
        return new Signature().addInputPort(ArrayLengthFilter.INPUT_PORT_ARRAY, 2, FrameType.array());
    }

    private void initializeInputsAndOutputs(Object obj) {
        this.mInputsArray = obj;
        this.mIndex = 0;
        this.mInputArraySize = Array.getLength(this.mInputsArray);
        this.mOutputs.clear();
    }

    protected void onProcess() {
        if (this.mState.state == 0) {
            this.mInputsArray = null;
            pullInputs();
            if (this.mInputArraySize > 0) {
                processGraph();
            } else {
                pushOutputs();
            }
        } else if (this.mState.state == 2) {
            assignOutputs();
            if (this.mIndex < this.mInputArraySize) {
                assignInputs();
                processGraph();
                return;
            }
            pushOutputs();
        }
    }

    protected void pullInputs() {
        clearInputs();
        for (InputPort inputPort : getConnectedInputPorts()) {
            this.mInputFrames.put(inputPort.getName(), inputPort.pullFrame().retain());
        }
        assignInputs();
    }

    protected void pushOutputs() {
        for (OutputPort outputPort : getConnectedOutputPorts()) {
            Object obj = this.mOutputs.get(outputPort.getName());
            if (obj != null) {
                Frame create = Frame.create(FrameType.array(), new int[]{this.mInputArraySize});
                create.asFrameValues().setValues(obj);
                outputPort.pushFrame(create);
                create.release();
            }
        }
        this.mState.state = 0;
    }

    private void setOutputForPortAtIndex(Object obj, String str, int i) {
        Object obj2 = this.mOutputs.get(str);
        if (obj2 == null) {
            obj2 = Array.newInstance(obj.getClass(), this.mInputArraySize);
            this.mOutputs.put(str, obj2);
        }
        Array.set(obj2, i, obj);
    }
}
