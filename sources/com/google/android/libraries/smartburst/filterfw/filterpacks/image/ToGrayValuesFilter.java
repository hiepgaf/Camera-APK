package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.imageutils.GrayValuesExtractor;

/* compiled from: PG */
public class ToGrayValuesFilter extends Filter {
    public GrayValuesExtractor mGrayValuesExtractor;

    public ToGrayValuesFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2)).addOutputPort("image", 2, FrameType.buffer2D(100)).disallowOtherPorts();
    }

    protected void onPrepare() {
        this.mGrayValuesExtractor = new GrayValuesExtractor(isOpenGLSupported());
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        FrameBuffer2D asFrameBuffer2D = connectedOutputPort.fetchAvailableFrame(this.mGrayValuesExtractor.getOutputFrameDimensions(asFrameImage2D.getDimensions())).asFrameBuffer2D();
        this.mGrayValuesExtractor.toGrayValues(asFrameImage2D, asFrameBuffer2D);
        connectedOutputPort.pushFrame(asFrameBuffer2D);
    }
}
