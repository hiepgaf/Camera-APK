package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class CountLimitFilter extends Filter {
    public int mCount = 0;
    public int mMaxCount = 1;

    public CountLimitFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addInputPort("maxCount", 1, FrameType.single(Integer.TYPE)).addOutputPort("frame", 2, FrameType.any()).disallowOtherPorts();
    }

    protected final void onClose() {
        this.mCount = 0;
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("maxCount")) {
            inputPort.bindToFieldNamed("mMaxCount");
            inputPort.setAutoPullEnabled(true);
            return;
        }
        inputPort.attachToOutputPort(getConnectedOutputPort("frame"));
    }

    protected final void onOpen() {
        this.mCount = 0;
    }

    protected final synchronized void onProcess() {
        if (this.mCount < this.mMaxCount) {
            getConnectedOutputPort("frame").pushFrame(getConnectedInputPort("frame").pullFrame());
        }
        this.mCount++;
        if (this.mCount == this.mMaxCount) {
            requestClose();
        }
    }

    public final synchronized void setMaxCount(int i) {
        this.mMaxCount = i;
    }
}
