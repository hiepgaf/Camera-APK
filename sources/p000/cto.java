package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: cto */
public final class cto {
    /* renamed from: a */
    public float f2700a;
    /* renamed from: b */
    public float f2701b;
    /* renamed from: c */
    public float f2702c;
    /* renamed from: d */
    private final float f2703d;
    /* renamed from: e */
    private final float f2704e;
    /* renamed from: f */
    private final float f2705f = 1.0f;
    /* renamed from: g */
    private final float f2706g = (this.f2705f * 0.0f);
    /* renamed from: h */
    private final float f2707h;
    /* renamed from: i */
    private final float f2708i;

    public cto(float f, float f2, float f3) {
        this.f2703d = f;
        this.f2704e = 0.8f * f;
        this.f2707h = f2;
        this.f2708i = f3;
        this.f2702c = 0.0f;
    }

    /* renamed from: a */
    public final float m1510a() {
        float f = this.f2705f;
        return f + ((this.f2706g - f) * this.f2702c);
    }

    /* renamed from: b */
    public final float m1511b() {
        float f = this.f2703d;
        return f + ((this.f2704e - f) * this.f2702c);
    }

    /* renamed from: c */
    public final PointF m1512c() {
        return new PointF(this.f2707h + this.f2700a, this.f2708i + this.f2701b);
    }
}
