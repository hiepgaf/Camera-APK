package p000;

/* compiled from: PG */
/* renamed from: cfp */
final class cfp implements iqt {
    /* renamed from: a */
    private final /* synthetic */ cfk f11821a;

    cfp(cfk cfk) {
        this.f11821a = cfk;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        obj = (Boolean) obj;
        jri.m13152b(obj);
        if (obj.booleanValue()) {
            cfk cfk = this.f11821a;
            if (cfk.f20270U && cfk.f20271V) {
                ikd.m12259a();
                if (cfk.f20270U && !cfk.f20272W) {
                    bli.m863a(cfk.f20249a, "stopPreviewForOverlay");
                    cfk.f20272W = true;
                    cfk.m14962G();
                    cfk.m14984a(cfk.f20257H);
                    cfk.f20252C.m9610c(cfk.f20267R);
                    cfk.f20286l.m4082a(false);
                }
            }
        }
    }
}
