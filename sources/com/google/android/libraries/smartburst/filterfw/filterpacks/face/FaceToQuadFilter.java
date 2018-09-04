package com.google.android.libraries.smartburst.filterfw.filterpacks.face;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.PointF;
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
public final class FaceToQuadFilter extends Filter {
    public float mScale = 2.0f;

    public FaceToQuadFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    @SuppressLint({"FloatMath"})
    private static float distancePointLine(PointF pointF, PointF pointF2, PointF pointF3) {
        return Math.abs(((pointF2.x - pointF.x) * (pointF.y - pointF3.y)) - ((pointF.x - pointF3.x) * (pointF2.y - pointF.y))) / ((float) Math.sqrt((double) (((pointF2.x - pointF.x) * (pointF2.x - pointF.x)) + ((pointF2.y - pointF.y) * (pointF2.y - pointF.y)))));
    }

    private final Quad faceToQuad(Face face) {
        PointF pointF = new PointF((((float) face.leftEye.x) / 2000.0f) + 0.5f, (((float) face.leftEye.y) / 2000.0f) + 0.5f);
        PointF pointF2 = new PointF((((float) face.rightEye.x) / 2000.0f) + 0.5f, (((float) face.rightEye.y) / 2000.0f) + 0.5f);
        return Quad.fromLineAndHeight(pointF, pointF2, distancePointLine(pointF, pointF2, new PointF((((float) face.mouth.x) / 2000.0f) + 0.5f, (((float) face.mouth.y) / 2000.0f) + 0.5f))).grow(this.mScale);
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
        Object obj = new Quad[faceArr.length];
        for (int i = 0; i < obj.length; i++) {
            obj[i] = faceToQuad(faceArr[i]);
        }
        OutputPort connectedOutputPort = getConnectedOutputPort("quads");
        Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(new int[]{faceArr.length}).asFrameValues();
        asFrameValues.setValues(obj);
        connectedOutputPort.pushFrame(asFrameValues);
    }
}
