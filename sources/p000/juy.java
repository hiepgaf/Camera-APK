package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: juy */
public final class juy implements Comparator {
    /* renamed from: a */
    private final jtv f7993a;

    public juy(jtv jtv) {
        jri.m13152b((Object) jtv);
        this.f7993a = jtv;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(this.f7993a.mo2049a(((Long) obj).longValue()).mo2076a(), this.f7993a.mo2049a(((Long) obj2).longValue()).mo2076a());
    }
}
