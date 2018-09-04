package com.google.android.apps.camera.metadata.refocus;

import java.io.InputStream;

/* compiled from: PG */
public class RgbzUtils {
    public static boolean isRgbz(InputStream inputStream) {
        return GDepthUtil.isPresent(XmpUtil.extractXMPMeta(inputStream, true));
    }
}
