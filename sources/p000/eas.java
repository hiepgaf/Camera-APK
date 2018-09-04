package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.google.android.apps.camera.legacy.app.tinyplanet.TinyPlanetPreview;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* renamed from: eas */
final class eas extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ ear f3470a;

    eas(ear ear) {
        this.f3470a = ear;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1741a();
    }

    /* renamed from: a */
    private final Void m1741a() {
        this.f3470a.f3469a.f14862a.lock();
        try {
            eaq eaq = this.f3470a.f3469a;
            Bitmap bitmap = eaq.f14870i;
            if (bitmap != null) {
                Bitmap bitmap2 = eaq.f14871j;
                if (bitmap2 != null) {
                    eaq.m9592a(bitmap, bitmap2);
                    return null;
                }
            }
            eaq.f14862a.unlock();
            return null;
        } finally {
            this.f3470a.f3469a.f14862a.unlock();
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        eaq eaq = this.f3470a.f3469a;
        TinyPlanetPreview tinyPlanetPreview = eaq.f14865d;
        Bitmap bitmap = eaq.f14871j;
        Lock lock = eaq.f14862a;
        tinyPlanetPreview.f2372a = bitmap;
        tinyPlanetPreview.f2373b = lock;
        tinyPlanetPreview.invalidate();
        synchronized (this.f3470a.f3469a.f14872k) {
            eaq = this.f3470a.f3469a;
            Boolean valueOf = Boolean.valueOf(false);
            eaq.f14872k = valueOf;
            if (eaq.f14873l.booleanValue()) {
                eaq = this.f3470a.f3469a;
                eaq.f14873l = valueOf;
                eaq.m9593b();
            }
        }
    }
}
