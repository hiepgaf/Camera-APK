package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;

/* compiled from: PG */
/* renamed from: aug */
public final class aug extends fiw {
    /* renamed from: a */
    public static final String f10274a = bli.m862a("SceneChangeMonitor");
    /* renamed from: b */
    public Runnable f10275b;
    /* renamed from: c */
    public long f10276c = 0;
    /* renamed from: d */
    public boolean f10277d;
    /* renamed from: e */
    public final hke f10278e;
    /* renamed from: f */
    private boolean f10279f = false;
    /* renamed from: g */
    private final ilp f10280g;
    /* renamed from: h */
    private final ilp f10281h;
    /* renamed from: i */
    private final iqt f10282i = new auh(this);

    aug(bps bps, ilp ilp, ivw ivw, hke hke) {
        this.f10280g = bps.f1415a;
        this.f10281h = ilp;
        this.f10277d = ((Boolean) this.f10280g.mo2860b()).booleanValue();
        this.f10278e = hke;
        ivw.mo414b().mo1879a(this.f10280g.mo2859a(this.f10282i, kpq.f8410a));
    }

    public final void a_(iwp iwp) {
        boolean z = true;
        if (hsy.f6601b == null) {
            z = false;
        } else if (((Integer) iwp.mo3143a(hsy.f6601b)).intValue() != 1) {
            z = false;
        }
        if (!this.f10279f && z) {
            if (((Boolean) this.f10280g.mo2860b()).booleanValue()) {
                bli.m863a(f10274a, "onSceneChanged while scrolling ev comp, ignoring");
            } else if (((Boolean) this.f10281h.mo2860b()).booleanValue()) {
                bli.m863a(f10274a, "onSceneChanged while counting down, ignoring");
            } else if (System.currentTimeMillis() - this.f10276c < ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS) {
                bli.m863a(f10274a, "onSceneChanged while waiting for expiration of last scrolling ev comp, ignoring");
            } else {
                bli.m863a(f10274a, "onSceneChanged");
                Runnable runnable = this.f10275b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        this.f10279f = z;
    }
}
