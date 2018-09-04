package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterpacks.base.ArrayLengthFilter;
import java.lang.reflect.Array;

/* compiled from: PG */
public final class ArraySelectFilter extends Filter {
    public Object mDefaultValue = null;
    public int mIndex = 0;

    public ArraySelectFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort(ArrayLengthFilter.INPUT_PORT_ARRAY, 2, FrameType.array()).addInputPort("index", 1, FrameType.single(Integer.TYPE)).addInputPort("defaultValue", 1, FrameType.single()).addOutputPort("element", 2, FrameType.single()).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("index")) {
            inputPort.bindToFieldNamed("mIndex");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("defaultValue")) {
            inputPort.bindToFieldNamed("mDefaultValue");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onProcess() {
        InputPort connectedInputPort = getConnectedInputPort(ArrayLengthFilter.INPUT_PORT_ARRAY);
        OutputPort connectedOutputPort = getConnectedOutputPort("element");
        Object values = connectedInputPort.pullFrame().asFrameValues().getValues();
        int length = Array.getLength(values);
        int i = this.mIndex;
        if (length <= i) {
            values = this.mDefaultValue;
        } else {
            values = Array.get(values, i);
        }
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(values);
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
