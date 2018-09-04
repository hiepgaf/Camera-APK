package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fkw */
final class fkw implements fjk {
    /* renamed from: a */
    public final fxy f16126a;
    /* renamed from: b */
    private final Set f16127b;
    /* renamed from: c */
    private final fjk f16128c;

    fkw(Set set, fjk fjk) {
        this.f16127b = set;
        this.f16128c = fjk;
        List arrayList = new ArrayList();
        for (fkv fkv : this.f16127b) {
            arrayList.add(fkv.f16124a);
        }
        this.f16126a = new fxy(arrayList);
    }

    /* renamed from: a */
    public final fjn mo1399a(int i, int i2, fju fju) {
        return new fky(this.f16128c.mo1399a(i, i2, fju), this);
    }

    /* renamed from: a */
    public final fjl mo1398a() {
        return new fkx(this, this.f16128c.mo1398a());
    }

    /* renamed from: b */
    public final ilp mo1400b() {
        return this.f16126a.f16627a;
    }

    /* renamed from: c */
    public final int mo1401c() {
        return this.f16128c.mo1401c();
    }
}
