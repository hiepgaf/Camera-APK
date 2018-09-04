package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: hah */
public final class hah implements kwk {
    /* renamed from: a */
    private final kwk f17597a;
    /* renamed from: b */
    private final kwk f17598b;
    /* renamed from: c */
    private final kwk f17599c;
    /* renamed from: d */
    private final kwk f17600d;
    /* renamed from: e */
    private final kwk f17601e;

    public hah(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f17597a = kwk;
        this.f17598b = kwk2;
        this.f17599c = kwk3;
        this.f17600d = kwk4;
        this.f17601e = kwk5;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f17597a;
        kwk kwk2 = this.f17598b;
        kwk kwk3 = this.f17599c;
        kwk kwk4 = this.f17600d;
        Context context = (Context) kwk.mo345a();
        BottomBarController bottomBarController = (BottomBarController) kwk2.mo345a();
        ena ena = (ena) kwk3.mo345a();
        ikd ikd = (ikd) kwk4.mo345a();
        eol gwp = new gwp(context, bottomBarController, (irs) this.f17601e.mo345a());
        eio.m1756a(ikd, ena, gwp);
        return (gwp) ktm.m13963a(gwp, "Cannot return null from a non-@Nullable @Provides method");
    }
}
