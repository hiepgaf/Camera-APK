package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kpq */
public enum kpq implements Executor {
    ;

    private kpq(String str) {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
