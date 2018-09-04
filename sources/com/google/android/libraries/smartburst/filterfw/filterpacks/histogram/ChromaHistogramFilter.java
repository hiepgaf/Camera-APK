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
import com.google.android.libraries.smartburst.filterpacks.image.HSVHistogramAnalysisFilter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
public final class ChromaHistogramFilter extends Filter {
    public int mHueBins = 6;
    public int mSaturationBins = 3;

    public ChromaHistogramFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final int getSchedulePriority() {
        return 25;
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 1);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("huebins", 1, FrameType.single(Integer.TYPE)).addInputPort("saturationbins", 1, FrameType.single(Integer.TYPE)).addOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES, 2, FrameType.buffer2D(200)).disallowOtherPorts();
    }

    public final void onInputPortAttached(InputPort inputPort) {
        if (inputPort.getName().equals("huebins")) {
            inputPort.bindToFieldNamed("mHueBins");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("saturationbins")) {
            inputPort.bindToFieldNamed("mSaturationBins");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onProcess() {
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        OutputPort connectedOutputPort = getConnectedOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES);
        Frame asFrameBuffer2D = connectedOutputPort.fetchAvailableFrame(new int[]{this.mHueBins, this.mSaturationBins}).asFrameBuffer2D();
        ByteBuffer lockBytes = asFrameBuffer2D.lockBytes(1);
        lockBytes.order(ByteOrder.nativeOrder());
        Histograms.extractHueSatHistogram(asFrameImage2D, this.mHueBins, this.mSaturationBins, lockBytes.asFloatBuffer());
        asFrameBuffer2D.unlock();
        connectedOutputPort.pushFrame(asFrameBuffer2D);
    }
}
