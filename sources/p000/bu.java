package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.floatingactionbutton.FloatingActionButton;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bu */
public class bu {
    /* renamed from: a */
    public static final TimeInterpolator f1563a = as.f929b;
    /* renamed from: r */
    public static final int[] f1564r = new int[]{16842919, 16842910};
    /* renamed from: s */
    public static final int[] f1565s = new int[]{16843623, 16842908, 16842910};
    /* renamed from: t */
    public static final int[] f1566t = new int[]{16842908, 16842910};
    /* renamed from: u */
    public static final int[] f1567u = new int[]{16843623, 16842910};
    /* renamed from: v */
    public static final int[] f1568v = new int[]{16842910};
    /* renamed from: w */
    public static final int[] f1569w = new int[0];
    /* renamed from: A */
    private final co f1570A;
    /* renamed from: B */
    private float f1571B = 1.0f;
    /* renamed from: C */
    private final Rect f1572C = new Rect();
    /* renamed from: D */
    private final RectF f1573D = new RectF();
    /* renamed from: E */
    private final RectF f1574E = new RectF();
    /* renamed from: F */
    private final Matrix f1575F = new Matrix();
    /* renamed from: b */
    public int f1576b = 0;
    /* renamed from: c */
    public Animator f1577c;
    /* renamed from: d */
    public av f1578d;
    /* renamed from: e */
    public av f1579e;
    /* renamed from: f */
    public av f1580f;
    /* renamed from: g */
    public av f1581g;
    /* renamed from: h */
    public cu f1582h;
    /* renamed from: i */
    public float f1583i;
    /* renamed from: j */
    public Drawable f1584j;
    /* renamed from: k */
    public Drawable f1585k;
    /* renamed from: l */
    public ci f1586l;
    /* renamed from: m */
    public Drawable f1587m;
    /* renamed from: n */
    public float f1588n;
    /* renamed from: o */
    public float f1589o;
    /* renamed from: p */
    public float f1590p;
    /* renamed from: q */
    public int f1591q;
    /* renamed from: x */
    public final cs f1592x;
    /* renamed from: y */
    public final cv f1593y;
    /* renamed from: z */
    public OnPreDrawListener f1594z;

    bu(cs csVar, cv cvVar) {
        this.f1592x = csVar;
        this.f1593y = cvVar;
        this.f1570A = new co();
        this.f1570A.m1209a(f1564r, bu.m967a(new ca(this)));
        this.f1570A.m1209a(f1565s, bu.m967a(new bz(this)));
        this.f1570A.m1209a(f1566t, bu.m967a(new bz(this)));
        this.f1570A.m1209a(f1567u, bu.m967a(new bz(this)));
        this.f1570A.m1209a(f1568v, bu.m967a(new cc(this)));
        this.f1570A.m1209a(f1569w, bu.m967a(new by(this)));
        this.f1583i = this.f1592x.getRotation();
    }

    /* renamed from: a */
    private final void m968a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f1592x.getDrawable();
        if (drawable != null && this.f1591q != 0) {
            RectF rectF = this.f1573D;
            RectF rectF2 = this.f1574E;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.f1591q;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            f2 = ((float) this.f1591q) / 2.0f;
            matrix.postScale(f, f, f2, f2);
        }
    }

    /* renamed from: a */
    public final AnimatorSet m969a(av avVar, float f, float f2, float f3) {
        List arrayList = new ArrayList();
        Animator ofFloat = ObjectAnimator.ofFloat(this.f1592x, View.ALPHA, new float[]{f});
        avVar.m704a("opacity").m706a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.f1592x, View.SCALE_X, new float[]{f2});
        avVar.m704a("scale").m706a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.f1592x, View.SCALE_Y, new float[]{f2});
        avVar.m704a("scale").m706a(ofFloat);
        arrayList.add(ofFloat);
        m968a(f3, this.f1575F);
        ofFloat = ObjectAnimator.ofObject(this.f1592x, new at(), new au(), new Matrix[]{new Matrix(this.f1575F)});
        avVar.m704a("iconScale").m706a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        df.m1598a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    final ci m971a(int i, ColorStateList colorStateList) {
        Context context = this.f1592x.getContext();
        ci c = mo654c();
        int color = ge.getColor(context, R.color.design_fab_stroke_top_outer_color);
        int color2 = ge.getColor(context, R.color.design_fab_stroke_top_inner_color);
        int color3 = ge.getColor(context, R.color.design_fab_stroke_end_inner_color);
        int color4 = ge.getColor(context, R.color.design_fab_stroke_end_outer_color);
        c.f2014d = color;
        c.f2015e = color2;
        c.f2016f = color3;
        c.f2017g = color4;
        float f = (float) i;
        if (c.f2013c != f) {
            c.f2013c = f;
            c.f2011a.setStrokeWidth(f * 1.3333f);
            c.f2018h = true;
            c.invalidateSelf();
        }
        c.m1150a(colorStateList);
        return c;
    }

    /* renamed from: a */
    private static ValueAnimator m967a(cd cdVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1563a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(cdVar);
        valueAnimator.addUpdateListener(cdVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    final GradientDrawable m970a() {
        GradientDrawable d = mo655d();
        d.setShape(1);
        d.setColor(-1);
        return d;
    }

    /* renamed from: a */
    void mo650a(Rect rect) {
        this.f1582h.getPadding(rect);
    }

    /* renamed from: b */
    public void mo652b() {
        co coVar = this.f1570A;
        ValueAnimator valueAnimator = coVar.f2222c;
        if (valueAnimator != null) {
            valueAnimator.end();
            coVar.f2222c = null;
        }
    }

    /* renamed from: c */
    ci mo654c() {
        return new ci();
    }

    /* renamed from: d */
    GradientDrawable mo655d() {
        return new GradientDrawable();
    }

    /* renamed from: a */
    public void mo651a(int[] iArr) {
        cq cqVar;
        co coVar = this.f1570A;
        int size = coVar.f2220a.size();
        for (int i = 0; i < size; i++) {
            cqVar = (cq) coVar.f2220a.get(i);
            if (StateSet.stateSetMatches(cqVar.f2547a, iArr)) {
                break;
            }
        }
        cqVar = null;
        cq cqVar2 = coVar.f2221b;
        if (cqVar != cqVar2) {
            if (cqVar2 != null) {
                ValueAnimator valueAnimator = coVar.f2222c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    coVar.f2222c = null;
                }
            }
            coVar.f2221b = cqVar;
            if (cqVar != null) {
                coVar.f2222c = cqVar.f2548b;
                coVar.f2222c.start();
            }
        }
    }

    /* renamed from: a */
    public void mo648a(float f, float f2, float f3) {
        cu cuVar = this.f1582h;
        if (cuVar != null) {
            cuVar.m8758a(f, this.f1590p + f);
            m984h();
        }
    }

    /* renamed from: b */
    void mo653b(Rect rect) {
    }

    /* renamed from: e */
    public boolean mo656e() {
        return true;
    }

    /* renamed from: a */
    public void mo649a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable[] drawableArr;
        this.f1584j = m970a();
        this.f1584j.setTintList(colorStateList);
        if (mode != null) {
            this.f1584j.setTintMode(mode);
        }
        this.f1585k = m970a();
        this.f1585k.setTintList(ct.m1492a(colorStateList2));
        if (i > 0) {
            this.f1586l = m971a(i, colorStateList);
            drawableArr = new Drawable[]{this.f1586l, this.f1584j, this.f1585k};
        } else {
            this.f1586l = null;
            drawableArr = new Drawable[]{this.f1584j, this.f1585k};
        }
        this.f1587m = new LayerDrawable(drawableArr);
        Context context = this.f1592x.getContext();
        Drawable drawable = this.f1587m;
        float a = this.f1593y.m1523a();
        float f = this.f1588n;
        this.f1582h = new cu(context, drawable, a, f, this.f1590p + f);
        cu cuVar = this.f1582h;
        cuVar.f12642b = false;
        cuVar.invalidateSelf();
        this.f1593y.m1524a(this.f1582h);
    }

    /* renamed from: a */
    public final void m972a(float f) {
        this.f1571B = f;
        Matrix matrix = this.f1575F;
        m968a(f, matrix);
        this.f1592x.setImageMatrix(matrix);
    }

    /* renamed from: f */
    public final boolean m982f() {
        return jm.m4590x(this.f1592x) && !this.f1592x.isInEditMode();
    }

    /* renamed from: g */
    public final void m983g() {
        m972a(this.f1571B);
    }

    /* renamed from: h */
    public final void m984h() {
        Rect rect = this.f1572C;
        mo650a(rect);
        mo653b(rect);
        cv cvVar = this.f1593y;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        cvVar.f2780a.f9940c.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = cvVar.f2780a;
        int i5 = floatingActionButton.f9938a;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
