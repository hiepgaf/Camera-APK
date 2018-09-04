package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ikf */
public final class ikf implements Executor {
    /* renamed from: a */
    private final ikd f7046a;

    public ikf(ikd ikd) {
        this.f7046a = ikd;
    }

    public final void execute(Runnable runnable) {
        if (ikd.m12260b()) {
            runnable.run();
            return;
        }
        knk d = kpw.m18056d();
        this.f7046a.execute(new ikg(runnable, d));
        try {
            d.get();
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }
}
