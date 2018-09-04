package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ckt */
public final class ckt implements chu {
    /* renamed from: a */
    public final AtomicReference f12123a = new AtomicReference(chw.ABSENT);
    /* renamed from: b */
    private final chu f12124b;

    public ckt(chu chu) {
        jri.m13152b((Object) chu);
        this.f12124b = chu;
    }

    /* renamed from: a */
    public final Surface mo688a() {
        return this.f12124b.mo688a();
    }

    /* renamed from: a */
    public final void mo691a(SurfaceTexture surfaceTexture, List list, fyy fyy) {
        this.f12124b.mo691a(surfaceTexture, list, fyy);
    }

    /* renamed from: b */
    public final ilp mo693b() {
        return this.f12124b.mo693b();
    }

    /* renamed from: c */
    public final void mo694c() {
        this.f12124b.mo694c();
        this.f12123a.set(chw.ABSENT);
    }

    /* renamed from: a */
    public final void mo692a(chv chv) {
        this.f12124b.mo692a(chv);
    }

    /* renamed from: a */
    public final kpk mo690a(chw chw, gks gks, gln gln, iqm iqm, iut iut, int i, bcy bcy, cjo cjo, iqp iqp) {
        jri.m13152b((Object) chw);
        if (!this.f12123a.compareAndSet(chw.ABSENT, chw)) {
            return kow.m13617a(Boolean.FALSE);
        }
        kpk a = this.f12124b.mo690a(chw, gks, gln, iqm, iut, i, bcy, cjo, iqp);
        kow.m13622a(a, new cku(this), kpq.f8410a);
        return a;
    }

    /* renamed from: a */
    public final kpk mo689a(chw chw) {
        jri.m13152b((Object) chw);
        if (!chw.equals(this.f12123a.get()) && !chw.equals(chw.FORCE_STOP)) {
            return kow.m13617a(Boolean.FALSE);
        }
        kpk a = this.f12124b.mo689a(chw);
        kow.m13622a(a, new ckv(this), kpq.f8410a);
        return a;
    }
}
