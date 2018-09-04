package p000;

import android.graphics.Rect;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ggg */
final class ggg {
    static {
        bli.m862a("LSScorer");
    }

    /* renamed from: a */
    public static double m2542a(gfw gfw) {
        iwz iwz = gfw.f5149b;
        ixa ixa = (ixa) iwz.mo2718e().get(0);
        int g = iwz.mo2720g();
        int d = iwz.mo2717d();
        ByteBuffer a = ixa.mo637a();
        int b = ixa.mo638b();
        int c = ixa.mo639c();
        Rect rect = gfw.f5153f;
        return (double) ImgUtilNative.m1325a(g, d, a, b, c, rect.left, rect.top, rect.right, rect.bottom);
    }
}
