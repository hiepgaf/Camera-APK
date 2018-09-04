package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: fbd */
public final class fbd {
    /* renamed from: a */
    public final fbg f4422a;
    /* renamed from: b */
    public final fbe f4423b;
    /* renamed from: c */
    public final Handler f4424c;
    /* renamed from: d */
    public final ilb f4425d;
    /* renamed from: e */
    public final Runnable f4426e;
    /* renamed from: f */
    private final ikd f4427f;
    /* renamed from: g */
    private final bmb f4428g;
    /* renamed from: h */
    private final Runnable f4429h;
    /* renamed from: i */
    private final Object f4430i = new Object();
    /* renamed from: j */
    private iqo f4431j;

    public fbd(fbg fbg, ikd ikd, bmb bmb, String str) {
        this.f4422a = fbg;
        this.f4427f = ikd;
        this.f4428g = bmb;
        fbf a = fbg.mo1334a();
        a.f4441d = str;
        a.f4438a = true;
        a.f4439b = 1610612733;
        this.f4423b = a.m2217a();
        this.f4424c = new Handler(Looper.getMainLooper());
        this.f4425d = new ilb(Boolean.valueOf(false));
        this.f4429h = new fal(this);
        this.f4426e = new fam(this, fbg);
    }

    /* renamed from: a */
    public final void m2215a() {
        synchronized (this.f4430i) {
            this.f4424c.removeCallbacks(this.f4429h);
            iqo iqo = this.f4431j;
            if (iqo != null) {
                iqo.close();
                this.f4431j = null;
            }
            this.f4424c.removeCallbacks(this.f4426e);
            this.f4427f.execute(new fao(this));
        }
    }

    /* renamed from: a */
    public final void m2216a(ilp ilp) {
        Object obj = null;
        synchronized (this.f4430i) {
            iqo iqo;
            bmb bmb = this.f4428g;
            if (!bmb.f1308b.m3194b()) {
                if (!(bmb.f1308b.m3195c() || bmb.f1308b.m3196d())) {
                    if (obj != null) {
                    }
                    this.f4425d.mo348a(Boolean.valueOf(false));
                    fap fap = new fap(ilp, this.f4425d);
                    iqo = this.f4431j;
                    if (iqo != null) {
                        iqo.close();
                    }
                    this.f4431j = fap.mo2859a(new fan(this), this.f4427f);
                    this.f4424c.postDelayed(this.f4429h, 1000);
                    return;
                }
            }
            bsn bsn = bmb.f1307a;
            obj = 1;
            if (obj != null) {
                this.f4425d.mo348a(Boolean.valueOf(false));
                fap fap2 = new fap(ilp, this.f4425d);
                iqo = this.f4431j;
                if (iqo != null) {
                    iqo.close();
                }
                this.f4431j = fap2.mo2859a(new fan(this), this.f4427f);
                this.f4424c.postDelayed(this.f4429h, 1000);
                return;
            }
        }
    }
}
