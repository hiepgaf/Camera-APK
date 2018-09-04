package p000;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: kiv */
final class kiv implements kix {
    /* renamed from: a */
    public static final kiv f19220a = new kiv();

    kiv() {
    }

    /* renamed from: a */
    public final void mo2181a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = kit.f8319a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
        stringBuilder.append("Suppressing exception thrown when closing ");
        stringBuilder.append(valueOf);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", stringBuilder.toString(), th2);
    }
}
