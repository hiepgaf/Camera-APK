package p000;

/* compiled from: PG */
/* renamed from: jgh */
abstract class jgh {
    /* renamed from: a */
    private final Object f7807a = new Object();
    /* renamed from: b */
    private kaw f7808b = kay.f19141a;

    jgh() {
    }

    /* renamed from: b */
    protected abstract Object mo1996b();

    /* renamed from: a */
    public final jgh m4466a(kaw kaw) {
        synchronized (this.f7807a) {
            this.f7808b = new kax(kaw, this.f7808b);
        }
        return this;
    }

    /* renamed from: c */
    public Object m4468c() {
        try {
            Object a;
            synchronized (this.f7807a) {
                a = this.f7808b.mo370a(mo1996b());
            }
            return a;
        } catch (Throwable th) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not build instance.", th);
        }
    }
}
