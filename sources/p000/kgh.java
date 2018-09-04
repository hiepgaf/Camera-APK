package p000;

/* compiled from: PG */
/* renamed from: kgh */
final class kgh extends ken {
    /* renamed from: a */
    public static final ken f22032a = new kgh(new Object[0], 0);
    /* renamed from: b */
    private final transient Object[] f22033b;
    /* renamed from: c */
    private final transient int f22034c;

    kgh(Object[] objArr, int i) {
        this.f22033b = objArr;
        this.f22034c = i;
    }

    /* renamed from: a */
    final int mo2142a(Object[] objArr, int i) {
        System.arraycopy(this.f22033b, 0, objArr, i, this.f22034c);
        return this.f22034c + i;
    }

    public final Object get(int i) {
        jri.m13138a(i, this.f22034c);
        return this.f22033b[i];
    }

    /* renamed from: b */
    final boolean mo3227b() {
        return false;
    }

    public final int size() {
        return this.f22034c;
    }
}
