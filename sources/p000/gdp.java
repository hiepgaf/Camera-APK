package p000;

/* compiled from: PG */
/* renamed from: gdp */
public final class gdp {
    /* renamed from: a */
    public static final bsq f5091a = new bsq("camera.gouda_sec_img", false);
    /* renamed from: b */
    public static final bsq f5092b = new bsq("camera.gouda_debug_img", false);
    /* renamed from: c */
    public static final bsq f5093c = new bsq("camera.gouda.raw", false);
    /* renamed from: d */
    public static final bsq f5094d = new bsq("camera.gouda.front", true);
    /* renamed from: e */
    public static final bsq f5095e = new bsq("camera.gouda.depthdata", false);

    /* renamed from: a */
    public static kbg m2489a(kwk kwk, hjf hjf) {
        Object obj = 1;
        if ((!hjf.m3195c() || hsz.f6608b == null) && !hjf.m3196d()) {
            obj = null;
        }
        if (obj != null) {
            return (kbg) kwk.mo345a();
        }
        return kau.f19138a;
    }

    /* renamed from: a */
    public static fyt m2488a(bkw bkw) {
        return new fxr(ije.m3772a(bkw.f1255a, "camera:max_gouda_inflight_shots", 5));
    }
}
