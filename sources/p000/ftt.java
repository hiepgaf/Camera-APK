package p000;

/* compiled from: PG */
/* renamed from: ftt */
public final class ftt implements fuw {
    /* renamed from: a */
    private final fuw f16519a;
    /* renamed from: b */
    private final fuc f16520b;

    public ftt(fuw fuw, fuc fuc) {
        this.f16520b = fuc;
        this.f16519a = fuw;
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        return m10758a(this.f16519a.mo404a(fwa), fwa);
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return this.f16519a.mo405a();
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return this.f16519a.mo407b();
    }

    /* renamed from: b */
    public final fux mo406b(fwa fwa) {
        fwa.f4753b.mo2870a(new ftu());
        fux b = this.f16519a.mo406b(fwa);
        if (b == null) {
            return null;
        }
        return m10758a(b, fwa);
    }

    /* renamed from: a */
    private final fux m10758a(fux fux, fwa fwa) {
        glm ftu = new ftu();
        fwa.f4753b.mo2870a(ftu);
        String n = fwa.f4753b.mo2886n();
        fuc fuc = this.f16520b;
        jri.m13143a(n.isEmpty() ^ 1);
        return new ftv(fux, ftu.f16521a, new fud(fuc, new fub(n)), this.f16520b);
    }
}
