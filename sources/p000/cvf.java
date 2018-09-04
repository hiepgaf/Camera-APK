package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: cvf */
public final class cvf {
    /* renamed from: a */
    public final FilmstripView f2791a;
    /* renamed from: b */
    public final View f2792b;
    /* renamed from: c */
    public final RectF f2793c = new RectF();
    /* renamed from: d */
    public Point f2794d;
    /* renamed from: e */
    public int f2795e;
    /* renamed from: f */
    public int f2796f;
    /* renamed from: g */
    public cre f2797g;
    /* renamed from: h */
    public err f2798h;
    /* renamed from: i */
    public int f2799i;
    /* renamed from: j */
    public ValueAnimator f2800j;
    /* renamed from: k */
    public boolean f2801k;
    /* renamed from: l */
    private ValueAnimator f2802l;
    /* renamed from: m */
    private ValueAnimator f2803m;

    public cvf(int i, View view, cre cre, FilmstripView filmstripView) {
        this.f2791a = filmstripView;
        this.f2792b = view;
        this.f2795e = i;
        this.f2797g = (cre) jri.m13152b((Object) cre);
        this.f2798h = cre.mo1066e();
        this.f2794d = hjg.m3202a(this.f2798h.mo1034h().f7329a, this.f2798h.mo1034h().f7330b, this.f2798h.mo1038l(), filmstripView.getMeasuredWidth(), filmstripView.getMeasuredHeight());
        this.f2796f = kvl.UNSET_ENUM_VALUE;
        this.f2799i = go.f5561Y;
        this.f2801k = false;
        this.f2792b.setPivotX(0.0f);
        this.f2792b.setPivotY(0.0f);
    }

    /* renamed from: a */
    public final void m1531a(float f, TimeInterpolator timeInterpolator) {
        if (this.f2803m == null) {
            this.f2803m = new ValueAnimator();
            this.f2803m.addUpdateListener(new cvi(this));
        }
        cvf.m1526a(this.f2803m, this.f2792b.getAlpha(), f, timeInterpolator);
    }

    /* renamed from: b */
    public final void m1536b(float f, TimeInterpolator timeInterpolator) {
        if (this.f2802l == null) {
            this.f2802l = new ValueAnimator();
            this.f2802l.addUpdateListener(new cvh(this));
        }
        cvf.m1526a(this.f2802l, m1537c(), f, timeInterpolator);
    }

    /* renamed from: a */
    public final int m1527a() {
        return this.f2796f + (this.f2794d.x / 2);
    }

    /* renamed from: b */
    public final float m1534b() {
        return this.f2792b.getTranslationX() / this.f2791a.f2349j;
    }

    /* renamed from: c */
    public final float m1537c() {
        return this.f2792b.getTranslationY() / this.f2791a.f2349j;
    }

    /* renamed from: d */
    public final boolean m1539d() {
        return this.f2797g.mo1064c() == cre.f2587c;
    }

    /* renamed from: a */
    public final void m1533a(Rect rect, int i, float f) {
        float f2 = 0.0f;
        ValueAnimator valueAnimator = this.f2800j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f2 = ((Float) this.f2800j.getAnimatedValue()).floatValue();
        }
        int centerX = (int) (((f2 + ((float) (this.f2796f - i))) * f) + ((float) rect.centerX()));
        int centerY = (int) (((float) rect.centerY()) - (((float) (this.f2792b.getMeasuredHeight() / 2)) * f));
        View view = this.f2792b;
        view.layout(centerX, centerY, view.getMeasuredWidth() + centerX, this.f2792b.getMeasuredHeight() + centerY);
        this.f2792b.setScaleX(f);
        this.f2792b.setScaleY(f);
        f2 = (float) this.f2792b.getLeft();
        float top = (float) this.f2792b.getTop();
        this.f2793c.set(f2, top, (((float) this.f2792b.getMeasuredWidth()) * f) + f2, (((float) this.f2792b.getMeasuredHeight()) * f) + top);
    }

    /* renamed from: a */
    final void m1530a(float f, float f2, float f3, int i, int i2) {
        float translationX = this.f2792b.getTranslationX();
        float f4 = f3 - 4.0f;
        m1529a(translationX - ((f - this.f2792b.getX()) * f4), this.f2792b.getTranslationY() - ((f2 - this.f2792b.getY()) * f4), this.f2792b.getScaleX() * f3, this.f2792b.getScaleY() * f3, i, i2);
    }

    /* renamed from: e */
    public final void m1540e() {
        this.f2791a.removeView(this.f2792b);
        this.f2798h.mo1027a(this.f2792b);
        FilmstripView filmstripView = this.f2791a;
        View view = this.f2792b;
        bli.m871d(FilmstripView.f2338a, "recycleView");
        int intValue = ((Integer) view.getTag(R.id.mediadata_tag_viewtype)).intValue();
        if (intValue > 0) {
            Queue queue = (Queue) filmstripView.f2361v.get(intValue);
            if (queue == null) {
                queue = new ArrayDeque();
                filmstripView.f2361v.put(intValue, queue);
            }
            queue.offer(view);
        }
    }

    /* renamed from: f */
    public final void m1541f() {
        this.f2792b.setScaleX(1.0f);
        this.f2792b.setScaleY(1.0f);
        this.f2792b.setTranslationX(0.0f);
        this.f2792b.setTranslationY(0.0f);
    }

    /* renamed from: a */
    public static void m1526a(ValueAnimator valueAnimator, float f, float f2, TimeInterpolator timeInterpolator) {
        if (f != f2) {
            valueAnimator.setInterpolator(timeInterpolator);
            valueAnimator.setDuration(400);
            valueAnimator.setFloatValues(new float[]{f, f2});
            valueAnimator.start();
        }
    }

    /* renamed from: a */
    public final void m1528a(float f) {
        if (!this.f2801k) {
            this.f2792b.setAlpha(f);
        }
    }

    /* renamed from: b */
    public final void m1535b(float f) {
        this.f2792b.setTranslationX(this.f2791a.f2349j * f);
    }

    /* renamed from: c */
    public final void m1538c(float f) {
        this.f2792b.setTranslationY(this.f2791a.f2349j * f);
    }

    /* renamed from: a */
    public final void m1532a(int i) {
        this.f2792b.setVisibility(i);
    }

    public final String toString() {
        int i = this.f2795e;
        int i2 = this.f2796f;
        String valueOf = String.valueOf(this.f2793c);
        int a = m1527a();
        int measuredWidth = this.f2792b.getMeasuredWidth();
        int measuredHeight = this.f2792b.getMeasuredHeight();
        int width = this.f2792b.getWidth();
        int height = this.f2792b.getHeight();
        float scaleX = this.f2792b.getScaleX();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 200);
        stringBuilder.append("AdapterIndex = ");
        stringBuilder.append(i);
        stringBuilder.append("\n\t left = ");
        stringBuilder.append(i2);
        stringBuilder.append("\n\t viewArea = ");
        stringBuilder.append(valueOf);
        stringBuilder.append("\n\t centerX = ");
        stringBuilder.append(a);
        stringBuilder.append("\n\t view MeasuredSize = ");
        stringBuilder.append(measuredWidth);
        stringBuilder.append(',');
        stringBuilder.append(measuredHeight);
        stringBuilder.append("\n\t view Size = ");
        stringBuilder.append(width);
        stringBuilder.append(',');
        stringBuilder.append(height);
        stringBuilder.append("\n\t view scale = ");
        stringBuilder.append(scaleX);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    final void m1529a(float f, float f2, float f3, float f4, int i, int i2) {
        float left = ((float) this.f2792b.getLeft()) + f;
        float top = ((float) this.f2792b.getTop()) + f2;
        RectF a = hfu.m3107a(new RectF(left, top, (((float) this.f2792b.getWidth()) * f3) + left, (((float) this.f2792b.getHeight()) * f4) + top), i, i2);
        this.f2792b.setScaleX(f3);
        this.f2792b.setScaleY(f4);
        top = a.left;
        int left2 = this.f2792b.getLeft();
        left = a.top;
        int top2 = this.f2792b.getTop();
        this.f2792b.setTranslationX(top - ((float) left2));
        this.f2792b.setTranslationY(left - ((float) top2));
    }
}
