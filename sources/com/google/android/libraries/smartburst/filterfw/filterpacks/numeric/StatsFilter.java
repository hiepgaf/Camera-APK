package com.google.android.libraries.smartburst.filterfw.filterpacks.numeric;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterfw.imageutils.RegionStatsCalculator;
import com.google.android.libraries.smartburst.filterfw.imageutils.RegionStatsCalculator.Statistics;

/* compiled from: PG */
public class StatsFilter extends Filter {
    public Quad mCropRect = Quad.fromRect(0.0f, 0.0f, 1.0f, 1.0f);
    public RegionStatsCalculator mRegionStatsCalculator;
    public boolean mSuppressZero = false;

    public StatsFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType buffer2D = FrameType.buffer2D(100);
        FrameType single = FrameType.single(Float.TYPE);
        return new Signature().addInputPort("buffer", 2, buffer2D).addInputPort("cropRect", 1, FrameType.single(Quad.class)).addInputPort("suppressZero", 1, FrameType.single(Boolean.TYPE)).addOutputPort("mean", 1, single).addOutputPort("stdev", 1, single).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("cropRect")) {
            inputPort.bindToFieldNamed("mCropRect");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals("suppressZero")) {
            inputPort.bindToFieldNamed("mSuppressZero");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        super.onPrepare();
        this.mRegionStatsCalculator = new RegionStatsCalculator();
    }

    protected void onProcess() {
        Statistics calcMeanAndStd = this.mRegionStatsCalculator.calcMeanAndStd(getConnectedInputPort("buffer").pullFrame().asFrameBuffer2D(), this.mCropRect, this.mSuppressZero);
        OutputPort connectedOutputPort = getConnectedOutputPort("mean");
        if (connectedOutputPort != null) {
            Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(Float.valueOf(calcMeanAndStd.mean));
            connectedOutputPort.pushFrame(asFrameValue);
        }
        connectedOutputPort = getConnectedOutputPort("stdev");
        if (connectedOutputPort != null) {
            asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
            asFrameValue.setValue(Float.valueOf(calcMeanAndStd.stdDev));
            connectedOutputPort.pushFrame(asFrameValue);
        }
    }
}
