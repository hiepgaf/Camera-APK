package p000;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/* compiled from: PG */
/* renamed from: gbt */
public final class gbt extends RectShape {
    /* renamed from: a */
    public View f5035a = null;
    /* renamed from: b */
    public boolean f5036b = false;
    /* renamed from: c */
    private final View f5037c;
    /* renamed from: d */
    private float f5038d = 0.0f;
    /* renamed from: e */
    private final int f5039e;
    /* renamed from: f */
    private final RectF f5040f;

    public gbt(int i, View view) {
        this.f5039e = i;
        this.f5040f = new RectF();
        this.f5037c = view;
    }

    public final void draw(Canvas canvas, Paint paint) {
        if (this.f5036b) {
            canvas.drawOval(m2465a(), paint);
        }
    }

    /* renamed from: a */
    private final RectF m2465a() {
        int paddingLeft;
        int i = this.f5039e;
        int width = i + ((int) (((float) (((int) (rect().width() + rect().height())) - i)) * this.f5038d));
        View view = this.f5035a;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            i = iArr[1];
            int paddingTop = this.f5035a.getPaddingTop();
            int width2 = this.f5035a.getWidth();
            int paddingRight = this.f5035a.getPaddingRight();
            paddingLeft = (iArr[0] + this.f5035a.getPaddingLeft()) + (((width2 - paddingRight) - this.f5035a.getPaddingLeft()) / 2);
            i = (i + paddingTop) + (((this.f5035a.getHeight() - this.f5035a.getPaddingBottom()) - this.f5035a.getPaddingTop()) / 2);
        } else {
            i = 0;
            paddingLeft = 0;
        }
        int[] iArr2 = new int[2];
        this.f5037c.getLocationOnScreen(iArr2);
        int i2 = paddingLeft - iArr2[0];
        i -= iArr2[1];
        this.f5040f.set((float) (i2 - width), (float) (i - width), (float) (i2 + width), (float) (i + width));
        return this.f5040f;
    }

    public final void getOutline(Outline outline) {
        if (this.f5036b) {
            RectF a = m2465a();
            outline.setOval((int) Math.ceil((double) a.left), (int) Math.ceil((double) a.top), (int) Math.floor((double) a.right), (int) Math.floor((double) a.bottom));
        }
    }

    /* renamed from: a */
    public final void m2466a(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        this.f5038d = f;
    }
}
