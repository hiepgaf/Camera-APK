package p000;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: brq */
public final class brq {
    /* renamed from: a */
    public final hjm f1488a = new hjm(5);
    /* renamed from: b */
    public final hjm f1489b = new hjm(5);
    /* renamed from: c */
    public final hjm f1490c = new hjm(5);
    /* renamed from: d */
    public final Handler f1491d;
    /* renamed from: e */
    public float f1492e;
    /* renamed from: f */
    public int f1493f;
    /* renamed from: g */
    public boolean f1494g;
    /* renamed from: h */
    public ValueAnimator f1495h;
    /* renamed from: i */
    public final Runnable f1496i = new bru(this);
    /* renamed from: j */
    private final Matrix f1497j;
    /* renamed from: k */
    private ValueAnimator f1498k;

    public brq(Face face, Matrix matrix) {
        this.f1497j = matrix;
        m950a(face);
        this.f1498k = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f});
        this.f1498k.setInterpolator(new ks());
        this.f1498k.setDuration(250);
        this.f1498k.addUpdateListener(new brr(this));
        this.f1498k.addListener(new brt(this));
        this.f1495h = ValueAnimator.ofInt(new int[]{204, 0});
        this.f1495h.setInterpolator(new ks());
        this.f1495h.setDuration(500);
        this.f1495h.addUpdateListener(new brs(this));
        this.f1491d = new Handler();
    }

    /* renamed from: a */
    public final void m949a() {
        if (!this.f1498k.isStarted()) {
            this.f1493f = 204;
            this.f1492e = this.f1490c.f6274a;
            this.f1498k.start();
            this.f1494g = true;
        }
    }

    public final String toString() {
        return String.format("ViewfinderFace: Center: %f,%f / Radius: %f", new Object[]{Float.valueOf(this.f1488a.f6274a), Float.valueOf(this.f1489b.f6274a), Float.valueOf(this.f1490c.f6274a)});
    }

    /* renamed from: a */
    public final void m950a(Face face) {
        Object obj = 1;
        RectF rectF = new RectF(face.getBounds());
        this.f1497j.mapRect(rectF);
        this.f1488a.m3208a(rectF.centerX());
        this.f1489b.m3208a(rectF.centerY());
        float width = rectF.width() * 0.5f;
        this.f1490c.m3208a(width);
        float f = this.f1490c.f6274a;
        float f2 = width * 0.5f;
        if (width >= f - f2 && width <= f + f2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (this.f1494g) {
            this.f1491d.removeCallbacks(this.f1496i);
            this.f1491d.postDelayed(this.f1496i, 1000);
            return;
        }
        m949a();
    }
}
