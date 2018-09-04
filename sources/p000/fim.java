package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fim */
public final class fim {
    /* renamed from: a */
    public final int f4566a;
    /* renamed from: b */
    public final Set f4567b;
    /* renamed from: c */
    public final Set f4568c;
    /* renamed from: d */
    public final Set f4569d;
    /* renamed from: e */
    public final kbg f4570e;

    public fim(int i, Set set, Set set2, Set set3, kbg kbg) {
        this.f4566a = i;
        this.f4567b = keu.m13477a((Collection) set);
        this.f4568c = keu.m13477a((Collection) set2);
        this.f4569d = keu.m13477a((Collection) set3);
        this.f4570e = kbg;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fim)) {
            fim fim = (fim) obj;
            if (kbf.m16436b(Integer.valueOf(this.f4566a), Integer.valueOf(fim.f4566a)) && kbf.m16436b(this.f4567b, fim.f4567b) && kbf.m16436b(this.f4569d, fim.f4569d) && kbf.m16436b(this.f4568c, fim.f4568c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4566a), this.f4567b, this.f4569d, this.f4568c});
    }
}
