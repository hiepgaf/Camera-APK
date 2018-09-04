package com.google.android.libraries.smartburst.filterfw.filterpacks.face;

import android.annotation.TargetApi;
import android.graphics.RectF;
import android.hardware.Camera.Face;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;

@TargetApi(14)
/* compiled from: PG */
public final class FaceToRectFilter extends Filter {
    public float mScale = 1.0f;

    public FaceToRectFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private final Quad faceRectToQuad(Face face) {
        RectF rectF = new RectF(face.rect);
        rectF.left = (rectF.left / 2000.0f) + 0.5f;
        rectF.right = (rectF.right / 2000.0f) + 0.5f;
        rectF.top = (rectF.top / 2000.0f) + 0.5f;
        rectF.bottom = (rectF.bottom / 2000.0f) + 0.5f;
        return Quad.fromRect(rectF).grow(this.mScale);
    }

    public final Signature getSignature() {
        FrameType array = FrameType.array(Face.class);
        return new Signature().addInputPort("faces", 2, array).addInputPort("scale", 1, FrameType.single(Float.TYPE)).addOutputPort("quads", 2, FrameType.array(Quad.class)).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("scale")) {
            inputPort.bindToFieldNamed("mScale");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onProcess() {
        Face[] faceArr = (Face[]) getConnectedInputPort("faces").pullFrame().asFrameValues().getValues();
        if (faceArr == null) {
            faceArr = new Face[0];
        }
        Object obj = new Quad[faceArr.length];
        for (int i = 0; i < obj.length; i++) {
            obj[i] = faceRectToQuad(faceArr[i]);
        }
        OutputPort connectedOutputPort = getConnectedOutputPort("quads");
        Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(new int[]{faceArr.length}).asFrameValues();
        asFrameValues.setValues(obj);
        connectedOutputPort.pushFrame(asFrameValues);
    }
}
