package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kow */
public final class kow extends khx {
    /* renamed from: a */
    public static void m13622a(kpk kpk, kov kov, Executor executor) {
        jri.m13152b((Object) kov);
        kpk.mo1985a(new kox(kpk, kov), executor);
    }

    /* renamed from: a */
    public static kpk m13616a(Iterable iterable) {
        return new kol(ken.m13452a(iterable), true);
    }

    @SafeVarargs
    /* renamed from: a */
    public static kpk m13621a(kpk... kpkArr) {
        return new kol(ken.m13460b(kpkArr), true);
    }

    /* renamed from: b */
    public static Object m13623b(Future future) {
        jri.m13156b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return khx.m4936a(future);
    }

    /* renamed from: c */
    public static Object m13625c(Future future) {
        jri.m13152b((Object) future);
        try {
            return khx.m4936a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new kon((Error) cause);
            }
            throw new kqe(cause);
        }
    }

    /* renamed from: b */
    public static kpk m13624b() {
        return new kpg();
    }

    /* renamed from: a */
    public static kpk m13618a(Throwable th) {
        jri.m13152b((Object) th);
        return new kpg(th);
    }

    /* renamed from: a */
    public static kpk m13617a(Object obj) {
        if (obj == null) {
            return kph.f23578a;
        }
        return new kph(obj);
    }

    /* renamed from: a */
    public static kpk m13620a(kpk kpk) {
        if (kpk.isDone()) {
            return kpk;
        }
        Runnable koy = new koy(kpk);
        kpk.mo1985a(koy, kpq.f8410a);
        return koy;
    }

    /* renamed from: a */
    public static kpk m13619a(koi koi, Executor executor) {
        Object kqb = new kqb(koi);
        executor.execute(kqb);
        return kqb;
    }
}
