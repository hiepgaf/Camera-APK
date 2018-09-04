package p000;

/* compiled from: PG */
/* renamed from: asv */
public final class asv implements iqt {
    /* renamed from: a */
    private final kpw f10191a = kpw.m18056d();
    /* renamed from: b */
    private boolean f10192b;

    asv() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        boolean z;
        boolean z2 = true;
        fco fco = (fco) obj;
        if (fco.f4475a.f4471b == gih.ACTIVE_SCAN) {
            z = false;
        } else if (fco.f4476b.f4471b == gih.ACTIVE_SCAN) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f10192b = true;
        } else if (this.f10192b) {
            if (fco.f4475a.f4471b == gih.ACTIVE_SCAN) {
                gih gih = fco.f4476b.f4471b;
                if (gih == gih.FOCUSED_LOCKED) {
                    z = true;
                } else if (gih != gih.NOT_FOCUSED_LOCKED) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                if (fco.f4476b.f4471b != gih.FOCUSED_LOCKED) {
                    z2 = false;
                }
                this.f10191a.mo3557a(Boolean.valueOf(z2));
            }
        }
    }
}
