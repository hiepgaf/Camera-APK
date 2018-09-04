package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* compiled from: PG */
/* renamed from: cl */
public class cl extends sy {
    /* renamed from: a */
    private Drawable f12142a;
    /* renamed from: b */
    private final Rect f12143b;
    /* renamed from: c */
    private final Rect f12144c;
    /* renamed from: h */
    private int f12145h;
    /* renamed from: i */
    private boolean f12146i;
    /* renamed from: j */
    private boolean f12147j;

    public cl(Context context) {
        this(context, null);
    }

    public cl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12143b = new Rect();
        this.f12144c = new Rect();
        this.f12145h = 119;
        this.f12146i = true;
        this.f12147j = false;
        TypedArray a = cr.m1413a(context, attributeSet, cn.f2188a, i, 0);
        this.f12145h = a.getInt(cn.f2190c, this.f12145h);
        Drawable drawable = a.getDrawable(cn.f2189b);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f12146i = a.getBoolean(cn.f2191d, true);
        a.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12142a;
        if (drawable != null) {
            if (this.f12147j) {
                this.f12147j = false;
                Rect rect = this.f12143b;
                Rect rect2 = this.f12144c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f12146i) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f12145h, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f12142a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12142a;
        if (drawable != null && drawable.isStateful()) {
            this.f12142a.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f12142a;
    }

    public int getForegroundGravity() {
        return this.f12145h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12142a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12147j |= z;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12147j = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f12142a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f12142a);
            }
            this.f12142a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f12145h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f12145h != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f12145h = i2;
            if (this.f12145h == 119 && this.f12142a != null) {
                this.f12142a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12142a;
    }
}
