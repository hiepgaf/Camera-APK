package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbd */
public final class jbd implements jau {
    /* renamed from: a */
    private final /* synthetic */ izi f18720a;

    public jbd(izi izi) {
        this.f18720a = izi;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        Iterable iterable = (Iterable) obj;
        jri.m13152b((Object) iterable);
        return jli.m12946b(iterable, executor, this.f18720a);
    }

    public final String toString() {
        return this.f18720a.toString();
    }
}
