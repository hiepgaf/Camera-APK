package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gki */
final class gki implements Executor {
    /* renamed from: a */
    public final Executor f5309a;
    /* renamed from: b */
    private final imk f5310b = new imk();

    public gki(Executor executor) {
        this.f5309a = executor;
    }

    public final void execute(Runnable runnable) {
        this.f5310b.execute(new gkj(this, runnable));
    }
}
