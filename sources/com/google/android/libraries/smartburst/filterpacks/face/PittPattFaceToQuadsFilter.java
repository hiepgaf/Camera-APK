package com.google.android.libraries.smartburst.filterpacks.face;

import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.app.NotificationManagerCompat;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValues;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.vision.face.Face;

/* compiled from: PG */
public class PittPattFaceToQuadsFilter extends Filter {
    public static final Rect CAMERA_FACE_RECT_BOUNDS = new Rect(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000, 1000);
    public static final String INPUT_PORT_FACES = "faces";
    public static final String INPUT_PORT_IMAGE_DIMENSIONS = "imageDimensions";
    public static final String INPUT_PORT_SCALE = "scale";
    public static final String OUTPUT_PORT_FACE_CAMERA_QUADS = "cameraFaceQuads";
    public static final String OUTPUT_PORT_NORMALIZED_FACE_QUADS = "normalizedFaceQuads";
    public float mScale = 2.0f;

    public PittPattFaceToQuadsFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private Quad convertToCameraQuads(Quad quad) {
        RectF enclosingRectF = quad.getEnclosingRectF();
        enclosingRectF.left = (enclosingRectF.left * ((float) CAMERA_FACE_RECT_BOUNDS.width())) + ((float) CAMERA_FACE_RECT_BOUNDS.left);
        enclosingRectF.right = (enclosingRectF.right * ((float) CAMERA_FACE_RECT_BOUNDS.width())) + ((float) CAMERA_FACE_RECT_BOUNDS.left);
        enclosingRectF.top = (enclosingRectF.top * ((float) CAMERA_FACE_RECT_BOUNDS.height())) + ((float) CAMERA_FACE_RECT_BOUNDS.top);
        enclosingRectF.bottom = (enclosingRectF.bottom * ((float) CAMERA_FACE_RECT_BOUNDS.height())) + ((float) CAMERA_FACE_RECT_BOUNDS.top);
        return Quad.fromRect(enclosingRectF);
    }

    private Quad convertToNormalizedQuads(Face face, int i, int i2) {
        RectF coreFeaturesBoundingBox = face.getCoreFeaturesBoundingBox();
        float f = (float) i;
        coreFeaturesBoundingBox.left /= f;
        coreFeaturesBoundingBox.right /= f;
        f = (float) i2;
        coreFeaturesBoundingBox.top /= f;
        coreFeaturesBoundingBox.bottom /= f;
        return Quad.fromRect(coreFeaturesBoundingBox).grow(this.mScale);
    }

    public Signature getSignature() {
        FrameType array = FrameType.array(Face.class);
        FrameType array2 = FrameType.array(Quad.class);
        return new Signature().addInputPort("faces", 2, array).addInputPort(INPUT_PORT_IMAGE_DIMENSIONS, 2, FrameType.array(Integer.TYPE)).addInputPort("scale", 1, FrameType.single(Integer.TYPE)).addOutputPort(OUTPUT_PORT_NORMALIZED_FACE_QUADS, 2, array2).addOutputPort(OUTPUT_PORT_FACE_CAMERA_QUADS, 1, array2).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("scale")) {
            inputPort.bindToFieldNamed("mScale");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onProcess() {
        FrameValues asFrameValues = getConnectedInputPort(INPUT_PORT_IMAGE_DIMENSIONS).pullFrame().asFrameValues();
        if (asFrameValues.getCount() != 2) {
            throw new IllegalStateException("Invalid image dimensions.");
        }
        int intValue = ((Integer) asFrameValues.getFrameValueAtIndex(0).getValue()).intValue();
        int intValue2 = ((Integer) asFrameValues.getFrameValueAtIndex(1).getValue()).intValue();
        FrameValues asFrameValues2 = getConnectedInputPort("faces").pullFrame().asFrameValues();
        int count = asFrameValues2.getCount();
        if (count > 0) {
            Object obj = new Quad[count];
            for (int i = 0; i < count; i++) {
                obj[i] = convertToNormalizedQuads((Face) asFrameValues2.getFrameValueAtIndex(i).getValue(), intValue, intValue2);
            }
            OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_NORMALIZED_FACE_QUADS);
            Frame asFrameValues3 = connectedOutputPort.fetchAvailableFrame(new int[]{count}).asFrameValues();
            asFrameValues3.setValues(obj);
            connectedOutputPort.pushFrame(asFrameValues3);
            OutputPort connectedOutputPort2 = getConnectedOutputPort(OUTPUT_PORT_FACE_CAMERA_QUADS);
            if (connectedOutputPort2 != null) {
                Object obj2 = new Quad[count];
                for (int i2 = 0; i2 < count; i2++) {
                    obj2[i2] = convertToCameraQuads(obj[i2]);
                }
                Frame asFrameValues4 = connectedOutputPort2.fetchAvailableFrame(new int[]{count}).asFrameValues();
                asFrameValues4.setValues(obj2);
                connectedOutputPort2.pushFrame(asFrameValues4);
            }
        }
    }
}
