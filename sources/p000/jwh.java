package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jwh */
public final class jwh implements jwa {
    /* renamed from: a */
    private final SortedSet f21990a = new TreeSet();

    /* renamed from: a */
    public final synchronized Set mo3186a() {
        return new HashSet(this.f21990a);
    }

    /* renamed from: a */
    public final synchronized void mo2034a(long j) {
        this.f21990a.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized void mo2035b(long j) {
        this.f21990a.add(Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized kbg mo3187b() {
        return kau.f19138a;
    }

    /* renamed from: c */
    public final synchronized void mo3188c() {
        this.f21990a.clear();
    }

    /* renamed from: d */
    public final synchronized long mo3189d() {
        return ((Long) this.f21990a.first()).longValue();
    }
}
