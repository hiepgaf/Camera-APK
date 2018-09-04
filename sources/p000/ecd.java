package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.modeswitch.ViewfinderCover;

/* compiled from: PG */
/* renamed from: ecd */
public class ecd extends gqj {
    /* renamed from: a */
    public static final String f21209a = bli.m862a("FacingChart");
    /* renamed from: b */
    public final ebw f21210b;
    /* renamed from: c */
    public final ffc f21211c;
    /* renamed from: d */
    public final ffc f21212d;
    /* renamed from: e */
    public final gkb f21213e;
    /* renamed from: f */
    public final gjk f21214f;
    /* renamed from: g */
    public ViewfinderCover f21215g;
    /* renamed from: h */
    public gal f21216h;
    /* renamed from: i */
    public BottomBarController f21217i;
    /* renamed from: j */
    public how f21218j;
    /* renamed from: k */
    public ayb f21219k;

    public ecd(ebw ebw, fbn fbn, gkb gkb, gjk gjk) {
        super(null);
        this.f21210b = ebw;
        this.f21213e = gkb;
        this.f21214f = gjk;
        iur b = fbn.mo1346b(iut.BACK);
        if (b != null) {
            this.f21211c = fbn.m10176b(b);
        } else {
            this.f21211c = null;
        }
        b = fbn.mo1346b(iut.FRONT);
        if (b != null) {
            this.f21212d = fbn.m10176b(b);
        } else {
            this.f21212d = null;
        }
    }

    /* renamed from: a */
    public void mo3420a(kwk kwk, BottomBarController bottomBarController, how how, gal gal, ayb ayb) {
        this.f21215g = (ViewfinderCover) ((hes) kwk.mo345a()).f6120j.m3223a((int) R.id.viewfinder_cover);
        this.f21217i = bottomBarController;
        this.f21218j = how;
        this.f21216h = gal;
        this.f21219k = ayb;
    }

    /* renamed from: a */
    public final void m15518a(iut iut) {
        if (iut == iut.BACK) {
            mo2998p();
        } else {
            mo2996n();
        }
    }
}
