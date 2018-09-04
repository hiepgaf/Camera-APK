package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: flv */
final class flv implements fjk {
    /* renamed from: a */
    private final List f16174a;
    /* renamed from: b */
    private final ikv f16175b;
    /* renamed from: c */
    private final fyt f16176c;

    flv(List list, ikv ikv) {
        this.f16174a = ken.m13458a((Collection) list);
        this.f16175b = ikv;
        List arrayList = new ArrayList();
        for (flu flu : list) {
            arrayList.add(flu.f16168b);
        }
        this.f16176c = new fxy(arrayList);
    }

    /* renamed from: a */
    public final fjn mo1399a(int i, int i2, fju fju) {
        iqo ikb = new ikb(this.f16175b);
        fyl fly = new fly(fju, i2, (i + i2) / 2);
        ikb.mo1879a(fly);
        fyl fli = new fli(this.f16176c, fly, this.f16174a.size());
        ikb.mo1879a(fli);
        for (flu flu : this.f16174a) {
            iqo a = flu.f16168b.m10891a(fly);
            iqo a2 = flu.f16168b.m10891a(fli);
            ikb.mo1879a(a);
            ikb.mo1879a(a2);
        }
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        int i3 = 0;
        for (flu flu2 : this.f16174a) {
            hashSet.add(flu2.f16170d);
            arrayList.add(flu2.f16167a.mo1393a(fli.m10483a(i3)));
            i3++;
        }
        return new flx(fly, fib.m2299a(hashSet, fds.m10250b(arrayList)), ikb);
    }

    /* renamed from: a */
    public final fjl mo1398a() {
        ikb ikb = new ikb(this.f16175b);
        for (flu flu : this.f16174a) {
            iqo b = flu.f16171e.mo1880b();
            b.mo1879a(ikb);
            ikb.mo1879a(b);
        }
        bbf d = fle.m17329d();
        ikb.mo1879a(d);
        fyd fyd = new fyd(this.f16176c);
        ikb.mo1879a(fyd);
        Object fli = new fli(fyd, d, this.f16174a.size());
        ikb.mo1879a(fli);
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        int i = 0;
        for (flu flu2 : this.f16174a) {
            hashSet.add(flu2.f16170d);
            arrayList.add(flu2.f16167a.mo1393a(fli.m10483a(i)));
            i++;
        }
        return new flh(fib.m2299a(hashSet, fds.m10250b(arrayList)), ikb, d, fyd);
    }

    /* renamed from: b */
    public final ilp mo1400b() {
        return this.f16176c.mo1430c();
    }

    /* renamed from: c */
    public final int mo1401c() {
        int i = LfuScheduler.MAX_PRIORITY;
        for (flu flu : this.f16174a) {
            i = Math.min(i, flu.f16169c);
        }
        return i;
    }
}
