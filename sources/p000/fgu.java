package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fgu */
public final class fgu {
    /* renamed from: a */
    public final iqp f4547a;
    /* renamed from: b */
    public final List f4548b;

    fgu(ffc ffc, fyy fyy) {
        iqp iqp;
        this.f4548b = ffc.mo1919b();
        jri.m13153b(this.f4548b.contains(new iqp(0, 0)));
        if (fyy.f4832c.mo2084b() && ((ive) fyy.f4832c.mo2081a()).f7494a == 256) {
            iqp = ((ive) fyy.f4832c.mo2081a()).f7495b;
        } else {
            ive ive = fyy.f4830a;
            if (ive.f7494a != 256) {
                iqp = null;
            } else {
                iqp = ive.f7495b;
            }
        }
        this.f4547a = iqp;
    }
}
