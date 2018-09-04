package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bo */
public final class bo extends qm {
    /* renamed from: a */
    private final bq f11118a;
    /* renamed from: b */
    private int f11119b;
    /* renamed from: c */
    private int f11120c;
    /* renamed from: d */
    private int f11121d;
    /* renamed from: e */
    private int f11122e;
    /* renamed from: f */
    private int f11123f;
    /* renamed from: g */
    private int f11124g;
    /* renamed from: h */
    private int f11125h;
    /* renamed from: i */
    private int f11126i;
    /* renamed from: j */
    private int f11127j;
    /* renamed from: k */
    private int f11128k;
    /* renamed from: l */
    private int f11129l;
    /* renamed from: m */
    private Mode f11130m;
    /* renamed from: n */
    private ColorStateList f11131n;
    /* renamed from: o */
    private Drawable f11132o;

    public bo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private bo(Context context, AttributeSet attributeSet, byte b) {
        Drawable bpVar;
        Mode mode;
        int i = 0;
        super(context, attributeSet, R.attr.materialButtonStyle);
        TypedArray a = cr.m1413a(context, attributeSet, br.f1462a, R.attr.materialButtonStyle, R.style.Widget.MaterialComponents.Button);
        int dimensionPixelOffset = a.getDimensionPixelOffset(br.f1469h, 0);
        this.f11119b = a.getDimensionPixelOffset(br.f1472k, a.getDimensionPixelOffset(1, dimensionPixelOffset));
        this.f11120c = a.getDimensionPixelOffset(br.f1471j, a.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.f11121d = a.getDimensionPixelOffset(br.f1473l, dimensionPixelOffset);
        this.f11122e = a.getDimensionPixelOffset(br.f1470i, dimensionPixelOffset);
        this.f11123f = a.getDimensionPixelOffset(br.f1466e, 0);
        this.f11124g = a.getDimensionPixelOffset(br.f1467f, 0);
        this.f11125h = a.getDimensionPixelOffset(br.f1468g, 0);
        this.f11126i = a.getDimensionPixelOffset(br.f1465d, 0);
        this.f11127j = a.getDimensionPixelOffset(br.f1464c, 0);
        this.f11128k = a.getDimensionPixelOffset(br.f1463b, 0);
        this.f11129l = a.getDimensionPixelSize(br.f1478q, 0);
        this.f11130m = df.m1593a(a.getInt(br.f1480s, -1), Mode.SRC_IN);
        this.f11131n = df.m1592a(getContext(), a, br.f1479r);
        this.f11132o = df.m1607b(getContext(), a, br.f1477p);
        this.f11118a = new bq(this);
        bq bqVar = this.f11118a;
        bqVar.f1428c = a.getDimensionPixelOffset(br.f1466e, 0);
        bqVar.f1429d = a.getDimensionPixelOffset(br.f1467f, 0);
        bqVar.f1430e = a.getDimensionPixelOffset(br.f1468g, 0);
        bqVar.f1431f = a.getDimensionPixelOffset(br.f1465d, 0);
        bqVar.f1432g = a.getDimensionPixelSize(br.f1476o, 0);
        bqVar.f1433h = a.getDimensionPixelSize(br.f1482u, 0);
        bqVar.f1434i = df.m1593a(a.getInt(br.f1475n, -1), Mode.SRC_IN);
        bqVar.f1435j = df.m1592a(bqVar.f1427b.getContext(), a, br.f1474m);
        bqVar.f1436k = df.m1592a(bqVar.f1427b.getContext(), a, br.f1481t);
        bqVar.f1437l = df.m1592a(bqVar.f1427b.getContext(), a, 11);
        bqVar.f1438m.setStyle(Style.STROKE);
        bqVar.f1438m.setStrokeWidth((float) bqVar.f1433h);
        Paint paint = bqVar.f1438m;
        ColorStateList colorStateList = bqVar.f1436k;
        if (colorStateList != null) {
            dimensionPixelOffset = colorStateList.getColorForState(bqVar.f1427b.getDrawableState(), 0);
        } else {
            dimensionPixelOffset = 0;
        }
        paint.setColor(dimensionPixelOffset);
        qm qmVar = bqVar.f1427b;
        if (bq.f1426a) {
            bqVar.f1443r = new GradientDrawable();
            bqVar.f1443r.setCornerRadius(((float) bqVar.f1432g) + 1.0E-5f);
            bqVar.f1443r.setColor(-1);
            bqVar.m940a();
            bqVar.f1444s = new GradientDrawable();
            bqVar.f1444s.setCornerRadius(((float) bqVar.f1432g) + 1.0E-5f);
            bqVar.f1444s.setColor(0);
            bqVar.f1444s.setStroke(bqVar.f1433h, bqVar.f1436k);
            InsetDrawable a2 = bqVar.m939a(new LayerDrawable(new Drawable[]{bqVar.f1443r, bqVar.f1444s}));
            bqVar.f1445t = new GradientDrawable();
            bqVar.f1445t.setCornerRadius(((float) bqVar.f1432g) + 1.0E-5f);
            bqVar.f1445t.setColor(-1);
            bpVar = new bp(ct.m1492a(bqVar.f1437l), a2, bqVar.f1445t);
        } else {
            bqVar.f1439n = new GradientDrawable();
            bqVar.f1439n.setCornerRadius(((float) bqVar.f1432g) + 1.0E-5f);
            bqVar.f1439n.setColor(-1);
            bqVar.f1440o = bqVar.f1439n;
            bqVar.f1440o.setTintList(bqVar.f1435j);
            mode = bqVar.f1434i;
            if (mode != null) {
                bqVar.f1440o.setTintMode(mode);
            }
            bqVar.f1441p = new GradientDrawable();
            bqVar.f1441p.setCornerRadius(((float) bqVar.f1432g) + 1.0E-5f);
            bqVar.f1441p.setColor(-1);
            bqVar.f1442q = bqVar.f1441p;
            bqVar.f1442q.setTintList(bqVar.f1437l);
            bpVar = bqVar.m939a(new LayerDrawable(new Drawable[]{bqVar.f1440o, bqVar.f1442q}));
        }
        super.setBackgroundDrawable(bpVar);
        a.recycle();
        setCompoundDrawablePadding(this.f11129l);
        bpVar = this.f11132o;
        if (bpVar != null) {
            this.f11132o = bpVar.mutate();
            this.f11132o.setTintList(this.f11131n);
            mode = this.f11130m;
            if (mode != null) {
                this.f11132o.setTintMode(mode);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(this.f11132o, null, null, null);
        int i2 = this.f11119b;
        Drawable drawable = this.f11132o;
        if (drawable != null) {
            dimensionPixelOffset = this.f11127j;
        } else {
            dimensionPixelOffset = 0;
        }
        dimensionPixelOffset = (dimensionPixelOffset + i2) + this.f11123f;
        i2 = this.f11121d + this.f11125h;
        int i3 = this.f11120c;
        if (drawable != null) {
            i = this.f11128k;
        }
        jm.m4551a(this, dimensionPixelOffset, i2, (i + i3) + this.f11124g, this.f11122e + this.f11126i);
    }

    public final ColorStateList getBackgroundTintList() {
        return mo550a();
    }

    public final Mode getBackgroundTintMode() {
        return mo553b();
    }

    /* renamed from: a */
    public final ColorStateList mo550a() {
        if (m7631c()) {
            return this.f11118a.f1435j;
        }
        return super.mo550a();
    }

    /* renamed from: b */
    public final Mode mo553b() {
        if (m7631c()) {
            return this.f11118a.f1434i;
        }
        return super.mo553b();
    }

    /* renamed from: c */
    private final boolean m7631c() {
        bq bqVar = this.f11118a;
        return (bqVar == null || bqVar.f1446u) ? false : true;
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundColor(int i) {
        if (m7631c()) {
            bq bqVar = this.f11118a;
            if (bq.f1426a) {
                GradientDrawable gradientDrawable = bqVar.f1443r;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(i);
                    return;
                }
            }
            if (!bq.f1426a) {
                GradientDrawable gradientDrawable2 = bqVar.f1439n;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColor(i);
                    return;
                }
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!m7631c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            bq bqVar = this.f11118a;
            bqVar.f1446u = true;
            bqVar.f1427b.mo551a(bqVar.f1435j);
            bqVar.f1427b.mo552a(bqVar.f1434i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public final void setBackgroundResource(int i) {
        Drawable b;
        if (i != 0) {
            b = nj.m5620b(getContext(), i);
        } else {
            b = null;
        }
        setBackgroundDrawable(b);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        mo551a(colorStateList);
    }

    public final void setBackgroundTintMode(Mode mode) {
        mo552a(mode);
    }

    /* renamed from: a */
    public final void mo551a(ColorStateList colorStateList) {
        if (m7631c()) {
            bq bqVar = this.f11118a;
            if (bqVar.f1435j != colorStateList) {
                bqVar.f1435j = colorStateList;
                if (bq.f1426a) {
                    bqVar.m940a();
                    return;
                }
                Drawable drawable = bqVar.f1440o;
                if (drawable != null) {
                    drawable.setTintList(bqVar.f1435j);
                }
            }
        } else if (this.f11118a != null) {
            super.mo551a(colorStateList);
        }
    }

    /* renamed from: a */
    public final void mo552a(Mode mode) {
        if (m7631c()) {
            bq bqVar = this.f11118a;
            if (bqVar.f1434i != mode) {
                bqVar.f1434i = mode;
                if (bq.f1426a) {
                    bqVar.m940a();
                    return;
                }
                Drawable drawable = bqVar.f1440o;
                if (drawable != null) {
                    Mode mode2 = bqVar.f1434i;
                    if (mode2 != null) {
                        drawable.setTintMode(mode2);
                    }
                }
            }
        } else if (this.f11118a != null) {
            super.mo552a(mode);
        }
    }
}
