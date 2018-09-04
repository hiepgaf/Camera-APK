package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.imageutils.SobelOperator;

/* compiled from: PG */
public class SobelFilter extends Filter {
    public SobelOperator mSobelOperator;

    public SobelFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        FrameType image2D2 = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16);
        return new Signature().addInputPort("image", 2, image2D).addOutputPort("gradientX", 1, image2D2).addOutputPort("gradientY", 1, image2D2).addOutputPort("direction", 1, image2D2).addOutputPort("magnitude", 1, image2D2).disallowOtherPorts();
    }

    protected void onPrepare() {
        this.mSobelOperator = new SobelOperator(isOpenGLSupported());
    }

    protected void onProcess() {
        Frame asFrameImage2D;
        Frame asFrameImage2D2;
        Frame asFrameImage2D3;
        Frame frame = null;
        OutputPort connectedOutputPort = getConnectedOutputPort("gradientX");
        OutputPort connectedOutputPort2 = getConnectedOutputPort("gradientY");
        OutputPort connectedOutputPort3 = getConnectedOutputPort("magnitude");
        OutputPort connectedOutputPort4 = getConnectedOutputPort("direction");
        FrameImage2D asFrameImage2D4 = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D4.getDimensions();
        if (connectedOutputPort3 != null) {
            asFrameImage2D = connectedOutputPort3.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D = null;
        }
        if (connectedOutputPort4 != null) {
            asFrameImage2D2 = connectedOutputPort4.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D2 = null;
        }
        if (connectedOutputPort != null) {
            asFrameImage2D3 = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        } else {
            asFrameImage2D3 = null;
        }
        if (connectedOutputPort2 != null) {
            frame = connectedOutputPort2.fetchAvailableFrame(dimensions).asFrameImage2D();
        }
        this.mSobelOperator.calculate(asFrameImage2D4, asFrameImage2D3, frame, asFrameImage2D, asFrameImage2D2);
        if (asFrameImage2D != null) {
            connectedOutputPort3.pushFrame(asFrameImage2D);
        }
        if (asFrameImage2D2 != null) {
            connectedOutputPort4.pushFrame(asFrameImage2D2);
        }
        if (connectedOutputPort != null) {
            connectedOutputPort.pushFrame(asFrameImage2D3);
        }
        if (connectedOutputPort2 != null) {
            connectedOutputPort2.pushFrame(frame);
        }
    }
}
