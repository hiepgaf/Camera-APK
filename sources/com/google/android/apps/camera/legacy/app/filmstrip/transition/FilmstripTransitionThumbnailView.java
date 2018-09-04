package com.google.android.apps.camera.legacy.app.filmstrip.transition;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import p000.bli;

/* compiled from: PG */
public class FilmstripTransitionThumbnailView extends View {
    /* renamed from: a */
    public final Object f2329a = new Object();
    /* renamed from: b */
    public Bitmap f2330b;
    /* renamed from: c */
    public Paint f2331c;
    /* renamed from: d */
    private float f2332d = -1.0f;

    static {
        bli.m862a("FsTransThumbnail");
    }

    public FilmstripTransitionThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final Bitmap m1248a() {
        Bitmap bitmap;
        synchronized (this.f2329a) {
            bitmap = this.f2330b;
        }
        return bitmap;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2332d >= 0.0f) {
            synchronized (this.f2329a) {
                canvas.drawCircle((float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2), this.f2332d, this.f2331c);
            }
        }
    }

    /* renamed from: a */
    public final void m1249a(float f) {
        this.f2332d = f;
        invalidate();
    }
}
