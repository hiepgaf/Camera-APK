package com.google.googlex.gcam.androidutils.camera2;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class Camera2Utilities {
    public static final String TAG = Camera2Utilities.class.getSimpleName();

    private Camera2Utilities() {
    }

    public static String dumpCaptureResultToString(CaptureResult captureResult) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Key key : captureResult.getKeys()) {
            String str = TAG;
            String valueOf = String.valueOf(key.getName());
            String str2 = "key = ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            Log.d(str, valueOf);
            stringBuilder.append(key.getName());
            stringBuilder.append("\t");
            stringBuilder.append(metadataValueToString(captureResult.get(key)));
        }
        return stringBuilder.toString();
    }

    public static String getIdOfFirstCameraWithFacing(CameraManager cameraManager, int i) {
        for (String str : cameraManager.getCameraIdList()) {
            if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == i) {
                return str;
            }
        }
        return null;
    }

    public static List getOutputSizes(StreamConfigurationMap streamConfigurationMap, int i) {
        return sizeArrayToVector2iList(streamConfigurationMap.getOutputSizes(i));
    }

    public static List getSupportedJPEGSizes(StreamConfigurationMap streamConfigurationMap) {
        return getOutputSizes(streamConfigurationMap, 256);
    }

    public static List getSupportedOpenGLSizes(StreamConfigurationMap streamConfigurationMap) {
        if (StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class)) {
            return sizeArrayToVector2iList(streamConfigurationMap.getOutputSizes(SurfaceTexture.class));
        }
        return null;
    }

    public static List getSupportedRaw10Sizes(StreamConfigurationMap streamConfigurationMap) {
        return getOutputSizes(streamConfigurationMap, 37);
    }

    public static List getSupportedRawSensorSizes(StreamConfigurationMap streamConfigurationMap) {
        return getOutputSizes(streamConfigurationMap, 32);
    }

    public static List getSupportedYUVSizes(StreamConfigurationMap streamConfigurationMap) {
        return getOutputSizes(streamConfigurationMap, 35);
    }

    private static String metadataValueToString(Object obj) {
        if (obj == null) {
            return "<null>";
        }
        if (!obj.getClass().isArray()) {
            return obj.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(metadataValueToString(Array.get(obj, i)));
            if (i != length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public static int numCameras(CameraManager cameraManager) {
        return cameraManager.getCameraIdList().length;
    }

    public static List sizeArrayToVector2iList(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        List arrayList = new ArrayList(r2);
        for (Size size : sizeArr) {
            arrayList.add(new Vector2i(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }
}
