package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hgo */
public final class hgo implements hhj {
    /* renamed from: a */
    public final Context f17816a;
    /* renamed from: b */
    public final ikd f17817b;
    /* renamed from: c */
    public final kbg f17818c;
    /* renamed from: d */
    public final goy f17819d;
    /* renamed from: e */
    public final boolean f17820e;
    /* renamed from: f */
    public final ilp f17821f;
    /* renamed from: g */
    public final gal f17822g;
    /* renamed from: h */
    public final AtomicBoolean f17823h = new AtomicBoolean(false);
    /* renamed from: i */
    public final AtomicReference f17824i = new AtomicReference();
    /* renamed from: j */
    public final AtomicReference f17825j = new AtomicReference();
    /* renamed from: k */
    public gbd f17826k;
    /* renamed from: l */
    private final kwk f17827l;
    /* renamed from: m */
    private final iji f17828m;
    /* renamed from: n */
    private final Resources f17829n;
    /* renamed from: o */
    private final hco f17830o;
    /* renamed from: p */
    private final ilp f17831p;
    /* renamed from: q */
    private final ilp f17832q;
    /* renamed from: r */
    private final AtomicReference f17833r = new AtomicReference();
    /* renamed from: s */
    private final AtomicReference f17834s = new AtomicReference();
    /* renamed from: t */
    private final hny f17835t;

    public hgo(Context context, kwk kwk, aws aws, ikd ikd, Resources resources, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg, hco hco, gal gal, goy goy, boolean z, hny hny) {
        this.f17816a = context;
        this.f17827l = kwk;
        this.f17828m = aws.mo373a();
        this.f17817b = ikd;
        this.f17829n = resources;
        this.f17818c = kbg;
        this.f17831p = ilp;
        this.f17832q = ilp3;
        this.f17821f = ilp2;
        this.f17830o = hco;
        this.f17819d = goy;
        this.f17820e = z;
        this.f17822g = gal;
        this.f17835t = hny;
    }

    /* renamed from: b */
    final void m11814b() {
        boolean z = this.f17819d.m2693a("ext_mic_tutorial_dismiss") <= 0 ? !((Boolean) this.f17832q.mo2860b()).booleanValue() ? this.f17820e : true : true;
        if (!z) {
            View view = (View) this.f17825j.get();
            if (view != null) {
                String string = this.f17829n.getString(R.string.mic_off_tooltip);
                WeakReference weakReference = new WeakReference((OptionsBarView) ((hes) this.f17827l.mo345a()).f6120j.m3223a((int) R.id.optionsbar2));
                WeakReference weakReference2 = new WeakReference(view);
                hcx a = this.f17830o.m3074a(string).mo1725a(view);
                a.f17656j = 2;
                m11813a(a.m11762c().m11759a(true).m11760b().m11755a().m11758a(new hgs(weakReference2, weakReference)).m11757a(new hgt(this), this.f17817b).m11761b(new hgu(this), this.f17817b).m11763d());
            }
        }
    }

    /* renamed from: c */
    final void m11816c() {
        if (!m11817d() && this.f17818c.mo2084b()) {
            View view = (View) this.f17824i.get();
            if (view != null) {
                String string;
                if (gon.m2661a(((Integer) this.f17831p.mo2860b()).intValue()) == gon.MICRO_OFF) {
                    string = this.f17829n.getString(R.string.micro_off_tooltip);
                } else {
                    string = this.f17829n.getString(R.string.micro_on_tooltip);
                }
                WeakReference weakReference = new WeakReference((OptionsBarView) ((hes) this.f17827l.mo345a()).f6120j.m3223a((int) R.id.optionsbar2));
                WeakReference weakReference2 = new WeakReference(view);
                hcx a = this.f17830o.m3074a(string).mo1725a(view);
                a.f17656j = 2;
                m11815b(a.m11762c().m11759a(false).m11760b().m11758a(new hgq(weakReference2, weakReference)).m11757a(new hgr(this), this.f17817b).m11763d());
            }
        }
    }

    /* renamed from: d */
    public final boolean m11817d() {
        gon a = gon.m2661a(((Integer) this.f17831p.mo2860b()).intValue());
        if (this.f17819d.m2693a("micro_tutorial_dismiss") <= 0 && a.equals(gon.MICRO_AUTO)) {
            ((eth) this.f17818c.mo2081a()).mo3027d();
            if (!this.f17820e) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static eti m11810a(gon gon) {
        switch (gon.ordinal()) {
            case 0:
                return eti.MICROVIDEO_MODE_OFF;
            case 1:
                return eti.MICROVIDEO_MODE_AUTO;
            case 2:
                return eti.MICROVIDEO_MODE_ON;
            default:
                String valueOf = String.valueOf(gon);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Unknown microvideo option: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    final void m11813a(iqo iqo) {
        hgo.m11811a(iqo, this.f17834s);
    }

    /* renamed from: b */
    final void m11815b(iqo iqo) {
        hgo.m11811a(iqo, this.f17833r);
    }

    /* renamed from: a */
    private static void m11811a(iqo iqo, AtomicReference atomicReference) {
        iqo iqo2 = (iqo) atomicReference.getAndSet(iqo);
        if (iqo2 != null) {
            iqo2.close();
        }
    }

    /* renamed from: a */
    public final void mo1729a() {
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ((hes) this.f17827l.mo345a()).f6120j.m3223a((int) R.id.activity_root_view);
        Object obj = (OptionsBarView) ((hes) this.f17827l.mo345a()).f6120j.m3223a((int) R.id.optionsbar2);
        obj.setVisibility(0);
        mainActivityLayout.f12346b = ken.m13453a(obj);
        mainActivityLayout.m8437a();
        mainActivityLayout.f12349e = new hfs(this);
        this.f17826k = new gbd(obj, this.f17835t);
        FrameLayout frameLayout = (FrameLayout) ((hes) this.f17827l.mo345a()).f6120j.m3223a((int) R.id.menu_button_holder);
        OptionsBarView optionsBarView = this.f17822g.f4984b;
        optionsBarView.f20402g = frameLayout;
        optionsBarView.f20399d.f4843e.setIronView(frameLayout);
        gal gal = this.f17822g;
        gbj gbj = new gbj(this);
        OptionsBarView optionsBarView2 = gal.f4984b;
        if (!optionsBarView2.f20397b.contains(gbj)) {
            optionsBarView2.f20397b.add(gbj);
        }
        if (this.f17818c.mo2084b()) {
            this.f17828m.mo1879a(this.f17831p.mo2859a(new hgp(this), this.f17817b));
            ((eth) this.f17818c.mo2081a()).mo3024a(new hgx(this), new hgy(this));
            ((eth) this.f17818c.mo2081a()).mo3023a(hgo.m11810a(gon.m2661a(((Integer) this.f17831p.mo2860b()).intValue())));
            this.f17822g.m2459a(fzo.MICROVIDEO, new hgz(this));
            obj.m15082a(fzo.MICROVIDEO, new hha(this));
            obj.m15081a(fzo.MICROVIDEO, new hhb(this));
            this.f17822g.m2459a(fzo.MICROPHONE, new hhc(this));
            obj.m15082a(fzo.MICROPHONE, new hhd(this));
            obj.m15081a(fzo.MICROPHONE, new hhe(this));
        }
    }
}
