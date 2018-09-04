package p000;

/* compiled from: PG */
/* renamed from: kgm */
final class kgm extends ken {
    /* renamed from: a */
    private final transient Object[] f22042a;
    /* renamed from: b */
    private final transient int f22043b;
    /* renamed from: c */
    private final transient int f22044c;

    kgm(Object[] objArr, int i, int i2) {
        this.f22042a = objArr;
        this.f22043b = i;
        this.f22044c = i2;
    }

    public final Object get(int i) {
        jri.m13138a(i, this.f22044c);
        return this.f22042a[(i + i) + this.f22043b];
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return true;
    }

    public final int size() {
        return this.f22044c;
    }
}
