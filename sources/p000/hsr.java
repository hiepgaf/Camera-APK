package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.processing.DepthOfFieldOptions;
import com.google.android.apps.refocus.processing.FaceDetector;
import com.google.android.apps.refocus.processing.FocusSettings;

/* compiled from: PG */
/* renamed from: hsr */
public final class hsr extends Thread {
    /* renamed from: a */
    private final /* synthetic */ RGBZ f6586a;
    /* renamed from: b */
    private final /* synthetic */ Runnable f6587b;
    /* renamed from: c */
    private final /* synthetic */ icu f6588c;

    public hsr(icu icu, RGBZ rgbz, Runnable runnable) {
        this.f6588c = icu;
        this.f6586a = rgbz;
        this.f6587b = runnable;
    }

    public final void run() {
        icu icu = this.f6588c;
        RGBZ rgbz = this.f6586a;
        icu.f18200h = new DepthOfFieldOptions(rgbz, 512);
        RGBZ rgbz2 = icu.f18200h.rgbz;
        if (rgbz2 == null || !rgbz2.hasDepthmap()) {
            icu.f18200h = null;
            icu.f18208p.countDown();
        } else {
            icu.f18201i = Bitmap.createBitmap(icu.f18200h.rgbz.getWidth(), icu.f18200h.rgbz.getHeight(), Config.ARGB_8888);
            icu.f18203k = new hsk(icu.f18200h.rgbz);
            if (rgbz.hasFocusSettings()) {
                icu.f18205m = rgbz.getFocusSettings();
            } else {
                icu.f18205m = FocusSettings.createDefault(new FaceDetector(icu.f18196d, icu.f18197e), icu.f18200h.rgbz, icu.f18203k);
            }
            hsk hsk = icu.f18203k;
            FocusSettings focusSettings = icu.f18205m;
            float f = focusSettings.focalDistance;
            float f2 = focusSettings.depthOfField;
            float f3 = focusSettings.blurAtInfinity;
            float a = hsk.m3345a(f, f2);
            if (a != 0.0f) {
                f3 *= a;
            }
            icu.f18204l = f3;
            icu.f18208p.countDown();
            if (!rgbz.hasFocusSettings()) {
                icu.m12113e();
            }
        }
        Runnable runnable = this.f6587b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
