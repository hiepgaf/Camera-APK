package p000;

/* compiled from: PG */
/* renamed from: kgg */
public final class kgg extends kee {
    /* renamed from: a */
    public static final kgg f22026a = new kgg();
    /* renamed from: b */
    private final transient int[] f22027b;
    /* renamed from: c */
    private final transient Object[] f22028c;
    /* renamed from: d */
    private final transient int f22029d;
    /* renamed from: e */
    private final transient int f22030e;
    /* renamed from: f */
    private final transient kgg f22031f;

    private kgg() {
        this.f22027b = null;
        this.f22028c = new Object[0];
        this.f22029d = 0;
        this.f22030e = 0;
        this.f22031f = this;
    }

    private kgg(int[] iArr, Object[] objArr, int i, kgg kgg) {
        this.f22027b = iArr;
        this.f22028c = objArr;
        this.f22029d = 1;
        this.f22030e = i;
        this.f22031f = kgg;
    }

    public kgg(Object[] objArr, int i) {
        int b;
        this.f22028c = objArr;
        this.f22030e = i;
        this.f22029d = 0;
        if (i >= 2) {
            b = keu.m13481b(i);
        } else {
            b = 0;
        }
        this.f22027b = kgi.m13504a(objArr, i, b, 0);
        this.f22031f = new kgg(kgi.m13504a(objArr, i, b, 1), objArr, i, this);
    }

    /* renamed from: f */
    final keu mo2153f() {
        return new kgj(this, this.f22028c, this.f22029d, this.f22030e);
    }

    /* renamed from: g */
    final keu mo2154g() {
        return new kgl(this, new kgm(this.f22028c, this.f22029d, this.f22030e));
    }

    public final Object get(Object obj) {
        return kgi.m13502a(this.f22027b, this.f22028c, this.f22030e, this.f22029d, obj);
    }

    /* renamed from: a */
    public final /* synthetic */ kcx mo2130a() {
        return this.f22031f;
    }

    /* renamed from: c */
    public final kee mo3241c() {
        return this.f22031f;
    }

    /* renamed from: i */
    final boolean mo2156i() {
        return false;
    }

    public final int size() {
        return this.f22030e;
    }
}
