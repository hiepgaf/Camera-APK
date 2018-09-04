package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: dll */
public final class dll implements kwk {
    /* renamed from: a */
    private final kwk f13576a;
    /* renamed from: b */
    private final kwk f13577b;
    /* renamed from: c */
    private final kwk f13578c;
    /* renamed from: d */
    private final kwk f13579d;
    /* renamed from: e */
    private final kwk f13580e;
    /* renamed from: f */
    private final kwk f13581f;
    /* renamed from: g */
    private final kwk f13582g;

    public dll(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        this.f13576a = kwk;
        this.f13577b = kwk2;
        this.f13578c = kwk3;
        this.f13579d = kwk4;
        this.f13580e = kwk5;
        this.f13581f = kwk6;
        this.f13582g = kwk7;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f13576a;
        kwk kwk2 = this.f13577b;
        kwk kwk3 = this.f13578c;
        kwk kwk4 = this.f13579d;
        kwk kwk5 = this.f13580e;
        kwk kwk6 = this.f13581f;
        kbg kbg = (kbg) kwk.mo345a();
        Object obj = (dgb) kwk2.mo345a();
        bag bag = (bag) kwk3.mo345a();
        bah bah = (bah) kwk4.mo345a();
        BottomBarController bottomBarController = (BottomBarController) kwk5.mo345a();
        hcd hcd = (hcd) kwk6.mo345a();
        this.f13582g.mo345a();
        if (kbg.mo2084b()) {
            obj = new cvt(bag, bah, (ezx) kbg.mo2081a(), bottomBarController, hcd);
        }
        return (kpk) ktm.m13963a(kow.m13617a(obj), "Cannot return null from a non-@Nullable @Provides method");
    }
}
