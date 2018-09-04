package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: hek */
public final class hek {
    /* renamed from: a */
    public final Object f6091a = new Object();
    /* renamed from: b */
    public hen f6092b;
    /* renamed from: c */
    private final iqz f6093c;
    /* renamed from: d */
    private final ira f6094d;
    /* renamed from: e */
    private final hmy f6095e;
    /* renamed from: f */
    private final FrameLayout f6096f;
    /* renamed from: g */
    private final gci f6097g;
    /* renamed from: h */
    private final Instrumentation f6098h;
    /* renamed from: i */
    private final MainActivityLayout f6099i;
    /* renamed from: j */
    private final ird f6100j;
    /* renamed from: k */
    private hei f6101k;

    hek(ira ira, hmy hmy, gci gci, Instrumentation instrumentation, MainActivityLayout mainActivityLayout, het het, ird ird) {
        this.f6094d = ira;
        this.f6095e = hmy;
        this.f6096f = het.f6124d;
        this.f6097g = gci;
        this.f6098h = instrumentation;
        this.f6099i = mainActivityLayout;
        this.f6100j = ird;
        this.f6093c = ira.mo511a("Viewfinder");
        this.f6093c.mo519e("Viewfinder constructed.");
    }

    /* renamed from: a */
    public final void m3097a() {
        this.f6093c.mo519e("Stopping current viewfinder");
        hei hei = this.f6101k;
        if (hei != null) {
            hei.close();
            this.f6101k = null;
        }
        MainActivityLayout mainActivityLayout = this.f6099i;
        FrameLayout frameLayout = mainActivityLayout.f12347c;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            mainActivityLayout.f12347c = null;
            mainActivityLayout.requestLayout();
            mainActivityLayout.invalidate();
        }
    }

    /* renamed from: a */
    public final Bitmap m3095a(int i, boolean z, boolean z2) {
        Bitmap createBitmap;
        synchronized (this.f6091a) {
            int width;
            int height;
            this.f6100j.mo1903a("getScreenshot");
            SurfaceView surfaceView = this.f6101k.f17715c;
            if (z2 || i % MediaDecoder.ROTATE_180 == 0) {
                width = surfaceView.getWidth();
            } else {
                width = surfaceView.getHeight();
            }
            if (z2 || i % MediaDecoder.ROTATE_180 == 0) {
                height = surfaceView.getHeight();
            } else {
                height = surfaceView.getWidth();
            }
            createBitmap = Bitmap.createBitmap(width / 4, height / 4, Config.ARGB_8888);
            PixelCopy.request(surfaceView, createBitmap, hel.f6102a, new Handler(Looper.getMainLooper()));
            this.f6100j.mo1905b("getScreenshot#flipAndRotate");
            Matrix matrix = new Matrix();
            matrix.postRotate((float) (-i));
            if (z) {
                matrix.postScale(-1.0f, 1.0f);
            }
            createBitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
            this.f6100j.mo1904b();
        }
        return createBitmap;
    }

    /* renamed from: a */
    public final kpk m3096a(heo heo) {
        kpk kpk;
        iqz iqz = this.f6093c;
        String valueOf = String.valueOf(heo);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
        stringBuilder.append("swapAndStartSurfaceViewViewfinder with configuration: ");
        stringBuilder.append(valueOf);
        iqz.mo519e(stringBuilder.toString());
        this.f6100j.mo1903a("swapAndStartSurfaceViewViewfinder");
        synchronized (this.f6091a) {
            m3097a();
            this.f6093c.mo519e("Starting the new viewfinder");
            this.f6101k = new hei(this.f6094d, this.f6095e, this.f6096f, this.f6099i, this.f6097g, this.f6098h, heo, new hem(this));
            MainActivityLayout mainActivityLayout = this.f6099i;
            mainActivityLayout.f12347c = this.f6096f;
            mainActivityLayout.f12348d.f17563a = null;
            mainActivityLayout.requestLayout();
            mainActivityLayout.invalidate();
            hei hei = this.f6101k;
            ikd.m12259a();
            kpk = hei.f17720h;
        }
        MainActivityLayout mainActivityLayout2 = this.f6099i;
        iqp iqp = heo.f6105a;
        mainActivityLayout2.m8438a(iqp.f7329a, iqp.f7330b, false);
        this.f6100j.mo1904b();
        return kpk;
    }
}
