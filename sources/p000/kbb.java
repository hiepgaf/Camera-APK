package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kbb */
final class kbb extends kaz {
    /* renamed from: b */
    private final /* synthetic */ kaz f19145b;

    kbb(kaz kaz, kaz kaz2) {
        this.f19145b = kaz;
        super(kaz2);
    }

    /* renamed from: a */
    public final Appendable mo2092a(Appendable appendable, Iterator it) {
        jri.m13139a((Object) appendable, (Object) "appendable");
        jri.m13139a((Object) it, (Object) "parts");
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                appendable.append(this.f19145b.mo2089a(next));
                break;
            }
        }
        while (it.hasNext()) {
            next = it.next();
            if (next != null) {
                appendable.append(this.f19145b.f8178a);
                appendable.append(this.f19145b.mo2089a(next));
            }
        }
        return appendable;
    }

    /* renamed from: b */
    public final kaz mo2091b(String str) {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    /* renamed from: c */
    public final kbc mo2093c(String str) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}
