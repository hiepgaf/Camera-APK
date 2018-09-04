package p000;

import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: bkb */
final class bkb implements ixd {
    /* renamed from: a */
    private final /* synthetic */ TimerTask f10975a;
    /* renamed from: b */
    private final /* synthetic */ kpw f10976b;
    /* renamed from: c */
    private final /* synthetic */ bjz f10977c;

    bkb(bjz bjz, TimerTask timerTask, kpw kpw) {
        this.f10977c = bjz;
        this.f10975a = timerTask;
        this.f10976b = kpw;
    }

    /* renamed from: a */
    public final void mo507a() {
        this.f10975a.cancel();
        Object b = this.f10977c.f20100f.mo3149b();
        if (b == null) {
            this.f10976b.m17780a(new RuntimeException("Image is not available."));
            return;
        }
        boolean z;
        jri.m13152b(b);
        if (b.mo2716c() == 256) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        this.f10976b.mo3557a(b);
    }
}
