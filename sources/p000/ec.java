package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: ec */
final class ec extends ConstantState {
    /* renamed from: a */
    public int f3522a;
    /* renamed from: b */
    public eb f3523b;
    /* renamed from: c */
    public ColorStateList f3524c;
    /* renamed from: d */
    public Mode f3525d;
    /* renamed from: e */
    public boolean f3526e;
    /* renamed from: f */
    public Bitmap f3527f;
    /* renamed from: g */
    public ColorStateList f3528g;
    /* renamed from: h */
    public Mode f3529h;
    /* renamed from: i */
    public int f3530i;
    /* renamed from: j */
    public boolean f3531j;
    /* renamed from: k */
    public boolean f3532k;
    /* renamed from: l */
    public Paint f3533l;

    public ec() {
        this.f3524c = null;
        this.f3525d = dw.f14632b;
        this.f3523b = new eb();
    }

    public ec(ec ecVar) {
        this.f3524c = null;
        this.f3525d = dw.f14632b;
        if (ecVar != null) {
            this.f3522a = ecVar.f3522a;
            this.f3523b = new eb(ecVar.f3523b);
            Paint paint = ecVar.f3523b.f3484c;
            if (paint != null) {
                this.f3523b.f3484c = new Paint(paint);
            }
            paint = ecVar.f3523b.f3483b;
            if (paint != null) {
                this.f3523b.f3483b = new Paint(paint);
            }
            this.f3524c = ecVar.f3524c;
            this.f3525d = ecVar.f3525d;
            this.f3526e = ecVar.f3526e;
        }
    }

    public final int getChangingConfigurations() {
        return this.f3522a;
    }

    public final Drawable newDrawable() {
        return new dw(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new dw(this);
    }

    /* renamed from: a */
    public final void m1747a(int i, int i2) {
        this.f3527f.eraseColor(0);
        Canvas canvas = new Canvas(this.f3527f);
        eb ebVar = this.f3523b;
        ebVar.m1743a(ebVar.f3485d, eb.f3482a, canvas, i, i2, null);
    }
}
