package p000;

/* compiled from: PG */
/* renamed from: fkb */
final class fkb implements kov {
    /* renamed from: a */
    private final /* synthetic */ fjz f16091a;

    fkb(fjz fjz) {
        this.f16091a = fjz;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        throw new AssertionError(th);
    }

    public final void b_(Object obj) {
        synchronized (this.f16091a.f16081c) {
            this.f16091a.f16084f = true;
        }
        this.f16091a.m10446a();
    }
}
