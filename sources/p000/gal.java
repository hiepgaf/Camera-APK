package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gal */
public class gal {
    /* renamed from: a */
    public static final String f4957a = gal.class.getSimpleName();
    /* renamed from: A */
    private final ilp f4958A;
    /* renamed from: B */
    private final ilp f4959B;
    /* renamed from: C */
    private final fzm f4960C;
    /* renamed from: D */
    private final fzm f4961D;
    /* renamed from: E */
    private final fzm f4962E;
    /* renamed from: F */
    private final fzm f4963F;
    /* renamed from: G */
    private final fzm f4964G;
    /* renamed from: H */
    private final fzm f4965H;
    /* renamed from: I */
    private final fzm f4966I;
    /* renamed from: J */
    private final fzm f4967J;
    /* renamed from: K */
    private final fzm f4968K;
    /* renamed from: L */
    private final fzm f4969L;
    /* renamed from: M */
    private final fzm f4970M;
    /* renamed from: N */
    private final fzm f4971N;
    /* renamed from: O */
    private final fzm f4972O;
    /* renamed from: P */
    private final fzm f4973P;
    /* renamed from: Q */
    private final fzm f4974Q;
    /* renamed from: R */
    private final fzm f4975R;
    /* renamed from: S */
    private final ilp f4976S;
    /* renamed from: T */
    private final boolean f4977T;
    /* renamed from: U */
    private final boolean f4978U;
    /* renamed from: V */
    private final boolean f4979V;
    /* renamed from: W */
    private final boolean f4980W;
    /* renamed from: X */
    private boolean f4981X;
    /* renamed from: Y */
    private final kcx f4982Y = kee.m13439a(fzp.TIMER_ZERO_SECONDS, Integer.valueOf(0), fzp.TIMER_THREE_SECONDS, Integer.valueOf(3), fzp.TIMER_TEN_SECONDS, Integer.valueOf(10));
    /* renamed from: Z */
    private final kcx f4983Z = kee.m13439a(fzp.HDR_OFF, fxj.OFF, fzp.HDR_AUTO, fxj.AUTO, fzp.HDR_ON, fxj.ON);
    private final kcx aa;
    private final kcx ab;
    private final kcx ac;
    private final kcx ad;
    private final kcx ae;
    private final kcx af;
    private final kcx ag;
    private final kcx ah;
    private final kcx ai;
    /* renamed from: b */
    public final OptionsBarView f4984b;
    /* renamed from: c */
    public final ilp f4985c;
    /* renamed from: d */
    public final ikd f4986d;
    /* renamed from: e */
    public final ilp f4987e;
    /* renamed from: f */
    public final ilp f4988f;
    /* renamed from: g */
    public final ilp f4989g;
    /* renamed from: h */
    public final ilp f4990h;
    /* renamed from: i */
    public final fzm f4991i;
    /* renamed from: j */
    public boolean f4992j;
    /* renamed from: k */
    public boolean f4993k;
    /* renamed from: l */
    public boolean f4994l;
    /* renamed from: m */
    public boolean f4995m;
    /* renamed from: n */
    private final iji f4996n;
    /* renamed from: o */
    private final Map f4997o;
    /* renamed from: p */
    private final ilp f4998p;
    /* renamed from: q */
    private final ilp f4999q;
    /* renamed from: r */
    private final boolean f5000r;
    /* renamed from: s */
    private final ilp f5001s;
    /* renamed from: t */
    private final ilp f5002t;
    /* renamed from: u */
    private final ilp f5003u;
    /* renamed from: v */
    private final ilp f5004v;
    /* renamed from: w */
    private final ilp f5005w;
    /* renamed from: x */
    private final ilp f5006x;
    /* renamed from: y */
    private final ilp f5007y;
    /* renamed from: z */
    private final ilp f5008z;

    public gal(OptionsBarView optionsBarView, ilp ilp, ikd ikd, iji iji, fzy fzy, bkw bkw, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, boolean z, ilp ilp7, ilp ilp8, ilp ilp9, ilp ilp10, ilp ilp11, ilp ilp12, ilp ilp13, boolean z2, ilp ilp14, boolean z3, ilp ilp15, boolean z4, ilp ilp16, ilp ilp17, boolean z5, ilp ilp18) {
        fzp fzp = fzp.SELECTED;
        Boolean valueOf = Boolean.valueOf(true);
        fzp fzp2 = fzp.UNSELECTED;
        Boolean valueOf2 = Boolean.valueOf(false);
        this.aa = kee.m13438a(fzp, valueOf, fzp2, valueOf2);
        Object obj = fzp.WHITE_BALANCE_AUTO;
        Object obj2 = feq.AUTO;
        Object obj3 = fzp.WHITE_BALANCE_CLOUDY;
        Object obj4 = feq.CLOUDY;
        Object obj5 = fzp.WHITE_BALANCE_SUNNY;
        Object obj6 = feq.SUNNY;
        Object obj7 = fzp.WHITE_BALANCE_FLUORESCENT;
        Object obj8 = feq.FLUORESCENT;
        Object obj9 = fzp.WHITE_BALANCE_INCANDESCENT;
        Object obj10 = feq.INCANDESCENT;
        khb.m4892b(obj, obj2);
        khb.m4892b(obj3, obj4);
        khb.m4892b(obj5, obj6);
        khb.m4892b(obj7, obj8);
        khb.m4892b(obj9, obj10);
        this.ab = new kgg(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, 5);
        this.ac = kee.m13439a(fzp.PHOTO_FLASH_AUTO, "auto", fzp.PHOTO_FLASH_OFF, "off", fzp.PHOTO_FLASH_ON, "on");
        this.ad = kee.m13439a(fzp.FPS_AUTO, gom.FPS_AUTO, fzp.FPS_30, gom.FPS_30, fzp.FPS_60, gom.FPS_60);
        this.ae = kee.m13438a(fzp.EXT_MICROPHONE_ON, valueOf, fzp.EXT_MICROPHONE_OFF, valueOf2);
        this.af = kee.m13438a(fzp.VESPER_ON, valueOf, fzp.VESPER_OFF, valueOf2);
        this.ag = kee.m13439a(fzp.MICROVIDEO_ON, Integer.valueOf(gon.MICRO_ON.f5605d), fzp.MICROVIDEO_AUTO, Integer.valueOf(gon.MICRO_AUTO.f5605d), fzp.MICROVIDEO_OFF, Integer.valueOf(gon.MICRO_OFF.f5605d));
        this.ah = kee.m13438a(fzp.VIDEO_FLASH_OFF, "off", fzp.VIDEO_FLASH_ON, "torch");
        this.ai = kee.m13438a(fzp.IMAX_AUDIO_ON, valueOf, fzp.IMAX_AUDIO_OFF, valueOf2);
        this.f4984b = optionsBarView;
        this.f4985c = ilp;
        this.f4986d = ikd;
        this.f4996n = iji;
        this.f4997o = new HashMap();
        this.f4998p = ilp2;
        this.f4987e = ilp3;
        this.f4988f = ilp5;
        this.f4999q = ilp6;
        this.f5000r = false;
        this.f5001s = ilp7;
        this.f5002t = ilp8;
        this.f5003u = ilp9;
        this.f5004v = ilp10;
        this.f5005w = ilp11;
        this.f5006x = ilp12;
        this.f5007y = ilp13;
        this.f5008z = ilp14;
        this.f4958A = ilp15;
        this.f4989g = ilp16;
        this.f4990h = ilp17;
        this.f4959B = ilp18;
        this.f4960C = fzy.f4920a;
        this.f4991i = fzy.f4921b;
        this.f4961D = fzy.f4922c;
        this.f4962E = fzy.f4923d;
        this.f4963F = fzy.f4924e;
        this.f4964G = fzy.f4925f;
        this.f4965H = fzy.f4926g;
        this.f4966I = fzy.f4927h;
        this.f4967J = fzy.f4928i;
        this.f4968K = fzy.f4929j;
        this.f4969L = fzy.f4930k;
        this.f4970M = fzy.f4935p;
        this.f4971N = fzy.f4931l;
        this.f4972O = fzy.f4932m;
        this.f4973P = fzy.f4933n;
        this.f4974Q = fzy.f4934o;
        this.f4975R = fzy.f4936q;
        this.f4976S = ilp4;
        this.f4977T = bkw.m849a(bkw.f1255a, "camera:white_balance_enabled", true);
        this.f4978U = z2;
        this.f4979V = z3;
        this.f4980W = z4;
        this.f4981X = false;
        this.f4996n.mo1879a(this.f4985c.mo2859a(new gam(this), this.f4986d));
        this.f4996n.mo1879a(this.f5006x.mo2859a(new gan(this), this.f4986d));
        this.f4996n.mo1879a(this.f4976S.mo2859a(new gat(this), this.f4986d));
        this.f4996n.mo1879a(this.f4999q.mo2859a(new gau(this), this.f4986d));
        m2455a(this.f4998p, this.f4982Y, this.f4960C);
        m2455a(this.f4987e, this.f4983Z, this.f4991i);
        m2455a(this.f4988f, this.aa, this.f4961D);
        m2455a(this.f5001s, this.ab, this.f4962E);
        m2455a(this.f5002t, this.ac, this.f4963F);
        m2455a(this.f5003u, this.ah, this.f4964G);
        m2455a(this.f5004v, this.ad, this.f4965H);
        m2455a(this.f5004v, this.ad, this.f4966I);
        m2455a(this.f5005w, this.ae, this.f4967J);
        m2455a(this.f5007y, this.ag, this.f4968K);
        m2455a(this.f5008z, this.af, this.f4969L);
        m2455a(this.f4959B, this.ai, this.f4975R);
        this.f4996n.mo1879a(this.f4958A.mo2859a(new gav(this), this.f4986d));
        this.f4996n.mo1879a(this.f5002t.mo2859a(new gaw(this), this.f4986d));
        this.f4996n.mo1879a(this.f4987e.mo2859a(new gax(this), this.f4986d));
        this.f4996n.mo1879a(this.f4988f.mo2859a(new gay(this), this.f4986d));
        this.f4996n.mo1879a(this.f4988f.mo2859a(new gaz(this), this.f4986d));
        this.f4996n.mo1879a(this.f4985c.mo2859a(new gba(this), this.f4986d));
    }

    /* renamed from: a */
    public final void m2459a(fzo fzo, fzt fzt) {
        this.f4997o.put(fzo, fzt);
    }

    /* renamed from: a */
    private final void m2456a(kcx kcx, ilp ilp, fzm fzm, boolean z) {
        if (z) {
            fzp a = gal.m2453a(kcx, ilp, fzp.UNKNOWN);
            if (a == fzp.UNKNOWN) {
                String str = f4957a;
                String valueOf = String.valueOf(ilp.mo2860b());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("Property value ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is not associated with a MenuOption.");
                bli.m873e(str, stringBuilder.toString());
                return;
            }
            this.f4984b.m15079a(fzm, a, (fzt) this.f4997o.get(fzm.f4856a));
        }
    }

    /* renamed from: a */
    public final void m2458a() {
        OptionsBarView optionsBarView = this.f4984b;
        if (!optionsBarView.f20403h) {
            ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498112);
            objectAnimator.setDuration(200);
            objectAnimator.setTarget(optionsBarView);
            objectAnimator.addListener(new gbm(optionsBarView));
            ObjectAnimator objectAnimator2 = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498112);
            objectAnimator2.setDuration(200);
            objectAnimator2.addListener(optionsBarView.m15075a(true));
            FrameLayout frameLayout = optionsBarView.f20402g;
            if (frameLayout != null) {
                objectAnimator2.setTarget(frameLayout);
                for (int i = 0; i < ((FrameLayout) jqk.m13102c(optionsBarView.f20402g)).getChildCount(); i++) {
                    ((FrameLayout) jqk.m13102c(optionsBarView.f20402g)).getChildAt(i).setEnabled(true);
                }
            }
            optionsBarView.f20398c.cancel();
            optionsBarView.f20398c = new AnimatorSet();
            optionsBarView.f20398c.playTogether(new Animator[]{objectAnimator, objectAnimator2});
            optionsBarView.f20398c.start();
            optionsBarView.f20403h = true;
        }
        this.f4984b.m15087c();
    }

    /* renamed from: b */
    public final void m2462b() {
        OptionsBarView optionsBarView = this.f4984b;
        if (optionsBarView.f20403h) {
            ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498113);
            objectAnimator.setDuration(200);
            objectAnimator.setTarget(optionsBarView);
            objectAnimator.addListener(new gbn(optionsBarView));
            ObjectAnimator objectAnimator2 = (ObjectAnimator) AnimatorInflater.loadAnimator(optionsBarView.getContext(), 17498113);
            objectAnimator2.setDuration(200);
            objectAnimator2.addListener(optionsBarView.m15075a(false));
            FrameLayout frameLayout = optionsBarView.f20402g;
            if (frameLayout != null) {
                objectAnimator2.setTarget(frameLayout);
                for (int i = 0; i < ((FrameLayout) jqk.m13102c(optionsBarView.f20402g)).getChildCount(); i++) {
                    ((FrameLayout) jqk.m13102c(optionsBarView.f20402g)).getChildAt(i).setEnabled(false);
                }
            }
            optionsBarView.f20398c.cancel();
            optionsBarView.f20398c = new AnimatorSet();
            optionsBarView.f20398c.playTogether(new Animator[]{objectAnimator, objectAnimator2});
            optionsBarView.f20398c.start();
            optionsBarView.f20403h = false;
        }
        this.f4984b.m15085b();
    }

    /* renamed from: a */
    static fzp m2453a(kcx kcx, ilp ilp, fzp fzp) {
        fzp fzp2 = (fzp) kcx.mo2130a().get(ilp.mo2860b());
        if (fzp2 != null) {
            return fzp2;
        }
        String str = f4957a;
        String valueOf = String.valueOf(ilp);
        String valueOf2 = String.valueOf(ilp.mo2860b());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 106) + String.valueOf(valueOf2).length());
        stringBuilder.append("Tried to get MenuOption for property ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" with value");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" but value wasn't found in map. Returning default instead.");
        bli.m873e(str, stringBuilder.toString());
        return fzp;
    }

    /* renamed from: a */
    private final void m2455a(ilp ilp, kcx kcx, fzm fzm) {
        this.f4996n.mo1879a(ilp.mo2859a(new gao(this, kcx, ilp, fzm), this.f4986d));
        OptionsBarView optionsBarView = this.f4984b;
        optionsBarView.f20396a.put(fzm, new gap(kcx, ilp));
    }

    /* renamed from: b */
    static final /* synthetic */ void m2457b(kcx kcx, ilp ilp, fzp fzp) {
        Object obj = kcx.get(fzp);
        if (obj != null) {
            ilp.mo348a(obj);
        }
    }

    /* renamed from: a */
    private final void m2454a(fzm fzm) {
        this.f4984b.m15078a(fzm, fzp.SELECTED);
    }

    /* renamed from: c */
    final void m2463c() {
        if (Boolean.TRUE.equals(this.f4988f.mo2860b())) {
            this.f4984b.m15080a(fzo.HDR);
            this.f4987e.mo348a(fxj.AUTO);
            return;
        }
        this.f4984b.m15086b(fzo.HDR);
    }

    /* renamed from: d */
    final void m2464d() {
        if (((String) this.f5002t.mo2860b()).equals("on")) {
            if (((Integer) this.f4958A.mo2860b()).intValue() != 0) {
            }
            this.f4984b.m15080a(fzo.MICROVIDEO);
        }
        if (!(fxj.ON.equals(this.f4987e.mo2860b()) || Boolean.TRUE.equals(this.f4988f.mo2860b()))) {
            this.f4984b.m15086b(fzo.MICROVIDEO);
            return;
        }
        this.f4984b.m15080a(fzo.MICROVIDEO);
    }

    /* renamed from: a */
    public final void m2460a(hhx hhx) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean isEnabled = this.f4984b.isEnabled();
        this.f4984b.m15085b();
        boolean z11 = hhx != hhx.PHOTO ? hhx != hhx.IMAGE_INTENT ? hhx == hhx.PORTRAIT : true : true;
        if (hhx != hhx.PHOTO) {
            z = false;
        } else if (!this.f4993k) {
            z = false;
        } else if (!this.f4980W) {
            z = true;
        } else if (((Boolean) this.f4976S.mo2860b()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f5000r) {
            if (((Boolean) this.f4988f.mo2860b()).booleanValue()) {
                this.f4988f.mo348a(Boolean.valueOf(false));
            }
            if (((Boolean) this.f4999q.mo2860b()).booleanValue()) {
                this.f4999q.mo348a(Boolean.valueOf(false));
                z2 = false;
            } else {
                z2 = false;
            }
        } else if (hhx != hhx.PHOTO) {
            z2 = false;
        } else if (((Boolean) this.f4999q.mo2860b()).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f4977T) {
            z3 = false;
        } else if (hhx == hhx.LENS_BLUR) {
            z3 = false;
        } else if (hhx == hhx.PANORAMA) {
            z3 = false;
        } else if (hhx == hhx.PHOTO_SPHERE) {
            z3 = false;
        } else if (hhx != hhx.IMAX) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.f4992j) {
            z4 = false;
        } else if (hhx == hhx.PHOTO) {
            z4 = true;
        } else if (hhx == hhx.IMAGE_INTENT) {
            z4 = true;
        } else if (hhx == hhx.PORTRAIT) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!this.f4992j) {
            z5 = false;
        } else if (hhx == hhx.VIDEO) {
            z5 = true;
        } else if (hhx == hhx.VIDEO_INTENT) {
            z5 = true;
        } else if (hhx == hhx.SLOW_MOTION) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (hhx != hhx.VIDEO) {
            z6 = false;
        } else if (this.f4995m) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (hhx != hhx.VIDEO) {
            z7 = false;
        } else if (((Boolean) this.f5006x.mo2860b()).booleanValue()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!this.f4978U) {
            z8 = false;
        } else if (hhx == hhx.PHOTO) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (hhx == hhx.IMAX) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!this.f4979V) {
            z10 = false;
        } else if (hhx == hhx.PHOTO && this.f4994l) {
            z10 = true;
        } else if (hhx == hhx.PORTRAIT) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4984b.m15076a();
        OptionsBarView optionsBarView = this.f4984b;
        synchronized (optionsBarView.f20399d) {
            fzh fzh = optionsBarView.f20399d;
            fzh.f4840b.clear();
            fzh.removeAllViews();
            fzh.m2425a();
            fzh.m2429b();
        }
        m2456a(this.af, this.f5008z, this.f4969L, z10);
        if (this.f4981X) {
            m2456a(this.ad, this.f5004v, this.f4966I, z6);
        } else {
            if (((gom) this.f5004v.mo2860b()).equals(gom.FPS_AUTO)) {
                this.f5004v.mo348a(gom.FPS_30);
            }
            m2456a(this.ad, this.f5004v, this.f4965H, z6);
        }
        m2456a(this.ae, this.f5005w, this.f4967J, z7);
        m2456a(this.f4982Y, this.f4998p, this.f4960C, z11);
        m2456a(this.f4983Z, this.f4987e, this.f4991i, z);
        m2456a(this.aa, this.f4988f, this.f4961D, z2);
        m2456a(this.ag, this.f5007y, this.f4968K, z8);
        m2456a(this.ab, this.f5001s, this.f4962E, z3);
        m2456a(this.ac, this.f5002t, this.f4963F, z4);
        m2456a(this.ah, this.f5003u, this.f4964G, z5);
        if (z9) {
            m2456a(this.ai, this.f4959B, this.f4975R, z9);
        }
        if (hhx == hhx.PHOTO_SPHERE) {
            this.f4984b.m15079a(this.f4970M, fzp.UNSELECTED, null);
            this.f4984b.m15079a(this.f4973P, fzp.UNSELECTED, null);
            this.f4984b.m15079a(this.f4974Q, fzp.UNSELECTED, null);
            m2461a(this.f4990h);
            this.f4984b.m15083a(new gar(this));
        }
        if (hhx == hhx.PANORAMA) {
            this.f4984b.m15079a(this.f4971N, fzp.UNSELECTED, null);
            this.f4984b.m15079a(this.f4972O, fzp.UNSELECTED, null);
            m2461a(this.f4989g);
            this.f4984b.m15083a(new gaq(this));
        }
        if (isEnabled) {
            this.f4984b.m15087c();
        }
        if (z) {
            m2463c();
        }
    }

    /* renamed from: a */
    final void m2461a(ilp ilp) {
        int i = 0;
        fzm[] fzmArr = new fzm[]{this.f4970M, this.f4971N, this.f4972O, this.f4973P, this.f4974Q};
        while (i < 5) {
            this.f4984b.m15078a(fzmArr[i], fzp.UNSELECTED);
            i++;
        }
        if (((String) ilp.mo2860b()).equals("pano_photosphere")) {
            m2454a(this.f4970M);
        } else if (((String) ilp.mo2860b()).equals("pano_horizontal")) {
            m2454a(this.f4971N);
        } else if (((String) ilp.mo2860b()).equals("pano_vertical")) {
            m2454a(this.f4972O);
        } else if (((String) ilp.mo2860b()).equals("pano_wide")) {
            m2454a(this.f4973P);
        } else if (((String) ilp.mo2860b()).equals("pano_fisheye")) {
            m2454a(this.f4974Q);
        } else {
            String str = f4957a;
            String str2 = (String) ilp.mo2860b();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 84);
            stringBuilder.append("Attempted to update panorama option to invalid value.");
            stringBuilder.append(str2);
            stringBuilder.append(" is not a valid panorama value.");
            bli.m866b(str, stringBuilder.toString());
        }
    }
}
