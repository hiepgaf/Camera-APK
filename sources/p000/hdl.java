package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hdl */
public final class hdl extends Drawable {
    /* renamed from: c */
    private static final float f6051c = ((float) Math.toRadians(45.0d));
    /* renamed from: a */
    public float f6052a;
    /* renamed from: b */
    private final Paint f6053b;
    /* renamed from: d */
    private float f6054d;
    /* renamed from: e */
    private float f6055e;
    /* renamed from: f */
    private float f6056f;
    /* renamed from: g */
    private float f6057g;
    /* renamed from: h */
    private boolean f6058h;
    /* renamed from: i */
    private final Path f6059i;
    /* renamed from: j */
    private final int f6060j;
    /* renamed from: k */
    private boolean f6061k;
    /* renamed from: l */
    private float f6062l;
    /* renamed from: m */
    private int f6063m;

    private hdl(Context context) {
        this.f6053b = new Paint();
        this.f6059i = new Path();
        this.f6061k = false;
        this.f6063m = 2;
        this.f6053b.setStyle(Style.STROKE);
        this.f6053b.setStrokeJoin(Join.MITER);
        this.f6053b.setStrokeCap(Cap.BUTT);
        this.f6053b.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, ni.az, R.attr.drawerArrowStyle, R.style.Base.Widget.AppCompat.DrawerArrowToggle);
        m3080a(obtainStyledAttributes.getColor(ni.aD, 0));
        float dimension = obtainStyledAttributes.getDimension(ni.aH, 0.0f);
        if (this.f6053b.getStrokeWidth() != dimension) {
            this.f6053b.setStrokeWidth(dimension);
            this.f6062l = (float) (((double) (dimension / 2.0f)) * Math.cos((double) f6051c));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(ni.aG, true);
        if (this.f6058h != z) {
            this.f6058h = z;
            invalidateSelf();
        }
        dimension = (float) Math.round(obtainStyledAttributes.getDimension(ni.aF, 0.0f));
        if (dimension != this.f6057g) {
            this.f6057g = dimension;
            invalidateSelf();
        }
        this.f6060j = obtainStyledAttributes.getDimensionPixelSize(ni.aE, 0);
        this.f6055e = (float) Math.round(obtainStyledAttributes.getDimension(ni.aC, 0.0f));
        this.f6054d = (float) Math.round(obtainStyledAttributes.getDimension(ni.aA, 0.0f));
        this.f6056f = obtainStyledAttributes.getDimension(ni.aB, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public hdl(Context context, byte b) {
        this(context);
        m3080a(-1);
    }

    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        switch (this.f6063m) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 3:
                if (getLayoutDirection() != 0) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
            default:
                if (getLayoutDirection() != 1) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
        }
        float f = this.f6054d;
        f *= f;
        double sqrt = Math.sqrt((double) (f + f));
        f = this.f6055e;
        float f2 = this.f6052a;
        float f3 = ((((float) sqrt) - f) * f2) + f;
        float f4 = ((this.f6056f - f) * f2) + f;
        float round = (float) Math.round(((this.f6062l + 0.0f) * f2) + 0.0f);
        f = f6051c;
        float f5 = this.f6052a;
        float f6 = ((f + 0.0f) * f5) + 0.0f;
        if (i == 0) {
            f2 = -180.0f;
        } else {
            f2 = 0.0f;
        }
        if (i == 0) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        f = ((f - f2) * f5) + f2;
        double d = (double) f3;
        double d2 = (double) f6;
        f2 = (float) Math.round(Math.cos(d2) * d);
        f3 = (float) Math.round(Math.sin(d2) * d);
        this.f6059i.rewind();
        f5 = this.f6057g + this.f6053b.getStrokeWidth();
        f5 += ((-this.f6062l) - f5) * this.f6052a;
        f6 = (-f4) / 2.0f;
        this.f6059i.moveTo(f6 + round, 0.0f);
        this.f6059i.rLineTo(f4 - (round + round), 0.0f);
        this.f6059i.moveTo(f6, f5);
        this.f6059i.rLineTo(f2, f3);
        this.f6059i.moveTo(f6, -f5);
        this.f6059i.rLineTo(f2, -f3);
        this.f6059i.close();
        canvas.save();
        f2 = this.f6053b.getStrokeWidth();
        int height = bounds.height();
        f4 = this.f6057g;
        height = ((int) ((((float) height) - (3.0f * f2)) - (f4 + f4))) / 4;
        canvas.translate((float) bounds.centerX(), (float) ((((double) f4) + (((double) f2) * 1.5d)) + ((double) ((float) (height + height)))));
        if (this.f6058h) {
            if ((i ^ this.f6061k) == 0) {
                i = 1;
            } else {
                i = -1;
            }
            canvas.rotate(((float) i) * f);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f6059i, this.f6053b);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f6060j;
    }

    public final int getIntrinsicWidth() {
        return this.f6060j;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.f6053b.getAlpha()) {
            this.f6053b.setAlpha(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private final void m3080a(int i) {
        if (i != this.f6053b.getColor()) {
            this.f6053b.setColor(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6053b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m3081a(boolean z) {
        if (this.f6061k != z) {
            this.f6061k = z;
            invalidateSelf();
        }
    }
}
