package p000;

import java.io.PrintStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: kqk */
final class kqk extends kqh {
    /* renamed from: b */
    private final kqi f19254b = new kqi();

    kqk() {
    }

    /* renamed from: a */
    public final void mo2208a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        } else {
            this.f19254b.m5049a(th, true).add(th2);
        }
    }

    /* renamed from: a */
    public final Throwable[] mo2209a(Throwable th) {
        List a = this.f19254b.m5049a(th, false);
        if (a == null || a.isEmpty()) {
            return a;
        }
        return (Throwable[]) a.toArray(a);
    }

    /* renamed from: b */
    public final void mo2210b(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f19254b.m5049a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2207a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> a = this.f19254b.m5049a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printStream.print("Suppressed: ");
                    th2.printStackTrace(printStream);
                }
            }
        }
    }
}
