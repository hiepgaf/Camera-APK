package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ikh */
public final class ikh implements Executor {
    /* renamed from: a */
    public final ikd f7049a;
    /* renamed from: b */
    private final Executor f7050b;

    public ikh(ikd ikd, Executor executor) {
        this.f7049a = ikd;
        this.f7050b = executor;
    }

    public final void execute(Runnable runnable) {
        this.f7050b.execute(new iki(this, runnable));
    }
}
