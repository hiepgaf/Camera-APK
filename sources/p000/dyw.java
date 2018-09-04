package p000;

/* compiled from: PG */
/* renamed from: dyw */
public final class dyw implements kwk {
    /* renamed from: a */
    private final kwk f14751a;
    /* renamed from: b */
    private final kwk f14752b;

    public dyw(kwk kwk, kwk kwk2) {
        this.f14751a = kwk;
        this.f14752b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f14751a;
        gor gor = (gor) kwk.mo345a();
        if (((kbg) this.f14752b.mo345a()).mo2084b()) {
            a = gor.m2666a("default_scope", "pref_camera_rect_key_ver_1", true);
        } else {
            a = imh.m3845a(Boolean.valueOf(false));
        }
        return (ilp) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
