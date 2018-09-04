package com.google.android.apps.refocus.viewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import p000.hsq;

/* compiled from: PG */
public class RGBZView extends ImageView {
    /* renamed from: a */
    public hsq f2464a;
    /* renamed from: b */
    public final RectF f2465b = new RectF();

    public RGBZView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getDrawable() != null) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            float width2 = (float) getWidth();
            float height2 = (float) getHeight();
            float min = Math.min(width2 / width, height2 / height);
            Matrix imageMatrix = getImageMatrix();
            imageMatrix.reset();
            imageMatrix.postTranslate((-width) / 2.0f, (-height) / 2.0f);
            imageMatrix.postRotate(0.0f);
            imageMatrix.postScale(min, min);
            imageMatrix.postTranslate(width2 / 2.0f, height2 / 2.0f);
            setScaleType(ScaleType.MATRIX);
            setImageMatrix(imageMatrix);
            this.f2465b.set(0.0f, 0.0f, width, height);
            imageMatrix.mapRect(this.f2465b);
            hsq hsq = this.f2464a;
            if (hsq != null) {
                hsq.mo800a(this.f2465b);
            }
        }
    }
}
