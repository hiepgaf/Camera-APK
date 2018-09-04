package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import p000.hfx;

/* compiled from: PG */
public class Cling extends TextView {
    /* renamed from: a */
    public boolean f2439a;
    /* renamed from: b */
    private View f2440b;
    /* renamed from: c */
    private final int[] f2441c;
    /* renamed from: d */
    private final OnLayoutChangeListener f2442d;

    public Cling(Context context) {
        super(context);
        this.f2440b = null;
        this.f2441c = new int[2];
        this.f2442d = new hfx(this);
        this.f2439a = false;
    }

    public Cling(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2440b = null;
        this.f2441c = new int[2];
        this.f2442d = new hfx(this);
        this.f2439a = false;
    }

    /* renamed from: a */
    public final void m1337a() {
        View view = this.f2440b;
        if (view != null) {
            view.getLocationInWindow(this.f2441c);
            int i = this.f2441c[0];
            int width = this.f2440b.getWidth();
            int i2 = this.f2441c[1];
            int width2 = getWidth();
            int height = getHeight();
            getLocationInWindow(this.f2441c);
            int i3 = this.f2441c[0];
            float translationX = getTranslationX();
            int i4 = this.f2441c[1];
            float translationY = getTranslationY();
            setTranslationX((float) (((i + (width / 2)) - (width2 / 2)) - (i3 - ((int) translationX))));
            setTranslationY((float) ((i2 - height) - (i4 - ((int) translationY))));
        }
    }

    public void draw(Canvas canvas) {
        if (!this.f2439a) {
            super.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void m1338a(View view) {
        if (view == null) {
            View view2 = this.f2440b;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(this.f2442d);
                this.f2440b = null;
                return;
            }
            return;
        }
        this.f2440b = view;
        this.f2440b.addOnLayoutChangeListener(this.f2442d);
        if (this.f2440b.getVisibility() == 8) {
            this.f2439a = true;
        } else {
            m1337a();
        }
    }
}
