package com.google.android.apps.camera.legacy.app.tinyplanet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.locks.Lock;
import p000.eaz;

/* compiled from: PG */
public class TinyPlanetPreview extends View {
    /* renamed from: a */
    public Bitmap f2372a;
    /* renamed from: b */
    public Lock f2373b;
    /* renamed from: c */
    public eaz f2374c;
    /* renamed from: d */
    private Paint f2375d = new Paint();

    public TinyPlanetPreview(Context context) {
        super(context);
    }

    public TinyPlanetPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TinyPlanetPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Lock lock = this.f2373b;
        if (lock != null && lock.tryLock()) {
            try {
                Bitmap bitmap = this.f2372a;
                if (!(bitmap == null || bitmap.isRecycled())) {
                    canvas.drawBitmap(this.f2372a, 0.0f, 0.0f, this.f2375d);
                }
                this.f2373b.unlock();
            } catch (Throwable th) {
                this.f2373b.unlock();
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.f2374c != null) {
            int min = Math.min(i3 - i, i4 - i2);
            if (min > 0) {
                eaz eaz = this.f2374c;
                if (eaz != null) {
                    eaz.mo1206a(min);
                }
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);
    }
}
