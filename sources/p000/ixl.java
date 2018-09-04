package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: ixl */
public final class ixl implements ixm {
    /* renamed from: a */
    private final ixm f18651a;
    /* renamed from: b */
    private final iqx f18652b;
    /* renamed from: c */
    private final iqz f18653c;

    public ixl(ixm ixm, iqz iqz) {
        String valueOf = String.valueOf(ixm);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("ringbuffer [");
        stringBuilder.append(valueOf);
        stringBuilder.append("] insertions");
        valueOf = stringBuilder.toString();
        this.f18653c = iqz;
        this.f18651a = ixm;
        this.f18652b = new iqx(iqz, valueOf);
    }

    /* renamed from: a */
    public final void mo1953a(long j, Object obj) {
        this.f18652b.m4059a();
        this.f18651a.mo1953a(j, obj);
    }

    /* renamed from: a */
    public final int mo1951a() {
        return this.f18651a.mo1951a();
    }

    /* renamed from: a */
    public final Object mo1952a(long j) {
        return this.f18651a.mo1952a(j);
    }

    /* renamed from: b */
    public final List mo1955b() {
        return this.f18651a.mo1955b();
    }

    /* renamed from: c */
    public final Object mo1956c() {
        return this.f18651a.mo1956c();
    }

    /* renamed from: d */
    public final Object mo1957d() {
        return this.f18651a.mo1957d();
    }

    /* renamed from: e */
    public final Collection mo1958e() {
        iqz iqz = this.f18653c;
        String valueOf = String.valueOf(this.f18651a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("Removing all elements from ");
        stringBuilder.append(valueOf);
        iqz.mo514b(stringBuilder.toString());
        return this.f18651a.mo1958e();
    }

    /* renamed from: f */
    public final Object mo1959f() {
        iqz iqz = this.f18653c;
        String valueOf = String.valueOf(this.f18651a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("Removing first element from ");
        stringBuilder.append(valueOf);
        iqz.mo514b(stringBuilder.toString());
        return this.f18651a.mo1959f();
    }

    /* renamed from: a */
    public final boolean mo1954a(int i) {
        return this.f18651a.mo1954a(i);
    }

    /* renamed from: g */
    public final int mo1960g() {
        return this.f18651a.mo1960g();
    }
}
