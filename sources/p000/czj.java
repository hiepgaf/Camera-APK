package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.OneCameraSession;

/* compiled from: PG */
/* renamed from: czj */
final class czj implements kaw {
    /* renamed from: a */
    private final /* synthetic */ OneCameraSession f12927a;
    /* renamed from: b */
    private final /* synthetic */ fbj f12928b;
    /* renamed from: c */
    private final /* synthetic */ czg f12929c;

    czj(czg czg, OneCameraSession oneCameraSession, fbj fbj) {
        this.f12929c = czg;
        this.f12927a = oneCameraSession;
        this.f12928b = fbj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo370a(Object obj) {
        return m8900a();
    }

    /* renamed from: a */
    private final fbj m8900a() {
        boolean z;
        bli.m869c(czg.f2854a, "OneCamera started!");
        synchronized (this.f12929c.f2858e) {
            this.f12929c.f2859f = null;
        }
        OneCameraSession oneCameraSession = this.f12927a;
        if (oneCameraSession.f12332e == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Accidental session reuse.");
        iya iya = oneCameraSession.m;
        oneCameraSession.f12332e = SystemClock.elapsedRealtimeNanos();
        oneCameraSession.m1327a("OneCamera Started", oneCameraSession.f12331d, oneCameraSession.f12332e);
        return this.f12928b;
    }
}
