package p000;

import android.content.Context;
import android.view.Window;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.uiutils.ReplaceableView;

/* compiled from: PG */
/* renamed from: hgd */
public final class hgd implements hhj {
    /* renamed from: a */
    private final kbg f17750a;
    /* renamed from: b */
    private final kbg f17751b;
    /* renamed from: c */
    private final kbg f17752c;
    /* renamed from: d */
    private final kbg f17753d;
    /* renamed from: e */
    private final kwk f17754e;
    /* renamed from: f */
    private final kwk f17755f;
    /* renamed from: g */
    private final kwk f17756g;
    /* renamed from: h */
    private final kwk f17757h;
    /* renamed from: i */
    private final kwk f17758i;
    /* renamed from: j */
    private final kwk f17759j;
    /* renamed from: k */
    private final kwk f17760k;
    /* renamed from: l */
    private final ilp f17761l;
    /* renamed from: m */
    private final ilp f17762m;
    /* renamed from: n */
    private final ilp f17763n;
    /* renamed from: o */
    private final aws f17764o;
    /* renamed from: p */
    private final enr f17765p;
    /* renamed from: q */
    private final Context f17766q;
    /* renamed from: r */
    private final ird f17767r;

    public hgd(kbg kbg, kbg kbg2, kbg kbg3, kbg kbg4, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, aws aws, ilp ilp, ilp ilp2, ilp ilp3, enr enr, Context context, ird ird) {
        this.f17750a = kbg;
        this.f17751b = kbg2;
        this.f17752c = kbg3;
        this.f17753d = kbg4;
        this.f17755f = kwk2;
        this.f17756g = kwk3;
        this.f17762m = ilp2;
        this.f17763n = ilp3;
        this.f17757h = kwk4;
        this.f17754e = kwk;
        this.f17758i = kwk5;
        this.f17759j = kwk6;
        this.f17760k = kwk7;
        this.f17761l = ilp;
        this.f17765p = enr;
        this.f17764o = aws;
        this.f17766q = context;
        this.f17767r = ird;
    }

    /* renamed from: a */
    public final void mo1729a() {
        hkg hkg = ((hes) this.f17754e.mo345a()).f6120j;
        ((gkb) this.f17756g.mo345a()).mo1494a(this.f17764o.mo373a(), (ReplaceableView) hkg.m3223a((int) R.id.fullscreen_selfie_flash), (BottomBarController) this.f17757h.mo345a(), new gkd((gal) this.f17755f.mo345a(), (BottomBarController) this.f17757h.mo345a(), (hes) this.f17754e.mo345a(), (Window) this.f17758i.mo345a()), (his) this.f17760k.mo345a(), (gui) this.f17759j.mo345a(), this.f17761l, this.f17763n, this.f17762m, this.f17753d);
        this.f17767r.mo1903a("WireSmarts");
        if (this.f17751b.mo2084b()) {
            hkg.m3223a((int) R.id.smarts_ui_replaceableview);
            hkg.m3223a((int) R.id.smarts_ui_overlay);
            hkg.m3223a((int) R.id.smarts_preview_overlay);
            this.f17767r.mo1903a("SmartsInit");
            ((gpk) this.f17751b.mo2081a()).m11286b();
            this.f17767r.mo1905b("addObserver");
            this.f17765p.m1906a((gpk) this.f17751b.mo2081a());
            this.f17767r.mo1904b();
        } else if (this.f17750a.mo2084b()) {
            ((hes) this.f17754e.mo345a()).f6120j.m3223a((int) R.id.iris_overlay);
            this.f17767r.mo1903a("IrisController#get");
            ((cdd) this.f17750a.mo2081a()).c_();
            this.f17767r.mo1905b("addObserver");
            this.f17765p.m1906a((cdd) this.f17750a.mo2081a());
            this.f17767r.mo1904b();
        }
        this.f17767r.mo1905b("WireMicro");
        if (this.f17752c.mo2084b()) {
            this.f17765p.m1906a((eth) this.f17752c.mo2081a());
        }
        this.f17767r.mo1905b("WireBottomBar");
        ((BottomBarController) this.f17757h.mo345a()).wireListeners();
        this.f17767r.mo1904b();
        if (this.f17753d.mo2084b()) {
            ((fbg) this.f17753d.mo2081a()).mo1335a(this.f17766q, (ReplaceableView) hkg.m3223a((int) R.id.notification_chip));
        }
    }
}
