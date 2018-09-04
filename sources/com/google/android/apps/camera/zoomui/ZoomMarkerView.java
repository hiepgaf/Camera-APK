package com.google.android.apps.camera.zoomui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p000.hpr;
import p000.jri;

/* compiled from: PG */
public class ZoomMarkerView extends View {
    /* renamed from: a */
    public final hpr f2453a;
    /* renamed from: b */
    public boolean f2454b;
    /* renamed from: c */
    public float f2455c;
    /* renamed from: d */
    public float f2456d;
    /* renamed from: e */
    public float f2457e;
    /* renamed from: f */
    public float f2458f = 1.0f;

    public ZoomMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2453a = new hpr(context.getResources());
        this.f2455c = this.f2458f;
    }

    public ZoomMarkerView(Context context, hpr hpr) {
        super(context);
        this.f2453a = hpr;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f2454b) {
            boolean z;
            hpr hpr = this.f2453a;
            float f = this.f2455c;
            float f2 = this.f2456d;
            float width = (float) getWidth();
            if (hpr.f6438i != 0.0f) {
                z = true;
            } else {
                z = false;
            }
            jri.m13144a(z, (Object) "max zoom value hasn't been initialized properly");
            if (hpr.f6439j >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            jri.m13144a(z, (Object) "min zoom value hasn't been initialized properly");
            float f3 = hpr.f6439j;
            if (f >= f3) {
                z = true;
            } else {
                z = false;
            }
            Float valueOf = Float.valueOf(f3);
            Float valueOf2 = Float.valueOf(hpr.f6438i);
            Float valueOf3 = Float.valueOf(f);
            jri.m13150a(z, "zoom must be in the range [%s, %s]: %s", valueOf, valueOf2, valueOf3);
            f3 = hpr.f6438i;
            if (f <= f3) {
                z = true;
            } else {
                z = false;
            }
            jri.m13150a(z, "zoom must be in the range [%s, %s]: %s", Float.valueOf(hpr.f6439j), Float.valueOf(f3), valueOf3);
            if (f2 >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Object valueOf4 = Float.valueOf(f2);
            jri.m13148a(z, "scale must be in the range [0, 1]: %s", valueOf4);
            if (f2 <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            jri.m13148a(z, "scale must be in the range [0, 1]: %s", valueOf4);
            if (f2 != 0.0f) {
                float f4 = hpr.f6431b;
                f3 = hpr.f6430a;
                float f5 = hpr.f6432c;
                float f6 = hpr.f6435f;
                f = (((float) (Math.log((double) (f / hpr.f6439j)) / Math.log((double) (hpr.f6438i / hpr.f6439j)))) * ((width - f6) - f6)) + f6;
                width = (f3 * f2) / 2.0f;
                f3 = hpr.f6431b;
                f4 = f3 - (f4 * f2);
                f5 = f3 - (f5 * f2);
                f6 = f - width;
                width += f;
                Path path = new Path();
                path.moveTo(f, f3);
                path.lineTo(width, f5);
                path.lineTo(width, hpr.f6433d + f4);
                path.quadTo(width, f4, width - hpr.f6433d, f4);
                path.lineTo(hpr.f6433d + f6, f4);
                path.quadTo(f6, f4, f6, hpr.f6433d + f4);
                path.lineTo(f6, f5);
                path.lineTo(f, f3);
                path.close();
                canvas.drawPath(path, hpr.f6436g);
                String concat = String.valueOf(String.format("%.1f", new Object[]{valueOf3})).concat(" X");
                hpr.f6437h.setTextSize(f2 * hpr.f6434e);
                Rect rect = new Rect();
                hpr.f6437h.getTextBounds(concat, 0, concat.length(), rect);
                canvas.drawText(concat, f, (f4 + ((f5 - f4) / 2.0f)) + ((float) (rect.height() / 2)), hpr.f6437h);
            }
        }
    }

    /* renamed from: a */
    public final void m1344a(float f) {
        boolean z;
        boolean z2 = true;
        float f2 = this.f2457e;
        if (f <= f2) {
            z = true;
        } else {
            z = false;
        }
        Object valueOf = Float.valueOf(f2);
        Object valueOf2 = Float.valueOf(f);
        jri.m13149a(z, "marker position must be in range [1,%s] was: %s", valueOf, valueOf2);
        if (f < 1.0f) {
            z2 = false;
        }
        jri.m13149a(z2, "marker position must be in range [1,%s] was: %s", Float.valueOf(this.f2457e), valueOf2);
        this.f2455c = f;
        invalidate();
    }
}
