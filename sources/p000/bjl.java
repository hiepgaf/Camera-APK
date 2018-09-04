package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjl */
public final class bjl implements bjk {
    /* renamed from: a */
    public final biw f20091a;
    /* renamed from: b */
    public final Object f20092b = new Object();
    /* renamed from: c */
    public boolean f20093c;
    /* renamed from: d */
    private final bic f20094d;

    static {
        bli.m862a("CdrMediaRecStarter");
    }

    public bjl(biw biw, bic bic) {
        this.f20091a = biw;
        this.f20094d = bic;
    }

    public final void close() {
        synchronized (this.f20092b) {
            this.f20093c = true;
            this.f20094d.close();
        }
    }

    /* renamed from: a */
    public final kpk mo2685a(bhj bhj, Surface surface, bhs bhs, iop iop) {
        kpk d = kpw.m18056d();
        synchronized (this.f20092b) {
            if (this.f20093c) {
                d = kow.m13618a(new IllegalStateException("MediaRecorder is closed"));
            } else {
                kow.m13622a(this.f20094d.m7406a(bhj, surface, bhs), new bjm(this, iop, d), kpq.f8410a);
            }
        }
        return d;
    }
}
