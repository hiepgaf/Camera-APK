package com.google.android.libraries.smartburst.filterfw.filterpacks.performance;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class ThroughputFilter extends Filter {
    public long mLastTime = 0;
    public int mPeriod = 3;
    public int mPeriodFrameCount = 0;
    public int mTotalFrameCount = 0;

    public ThroughputFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("frame", 2, FrameType.any()).addOutputPort("throughput", 2, FrameType.single(Throughput.class)).addOutputPort("frame", 2, FrameType.any()).addInputPort("period", 1, FrameType.single(Integer.TYPE)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("period")) {
            inputPort.bindToFieldNamed("mPeriod");
        } else {
            inputPort.attachToOutputPort(getConnectedOutputPort("frame"));
        }
    }

    protected void onOpen() {
        this.mTotalFrameCount = 0;
        this.mPeriodFrameCount = 0;
        this.mLastTime = 0;
    }

    protected synchronized void onProcess() {
        Frame pullFrame = getConnectedInputPort("frame").pullFrame();
        this.mTotalFrameCount++;
        this.mPeriodFrameCount++;
        if (this.mLastTime == 0) {
            this.mLastTime = SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.mLastTime >= ((long) (this.mPeriod * 1000))) {
            Log.i("Thru", "It is time!");
            OutputPort connectedOutputPort = getConnectedOutputPort("throughput");
            Throughput throughput = new Throughput(this.mTotalFrameCount, this.mPeriodFrameCount, elapsedRealtime - this.mLastTime, pullFrame.getElementCount());
            Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(throughput);
            connectedOutputPort.pushFrame(asFrameValue);
            this.mLastTime = elapsedRealtime;
            this.mPeriodFrameCount = 0;
        }
        getConnectedOutputPort("frame").pushFrame(pullFrame);
    }
}
