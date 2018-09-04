package p000;

/* compiled from: PG */
/* renamed from: apx */
final class apx {
    /* renamed from: a */
    public final Class f846a;
    /* renamed from: b */
    public final adq f847b;
    /* renamed from: c */
    private final Class f848c;

    public apx(Class cls, Class cls2, adq adq) {
        this.f848c = cls;
        this.f846a = cls2;
        this.f847b = adq;
    }

    /* renamed from: a */
    public final boolean m560a(Class cls, Class cls2) {
        if (this.f848c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f846a)) {
            return true;
        }
        return false;
    }
}
