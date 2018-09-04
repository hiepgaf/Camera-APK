package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kex */
public final class kex extends kdu {
    /* renamed from: a */
    private final /* synthetic */ Iterable f19187a;
    /* renamed from: b */
    private final /* synthetic */ kbj f19188b;

    public kex(Iterable iterable, kbj kbj) {
        this.f19187a = iterable;
        this.f19188b = kbj;
    }

    public final Iterator iterator() {
        Object it = this.f19187a.iterator();
        Object obj = this.f19188b;
        jri.m13152b(it);
        jri.m13152b(obj);
        return new kfa(it, obj);
    }
}
