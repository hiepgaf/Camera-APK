package p000;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: koo */
public final class koo {
    /* renamed from: c */
    private static final Logger f8392c = Logger.getLogger(koo.class.getName());
    /* renamed from: a */
    public kop f8393a;
    /* renamed from: b */
    public boolean f8394b;

    /* renamed from: a */
    static void m5024a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = f8392c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length());
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with executor ");
            stringBuilder.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", stringBuilder.toString(), e);
        }
    }
}
