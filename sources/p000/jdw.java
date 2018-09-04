package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jdw */
final class jdw implements Callable {
    /* renamed from: a */
    private final /* synthetic */ izi f7725a;
    /* renamed from: b */
    private final /* synthetic */ jdv f7726b;

    jdw(jdv jdv, izi izi) {
        this.f7726b = jdv;
        this.f7725a = izi;
    }

    public final Object call() {
        try {
            return this.f7725a.mo711a(this.f7726b.mo3492c());
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            Error error = new Error(th);
        }
    }
}
