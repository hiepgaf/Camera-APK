package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bhz */
final class bhz implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ kpw f1174a;
    /* renamed from: b */
    public final /* synthetic */ bhj f1175b;
    /* renamed from: c */
    public final /* synthetic */ Surface f1176c;
    /* renamed from: d */
    private final /* synthetic */ bhs f1177d;
    /* renamed from: e */
    private final /* synthetic */ bhy f1178e;

    bhz(bhy bhy, kpw kpw, bhj bhj, Surface surface, bhs bhs) {
        this.f1178e = bhy;
        this.f1174a = kpw;
        this.f1175b = bhj;
        this.f1176c = surface;
        this.f1177d = bhs;
    }

    public final void run() {
        Throwable e;
        Surface surface;
        knk knk;
        synchronized (this.f1178e.f10901d) {
            if (this.f1178e.f10902e) {
                this.f1174a.mo3557a(null);
                return;
            }
            bli.m863a(bhy.f10898a, "Send preview command");
            try {
                iwn a = this.f1178e.f10899b.m820a(this.f1175b);
                a.m4293a(this.f1176c);
                this.f1175b.m7382a(fiv.REPEATING, a, this.f1178e.f10900c, this.f1177d);
                kow.m13622a(this.f1177d.f10890a, new bia(this), kpq.f8410a);
            } catch (isr e2) {
                e = e2;
                surface = this.f1176c;
                knk = this.f1174a;
                bli.m864a(bhy.f10898a, "Fails to start preview", e);
                if (surface.isValid()) {
                    bli.m866b(bhy.f10898a, "preview surface has became invalid");
                    knk.mo3557a(null);
                } else {
                    knk.m17780a(e);
                }
            } catch (UnsupportedOperationException e3) {
                e = e3;
                surface = this.f1176c;
                knk = this.f1174a;
                bli.m864a(bhy.f10898a, "Fails to start preview", e);
                if (surface.isValid()) {
                    knk.m17780a(e);
                } else {
                    bli.m866b(bhy.f10898a, "preview surface has became invalid");
                    knk.mo3557a(null);
                }
            }
        }
    }
}
