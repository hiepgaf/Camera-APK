package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ci */
public class ci extends Drawable {
    /* renamed from: a */
    public final Paint f2011a = new Paint(1);
    /* renamed from: b */
    public final Rect f2012b = new Rect();
    /* renamed from: c */
    public float f2013c;
    /* renamed from: d */
    public int f2014d;
    /* renamed from: e */
    public int f2015e;
    /* renamed from: f */
    public int f2016f;
    /* renamed from: g */
    public int f2017g;
    /* renamed from: h */
    public boolean f2018h = true;
    /* renamed from: i */
    public float f2019i;
    /* renamed from: j */
    private final RectF f2020j = new RectF();
    /* renamed from: k */
    private ColorStateList f2021k;
    /* renamed from: l */
    private int f2022l;

    public ci() {
        this.f2011a.setStyle(Style.STROKE);
    }

    public void draw(Canvas canvas) {
        float height;
        if (this.f2018h) {
            Paint paint = this.f2011a;
            Rect rect = this.f2012b;
            copyBounds(rect);
            height = this.f2013c / ((float) rect.height());
            float f = 0.0f;
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, f, (float) rect.bottom, new int[]{gu.m2829a(this.f2014d, this.f2022l), gu.m2829a(this.f2015e, this.f2022l), gu.m2829a(gu.m2831b(this.f2015e, 0), this.f2022l), gu.m2829a(gu.m2831b(this.f2017g, 0), this.f2022l), gu.m2829a(this.f2017g, this.f2022l), gu.m2829a(this.f2016f, this.f2022l)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP));
            this.f2018h = false;
        }
        height = this.f2011a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f2020j;
        copyBounds(this.f2012b);
        rectF.set(this.f2012b);
        rectF.left += height;
        rectF.top += height;
        rectF.right -= height;
        rectF.bottom -= height;
        canvas.save();
        canvas.rotate(this.f2019i, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f2011a);
        canvas.restore();
    }

    public int getOpacity() {
        return this.f2013c > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f2013c);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f2021k;
        if (colorStateList != null) {
            if (!colorStateList.isStateful()) {
            }
            return true;
        }
        if (!super.isStateful()) {
            return false;
        }
        return true;
    }

    protected void onBoundsChange(Rect rect) {
        this.f2018h = true;
    }

    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2021k;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.f2022l);
            if (colorForState != this.f2022l) {
                this.f2018h = true;
                this.f2022l = colorForState;
            }
        }
        if (this.f2018h) {
            invalidateSelf();
        }
        return this.f2018h;
    }

    public void setAlpha(int i) {
        this.f2011a.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m1150a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f2022l = colorStateList.getColorForState(getState(), this.f2022l);
        }
        this.f2021k = colorStateList;
        this.f2018h = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2011a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
