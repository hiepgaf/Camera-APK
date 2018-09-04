package p000;

/* compiled from: PG */
/* renamed from: jei */
final class jei implements jdo {
    /* renamed from: a */
    private final jdo f23394a;

    public jei(jdo jdo) {
        this.f23394a = jdo;
    }

    public final void close() {
        this.f23394a.close();
    }

    /* renamed from: a */
    public final jas mo3162a() {
        return this.f23394a.mo3162a();
    }

    public final void execute(Runnable runnable) {
        this.f23394a.execute(new jej(runnable));
    }

    /* renamed from: d */
    public final jfj mo3489d() {
        return this.f23394a.mo3489d();
    }

    /* renamed from: e */
    public final boolean mo3490e() {
        return this.f23394a.mo3490e();
    }

    /* renamed from: f */
    public final jdk mo3491f() {
        return this.f23394a.mo3491f();
    }
}
