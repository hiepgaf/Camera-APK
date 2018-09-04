package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: jus */
public final class jus extends jum {
    /* renamed from: a */
    private final List f21917a;

    private jus(List list) {
        jri.m13152b((Object) list);
        this.f21917a = list;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        for (jum a : this.f21917a) {
            juh = a.mo3176a(juh);
        }
        return juh;
    }

    /* renamed from: a */
    public static jus m16346a(jum... jumArr) {
        return new jus(khb.m4864a((Object[]) jumArr));
    }

    public final String toString() {
        String a = kaz.m4732a(",").m4735a(this.f21917a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 30);
        stringBuilder.append("ChainedSegmentFilter[filters=");
        stringBuilder.append(a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
