package com.google.android.apps.refocus;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
public class RefocusProgressView extends View {
    /* renamed from: a */
    public boolean f2459a;
    /* renamed from: b */
    private final Drawable f2460b = getResources().getDrawable(R.drawable.refocus_arrow_top);
    /* renamed from: c */
    private final Drawable f2461c = getResources().getDrawable(R.drawable.refocus_arrow_bottom);
    /* renamed from: d */
    private final Drawable f2462d = getResources().getDrawable(R.drawable.ic_phone_graphic);
    /* renamed from: e */
    private final Drawable f2463e = getResources().getDrawable(R.drawable.ic_warning_graphic);

    public RefocusProgressView(Context context) {
        super(context);
    }

    public RefocusProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RefocusProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f2460b.draw(canvas);
        this.f2461c.draw(canvas);
        if (this.f2459a) {
            this.f2463e.draw(canvas);
        } else {
            this.f2462d.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void m1348a(float f) {
        int height = getHeight();
        int floor = (int) Math.floor((double) (((float) getWidth()) / 2.0f));
        int minimumHeight = this.f2460b.getMinimumHeight();
        int minimumWidth = this.f2460b.getMinimumWidth();
        int minimumWidth2 = this.f2461c.getMinimumWidth();
        int intrinsicHeight = this.f2462d.getIntrinsicHeight();
        int intrinsicWidth = this.f2462d.getIntrinsicWidth();
        int intrinsicWidth2 = this.f2463e.getIntrinsicWidth();
        int intrinsicHeight2 = this.f2463e.getIntrinsicHeight();
        height = ((height - 8) - minimumHeight) - intrinsicHeight;
        int floor2 = (int) Math.floor((double) (((float) height) * f));
        height = (height + minimumHeight) - floor2;
        minimumHeight = height + 4;
        int i = (minimumHeight + 4) + intrinsicHeight;
        int i2 = intrinsicHeight / intrinsicHeight2;
        minimumWidth /= 2;
        this.f2460b.setBounds(floor - minimumWidth, 0, minimumWidth + floor, height);
        height = intrinsicWidth / 2;
        this.f2462d.setBounds(floor - height, minimumHeight, height + floor, intrinsicHeight + minimumHeight);
        height = (intrinsicWidth2 * i2) / 2;
        this.f2463e.setBounds(floor - height, minimumHeight, height + floor, (intrinsicHeight2 * i2) + minimumHeight);
        height = minimumWidth2 / 2;
        this.f2461c.setBounds(floor - height, i, height + floor, i + floor2);
        invalidate();
    }
}
