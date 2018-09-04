package p000;

import android.annotation.TargetApi;
import android.graphics.PointF;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: ctu */
public final class ctu {
    /* renamed from: a */
    public final float f2713a;
    /* renamed from: b */
    public final PointF f2714b;
    /* renamed from: c */
    public final float f2715c;
    /* renamed from: d */
    private final float f2716d;
    /* renamed from: e */
    private final PointF f2717e;
    /* renamed from: f */
    private final float f2718f;
    /* renamed from: g */
    private final float f2719g;
    /* renamed from: h */
    private final float f2720h;

    public ctu(float f, float f2, PointF pointF, PointF pointF2, float f3, float f4, float f5, float f6) {
        this.f2713a = f;
        this.f2716d = f2;
        this.f2714b = (PointF) jri.m13152b((Object) pointF);
        this.f2717e = (PointF) jri.m13152b((Object) pointF2);
        this.f2715c = f3;
        this.f2718f = f4;
        this.f2719g = f5;
        this.f2720h = f6;
    }

    /* renamed from: a */
    public final float m1516a(float f) {
        float f2 = this.f2719g;
        return f2 + ((this.f2720h - f2) * f);
    }

    /* renamed from: b */
    public final float m1517b(float f) {
        float f2 = this.f2715c;
        return f2 + ((this.f2718f - f2) * f);
    }

    /* renamed from: c */
    public final float m1518c(float f) {
        float f2 = this.f2713a;
        return f2 + ((this.f2716d - f2) * f);
    }

    /* renamed from: d */
    public final PointF m1519d(float f) {
        PointF pointF = this.f2714b;
        float f2 = pointF.x;
        PointF pointF2 = this.f2717e;
        return new PointF(f2 + ((pointF2.x - pointF.x) * f), ((pointF2.y - pointF.y) * f) + pointF.y);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(getClass().getName()).concat(" {"));
        float f = this.f2713a;
        float f2 = this.f2716d;
        StringBuilder stringBuilder2 = new StringBuilder(42);
        stringBuilder2.append(" scale: ");
        stringBuilder2.append(f);
        stringBuilder2.append(" -> ");
        stringBuilder2.append(f2);
        stringBuilder.append(stringBuilder2.toString());
        String valueOf = String.valueOf(this.f2714b);
        String valueOf2 = String.valueOf(this.f2717e);
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length());
        stringBuilder3.append(", translation: ");
        stringBuilder3.append(valueOf);
        stringBuilder3.append(" -> ");
        stringBuilder3.append(valueOf2);
        stringBuilder.append(stringBuilder3.toString());
        f = this.f2715c;
        f2 = this.f2718f;
        stringBuilder2 = new StringBuilder(44);
        stringBuilder2.append(", radius: ");
        stringBuilder2.append(f);
        stringBuilder2.append(" -> ");
        stringBuilder2.append(f2);
        stringBuilder.append(stringBuilder2.toString());
        f = this.f2719g;
        f2 = this.f2720h;
        stringBuilder2 = new StringBuilder(45);
        stringBuilder2.append(", bgAlpha: ");
        stringBuilder2.append(f);
        stringBuilder2.append(" -> ");
        stringBuilder2.append(f2);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
