package com.google.android.libraries.smartburst.filterfw.filterpacks.transform;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;

/* compiled from: PG */
public class RotateFilter extends Filter {
    public float mRotateAngle = 0.0f;
    public ImageShader mShader;
    public Quad mSourceRect = Quad.fromRect(0.0f, 0.0f, 1.0f, 1.0f);

    public RotateFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("rotateAngle", 2, FrameType.single(Float.TYPE)).addInputPort("sourceRect", 1, FrameType.single(Quad.class)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("rotateAngle")) {
            inputPort.bindToFieldNamed("mRotateAngle");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("sourceRect")) {
            inputPort.bindToFieldNamed("mSourceRect");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mShader = ImageShader.createIdentity();
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        this.mShader.setSourceQuad(this.mSourceRect);
        this.mShader.setTargetQuad(this.mSourceRect.rotated((float) (((double) (this.mRotateAngle / 180.0f)) * 3.141592653589793d)));
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
