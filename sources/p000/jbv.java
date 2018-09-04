package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbv */
final class jbv {
    /* renamed from: a */
    public jbv f7676a;
    /* renamed from: b */
    public final Executor f7677b;
    /* renamed from: c */
    public final Runnable f7678c;
    /* renamed from: d */
    public final jbj f7679d;

    public jbv(Executor executor, Runnable runnable, jbj jbj, jcc jcc) {
        this.f7677b = executor;
        this.f7678c = runnable;
        this.f7679d = jbj;
    }

    public jbv(Executor executor, Runnable runnable, jcc jcc) {
        this.f7677b = executor;
        this.f7678c = runnable;
        this.f7679d = null;
    }
}
