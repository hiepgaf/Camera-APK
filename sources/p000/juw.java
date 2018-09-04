package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: juw */
public final class juw extends jum {
    /* renamed from: a */
    private final jwa f21932a;
    /* renamed from: b */
    private final int f21933b;

    public juw(jwa jwa, int i) {
        this.f21932a = jwa;
        this.f21933b = i;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        Collection d = khb.m4900d((Iterable) juh);
        this.f21932a.mo3188c();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            this.f21932a.mo2035b(((Long) it.next()).longValue());
        }
        while (d.size() > this.f21933b) {
            long d2 = this.f21932a.mo3189d();
            d.remove(Long.valueOf(d2));
            this.f21932a.mo2034a(d2);
        }
        return new juh(d, juh.f7985b);
    }

    public final String toString() {
        int i = this.f21933b;
        String valueOf = String.valueOf(this.f21932a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
        stringBuilder.append("FrameDropperSegmentFilter[size=");
        stringBuilder.append(i);
        stringBuilder.append(", dropper=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
