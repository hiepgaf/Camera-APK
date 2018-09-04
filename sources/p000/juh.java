package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* renamed from: juh */
public final class juh implements Iterable {
    /* renamed from: a */
    public final List f7984a;
    /* renamed from: b */
    public final Set f7985b;
    /* renamed from: c */
    public final long f7986c;
    /* renamed from: d */
    public final long f7987d;

    public juh(Collection collection) {
        this(collection, -1, -1);
    }

    public juh(Collection collection, long j, long j2) {
        this(collection, j, j2, EnumSet.noneOf(jui.class));
    }

    public juh(Collection collection, long j, long j2, Set set) {
        this.f7984a = khb.m4895c((Iterable) collection);
        this.f7985b = khb.m4890b((Iterable) set);
        Collections.sort(this.f7984a);
        if (j == -1 && this.f7984a.size() != 0) {
            j = ((Long) this.f7984a.get(0)).longValue();
        }
        this.f7986c = j;
        if (j2 == -1 && this.f7984a.size() != 0) {
            List list = this.f7984a;
            j2 = ((Long) list.get(list.size() - 1)).longValue();
        }
        this.f7987d = j2;
        long j3 = this.f7987d;
        long j4 = this.f7986c;
        if (j3 < j4) {
            StringBuilder stringBuilder = new StringBuilder(71);
            stringBuilder.append("Segment range is negative: ");
            stringBuilder.append(j4);
            stringBuilder.append(" to ");
            stringBuilder.append(j3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (Long longValue : this.f7984a) {
            j4 = longValue.longValue();
            long j5 = this.f7986c;
            if (j4 >= j5) {
                if (j4 > this.f7987d) {
                }
            }
            long j6 = this.f7987d;
            StringBuilder stringBuilder2 = new StringBuilder(93);
            stringBuilder2.append("Frame ");
            stringBuilder2.append(j4);
            stringBuilder2.append(" is not within segment [");
            stringBuilder2.append(j5);
            stringBuilder2.append(", ");
            stringBuilder2.append(j6);
            stringBuilder2.append("]");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    public juh(Collection collection, Set set) {
        this(collection, -1, -1, set);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof juh)) {
            return false;
        }
        juh juh = (juh) obj;
        if (juh.f7986c == this.f7986c && juh.f7987d == this.f7987d && juh.f7985b.equals(this.f7985b) && juh.f7984a.equals(this.f7984a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long m4644a() {
        jri.m13154b(m4646b() ^ 1, (Object) "No frames in segment");
        return ((Long) this.f7984a.get(0)).longValue();
    }

    /* renamed from: a */
    public final boolean m4645a(jui jui) {
        return this.f7985b.contains(jui);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f7986c), Long.valueOf(this.f7987d), this.f7984a, this.f7985b});
    }

    /* renamed from: b */
    public final boolean m4646b() {
        return this.f7984a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f7984a.iterator();
    }

    /* renamed from: c */
    public final long m4647c() {
        jri.m13154b(m4646b() ^ 1, (Object) "No frames in segment");
        List list = this.f7984a;
        return ((Long) list.get(list.size() - 1)).longValue();
    }

    /* renamed from: d */
    public final int m4648d() {
        return this.f7984a.size();
    }

    public final String toString() {
        long j = this.f7986c;
        long j2 = this.f7987d;
        String valueOf = String.valueOf(this.f7985b);
        int size = this.f7984a.size();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 82);
        stringBuilder.append("[range=");
        stringBuilder.append(j);
        stringBuilder.append(":");
        stringBuilder.append(j2);
        stringBuilder.append(", labels=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", frameCount=");
        stringBuilder.append(size);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
