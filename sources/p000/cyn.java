package p000;

/* compiled from: PG */
/* renamed from: cyn */
final class cyn implements iqt {
    /* renamed from: a */
    public final /* synthetic */ cyd f12856a;

    cyn(cyd cyd) {
        this.f12856a = cyd;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        boolean z;
        fbi fbi = (fbi) obj;
        cyd cyd = this.f12856a;
        if (fbi == fbi.RUNNING) {
            z = true;
        } else {
            z = false;
        }
        cyd.f22740N = z;
        cyd cyd2 = this.f12856a;
        if (!cyd2.f22740N) {
            cyd2.f22741O.execute(new cyo(this));
        }
    }
}
