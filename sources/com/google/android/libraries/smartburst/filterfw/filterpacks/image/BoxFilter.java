package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.imageutils.FastBoxBlur;

/* compiled from: PG */
public class BoxFilter extends Filter {
    public FastBoxBlur mBoxBlurOperator;
    public int mFilterHeight;
    public int mFilterWidth;

    public BoxFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("filterWidth", 2, FrameType.single(Integer.TYPE)).addInputPort("filterHeight", 2, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("filterWidth")) {
            inputPort.bindToFieldNamed("mFilterWidth");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals("filterHeight")) {
            inputPort.bindToFieldNamed("mFilterHeight");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mFilterWidth |= 1;
        this.mFilterHeight |= 1;
        this.mBoxBlurOperator = new FastBoxBlur(isOpenGLSupported(), this.mFilterWidth, this.mFilterHeight);
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        if (this.mFilterHeight > asFrameImage2D.getHeight() || this.mFilterWidth > asFrameImage2D.getWidth()) {
            throw new UnsupportedOperationException("Can not apply a box filter that is largerthan the original image!");
        }
        this.mBoxBlurOperator.computeBlur(asFrameImage2D, asFrameImage2D2);
        if (asFrameImage2D2 != null) {
            connectedOutputPort.pushFrame(asFrameImage2D2);
        }
    }
}
