package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijo */
public final class ijo implements Runnable {
    /* renamed from: a */
    private final Runnable f7037a;
    /* renamed from: b */
    private final Executor f7038b;

    public ijo(Runnable runnable, Executor executor) {
        this.f7038b = executor;
        this.f7037a = runnable;
    }

    public final void run() {
        this.f7038b.execute(this.f7037a);
    }
}
