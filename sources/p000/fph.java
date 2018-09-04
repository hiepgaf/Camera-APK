package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: fph */
public final class fph {
    /* renamed from: a */
    private final fre f4658a;
    /* renamed from: b */
    private final Collection f4659b;
    /* renamed from: c */
    private final gfx f4660c;

    public fph(fre fre, Collection collection, gfx gfx) {
        this.f4658a = fre;
        this.f4659b = collection;
        this.f4660c = gfx;
    }

    /* renamed from: a */
    public final kpk m2359a(gfw gfw, boolean z) {
        if (z) {
            gfw = this.f4660c.mo560a(gfw);
        }
        frj a = fri.m10698a(gfw.f5149b, gfw.f5151d);
        a.f4666a = gfw.f5150c;
        return this.f4658a.mo1412a(a.m2364a(this.f4659b).m2363a());
    }
}
