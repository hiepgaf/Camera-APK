package p000;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jdv */
public class jdv implements jdu {
    /* renamed from: a */
    public final jdo f23392a;
    /* renamed from: b */
    private final jaq f23393b;

    protected jdv(jdo jdo, jaq jaq) {
        this.f23392a = jdo;
        this.f23393b = jaq;
        if (this.f23392a.mo3490e() && jli.m12949b(jaq) == null) {
            Log.e("GLContextObject", "Creating non-ready GL object on GL thread. This will likely cause a deadlock.");
        }
    }

    /* renamed from: a */
    public static jaq m17630a(jdo jdo, Callable callable) {
        if (!jdo.mo3490e()) {
            return jli.m12939a((Executor) jdo, callable);
        }
        try {
            return jli.m12948b(callable.call());
        } catch (Throwable e) {
            return jli.m12940a(kow.m13618a(jar.m4390a(e)));
        }
    }

    public void close() {
        jli.m12951c(mo3162a());
    }

    /* renamed from: a */
    public final jas mo3162a() {
        return jas.m12715a(m17631a(ion.m3944a()));
    }

    /* renamed from: c */
    public final jez mo3492c() {
        if (this.f23392a.mo3490e()) {
            return m17634d();
        }
        throw new IllegalStateException("raw should only be called from the GLContext thread");
    }

    /* renamed from: d */
    protected final jez m17634d() {
        if (!this.f23392a.mo3490e()) {
            return (jez) jli.m12951c(this.f23393b);
        }
        jez jez = (jez) jli.m12949b(this.f23393b);
        if (jez != null) {
            return jez;
        }
        throw new RuntimeException("Waiting for incomplete GL object while on GL thread. This deadlocks the process.");
    }

    /* renamed from: a */
    public final jaq m17631a(izi izi) {
        return jdv.m17630a(this.f23392a, new jdw(this, izi));
    }
}
