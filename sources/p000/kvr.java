package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* compiled from: PG */
/* renamed from: kvr */
public final class kvr extends ImageView {
    /* renamed from: a */
    public float f8674a;
    /* renamed from: b */
    public Matrix f8675b;
    /* renamed from: c */
    public int f8676c;
    /* renamed from: d */
    public float f8677d;
    /* renamed from: e */
    public float f8678e;
    /* renamed from: f */
    public float[] f8679f;
    /* renamed from: g */
    public Context f8680g;
    /* renamed from: h */
    public kvv f8681h;
    /* renamed from: i */
    public int f8682i;
    /* renamed from: j */
    public int f8683j;
    /* renamed from: k */
    public ScaleGestureDetector f8684k;
    /* renamed from: l */
    public GestureDetector f8685l;
    /* renamed from: m */
    public OnTouchListener f8686m = null;
    /* renamed from: n */
    private Matrix f8687n;
    /* renamed from: o */
    private float f8688o;
    /* renamed from: p */
    private float f8689p;
    /* renamed from: q */
    private ScaleType f8690q;
    /* renamed from: r */
    private boolean f8691r;
    /* renamed from: s */
    private boolean f8692s;
    /* renamed from: t */
    private kvz f8693t;
    /* renamed from: u */
    private int f8694u;
    /* renamed from: v */
    private int f8695v;
    /* renamed from: w */
    private float f8696w;
    /* renamed from: x */
    private float f8697x;
    /* renamed from: y */
    private float f8698y;
    /* renamed from: z */
    private float f8699z;

    public kvr(Context context) {
        super(context);
        super.setClickable(true);
        this.f8680g = context;
        this.f8684k = new ScaleGestureDetector(context, new kvy(this));
        this.f8685l = new GestureDetector(context, new kvw(this));
        this.f8675b = new Matrix();
        this.f8687n = new Matrix();
        this.f8679f = new float[9];
        this.f8674a = 1.0f;
        if (this.f8690q == null) {
            this.f8690q = ScaleType.FIT_CENTER;
        }
        this.f8677d = 1.0f;
        this.f8678e = 3.0f;
        this.f8688o = this.f8677d * 0.75f;
        this.f8689p = this.f8678e * 1.25f;
        setImageMatrix(this.f8675b);
        setScaleType(ScaleType.MATRIX);
        this.f8676c = go.cf;
        this.f8692s = false;
        super.setOnTouchListener(new kvx(this));
    }

    public final boolean canScrollHorizontally(int i) {
        this.f8675b.getValues(this.f8679f);
        float f = this.f8679f[2];
        if (m5471d() < ((float) this.f8682i)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if ((Math.abs(f) + ((float) this.f8682i)) + 1.0f < m5471d() || i <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final void m5465f() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0 && this.f8675b != null && this.f8687n != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = (float) intrinsicWidth;
            float f2 = ((float) this.f8682i) / f;
            float f3 = (float) intrinsicHeight;
            float f4 = ((float) this.f8683j) / f3;
            switch (kvs.f8700a[this.f8690q.ordinal()]) {
                case 1:
                    f4 = 1.0f;
                    f2 = 1.0f;
                    break;
                case 2:
                    f4 = Math.max(f2, f4);
                    f2 = f4;
                    break;
                case 3:
                    f4 = Math.min(1.0f, Math.min(f2, f4));
                    f2 = f4;
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
            }
            f4 = Math.min(f2, f4);
            f2 = f4;
            float f5 = (float) this.f8682i;
            float f6 = f5 - (f2 * f);
            float f7 = (float) this.f8683j;
            float f8 = f7 - (f4 * f3);
            this.f8696w = f5 - f6;
            this.f8697x = f7 - f8;
            if (this.f8674a != 1.0f || this.f8691r) {
                if (this.f8698y == 0.0f || this.f8699z == 0.0f) {
                    m5466g();
                }
                this.f8687n.getValues(this.f8679f);
                float[] fArr = this.f8679f;
                float f9 = this.f8696w;
                f2 = this.f8674a;
                fArr[0] = (f9 / f) * f2;
                fArr[4] = (this.f8697x / f3) * f2;
                f9 = fArr[2];
                f6 = fArr[5];
                m5463a(2, f9, f2 * this.f8698y, m5471d(), this.f8694u, this.f8682i, intrinsicWidth);
                m5463a(5, f6, this.f8699z * this.f8674a, m5470c(), this.f8695v, this.f8683j, intrinsicHeight);
                this.f8675b.setValues(this.f8679f);
            } else {
                this.f8675b.setScale(f2, f4);
                this.f8675b.postTranslate(f6 / 2.0f, f8 / 2.0f);
                this.f8674a = 1.0f;
            }
            m5469b();
            setImageMatrix(this.f8675b);
        }
    }

    /* renamed from: a */
    final void m5468a() {
        m5469b();
        this.f8675b.getValues(this.f8679f);
        float f = (float) this.f8682i;
        if (m5471d() < f) {
            this.f8679f[2] = (f - m5471d()) / 2.0f;
        }
        f = (float) this.f8683j;
        if (m5470c() < f) {
            this.f8679f[5] = (f - m5470c()) / 2.0f;
        }
        this.f8675b.setValues(this.f8679f);
    }

    /* renamed from: b */
    final void m5469b() {
        this.f8675b.getValues(this.f8679f);
        float[] fArr = this.f8679f;
        float f = fArr[2];
        float f2 = fArr[5];
        f = kvr.m5459a(f, (float) this.f8682i, m5471d());
        f2 = kvr.m5459a(f2, (float) this.f8683j, m5470c());
        if (f != 0.0f || f2 != 0.0f) {
            this.f8675b.postTranslate(f, f2);
        }
    }

    /* renamed from: a */
    private static float m5459a(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = 0.0f;
        } else {
            f5 = f2 - f3;
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    /* renamed from: c */
    final float m5470c() {
        return this.f8697x * this.f8674a;
    }

    /* renamed from: d */
    final float m5471d() {
        return this.f8696w * this.f8674a;
    }

    public final ScaleType getScaleType() {
        return this.f8690q;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5466g();
    }

    protected final void onDraw(Canvas canvas) {
        this.f8692s = true;
        this.f8691r = true;
        kvz kvz = this.f8693t;
        if (kvz != null) {
            m5462a(kvz.f8720a, kvz.f8721b, kvz.f8722c, kvz.f8723d);
            this.f8693t = null;
        }
        super.onDraw(canvas);
    }

    protected final void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        this.f8682i = kvr.m5460a(mode, size, intrinsicWidth);
        this.f8683j = kvr.m5460a(mode2, size2, intrinsicHeight);
        setMeasuredDimension(this.f8682i, this.f8683j);
        m5465f();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f8674a = bundle.getFloat("saveScale");
            this.f8679f = bundle.getFloatArray("matrix");
            this.f8687n.setValues(this.f8679f);
            this.f8699z = bundle.getFloat("matchViewHeight");
            this.f8698y = bundle.getFloat("matchViewWidth");
            this.f8695v = bundle.getInt("viewHeight");
            this.f8694u = bundle.getInt("viewWidth");
            this.f8691r = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.f8674a);
        bundle.putFloat("matchViewHeight", this.f8697x);
        bundle.putFloat("matchViewWidth", this.f8696w);
        bundle.putInt("viewWidth", this.f8682i);
        bundle.putInt("viewHeight", this.f8683j);
        this.f8675b.getValues(this.f8679f);
        bundle.putFloatArray("matrix", this.f8679f);
        bundle.putBoolean("imageRendered", this.f8691r);
        return bundle;
    }

    /* renamed from: e */
    public final void m5472e() {
        this.f8674a = 1.0f;
        m5465f();
    }

    /* renamed from: g */
    private final void m5466g() {
        Matrix matrix = this.f8675b;
        if (matrix != null && this.f8683j != 0 && this.f8682i != 0) {
            matrix.getValues(this.f8679f);
            this.f8687n.setValues(this.f8679f);
            this.f8699z = this.f8697x;
            this.f8698y = this.f8696w;
            this.f8695v = this.f8683j;
            this.f8694u = this.f8682i;
        }
    }

    /* renamed from: a */
    private final void m5461a(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            f3 = this.f8688o;
            f4 = this.f8689p;
        } else {
            f3 = this.f8677d;
            f4 = this.f8678e;
        }
        float f5 = this.f8674a;
        this.f8674a = (float) (((double) f5) * d);
        float f6 = this.f8674a;
        if (f6 > f4) {
            this.f8674a = f4;
            d = (double) (f4 / f5);
        } else if (f6 < f3) {
            this.f8674a = f3;
            d = (double) (f3 / f5);
        }
        f4 = (float) d;
        this.f8675b.postScale(f4, f4, f, f2);
        m5468a();
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m5466g();
        m5465f();
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m5466g();
        m5465f();
    }

    public final void setImageResource(int i) {
        super.setImageResource(i);
        m5466g();
        m5465f();
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m5466g();
        m5465f();
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f8686m = onTouchListener;
    }

    public final void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.FIT_START || scaleType == ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        } else if (scaleType == ScaleType.MATRIX) {
            super.setScaleType(ScaleType.MATRIX);
        } else {
            this.f8690q = scaleType;
            if (this.f8692s) {
                PointF a;
                Drawable drawable = getDrawable();
                if (drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    a = m5467a((float) (this.f8682i / 2), (float) (this.f8683j / 2), true);
                    a.x /= (float) intrinsicWidth;
                    a.y /= (float) intrinsicHeight;
                } else {
                    a = null;
                }
                m5462a(this.f8674a, a.x, a.y, getScaleType());
            }
        }
    }

    /* renamed from: a */
    private static int m5460a(int i, int i2, int i3) {
        switch (i) {
            case kvl.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(i3, i2);
            case 0:
                return i3;
            default:
                return i2;
        }
    }

    /* renamed from: a */
    private final void m5462a(float f, float f2, float f3, ScaleType scaleType) {
        if (this.f8692s) {
            if (scaleType != this.f8690q) {
                setScaleType(scaleType);
            }
            m5472e();
            m5461a((double) f, (float) (this.f8682i / 2), (float) (this.f8683j / 2), true);
            this.f8675b.getValues(this.f8679f);
            this.f8679f[2] = -((m5471d() * f2) - (((float) this.f8682i) * 0.5f));
            this.f8679f[5] = -((m5470c() * f3) - (((float) this.f8683j) * 0.5f));
            this.f8675b.setValues(this.f8679f);
            m5469b();
            setImageMatrix(this.f8675b);
            return;
        }
        this.f8693t = new kvz(f, f2, f3, scaleType);
    }

    /* renamed from: a */
    final PointF m5467a(float f, float f2, boolean z) {
        this.f8675b.getValues(this.f8679f);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f8679f;
        float f3 = fArr[2];
        f3 = ((f - f3) * intrinsicWidth) / m5471d();
        float c = ((f2 - fArr[5]) * intrinsicHeight) / m5470c();
        if (z) {
            f3 = Math.min(Math.max(f3, 0.0f), intrinsicWidth);
            c = Math.min(Math.max(c, 0.0f), intrinsicHeight);
        }
        return new PointF(f3, c);
    }

    /* renamed from: a */
    private final void m5463a(int i, float f, float f2, float f3, int i2, int i3, int i4) {
        float f4 = (float) i3;
        if (f3 < f4) {
            float[] fArr = this.f8679f;
            fArr[i] = (f4 - (((float) i4) * fArr[0])) * 0.5f;
        } else if (f > 0.0f) {
            this.f8679f[i] = -((f3 - f4) * 0.5f);
        } else {
            this.f8679f[i] = -((((Math.abs(f) + (((float) i2) * 0.5f)) / f2) * f3) - (f4 * 0.5f));
        }
    }
}
