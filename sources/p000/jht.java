package p000;

/* compiled from: PG */
/* renamed from: jht */
public final class jht implements jhs {
    /* renamed from: a */
    private boolean f23400a = false;
    /* renamed from: b */
    private final /* synthetic */ jhs f23401b;
    /* renamed from: c */
    private final /* synthetic */ Iterable f23402c;

    public jht(jhs jhs, Iterable iterable) {
        this.f23401b = jhs;
        this.f23402c = iterable;
    }

    public final void close() {
        jli.m12951c(mo3162a());
    }

    /* renamed from: a */
    public final synchronized jas mo3162a() {
        jas a;
        if (this.f23400a) {
            a = this.f23401b.mo3162a();
        } else {
            a = jas.m12715a(this.f23401b.mo3162a().m12727b(kpq.f8410a, new jlf(this.f23402c)));
        }
        return a;
    }

    /* renamed from: b */
    public final synchronized Object mo3494b() {
        Object b;
        b = this.f23401b.mo3494b();
        this.f23400a = true;
        return b;
    }

    /* renamed from: c */
    public final Object mo3495c() {
        return this.f23401b.mo3495c();
    }
}
