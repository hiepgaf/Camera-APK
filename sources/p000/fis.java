package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fis */
public final class fis {
    /* renamed from: a */
    public final kbg f4581a;
    /* renamed from: b */
    public final Set f4582b;
    /* renamed from: c */
    public final Set f4583c;
    /* renamed from: d */
    public final Set f4584d;

    public fis(kbg kbg, Set set, Set set2, Set set3) {
        this.f4581a = kbg;
        this.f4582b = keu.m13477a((Collection) set);
        this.f4583c = keu.m13477a((Collection) set2);
        this.f4584d = keu.m13477a((Collection) set3);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fis)) {
            fis fis = (fis) obj;
            if (kbf.m16436b(this.f4581a, fis.f4581a) && kbf.m16436b(this.f4582b, fis.f4582b) && kbf.m16436b(this.f4583c, fis.f4583c) && kbf.m16436b(this.f4584d, fis.f4584d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4581a, this.f4582b, this.f4583c, this.f4584d});
    }

    /* renamed from: a */
    public final void m2312a(fio fio) {
        if (this.f4581a.mo2084b()) {
            fio.f4573a = ((Integer) this.f4581a.mo2081a()).intValue();
        }
        for (fhy a : this.f4582b) {
            fio.m2304a(a);
        }
        for (fiw a2 : this.f4583c) {
            fio.m2307a(a2);
        }
        for (fin a3 : this.f4584d) {
            fio.m2306a(a3);
        }
    }
}
