package p000;

/* compiled from: PG */
/* renamed from: fnt */
public final class fnt implements kwk {
    /* renamed from: a */
    private final kwk f16238a;
    /* renamed from: b */
    private final kwk f16239b;

    public fnt(fnr fnr, kwk kwk, kwk kwk2) {
        this.f16238a = kwk;
        this.f16239b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16238a;
        bkw bkw = (bkw) kwk.mo345a();
        ivw ivw = (ivw) this.f16239b.mo345a();
        int a = ije.m3772a(bkw.f1255a, "camera:global_imagereader_ticket_limit", Math.max(bkw.m850b(), bkw.m851c()) + Math.min(10, bkw.m852d()));
        fyt fxr = new fxr(a);
        ivw.mo414b().mo1879a(fxr.mo1430c().mo2859a(new fns(a), kpq.f8410a));
        return (fyt) ktm.m13963a(fxr, "Cannot return null from a non-@Nullable @Provides method");
    }
}
