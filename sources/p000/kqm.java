package p000;

import java.io.PrintStream;

/* compiled from: PG */
/* renamed from: kqm */
final class kqm extends kqh {
    kqm() {
    }

    /* renamed from: a */
    public final void mo2208a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    /* renamed from: a */
    public final Throwable[] mo2209a(Throwable th) {
        return th.getSuppressed();
    }

    /* renamed from: b */
    public final void mo2210b(Throwable th) {
        th.printStackTrace();
    }

    /* renamed from: a */
    public final void mo2207a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }
}
