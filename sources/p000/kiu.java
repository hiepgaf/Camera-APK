package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: kiu */
public final class kiu implements Closeable {
    /* renamed from: a */
    private static final kix f8320a;
    /* renamed from: b */
    private final kix f8321b;
    /* renamed from: c */
    private final Deque f8322c = new ArrayDeque(4);
    /* renamed from: d */
    private Throwable f8323d;

    static {
        kix kix;
        if (kiw.f19222b != null) {
            kix = kiw.f19221a;
        } else {
            kix = kiv.f19220a;
        }
        f8320a = kix;
    }

    private kiu(kix kix) {
        this.f8321b = (kix) jri.m13152b((Object) kix);
    }

    public final void close() {
        Throwable th = this.f8323d;
        while (!this.f8322c.isEmpty()) {
            Closeable closeable = (Closeable) this.f8322c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th != null) {
                    this.f8321b.mo2181a(closeable, th, th2);
                } else {
                    th = th2;
                }
            }
        }
        if (this.f8323d == null && th != null) {
            kbr.m4758a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public static kiu m4965a() {
        return new kiu(f8320a);
    }

    /* renamed from: a */
    public final Closeable m4966a(Closeable closeable) {
        if (closeable != null) {
            this.f8322c.addFirst(closeable);
        }
        return closeable;
    }

    /* renamed from: a */
    public final RuntimeException m4967a(Throwable th) {
        jri.m13152b((Object) th);
        this.f8323d = th;
        kbr.m4758a(th, IOException.class);
        throw new RuntimeException(th);
    }
}
