package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbc */
public final class jbc implements jau {
    /* renamed from: a */
    private final /* synthetic */ jau f18719a;

    public jbc(jau jau) {
        this.f18719a = jau;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        Iterable iterable = (Iterable) obj;
        jri.m13152b((Object) iterable);
        return jli.m12947b(iterable, executor, this.f18719a);
    }

    public final String toString() {
        return this.f18719a.toString();
    }
}
