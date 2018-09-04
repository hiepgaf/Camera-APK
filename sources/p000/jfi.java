package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jfi */
final class jfi implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jdo f7756a;
    /* renamed from: b */
    private final /* synthetic */ jdc f7757b;

    jfi(jdo jdo, jdc jdc) {
        this.f7756a = jdo;
        this.f7757b = jdc;
    }

    public final /* synthetic */ Object call() {
        return m4446a();
    }

    /* renamed from: a */
    private final jfb m4446a() {
        jfb jfe = new jfe(this.f7756a.mo3489d(), jfe.m17963f(), 3553, this.f7757b);
        try {
            jfe.mo3584b();
            return jfe;
        } catch (Exception e) {
            jfe.close();
            throw e;
        }
    }
}
