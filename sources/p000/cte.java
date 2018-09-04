package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cte */
final class cte implements Executor {
    /* renamed from: a */
    private Executor f2695a = new ikd();

    cte() {
    }

    public final void execute(Runnable runnable) {
        if (ikd.m12260b()) {
            runnable.run();
        } else {
            this.f2695a.execute(runnable);
        }
    }
}
