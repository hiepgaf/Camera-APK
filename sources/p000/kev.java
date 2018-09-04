package p000;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kev */
public final class kev extends kei {
    /* renamed from: d */
    private Object[] f22018d;
    /* renamed from: e */
    private int f22019e;

    public kev() {
        super(4);
    }

    kev(int i) {
        super(i);
        this.f22018d = new Object[keu.m13481b(i)];
    }

    /* renamed from: a */
    public final /* synthetic */ kei mo3231a(Object obj) {
        return m16507c(obj);
    }

    /* renamed from: b */
    public final /* synthetic */ kej mo2141b(Object obj) {
        return m16507c(obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public final p000.kev m16507c(java.lang.Object r6) {
        /*
        r5 = this;
        p000.jri.m13152b(r6);
        r0 = r5.f22018d;
        if (r0 == 0) goto L_0x0037;
    L_0x0007:
        r0 = r5.b;
        r0 = p000.keu.m13481b(r0);
        r1 = r5.f22018d;
        r1 = r1.length;
        if (r0 > r1) goto L_0x0037;
    L_0x0012:
        r1 = r1 + -1;
        r2 = r6.hashCode();
        r0 = p000.khb.m4893c(r2);
    L_0x001c:
        r0 = r0 & r1;
        r3 = r5.f22018d;
        r4 = r3[r0];
        if (r4 != 0) goto L_0x002e;
    L_0x0023:
        r3[r0] = r6;
        r0 = r5.f22019e;
        r0 = r0 + r2;
        r5.f22019e = r0;
        super.mo3231a(r6);
    L_0x002d:
        return r5;
    L_0x002e:
        r3 = r4.equals(r6);
        if (r3 != 0) goto L_0x002d;
    L_0x0034:
        r0 = r0 + 1;
        goto L_0x001c;
    L_0x0037:
        r0 = 0;
        r5.f22018d = r0;
        super.mo3231a(r6);
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: kev.c(java.lang.Object):kev");
    }

    /* renamed from: a */
    public final /* synthetic */ kej mo2140a(Iterable iterable) {
        return m16506b(iterable);
    }

    /* renamed from: b */
    public final kev m16506b(Iterable iterable) {
        jri.m13152b((Object) iterable);
        if (this.f22018d != null) {
            for (Object c : iterable) {
                m16507c(c);
            }
        } else {
            super.mo2140a(iterable);
        }
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ kej mo3232a(Iterator it) {
        jri.m13152b((Object) it);
        while (it.hasNext()) {
            m16507c(it.next());
        }
        return this;
    }

    /* renamed from: a */
    public final keu m16504a() {
        switch (this.b) {
            case 0:
                return kgn.f22045a;
            case 1:
                return keu.m13472a(this.a[0]);
            default:
                keu a;
                if (this.f22018d == null || keu.m13481b(this.b) != this.f22018d.length) {
                    a = keu.m13471a(this.b, this.a);
                    this.b = a.size();
                } else {
                    Object[] copyOf;
                    if (keu.m13480a(this.b, this.a.length)) {
                        copyOf = Arrays.copyOf(this.a, this.b);
                    } else {
                        copyOf = this.a;
                    }
                    int i = this.f22019e;
                    Object[] objArr = this.f22018d;
                    a = new kgn(copyOf, i, objArr, objArr.length - 1, this.b);
                }
                this.c = true;
                this.f22018d = null;
                return a;
        }
    }
}
