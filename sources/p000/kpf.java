package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: kpf */
abstract class kpf extends koq {
    /* renamed from: a */
    private static final Logger f23433a = Logger.getLogger(kpf.class.getName());

    public abstract Object get();

    kpf() {
    }

    /* renamed from: a */
    public final void mo1985a(Runnable runnable, Executor executor) {
        jri.m13139a((Object) runnable, (Object) "Runnable was null.");
        jri.m13139a((Object) executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = f23433a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length());
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with executor ");
            stringBuilder.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", stringBuilder.toString(), e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public Object get(long j, TimeUnit timeUnit) {
        jri.m13152b((Object) timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
