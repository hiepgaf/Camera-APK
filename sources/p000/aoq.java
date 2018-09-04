package p000;

/* compiled from: PG */
/* renamed from: aoq */
final class aoq {
    /* renamed from: a */
    public final aoo f815a;
    /* renamed from: b */
    private final Class f816b;
    /* renamed from: c */
    private final Class f817c;

    aoq(Class cls, Class cls2, aoo aoo) {
        this.f816b = cls;
        this.f817c = cls2;
        this.f815a = aoo;
    }

    /* renamed from: a */
    public final boolean m530a(Class cls, Class cls2) {
        return this.f816b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f817c);
    }
}
