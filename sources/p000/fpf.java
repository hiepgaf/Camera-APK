package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: fpf */
final class fpf implements fuw {
    /* renamed from: a */
    public final Set f16303a;
    /* renamed from: b */
    private final fuw f16304b;

    fpf(fuw fuw, Set set) {
        this.f16304b = fuw;
        this.f16303a = set;
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        return new fpg(this, this.f16304b.mo404a(fwa));
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return this.f16304b.mo405a();
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return this.f16304b.mo407b();
    }

    /* renamed from: b */
    public final fux mo406b(fwa fwa) {
        fux b = this.f16304b.mo406b(fwa);
        if (b == null) {
            return null;
        }
        return new fpg(this, b);
    }
}
