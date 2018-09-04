package p000;

/* compiled from: PG */
/* renamed from: bxg */
public final class bxg {
    /* renamed from: b */
    public static final bsb f1686b = new bsb("camera.raisr");
    /* renamed from: c */
    public static final bsa f1687c = new bsa("camera.p3");
    /* renamed from: d */
    public static final bsa f1688d = new bsa("camera.slowraw.RESTART");
    /* renamed from: e */
    public static final bsa f1689e = new bsa("camera.tbinning.RESTART");
    /* renamed from: f */
    public static final bsa f1690f = new bsa("camera.gcam_awb");
    /* renamed from: a */
    public final bmb f1691a;
    /* renamed from: g */
    public final int f1692g = 3;
    /* renamed from: h */
    public final int f1693h;
    /* renamed from: i */
    public final int f1694i;

    bxg(bkw bkw, bmb bmb, iwc iwc) {
        boolean z;
        boolean z2 = true;
        this.f1691a = bmb;
        this.f1693h = Math.max(this.f1692g, iwc.m4273a("persist.gcam.max_burst_size", bkw.m852d()));
        this.f1694i = Math.max(this.f1692g, iwc.m4273a("persist.gcam.zsl_buffer_size", ije.m3772a(bkw.f1255a, "camera:hdr_plus_zsl_buffer_count", bkw.m852d() + 2)));
        if (this.f1692g <= this.f1693h) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (this.f1693h > this.f1694i) {
            z2 = false;
        }
        jri.m13153b(z2);
    }
}
