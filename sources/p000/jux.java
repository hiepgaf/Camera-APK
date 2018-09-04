package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jux */
public final class jux extends jum {
    /* renamed from: a */
    private final jwb f21934a;

    public jux(jwb jwb) {
        jri.m13152b((Object) jwb);
        this.f21934a = jwb;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        Collection b = khb.m4885b();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (this.f21934a.mo2057a(longValue)) {
                b.add(Long.valueOf(longValue));
            }
        }
        return new juh(b, juh.f7985b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21934a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
        stringBuilder.append("FrameFilterSegmentFilter[filter=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
