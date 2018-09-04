package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: gyd */
public class gyd {
    /* renamed from: a */
    public int f5788a;
    /* renamed from: b */
    public boolean f5789b;
    /* renamed from: c */
    public final Paint f5790c;

    public gyd(Paint paint) {
        this.f5790c = paint;
    }

    public gyd(Paint paint, byte b) {
        this(paint);
    }

    /* renamed from: a */
    public void mo1674a(Canvas canvas, RectF rectF) {
        if (!this.f5789b) {
            float f = (float) this.f5788a;
            Canvas canvas2 = canvas;
            canvas2.drawLine(rectF.left, rectF.top + f, rectF.right, f + rectF.top, this.f5790c);
        }
    }

    /* renamed from: a */
    public final void m2910a(int i) {
        this.f5790c.setAlpha(i);
    }
}
