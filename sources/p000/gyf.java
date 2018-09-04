package p000;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: gyf */
public final class gyf {
    /* renamed from: a */
    public final RectF f5791a = new RectF();
    /* renamed from: b */
    public gxj f5792b;
    /* renamed from: c */
    public final View f5793c;
    /* renamed from: d */
    public final gxm f5794d;
    /* renamed from: e */
    public final gxm f5795e;
    /* renamed from: f */
    public final gyd f5796f;
    /* renamed from: g */
    public final gyd f5797g;
    /* renamed from: h */
    public final gxm f5798h;
    /* renamed from: i */
    public final gyd f5799i;

    public gyf(GridLinesUi gridLinesUi, Paint paint, Paint paint2) {
        this.f5793c = gridLinesUi;
        this.f5794d = new gxm(paint);
        this.f5795e = new gxm(paint);
        this.f5796f = new gyd(paint, (byte) 0);
        this.f5797g = new gyd(paint, (byte) 0);
        this.f5798h = new gxm(paint2);
        this.f5799i = new gyd(paint2, (byte) 0);
    }

    /* renamed from: a */
    public final void m2913a(gxj gxj) {
        this.f5792b = gxj;
        m2912a();
        this.f5793c.invalidate();
    }

    /* renamed from: a */
    public final void m2912a() {
        int i = 0;
        gyd gyd = this.f5794d;
        gxj gxj = this.f5792b;
        boolean z = gxj.f5759i;
        gyd.f5789b = z;
        this.f5795e.f5789b = z;
        this.f5796f.f5789b = z;
        this.f5797g.f5789b = z;
        gyd gyd2 = this.f5798h;
        gyd2.f5789b = z;
        this.f5799i.f5789b = z;
        gyd2.m2910a(!gxj.f5758h ? 0 : Illuminant.kOther);
        gyd = this.f5799i;
        if (this.f5792b.f5758h) {
            i = Illuminant.kOther;
        }
        gyd.m2910a(i);
        this.f5792b.mo1673a(this.f5791a);
        gyd = this.f5794d;
        gxj gxj2 = this.f5792b;
        gyd.f5788a = gxj2.f5751a;
        this.f5795e.f5788a = gxj2.f5752b;
        this.f5796f.f5788a = gxj2.f5753c;
        this.f5797g.f5788a = gxj2.f5754d;
        this.f5798h.f5788a = gxj2.f5755e;
        this.f5799i.f5788a = gxj2.f5756f;
        this.f5793c.invalidate();
    }
}
