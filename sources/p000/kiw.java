package p000;

import java.io.Closeable;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: kiw */
final class kiw implements kix {
    /* renamed from: a */
    public static final kiw f19221a = new kiw();
    /* renamed from: b */
    public static final Method f19222b = kiw.m13564a();

    kiw() {
    }

    /* renamed from: a */
    private static Method m13564a() {
        try {
            return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo2181a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                f19222b.invoke(th, new Object[]{th2});
            } catch (Throwable th3) {
                kiv.f19220a.mo2181a(closeable, th, th2);
            }
        }
    }
}
