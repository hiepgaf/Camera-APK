package p000;

/* compiled from: PG */
/* renamed from: bay */
final class bay implements koj {
    /* renamed from: a */
    private final /* synthetic */ String f10634a;
    /* renamed from: b */
    private final /* synthetic */ kwk f10635b;
    /* renamed from: c */
    private final /* synthetic */ bax f10636c;

    bay(bax bax, String str, kwk kwk) {
        this.f10636c = bax;
        this.f10634a = str;
        this.f10635b = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo419a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return kow.m13617a(Boolean.valueOf(false));
        }
        ird ird = this.f10636c.f1052b;
        if (ird == null) {
            return ((ijk) this.f10635b.mo345a()).mo385a();
        }
        ird.mo1903a(String.valueOf(this.f10634a).concat("#get"));
        ijk ijk = (ijk) this.f10635b.mo345a();
        this.f10636c.f1052b.mo1905b(String.valueOf(this.f10634a).concat("#start"));
        kpk a = ijk.mo385a();
        this.f10636c.f1052b.mo1904b();
        return a;
    }
}
