package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: flr */
final class flr implements fjk {
    /* renamed from: a */
    public final fyt f16157a;
    /* renamed from: b */
    private final List f16158b;
    /* renamed from: c */
    private final ikv f16159c;

    flr(List list, ikv ikv) {
        this.f16158b = ken.m13458a((Collection) list);
        this.f16159c = ikv;
        List arrayList = new ArrayList();
        for (flq flq : list) {
            arrayList.add(flq.f16152b);
        }
        this.f16157a = new fxy(arrayList);
    }

    /* renamed from: a */
    public final fjn mo1399a(int i, int i2, fju fju) {
        ikb ikb = new ikb(this.f16159c);
        bbz.m790a(m10497d(), ikb);
        fyl fly = new fly(fju, i2, (i + i2) / 2);
        ikb.mo1879a(fly);
        fyl fli = new fli(new fxv(), fly, this.f16158b.size());
        ikb.mo1879a(fli);
        for (flq flq : this.f16158b) {
            iqo a = flq.f16152b.m10891a(fly);
            iqo a2 = flq.f16152b.m10891a(fli);
            ikb.mo1879a(a);
            ikb.mo1879a(a2);
        }
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        Collection arrayList2 = new ArrayList();
        int i3 = 0;
        for (flq flq2 : this.f16158b) {
            hashSet.add(flq2.f16154d);
            Object flp = new flp(fli.m10483a(i3));
            ikb.mo1879a(flp);
            arrayList2.add(flp);
            arrayList.add(flq2.f16151a.mo1393a(flp));
            i3++;
        }
        return new flx(fly, (fhz) ikb.mo1879a(new fks(new fls(this, fly, i), hashSet, fds.m10250b(arrayList), arrayList2, this.f16157a)), ikb);
    }

    /* renamed from: a */
    public final fjl mo1398a() {
        ikb ikb = new ikb(this.f16159c);
        bbf d = fle.m17329d();
        bbz.m785a(Arrays.asList(new ikb[]{ikb, m10497d()})).mo1879a(d);
        fyd fyd = new fyd(this.f16157a);
        ikb.mo1879a(fyd);
        Object fli = new fli(new fxv(), d, this.f16158b.size());
        ikb.mo1879a(fli);
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        Collection arrayList2 = new ArrayList();
        int i = 0;
        for (flq flq : this.f16158b) {
            hashSet.add(flq.f16154d);
            Object flp = new flp(fli.m10483a(i));
            ikb.mo1879a(flp);
            arrayList2.add(flp);
            arrayList.add(flq.f16151a.mo1393a(flp));
            i++;
        }
        return new flh((fhz) ikb.mo1879a(new fks(new fla(), hashSet, fds.m10250b(arrayList), arrayList2, fyd)), ikb, d, fyd);
    }

    /* renamed from: b */
    public final ilp mo1400b() {
        return this.f16157a.mo1430c();
    }

    /* renamed from: c */
    public final int mo1401c() {
        int i = LfuScheduler.MAX_PRIORITY;
        for (flq flq : this.f16158b) {
            i = Math.min(i, flq.f16153c);
        }
        return i;
    }

    /* renamed from: d */
    private final ikb m10497d() {
        Collection arrayList = new ArrayList(this.f16158b.size());
        for (flq flq : this.f16158b) {
            arrayList.add(flq.f16155e);
        }
        return bbz.m785a(arrayList);
    }
}
