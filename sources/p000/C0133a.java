package p000;

/* compiled from: PG */
/* renamed from: a */
public class C0133a extends C0119e {
    /* renamed from: b */
    private static volatile C0133a f9599b;
    /* renamed from: a */
    public C0119e f9600a = this.f9601c;
    /* renamed from: c */
    private C0119e f9601c = new C0153d();

    static {
        C0032b c0032b = new C0032b();
        C0033c c0033c = new C0033c();
    }

    private C0133a() {
    }

    /* renamed from: a */
    public final void mo1a(Runnable runnable) {
        this.f9600a.mo1a(runnable);
    }

    /* renamed from: a */
    public static C0133a m6271a() {
        if (f9599b != null) {
            return f9599b;
        }
        synchronized (C0133a.class) {
            if (f9599b == null) {
                f9599b = new C0133a();
            }
        }
        return f9599b;
    }

    /* renamed from: b */
    public final boolean mo3b() {
        return this.f9600a.mo3b();
    }

    /* renamed from: b */
    public final void mo2b(Runnable runnable) {
        this.f9600a.mo2b(runnable);
    }
}
