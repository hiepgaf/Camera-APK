package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bsy */
public final class bsy {
    /* renamed from: a */
    public static void m956a(Canvas canvas, Drawable drawable, float f) {
        int width = canvas.getWidth();
        canvas.save();
        float f2 = (float) width;
        float f3 = (f2 - f) / 2.0f;
        canvas.translate(f3, f3);
        f2 = f / f2;
        canvas.scale(f2, f2);
        drawable.draw(canvas);
        canvas.restore();
    }
}
