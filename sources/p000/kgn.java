package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgn */
public final class kgn extends keu {
    /* renamed from: a */
    public static final kgn f22045a = new kgn(new Object[0], 0, null, 0, 0);
    /* renamed from: b */
    private final transient Object[] f22046b;
    /* renamed from: c */
    private final transient Object[] f22047c;
    /* renamed from: d */
    private final transient int f22048d;
    /* renamed from: e */
    private final transient int f22049e;
    /* renamed from: f */
    private final transient int f22050f;

    kgn(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f22046b = objArr;
        this.f22047c = objArr2;
        this.f22048d = i2;
        this.f22049e = i;
        this.f22050f = i3;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f22047c;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = khb.m4883b(obj);
        while (true) {
            b &= this.f22048d;
            Object obj2 = objArr[b];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b++;
        }
    }

    /* renamed from: a */
    final int mo2142a(Object[] objArr, int i) {
        System.arraycopy(this.f22046b, 0, objArr, i, this.f22050f);
        return this.f22050f + i;
    }

    /* renamed from: e */
    final ken mo3242e() {
        return ken.m13461b(this.f22046b, this.f22050f);
    }

    public final int hashCode() {
        return this.f22049e;
    }

    /* renamed from: d */
    final boolean mo3228d() {
        return true;
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return false;
    }

    /* renamed from: c */
    public final khy mo2144c() {
        return mo2143a().m13468a(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo2144c();
    }

    public final int size() {
        return this.f22050f;
    }
}
