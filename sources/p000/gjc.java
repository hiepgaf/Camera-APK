package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.uiutils.ReplaceableView;

/* compiled from: PG */
/* renamed from: gjc */
public final class gjc implements gkb {
    /* renamed from: a */
    private static final String f16959a = bli.m862a("SelfieController");
    /* renamed from: b */
    private final ikd f16960b;
    /* renamed from: c */
    private final ilp f16961c;
    /* renamed from: d */
    private gjr f16962d;
    /* renamed from: e */
    private gju f16963e;
    /* renamed from: f */
    private ilp f16964f;
    /* renamed from: g */
    private ilp f16965g;
    /* renamed from: h */
    private boolean f16966h;
    /* renamed from: i */
    private his f16967i;

    public gjc(gju gju, ikd ikd, ilp ilp) {
        this.f16963e = gju;
        this.f16960b = ikd;
        this.f16961c = ilp;
    }

    /* renamed from: a */
    public final kpk mo1492a() {
        bli.m869c(f16959a, "turning selfie flash off");
        ((his) jqk.m13102c(this.f16967i)).m3184a();
        gjr gjr = (gjr) jqk.m13102c(this.f16962d);
        gjr.setVisibility(8);
        return gjr.m2571a();
    }

    /* renamed from: b */
    public final kpk mo1495b() {
        bli.m869c(f16959a, "turning selfie flash on");
        ((his) jqk.m13102c(this.f16967i)).m3185b();
        gjr gjr = (gjr) jqk.m13102c(this.f16962d);
        gjr.setVisibility(0);
        return gjr.m2571a();
    }

    /* renamed from: a */
    public final void mo1493a(ffc ffc) {
        boolean z;
        if (ffc.mo1921c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this.f16966h = z;
        m11115c();
    }

    /* renamed from: c */
    final void m11115c() {
        Object obj = null;
        if (this.f16966h) {
            Object obj2;
            Object obj3;
            hhx hhx = (hhx) this.f16961c.mo2860b();
            int i;
            if (hhx == hhx.VIDEO) {
                i = 1;
            } else if (hhx != hhx.VIDEO_INTENT) {
                obj2 = null;
            } else {
                i = 1;
            }
            int i2;
            if (hhx == hhx.PHOTO) {
                i2 = 1;
            } else if (hhx == hhx.IMAGE_INTENT) {
                i2 = 1;
            } else if (hhx != hhx.PORTRAIT) {
                obj3 = null;
            } else {
                i2 = 1;
            }
            if (obj2 != null && ((String) this.f16964f.mo2860b()).equals("torch")) {
                int i3 = 1;
            } else if (obj3 != null && ((String) this.f16965g.mo2860b()).equals("on")) {
                obj = 1;
            }
        }
        if (obj != null) {
            this.f16963e.mo3061R();
        } else {
            this.f16963e.mo3063Q();
        }
    }

    /* renamed from: a */
    public final void mo1494a(iji iji, ReplaceableView replaceableView, BottomBarController bottomBarController, gkd gkd, his his, gui gui, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg) {
        this.f16964f = ilp2;
        this.f16965g = ilp3;
        this.f16967i = his;
        this.f16962d = new gjr(replaceableView.getContext(), new gjt());
        this.f16962d.setBackgroundColor(-5937);
        replaceableView.m1341a(this.f16962d);
        this.f16963e.mo3448a(bottomBarController, gkd, his, gui, ilp, kbg);
        this.f16963e.mo1562a();
        iji.mo1879a(this.f16964f.mo2859a(new gjd(this), this.f16960b));
        iji.mo1879a(ilp3.mo2859a(new gje(this), this.f16960b));
        iji.mo1879a(this.f16961c.mo2859a(new gjf(this), this.f16960b));
    }
}
