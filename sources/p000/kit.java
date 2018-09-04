package p000;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: kit */
public final class kit {
    /* renamed from: a */
    public static final Logger f8319a = Logger.getLogger(kit.class.getName());

    private kit() {
    }

    /* renamed from: a */
    public static void m4964a(Closeable closeable, boolean z) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable e) {
                if (z) {
                    f8319a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                    return;
                }
                throw e;
            }
        }
    }
}
