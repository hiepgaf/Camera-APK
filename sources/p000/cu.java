package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cu */
public final class cu extends nk {
    /* renamed from: e */
    private static final double f12640e = Math.cos(Math.toRadians(45.0d));
    /* renamed from: a */
    public float f12641a;
    /* renamed from: b */
    public boolean f12642b = true;
    /* renamed from: c */
    public float f12643c;
    /* renamed from: f */
    private final Paint f12644f;
    /* renamed from: g */
    private final Paint f12645g;
    /* renamed from: h */
    private final RectF f12646h;
    /* renamed from: i */
    private float f12647i;
    /* renamed from: j */
    private Path f12648j;
    /* renamed from: k */
    private float f12649k;
    /* renamed from: l */
    private float f12650l;
    /* renamed from: m */
    private boolean f12651m = true;
    /* renamed from: n */
    private final int f12652n;
    /* renamed from: o */
    private final int f12653o;
    /* renamed from: p */
    private final int f12654p;
    /* renamed from: q */
    private boolean f12655q = false;

    public cu(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f12652n = ge.getColor(context, R.color.design_fab_shadow_start_color);
        this.f12653o = ge.getColor(context, R.color.design_fab_shadow_mid_color);
        this.f12654p = ge.getColor(context, R.color.design_fab_shadow_end_color);
        this.f12644f = new Paint(5);
        this.f12644f.setStyle(Style.FILL);
        this.f12647i = (float) Math.round(f);
        this.f12646h = new RectF();
        this.f12645g = new Paint(this.f12644f);
        this.f12645g.setAntiAlias(false);
        m8758a(f2, f3);
    }

    /* renamed from: a */
    public static float m8754a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f12640e) * ((double) f2)));
        }
        return f;
    }

    /* renamed from: b */
    public static float m8755b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - f12640e) * ((double) f2)));
        }
        return 1.5f * f;
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        if (this.f12651m) {
            Rect bounds = getBounds();
            float f3 = this.f12649k;
            f = 1.5f * f3;
            this.f12646h.set(((float) bounds.left) + f3, ((float) bounds.top) + f, ((float) bounds.right) - f3, ((float) bounds.bottom) - f);
            Drawable drawable = this.f8925d;
            RectF rectF = this.f12646h;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            f2 = this.f12647i;
            f3 = -f2;
            RectF rectF2 = new RectF(f3, f3, f2, f2);
            RectF rectF3 = new RectF(rectF2);
            f2 = -this.f12650l;
            rectF3.inset(f2, f2);
            Path path = this.f12648j;
            if (path == null) {
                this.f12648j = new Path();
            } else {
                path.reset();
            }
            this.f12648j.setFillType(FillType.EVEN_ODD);
            this.f12648j.moveTo(-this.f12647i, 0.0f);
            this.f12648j.rLineTo(-this.f12650l, 0.0f);
            this.f12648j.arcTo(rectF3, 180.0f, 90.0f, false);
            this.f12648j.arcTo(rectF2, 270.0f, -90.0f, false);
            this.f12648j.close();
            float f4 = -rectF3.top;
            if (f4 > 0.0f) {
                f3 = this.f12647i / f4;
                this.f12644f.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{0, this.f12652n, this.f12653o, this.f12654p}, new float[]{0.0f, f3, f3 + ((1.0f - f3) / 2.0f), 1.0f}, TileMode.CLAMP));
            }
            this.f12645g.setShader(new LinearGradient(0.0f, rectF2.top, 0.0f, rectF3.top, new int[]{this.f12652n, this.f12653o, this.f12654p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.f12645g.setAntiAlias(false);
            this.f12651m = false;
        }
        int save = canvas.save();
        canvas.rotate(this.f12643c, this.f12646h.centerX(), this.f12646h.centerY());
        float f5 = this.f12647i;
        f = (-f5) - this.f12650l;
        float f6 = f5 + f5;
        float width = this.f12646h.width() - f6;
        float height = this.f12646h.height() - f6;
        f2 = this.f12641a;
        float f7 = f5 / ((f2 - (0.5f * f2)) + f5);
        float f8 = f5 / ((f2 - (0.25f * f2)) + f5);
        float f9 = f5 / (0.0f + f5);
        int save2 = canvas.save();
        RectF rectF4 = this.f12646h;
        canvas.translate(rectF4.left + f5, rectF4.top + f5);
        canvas.scale(f7, f8);
        canvas.drawPath(this.f12648j, this.f12644f);
        if (width > 0.0f) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f, this.f12646h.width() - f6, -this.f12647i, this.f12645g);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        rectF4 = this.f12646h;
        canvas.translate(rectF4.right - f5, rectF4.bottom - f5);
        canvas.scale(f7, f9);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f12648j, this.f12644f);
        if (width > 0.0f) {
            canvas.scale(1.0f / f7, 1.0f);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, f, this.f12646h.width() - f6, this.f12650l + (-this.f12647i), this.f12645g);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        rectF4 = this.f12646h;
        canvas.translate(rectF4.left + f5, rectF4.bottom - f5);
        canvas.scale(f7, f9);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f12648j, this.f12644f);
        if (height > 0.0f) {
            canvas.scale(1.0f / f9, 1.0f);
            canvas.drawRect(0.0f, f, this.f12646h.height() - f6, -this.f12647i, this.f12645g);
        }
        canvas.restoreToCount(save3);
        save3 = canvas.save();
        rectF4 = this.f12646h;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        canvas.scale(f7, f8);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f12648j, this.f12644f);
        if (height > 0.0f) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f, this.f12646h.height() - f6, -this.f12647i, this.f12645g);
        }
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
        super.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) cu.m8755b(this.f12649k, this.f12647i, this.f12642b));
        int ceil2 = (int) Math.ceil((double) cu.m8754a(this.f12649k, this.f12647i, this.f12642b));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        this.f12651m = true;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f12644f.setAlpha(i);
        this.f12645g.setAlpha(i);
    }

    /* renamed from: a */
    public final void m8757a(float f) {
        m8758a(f, this.f12649k);
    }

    /* renamed from: a */
    public final void m8758a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = (float) cu.m8756b(f);
        float b2 = (float) cu.m8756b(f2);
        if (b > b2) {
            if (this.f12655q) {
                b = b2;
            } else {
                this.f12655q = true;
                b = b2;
            }
        }
        if (this.f12641a != b || this.f12649k != b2) {
            this.f12641a = b;
            this.f12649k = b2;
            this.f12650l = (float) Math.round(b * 1.5f);
            this.f12651m = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    private static int m8756b(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }
}
