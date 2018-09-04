package com.google.android.apps.refocus.processing;

import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.Serializable;
import p000.hsk;

/* compiled from: PG */
public class FocusSettings implements Serializable {
    public static final float DEFAULT_AVERAGE_BLUR_RATIO = 0.004f;
    public float blurAtInfinity = 1.0f;
    public float depthOfField = 0.0f;
    public float focalDistance = 1.0f;
    public float focalPointX = 0.5f;
    public float focalPointY = 0.5f;

    public static FocusSettings createDefault(FaceDetector faceDetector, RGBZ rgbz) {
        return createDefault(faceDetector, rgbz, new hsk(rgbz));
    }

    public static FocusSettings createDefault(FaceDetector faceDetector, RGBZ rgbz, hsk hsk) {
        FocusSettings focusSettings = new FocusSettings();
        if (!faceDetector.computeFaceFocus(rgbz, focusSettings)) {
            focusSettings.focalDistance = hsk.f6578a;
        }
        focusSettings.depthOfField = hsk.m3343a();
        focusSettings.blurAtInfinity = hsk.m3346a(focusSettings.focalDistance, focusSettings.depthOfField, 0.004f);
        return focusSettings;
    }

    public static FocusSettings rotate(FocusSettings focusSettings, int i) {
        if (focusSettings == null || i % 90 != 0) {
            return null;
        }
        if (i == 0) {
            return focusSettings;
        }
        FocusSettings focusSettings2 = new FocusSettings();
        focusSettings2.blurAtInfinity = focusSettings.blurAtInfinity;
        focusSettings2.focalDistance = focusSettings.focalDistance;
        focusSettings2.depthOfField = focusSettings.depthOfField;
        if (i == 90) {
            focusSettings2.focalPointX = 1.0f - focusSettings.focalPointY;
            focusSettings2.focalPointY = focusSettings.focalPointX;
        }
        if (i == MediaDecoder.ROTATE_180) {
            focusSettings2.focalPointX = 1.0f - focusSettings.focalPointX;
            focusSettings2.focalPointY = 1.0f - focusSettings.focalPointY;
        }
        if (i == MediaDecoder.ROTATE_90_LEFT) {
            focusSettings2.focalPointX = focusSettings.focalPointY;
            focusSettings2.focalPointY = 1.0f - focusSettings.focalPointX;
        }
        return focusSettings2;
    }
}
