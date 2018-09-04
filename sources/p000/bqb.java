package p000;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqb */
public class bqb extends gqj {
    /* renamed from: a */
    public EvCompView f20146a;
    /* renamed from: b */
    public bpx f20147b;
    /* renamed from: c */
    public ValueAnimator f20148c;
    /* renamed from: d */
    public ilp f20149d;
    /* renamed from: e */
    public float f20150e;
    /* renamed from: f */
    public int f20151f;
    /* renamed from: g */
    public int f20152g;
    /* renamed from: h */
    public float f20153h;
    /* renamed from: i */
    public int f20154i;
    /* renamed from: j */
    public final Runnable f20155j = new bqc(this);
    /* renamed from: k */
    private ilp f20156k;

    public bqb() {
        super('\u0000');
    }

    /* renamed from: a */
    public void mo3383a(bpx bpx, EvCompView evCompView, ValueAnimator valueAnimator, int i, ilp ilp, bps bps) {
        this.f20147b = bpx;
        this.f20146a = evCompView;
        this.f20148c = valueAnimator;
        this.f20154i = i;
        this.f20156k = ilp;
        this.f20149d = bps.f1415a;
    }

    final void a_() {
        boolean z;
        boolean z2 = true;
        EvCompView evCompView = this.f20146a;
        float f = this.f20150e;
        if (f <= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        Object valueOf = Float.valueOf(f);
        jri.m13148a(z, "marker position must be in range [0,1] was: %s", valueOf);
        if (f < 0.0f) {
            z2 = false;
        }
        jri.m13148a(z2, "marker position must be in range [0,1] was: %s", valueOf);
        evCompView.f2280b = f;
        evCompView.invalidate();
        int round = Math.round(((float) this.f20152g) * this.f20150e);
        int i = this.f20151f;
        int i2 = round + i;
        this.f20146a.f2283e = (((float) i) + (((float) this.f20152g) * this.f20150e)) * this.f20153h;
        if (i2 != ((Integer) this.f20156k.mo2860b()).intValue()) {
            this.f20156k.mo348a(Integer.valueOf(i2));
        }
    }
}
