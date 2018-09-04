package com.google.android.libraries.smartburst.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class TimestampFilter extends Filter {
    public static final String INPUT_PORT_FRAME = "frame";
    public static final String OUTPUT_PORT_TIMESTAMP = "timestamp";
    public long mBaseTimeStampValue = -1;

    public TimestampFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addOutputPort("timestamp", 2, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    protected void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        OutputPort connectedOutputPort = getConnectedOutputPort("timestamp");
        if (this.mBaseTimeStampValue < 0) {
            this.mBaseTimeStampValue = pullFrame.getTimestamp();
        }
        long timestamp = pullFrame.getTimestamp();
        long j = this.mBaseTimeStampValue;
        pullFrame = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        pullFrame.setValue(Float.valueOf(((float) (timestamp - j)) / 1000000.0f));
        connectedOutputPort.pushFrame(pullFrame);
    }
}
