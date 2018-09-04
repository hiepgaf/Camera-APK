package p000;

import android.graphics.drawable.GradientDrawable;

/* compiled from: PG */
/* renamed from: bsz */
public final class bsz {
    /* renamed from: a */
    public final GradientDrawable f1512a;
    /* renamed from: b */
    public float f1513b;

    public bsz(bsy bsy) {
        this(new GradientDrawable());
    }

    private bsz(GradientDrawable gradientDrawable) {
        this.f1512a = gradientDrawable;
        gradientDrawable.setShape(0);
    }

    /* renamed from: a */
    public final void m957a(float f) {
        this.f1512a.setCornerRadius(f);
    }

    /* renamed from: b */
    public final void m958b(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f1513b = f;
    }

    /* renamed from: c */
    public final void m959c(float f) {
        this.f1512a.setAlpha((int) (255.0f * f));
    }

    /* renamed from: d */
    public final void m960d(float f) {
        this.f1512a.setStroke((int) f, -1);
    }
}
