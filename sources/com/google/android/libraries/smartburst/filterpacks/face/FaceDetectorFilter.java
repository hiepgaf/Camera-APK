package com.google.android.libraries.smartburst.filterpacks.face;

import android.hardware.Camera;
import android.hardware.Camera.Face;
import android.hardware.Camera.FaceDetectionListener;
import com.google.android.libraries.smartburst.filterfw.CameraStreamer;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class FaceDetectorFilter extends Filter implements FaceDetectionListener {
    public static final String INPUT_PORT_IMAGE = "image";
    public static final String OUTPUT_PORT_FACES = "faces";
    public Face[] mFaces;

    public FaceDetectorFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(100, 1);
        return new Signature().addInputPort("image", 2, image2D).addOutputPort("faces", 2, FrameType.array(Face.class)).disallowOtherPorts();
    }

    protected void onClose() {
        super.onClose();
        if (isOpenGLSupported()) {
            CameraStreamer cameraStreamer = getContext().getCameraStreamer();
            if (cameraStreamer.isRunning()) {
                cameraStreamer.lockCamera(this).stopFaceDetection();
                cameraStreamer.unlockCamera(this);
            }
        }
    }

    public void onFaceDetection(Face[] faceArr, Camera camera) {
        synchronized (this) {
            this.mFaces = faceArr;
        }
    }

    protected void onOpen() {
        super.onOpen();
        if (isOpenGLSupported()) {
            CameraStreamer cameraStreamer = getContext().getCameraStreamer();
            if (cameraStreamer.isRunning()) {
                Camera lockCamera = cameraStreamer.lockCamera(this);
                lockCamera.setFaceDetectionListener(this);
                lockCamera.startFaceDetection();
                cameraStreamer.unlockCamera(this);
            }
        }
    }

    protected void onProcess() {
        Object obj;
        long timestamp = getConnectedInputPort("image").pullFrame().getTimestamp();
        OutputPort connectedOutputPort = getConnectedOutputPort("faces");
        synchronized (this) {
            obj = this.mFaces;
            if (obj == null) {
                obj = new Face[0];
            }
            this.mFaces = null;
        }
        Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(new int[]{obj.length}).asFrameValues();
        asFrameValues.setValues(obj);
        asFrameValues.setTimestamp(timestamp);
        connectedOutputPort.pushFrame(asFrameValues);
    }
}
