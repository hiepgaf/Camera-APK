package p000;

import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: gxl */
public final class gxl extends gxj {
    /* renamed from: j */
    private final float[] f17541j;

    public gxl(float[] fArr, boolean z, boolean z2) {
        boolean z3;
        super(false, z, z2);
        this.f17541j = (float[]) jri.m13152b((Object) fArr);
        if (!z && fArr.length == 2) {
            z3 = true;
        } else if (fArr.length != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        jri.m13153b(z3);
    }

    /* renamed from: a */
    public final void mo1673a(RectF rectF) {
        if (this.h) {
            this.a = Math.round(rectF.width() * this.f17541j[0]);
            this.e = Math.round(rectF.width() * this.f17541j[1]);
            this.b = Math.round(rectF.width() * this.f17541j[2]);
            this.c = Math.round(rectF.height() * this.f17541j[0]);
            this.f = Math.round(rectF.height() * this.f17541j[1]);
            this.d = Math.round(rectF.height() * this.f17541j[2]);
            return;
        }
        this.a = Math.round(rectF.width() * this.f17541j[0]);
        this.b = Math.round(rectF.width() * this.f17541j[1]);
        this.c = Math.round(rectF.height() * this.f17541j[0]);
        this.d = Math.round(rectF.height() * this.f17541j[1]);
    }
}
