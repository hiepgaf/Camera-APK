package p000;

import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import java.util.List;

/* compiled from: PG */
/* renamed from: iuw */
public final class iuw {
    /* renamed from: a */
    public static void m4258a(iwz iwz, iwz iwz2) {
        boolean z;
        jri.m13152b((Object) iwz);
        jri.m13152b((Object) iwz2);
        if (iwz.mo2716c() == iwz2.mo2716c()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (iwz.mo2716c() != 34) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (iwz2.mo2716c() != 34) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        iqp iqp = new iqp(iwz.mo2720g(), iwz.mo2717d());
        iqp iqp2 = new iqp(iwz2.mo2720g(), iwz2.mo2717d());
        boolean equals = iqp.equals(iqp2);
        String valueOf = String.valueOf(iqp);
        String valueOf2 = String.valueOf(iqp2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 60) + String.valueOf(valueOf2).length());
        stringBuilder.append("source image size ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" is different with destination image size ");
        stringBuilder.append(valueOf2);
        jri.m13144a(equals, stringBuilder.toString());
        if (iwz.mo2716c() == 35) {
            List e = iwz.mo2718e();
            List e2 = iwz2.mo2718e();
            if (YuvUtilNative.m1352a(iwz.mo2720g(), iwz.mo2717d(), ((ixa) e.get(0)).mo637a(), ((ixa) e.get(1)).mo637a(), ((ixa) e.get(2)).mo637a(), ((ixa) e.get(0)).mo639c(), ((ixa) e.get(1)).mo639c(), ((ixa) e.get(1)).mo638b(), ((ixa) e2.get(0)).mo637a(), ((ixa) e2.get(1)).mo637a(), ((ixa) e2.get(2)).mo637a(), ((ixa) e2.get(0)).mo639c(), ((ixa) e2.get(1)).mo639c(), ((ixa) e2.get(1)).mo638b())) {
                for (ixa a : iwz2.mo2718e()) {
                    a.mo637a().rewind();
                }
                return;
            }
            throw new IllegalStateException("Copy failed.");
        }
        int c = iwz.mo2716c();
        StringBuilder stringBuilder2 = new StringBuilder(37);
        stringBuilder2.append("Unsupported image format: ");
        stringBuilder2.append(c);
        throw new UnsupportedOperationException(stringBuilder2.toString());
    }
}
