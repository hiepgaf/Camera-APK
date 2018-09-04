package p000;

import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: PG */
/* renamed from: kvu */
final class kvu implements Runnable {
    /* renamed from: a */
    private long f8702a;
    /* renamed from: b */
    private float f8703b;
    /* renamed from: c */
    private float f8704c;
    /* renamed from: d */
    private float f8705d;
    /* renamed from: e */
    private float f8706e;
    /* renamed from: f */
    private boolean f8707f;
    /* renamed from: g */
    private AccelerateDecelerateInterpolator f8708g = new AccelerateDecelerateInterpolator();
    /* renamed from: h */
    private PointF f8709h;
    /* renamed from: i */
    private PointF f8710i;
    /* renamed from: j */
    private final /* synthetic */ kvr f8711j;

    kvu(kvr kvr, float f, float f2, float f3, boolean z) {
        this.f8711j = kvr;
        kvr.f8676c = go.cj;
        this.f8702a = System.currentTimeMillis();
        this.f8703b = kvr.f8674a;
        this.f8704c = f;
        this.f8707f = z;
        PointF a = kvr.m5467a(f2, f3, false);
        this.f8705d = a.x;
        this.f8706e = a.y;
        float f4 = this.f8705d;
        float f5 = this.f8706e;
        kvr.f8675b.getValues(kvr.f8679f);
        int intrinsicWidth = kvr.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = kvr.getDrawable().getIntrinsicHeight();
        this.f8709h = new PointF(((f4 / ((float) intrinsicWidth)) * kvr.m5471d()) + kvr.f8679f[2], ((f5 / ((float) intrinsicHeight)) * kvr.m5470c()) + kvr.f8679f[5]);
        this.f8710i = new PointF((float) (kvr.f8682i / 2), (float) (kvr.f8683j / 2));
    }

    public final void run() {
        float interpolation = this.f8708g.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f8702a)) / 500.0f));
        float f = this.f8703b;
        float f2 = this.f8704c;
        kvr kvr = this.f8711j;
        kvr.m5461a(((double) (f + ((f2 - f) * interpolation))) / ((double) kvr.f8674a), this.f8705d, this.f8706e, this.f8707f);
        PointF pointF = this.f8709h;
        f = pointF.x;
        PointF pointF2 = this.f8710i;
        float f3 = pointF2.x;
        float f4 = pointF.x;
        float f5 = pointF.y;
        f2 = pointF2.y;
        float f6 = pointF.y;
        kvr kvr2 = this.f8711j;
        float f7 = this.f8705d;
        float f8 = this.f8706e;
        kvr2.f8675b.getValues(kvr2.f8679f);
        int intrinsicWidth = kvr2.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = kvr2.getDrawable().getIntrinsicHeight();
        PointF pointF3 = new PointF(((f7 / ((float) intrinsicWidth)) * kvr2.m5471d()) + kvr2.f8679f[2], (kvr2.m5470c() * (f8 / ((float) intrinsicHeight))) + kvr2.f8679f[5]);
        this.f8711j.f8675b.postTranslate((f + ((f3 - f4) * interpolation)) - pointF3.x, (((f2 - f6) * interpolation) + f5) - pointF3.y);
        this.f8711j.m5468a();
        kvr = this.f8711j;
        kvr.setImageMatrix(kvr.f8675b);
        kvr = this.f8711j;
        if (interpolation >= 1.0f) {
            kvr.f8676c = go.cf;
        } else {
            kvr.postOnAnimation(this);
        }
    }
}
