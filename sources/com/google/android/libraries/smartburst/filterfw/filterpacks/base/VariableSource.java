package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class VariableSource extends Filter {
    public OutputPort mOutputPort = null;
    public Object mValue = null;

    public VariableSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addOutputPort("value", 2, FrameType.single()).disallowOtherPorts();
    }

    public final synchronized Object getValue() {
        return this.mValue;
    }

    protected final void onPrepare() {
        this.mOutputPort = getConnectedOutputPort("value");
    }

    protected final synchronized void onProcess() {
        Frame asFrameValue = this.mOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(this.mValue);
        this.mOutputPort.pushFrame(asFrameValue);
    }

    public final synchronized void setValue(Object obj) {
        this.mValue = obj;
    }
}
