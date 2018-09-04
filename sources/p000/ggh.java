package p000;

import java.util.Collections;

/* compiled from: PG */
/* renamed from: ggh */
public final class ggh implements gfj {
    /* renamed from: a */
    private kpw f21454a = kpw.m18056d();
    /* renamed from: b */
    private gfw f21455b;

    public final void close() {
        Object obj = this.f21455b;
        if (obj == null) {
            this.f21454a.mo3557a(Collections.emptySet());
        } else {
            this.f21454a.mo3557a(keu.m13472a(obj));
        }
    }

    /* renamed from: a */
    public final kpk mo3056a() {
        return this.f21454a;
    }

    /* renamed from: a */
    public final void mo3057a(gfw gfw, get get) {
        gfw gfw2 = this.f21455b;
        if (gfw2 == null || gfw2.f5149b.mo2719f() < gfw.f5149b.mo2719f()) {
            gfw2 = this.f21455b;
            if (gfw2 != null) {
                gfw2.f5149b.close();
            }
            this.f21455b = gfw;
            return;
        }
        gfw.f5149b.close();
    }
}
