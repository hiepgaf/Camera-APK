package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jvz */
public final class jvz implements jwa {
    /* renamed from: a */
    private final float f21977a;
    /* renamed from: b */
    private final int f21978b;
    /* renamed from: c */
    private final jwa f21979c;
    /* renamed from: d */
    private final Set f21980d = new HashSet();
    /* renamed from: e */
    private Long f21981e = Long.valueOf(-1);
    /* renamed from: f */
    private final SortedSet f21982f = new TreeSet();
    /* renamed from: g */
    private final int f21983g;

    public jvz(jwa jwa) {
        jri.m13143a(true);
        jri.m13143a(true);
        this.f21979c = jwa;
        this.f21977a = 10.0f;
        this.f21983g = 2;
        this.f21978b = Math.round(1.0E9f / this.f21977a);
    }

    /* renamed from: a */
    public final synchronized Set mo3186a() {
        return this.f21979c.mo3186a();
    }

    /* renamed from: a */
    public final synchronized void mo2034a(long j) {
        this.f21980d.remove(Long.valueOf(j));
        this.f21979c.mo2034a(j);
    }

    /* renamed from: b */
    public final synchronized void mo2035b(long j) {
        if (this.f21981e.longValue() < 0) {
            this.f21981e = Long.valueOf(j);
        }
        if (j > this.f21981e.longValue() - 16666666) {
            this.f21980d.add(Long.valueOf(j));
            this.f21981e = Long.valueOf(this.f21981e.longValue() + ((long) this.f21978b));
        }
        this.f21979c.mo2035b(j);
    }

    /* renamed from: b */
    public final synchronized kbg mo3187b() {
        kbg kbg;
        if (this.f21982f.isEmpty()) {
            kbg = kau.f19138a;
        } else {
            long longValue = ((Long) this.f21982f.first()).longValue();
            SortedSet sortedSet = this.f21982f;
            Long valueOf = Long.valueOf(longValue);
            sortedSet.remove(valueOf);
            kbg = kbg.m4745c(valueOf);
        }
        return kbg;
    }

    /* renamed from: c */
    public final synchronized void mo3188c() {
        this.f21982f.clear();
        this.f21979c.mo3188c();
    }

    /* renamed from: d */
    public final synchronized long mo3189d() {
        long d;
        d = this.f21979c.mo3189d();
        while (this.f21982f.size() < this.f21983g) {
            Set set = this.f21980d;
            Long valueOf = Long.valueOf(d);
            if (!set.contains(valueOf) || mo3186a().size() <= 8) {
                break;
            }
            this.f21979c.mo2034a(d);
            this.f21980d.remove(valueOf);
            this.f21982f.add(valueOf);
            d = this.f21979c.mo3189d();
        }
        return d;
    }
}
