package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.apps.refocus.image.BitmapNative;
import com.google.android.apps.refocus.image.DepthTransform;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.image.RangeInverseDepthTransform;
import com.google.android.apps.refocus.image.RangeLinearDepthTransform;

/* compiled from: PG */
/* renamed from: hrw */
public final class hrw {
    /* renamed from: d */
    private static final String f6527d = bli.m862a(GDepthUtil.DEPTH_PREFIX);
    /* renamed from: a */
    public String f6528a;
    /* renamed from: b */
    public byte[] f6529b;
    /* renamed from: c */
    public DepthTransform f6530c;

    /* renamed from: a */
    public static hrw m3316a(RGBZ rgbz) {
        if (rgbz == null || rgbz.getBitmap() == null || rgbz.getDepthTransform() == null) {
            bli.m866b(f6527d, "null rgbz passed to fromBitmap");
            return null;
        }
        hrw hrw = new hrw();
        hrw.f6530c = rgbz.getDepthTransform();
        hrw.f6528a = GDepthUtil.MIME_JPEG;
        hrw.f6529b = BitmapNative.encodeChannelAsJPEG(rgbz.getBitmap(), 3, 95);
        if (hrw.f6529b != null) {
            return hrw;
        }
        bli.m866b(f6527d, "null depthmap data in fromBitmap");
        return null;
    }

    /* renamed from: a */
    public static hrw m3317a(wd wdVar) {
        if (wdVar == null) {
            return null;
        }
        GDepthUtil.initialize();
        hrw hrw = new hrw();
        try {
            hrw.f6528a = wdVar.mo2534j(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.MIME);
            String str;
            String str2;
            String valueOf;
            if (GDepthUtil.MIME_PNG.equals(hrw.f6528a) || GDepthUtil.MIME_JPEG.equals(hrw.f6528a)) {
                hrw.f6529b = wdVar.mo2529e(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, "Data");
                if (hrw.f6529b == null) {
                    bli.m866b(f6527d, "No GDepth data");
                    return null;
                }
                try {
                    float floatValue = wdVar.mo2532h(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.NEAR).floatValue();
                    float floatValue2 = wdVar.mo2532h(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.FAR).floatValue();
                    String j = wdVar.mo2534j(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.FORMAT);
                    if (RangeInverseDepthTransform.FORMAT.equals(j)) {
                        hrw.f6530c = new RangeInverseDepthTransform(floatValue, floatValue2);
                    } else if (RangeLinearDepthTransform.FORMAT.equals(j)) {
                        hrw.f6530c = new RangeLinearDepthTransform(floatValue, floatValue2);
                    } else {
                        str = f6527d;
                        str2 = "Unknown GDepth format: ";
                        valueOf = String.valueOf(j);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        bli.m866b(str, valueOf);
                        return null;
                    }
                    return hrw;
                } catch (Exception e) {
                    bli.m866b(f6527d, e.toString());
                    return null;
                }
            }
            str = f6527d;
            str2 = "Unknown GDepth mime: ";
            valueOf = String.valueOf(hrw.f6528a);
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m866b(str, valueOf);
            return null;
        } catch (Exception e2) {
            bli.m866b(f6527d, e2.toString());
            return null;
        }
    }
}
