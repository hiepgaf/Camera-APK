package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kox */
final class kox implements Runnable {
    /* renamed from: a */
    private final Future f8398a;
    /* renamed from: b */
    private final kov f8399b;

    kox(Future future, kov kov) {
        this.f8398a = future;
        this.f8399b = kov;
    }

    public final void run() {
        Throwable e;
        try {
            this.f8399b.b_(kow.m13623b(this.f8398a));
        } catch (ExecutionException e2) {
            this.f8399b.mo349a(e2.getCause());
        } catch (RuntimeException e3) {
            e = e3;
            this.f8399b.mo349a(e);
        } catch (Error e4) {
            e = e4;
            this.f8399b.mo349a(e);
        }
    }

    public final String toString() {
        kbd b = jqk.m13098b((Object) this);
        b.m4743a().f8185b = this.f8399b;
        return b.toString();
    }
}
