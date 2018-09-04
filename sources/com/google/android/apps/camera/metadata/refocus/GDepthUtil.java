package com.google.android.apps.camera.metadata.refocus;

import com.google.android.apps.refocus.image.RangeInverseDepthTransform;
import com.google.android.apps.refocus.image.RangeLinearDepthTransform;
import p000.jri;
import p000.kqg;
import p000.wd;
import p000.we;

/* compiled from: PG */
public class GDepthUtil {
    public static final String DEPTH_PREFIX = "GDepth";
    public static final String FAR = "Far";
    public static final String FORMAT = "Format";
    public static final String GOOGLE_DEPTH_NAMESPACE = "http://ns.google.com/photos/1.0/depthmap/";
    public static final String MIME = "Mime";
    public static final String MIME_JPEG = "image/jpeg";
    public static final String MIME_PNG = "image/png";
    public static final String NEAR = "Near";

    public static void initialize() {
        try {
            we.f9447a.m6124a(GOOGLE_DEPTH_NAMESPACE, DEPTH_PREFIX);
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }

    public static boolean isPresent(wd wdVar) {
        if (wdVar == null) {
            return false;
        }
        wd wdVar2 = (wd) jri.m13152b((Object) wdVar);
        initialize();
        try {
            String j = wdVar2.mo2534j(GOOGLE_DEPTH_NAMESPACE, FORMAT);
            if (!RangeInverseDepthTransform.FORMAT.equals(j) && !RangeLinearDepthTransform.FORMAT.equals(j)) {
                return false;
            }
            j = wdVar2.mo2534j(GOOGLE_DEPTH_NAMESPACE, MIME);
            if (!MIME_PNG.equals(j) && !MIME_JPEG.equals(j)) {
                return false;
            }
            double doubleValue = wdVar2.mo2532h(GOOGLE_DEPTH_NAMESPACE, NEAR).doubleValue();
            double doubleValue2 = wdVar2.mo2532h(GOOGLE_DEPTH_NAMESPACE, FAR).doubleValue();
            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || doubleValue <= 0.0d || doubleValue2 <= 0.0d) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
