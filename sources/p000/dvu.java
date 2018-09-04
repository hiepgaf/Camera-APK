package p000;

import android.annotation.TargetApi;
import com.google.android.apps.camera.stats.ViewfinderJankSession;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: dvu */
public final class dvu implements dvp {
    /* renamed from: a */
    private final ViewfinderJankSession f14628a;

    dvu(ViewfinderJankSession viewfinderJankSession) {
        this.f14628a = viewfinderJankSession;
    }

    /* renamed from: a */
    public final void mo1178a(iwp iwp, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.f14628a;
        synchronized (viewfinderJankSession.f12333a) {
            if (viewfinderJankSession.f12334b.size() < 30) {
                kke a = ViewfinderJankSession.m8428a(iwp, d, d2);
                viewfinderJankSession.f12334b.add(a);
                viewfinderJankSession.m8430a(a);
            }
        }
    }
}
