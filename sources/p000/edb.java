package p000;

import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: edb */
public class edb extends gqj {
    /* renamed from: a */
    public static final String f21222a = bli.m862a("CameraUiStatechart");
    /* renamed from: b */
    public Window f21223b;
    /* renamed from: c */
    public hny f21224c;
    /* renamed from: d */
    public BottomBarController f21225d;
    /* renamed from: e */
    public int f21226e;
    /* renamed from: f */
    public ctx f21227f;
    /* renamed from: g */
    public hcd f21228g;
    /* renamed from: h */
    public bxj f21229h;
    /* renamed from: i */
    private bcn f21230i;

    public edb() {
        super(null);
    }

    /* renamed from: a */
    public void mo1562a() {
        super.mo1562a();
        this.f21230i.m791a();
    }

    /* renamed from: a */
    public void mo3421a(Window window, bcn bcn, hny hny, BottomBarController bottomBarController, ctx ctx, hcd hcd, bxj bxj) {
        this.f21223b = window;
        this.f21230i = bcn;
        this.f21224c = hny;
        this.f21225d = bottomBarController;
        this.f21226e = window.getAttributes().rotationAnimation;
        this.f21227f = ctx;
        this.f21228g = hcd;
        this.f21229h = bxj;
    }
}
