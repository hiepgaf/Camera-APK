package com.google.android.libraries.smartburst.filterfw.filterpacks.histogram;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.imageutils.Histograms;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
public final class LumaChromaHistogramFilter extends Filter {
    public int mHueBins = 6;
    public int mSaturationBins = 3;
    public int mSaturationThreshold = 26;
    public int mValueThreshold = 51;

    public LumaChromaHistogramFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 1);
        FrameType buffer2D = FrameType.buffer2D(200);
        FrameType buffer1D = FrameType.buffer1D(200);
        FrameType single = FrameType.single(Integer.TYPE);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("huebins", 1, single).addInputPort("saturationbins", 1, single).addInputPort("saturationthreshold", 1, FrameType.single(Integer.TYPE)).addInputPort("valuethreshold", 1, single).addOutputPort("huesat", 2, buffer2D).addOutputPort("value", 2, buffer1D).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("huebins")) {
            inputPort.bindToFieldNamed("mHueBins");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("saturationbins")) {
            inputPort.bindToFieldNamed("mSaturationBins");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("saturationthreshold")) {
            inputPort.bindToFieldNamed("mSaturationThreshold");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("valuethreshold")) {
            inputPort.bindToFieldNamed("mValueThreshold");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onProcess() {
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        OutputPort connectedOutputPort = getConnectedOutputPort("huesat");
        OutputPort connectedOutputPort2 = getConnectedOutputPort("value");
        int[] iArr = new int[]{this.mHueBins};
        Frame asFrameBuffer2D = connectedOutputPort.fetchAvailableFrame(new int[]{this.mHueBins, this.mSaturationBins}).asFrameBuffer2D();
        Frame asFrameBuffer1D = connectedOutputPort2.fetchAvailableFrame(iArr).asFrameBuffer1D();
        ByteBuffer lockBytes = asFrameBuffer2D.lockBytes(2);
        ByteBuffer lockBytes2 = asFrameBuffer1D.lockBytes(2);
        lockBytes.order(ByteOrder.nativeOrder());
        lockBytes2.order(ByteOrder.nativeOrder());
        Histograms.extractHueSatValueHistogram(asFrameImage2D, this.mHueBins, this.mSaturationBins, r3, this.mSaturationThreshold, this.mValueThreshold, lockBytes.asFloatBuffer(), lockBytes2.asFloatBuffer());
        asFrameBuffer2D.unlock();
        asFrameBuffer1D.unlock();
        connectedOutputPort.pushFrame(asFrameBuffer2D);
        connectedOutputPort2.pushFrame(asFrameBuffer1D);
    }
}
