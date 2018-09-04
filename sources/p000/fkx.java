package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fkx */
final class fkx implements fjl {
    /* renamed from: a */
    private final fjl f23185a;
    /* renamed from: b */
    private final fyd f23186b;

    fkx(fkw fkw, fjl fjl) {
        this.f23185a = fjl;
        this.f23186b = new fyd(fkw.f16126a);
    }

    public final void close() {
        this.f23185a.close();
        this.f23186b.close();
    }

    /* renamed from: d */
    public final int mo3439d() {
        return this.f23186b.m10884e();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2649a() {
        fjj fjj = (fjj) this.f23185a.mo2649a();
        fyr d = this.f23186b.mo1431d();
        if (d != null) {
            return fma.m17345a(fjj, d);
        }
        throw new bbg();
    }

    public final fhz x_() {
        return this.f23185a.x_();
    }

    /* renamed from: a */
    public final kpk mo3437a(int i) {
        kpk a = this.f23185a.mo3437a(i);
        kpk b = this.f23186b.m10879b(i);
        return kow.m13621a(a, b);
    }

    /* renamed from: b */
    public final boolean mo2650b() {
        return this.f23185a.mo2650b();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo2651c() {
        fjj fjj = (fjj) this.f23185a.mo2651c();
        if (fjj == null) {
            return null;
        }
        Object d = this.f23186b.mo1431d();
        jri.m13152b(d);
        return fma.m17345a(fjj, d);
    }

    /* renamed from: b */
    public final boolean mo3438b(int i) {
        if (this.f23186b.m10882c(i)) {
            if (this.f23185a.mo3438b(i)) {
                return true;
            }
            fyd fyd = this.f23186b;
            if (i > 0) {
                int i2;
                int i3;
                ArrayList arrayList = new ArrayList();
                synchronized (fyd.f16630a) {
                    i2 = fyd.f16635f;
                    if (i > i2) {
                        i = i2;
                    }
                    fyd.f16635f = i2 - i;
                    int min = Math.min(fyd.f16633d.size(), i);
                    for (i3 = 0; i3 < min; i3++) {
                        arrayList.add((fyr) fyd.f16633d.remove());
                    }
                }
                fyd.m10880b();
                int size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    i3 = i2 + 1;
                    ((fyr) arrayList.get(i2)).close();
                    i2 = i3;
                }
                synchronized (fyd.f16630a) {
                    fyd.f16634e.f21744b = Integer.valueOf(fyd.m10885f());
                }
                fyd.f16634e.f21743a.m16083a();
            }
        }
        return false;
    }
}
