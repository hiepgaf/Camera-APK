package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Listener;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import java.util.HashMap;

/* compiled from: PG */
public class DispatchFilter extends MetaFilter {
    public HashMap mOutputFrames = null;
    public Listener mRunListener = new C01481();
    public GraphRunner mRunner;

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.base.DispatchFilter$1 */
    class C01481 implements Listener {
        C01481() {
        }

        public void onGraphRunnerError(Exception exception, boolean z) {
            throw new RuntimeException("Error during dispatched run!", exception);
        }

        public void onGraphRunnerStopped(GraphRunner graphRunner) {
            synchronized (DispatchFilter.this.mState) {
                DispatchFilter dispatchFilter = DispatchFilter.this;
                if (dispatchFilter.mState.state == 1) {
                    dispatchFilter.mState.state = 2;
                }
            }
        }
    }

    public DispatchFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected void assignInput(GraphInputSource graphInputSource, Frame frame) {
        graphInputSource.pushFrame(frame);
        frame.release();
    }

    private void ignoreInputs() {
        for (InputPort pullFrame : getConnectedInputPorts()) {
            pullFrame.pullFrame();
        }
    }

    protected void onClose() {
        super.onClose();
        this.mOutputFrames = null;
    }

    protected void onPrepare() {
        this.mRunner = new GraphRunner(getContext());
        this.mRunner.setListener(this.mRunListener);
    }

    protected void onProcess() {
        synchronized (this.mState) {
            if (this.mState.state == 0) {
                pullInputs();
                processGraph();
            } else {
                ignoreInputs();
            }
            if (this.mState.state == 2) {
                pushOutputs();
            }
            if (this.mState.state == 1) {
                pushSavedOutputs();
            }
        }
    }

    protected void processGraph() {
        this.mState.state = 1;
        HashMap hashMap = this.mOutputFrames;
        this.mCurrentGraph.attachToRunner(this.mRunner);
        this.mRunner.start(this.mCurrentGraph);
        if (hashMap == null) {
            this.mRunner.waitUntilStop();
            this.mState.state = 2;
        }
    }

    protected void pullInputs() {
        this.mInputFrames.clear();
        FrameManager frameManager = this.mRunner.getFrameManager();
        for (InputPort inputPort : getConnectedInputPorts()) {
            this.mInputFrames.put(inputPort.getName(), frameManager.importFrame(inputPort.pullFrame()));
        }
        assignInputs();
    }

    protected void pushOutput(Frame frame, OutputPort outputPort) {
        Frame importFrame = getFrameManager().importFrame(frame);
        outputPort.pushFrame(importFrame);
        saveOutput(outputPort.getName(), importFrame);
    }

    private void pushSavedOutputs() {
        for (OutputPort outputPort : getConnectedOutputPorts()) {
            Frame frame = (Frame) this.mOutputFrames.get(outputPort.getName());
            if (frame != null) {
                outputPort.pushFrame(frame);
            } else {
                String valueOf = String.valueOf(outputPort);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                stringBuilder.append("No output frame produced for ");
                stringBuilder.append(valueOf);
                stringBuilder.append("!");
                Log.w("DF", stringBuilder.toString());
            }
        }
    }

    private void saveOutput(String str, Frame frame) {
        if (this.mOutputFrames == null) {
            this.mOutputFrames = new HashMap();
        }
        Frame frame2 = (Frame) this.mOutputFrames.get(str);
        if (frame2 != null) {
            frame2.release();
        }
        this.mOutputFrames.put(str, frame.retain());
    }

    protected boolean schedulePolicy() {
        return inSchedulableState() && inputConditionsMet() && outputConditionsMet();
    }
}
