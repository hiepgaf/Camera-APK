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
import java.nio.IntBuffer;

/* compiled from: PG */
public final class GrayHistogramFilter extends Filter {
    public boolean mHasMask = false;
    public int mNumBins = 50;

    public GrayHistogramFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 1);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("mask", 1, image2D).addInputPort("binsize", 1, FrameType.array(Integer.TYPE)).addOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES, 2, FrameType.array(Integer.TYPE)).disallowOtherPorts();
    }

    public final void onInputPortAttached(InputPort inputPort) {
        if (inputPort.getName().equals("mask")) {
            this.mHasMask = true;
        } else if (inputPort.getName().equals("binsize")) {
            inputPort.bindToFieldNamed("mNumBins");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onProcess() {
        FrameImage2D asFrameImage2D;
        FrameImage2D asFrameImage2D2 = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        if (this.mHasMask) {
            asFrameImage2D = getConnectedInputPort("mask").pullFrame().asFrameImage2D();
        } else {
            asFrameImage2D = null;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.mNumBins << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        if (this.mHasMask) {
            Histograms.extractGrayHistogramWithMask(asFrameImage2D2, asFrameImage2D, asIntBuffer);
        } else {
            Histograms.extractGrayHistogram(asFrameImage2D2, asIntBuffer);
        }
        asIntBuffer.rewind();
        Object obj = new int[this.mNumBins];
        for (int i = 0; i < this.mNumBins; i++) {
            obj[i] = asIntBuffer.get();
        }
        OutputPort connectedOutputPort = getConnectedOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES);
        Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(null).asFrameValues();
        asFrameValues.setValue(obj);
        connectedOutputPort.pushFrame(asFrameValues);
    }
}
