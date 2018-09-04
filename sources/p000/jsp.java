package p000;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: jsp */
public final class jsp implements Comparable {
    /* renamed from: a */
    public final jiq f7946a;
    /* renamed from: b */
    public final juh f7947b;

    public jsp(jiq jiq, juh juh) {
        jri.m13152b((Object) jiq);
        jri.m13152b((Object) juh);
        this.f7946a = jiq;
        this.f7947b = juh;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(((jsp) obj).f7946a.mo2011a(), this.f7946a.mo2011a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jsp jsp = (jsp) obj;
        if (this.f7946a.equals(jsp.f7946a) && this.f7947b.equals(jsp.f7947b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f7946a, this.f7947b});
    }
}
