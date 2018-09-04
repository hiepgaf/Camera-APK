package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: jdp */
final class jdp extends izq implements jdo {
    /* renamed from: f */
    private static final Callable f23386f = new jds();
    /* renamed from: a */
    public final jbj f23387a = jbj.m12751d();
    /* renamed from: b */
    public volatile boolean f23388b = true;
    /* renamed from: c */
    private final Executor f23389c;
    /* renamed from: d */
    private final jaq f23390d;
    /* renamed from: e */
    private final HashMap f23391e = new HashMap();

    public jdp(Executor executor) {
        this.f23389c = executor;
        this.f23390d = jli.m12939a(this.f23389c, f23386f);
    }

    /* renamed from: b */
    protected final void mo3487b() {
        for (jhs close : m17624h()) {
            close.close();
        }
        ((jdk) jli.m12951c(this.f23387a)).close();
        this.f23388b = false;
        jli.m12951c(jas.m12717d());
    }

    /* renamed from: c */
    protected final jas mo3488c() {
        return jas.m12715a(jli.m12947b(m17624h(), this.f23389c, jdt.f18739a).mo1975a(this.f23389c, new jaw(this.f23387a)).mo1975a(this.f23389c, new jdr()).mo1975a(this.f23389c, new jdq(this)));
    }

    public final void execute(Runnable runnable) {
        if (this.f23388b) {
            this.f23389c.execute(runnable);
            return;
        }
        throw new RejectedExecutionException("Attempting to execute task on a GLContext that is already closed!");
    }

    /* renamed from: h */
    private final Collection m17624h() {
        Collection arrayList;
        synchronized (this.f23391e) {
            arrayList = new ArrayList(this.f23391e.values());
            this.f23391e.clear();
        }
        return arrayList;
    }

    /* renamed from: d */
    public final jfj mo3489d() {
        return ((jeu) ((jdk) jli.m12941a(this.f23387a)).m17634d()).mo3580h();
    }

    /* renamed from: e */
    public final boolean mo3490e() {
        return jli.m12949b(this.f23390d) == Thread.currentThread();
    }

    /* renamed from: g */
    protected static jas m17623g() {
        return jas.m12717d();
    }

    /* renamed from: f */
    public final jdk mo3491f() {
        return (jdk) jli.m12941a(this.f23387a);
    }
}
