package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000.hga;
import p000.hgb;
import p000.hgc;

/* compiled from: PG */
public class TracedFrameLayout extends FrameLayout {
    /* renamed from: a */
    private final hgb f2445a = m1340a(this);

    public TracedFrameLayout(Context context) {
        super(context);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private static hgb m1340a(View view) {
        Object tag = view.getTag();
        if (tag == null) {
            return hga.f17748a;
        }
        return new hgc(tag.toString());
    }

    public void draw(Canvas canvas) {
        this.f2445a.mo1728a("draw");
        super.draw(canvas);
        this.f2445a.mo1727a();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2445a.mo1728a("onLayout");
        super.onLayout(z, i, i2, i3, i4);
        this.f2445a.mo1727a();
    }

    protected void onMeasure(int i, int i2) {
        this.f2445a.mo1728a("onMeasure");
        super.onMeasure(i, i2);
        this.f2445a.mo1727a();
    }
}
