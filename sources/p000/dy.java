package p000;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;

/* compiled from: PG */
/* renamed from: dy */
final class dy extends ea {
    /* renamed from: a */
    public int[] f14712a;
    /* renamed from: b */
    public int f14713b = 0;
    /* renamed from: c */
    public float f14714c = 0.0f;
    /* renamed from: d */
    public int f14715d = 0;
    /* renamed from: e */
    public float f14716e = 1.0f;
    /* renamed from: f */
    public int f14717f = 0;
    /* renamed from: g */
    public float f14718g = 1.0f;
    /* renamed from: h */
    public float f14719h = 0.0f;
    /* renamed from: i */
    public float f14720i = 1.0f;
    /* renamed from: j */
    public float f14721j = 0.0f;
    /* renamed from: k */
    public Cap f14722k = Cap.BUTT;
    /* renamed from: l */
    public Join f14723l = Join.MITER;
    /* renamed from: m */
    public float f14724m = 4.0f;

    public dy(dy dyVar) {
        super(dyVar);
        this.f14712a = dyVar.f14712a;
        this.f14713b = dyVar.f14713b;
        this.f14714c = dyVar.f14714c;
        this.f14716e = dyVar.f14716e;
        this.f14715d = dyVar.f14715d;
        this.f14717f = dyVar.f14717f;
        this.f14718g = dyVar.f14718g;
        this.f14719h = dyVar.f14719h;
        this.f14720i = dyVar.f14720i;
        this.f14721j = dyVar.f14721j;
        this.f14722k = dyVar.f14722k;
        this.f14723l = dyVar.f14723l;
        this.f14724m = dyVar.f14724m;
    }

    final float getFillAlpha() {
        return this.f14718g;
    }

    final int getFillColor() {
        return this.f14715d;
    }

    final float getStrokeAlpha() {
        return this.f14716e;
    }

    final int getStrokeColor() {
        return this.f14713b;
    }

    final float getStrokeWidth() {
        return this.f14714c;
    }

    final float getTrimPathEnd() {
        return this.f14720i;
    }

    final float getTrimPathOffset() {
        return this.f14721j;
    }

    final float getTrimPathStart() {
        return this.f14719h;
    }

    final void setFillAlpha(float f) {
        this.f14718g = f;
    }

    final void setFillColor(int i) {
        this.f14715d = i;
    }

    final void setStrokeAlpha(float f) {
        this.f14716e = f;
    }

    final void setStrokeColor(int i) {
        this.f14713b = i;
    }

    final void setStrokeWidth(float f) {
        this.f14714c = f;
    }

    final void setTrimPathEnd(float f) {
        this.f14720i = f;
    }

    final void setTrimPathOffset(float f) {
        this.f14721j = f;
    }

    final void setTrimPathStart(float f) {
        this.f14719h = f;
    }
}
