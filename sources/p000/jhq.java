package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jhq */
public final class jhq implements jhs {
    /* renamed from: a */
    private final AtomicReference f23396a;
    /* renamed from: b */
    private final jbj f23397b;
    /* renamed from: c */
    private final jas f23398c;

    public jhq(ize ize) {
        this((Object) ize);
    }

    private jhq(Object obj) {
        this.f23397b = jbj.m12751d();
        this.f23398c = jas.m12715a(this.f23397b);
        jri.m13152b(obj);
        this.f23396a = new AtomicReference(obj);
    }

    public final void close() {
        jli.m12951c(mo3162a());
    }

    /* renamed from: a */
    public final jas mo3162a() {
        Object d = m17653d();
        if (d != null) {
            jbj jbj = this.f23397b;
            ((ize) d).mo3162a().mo1974a(kpq.f8410a, new jbf(jbj), new jbe(jbj)).mo1980a(izw.f18704a);
        }
        return this.f23398c;
    }

    /* renamed from: b */
    public final Object mo3494b() {
        Object d = m17653d();
        if (d == null) {
            throw new jhu();
        }
        this.f23397b.m12763a(izg.f7590a);
        jli.m12951c(this.f23398c);
        return d;
    }

    /* renamed from: c */
    public final Object mo3495c() {
        Object obj = this.f23396a.get();
        if (obj != null) {
            return obj;
        }
        throw new jhu();
    }

    /* renamed from: d */
    private final Object m17653d() {
        return this.f23396a.getAndSet(null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f23396a.get());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("single-owner[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
