package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.view.ViewMagnet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: fzz */
public final class fzz {
    /* renamed from: a */
    public final ShapeDrawable f4937a;
    /* renamed from: b */
    public final gbt f4938b;
    /* renamed from: c */
    public final Animator f4939c;
    /* renamed from: d */
    public final Animator f4940d;
    /* renamed from: e */
    public final ViewMagnet f4941e;
    /* renamed from: f */
    private final ViewGroup f4942f;
    /* renamed from: g */
    private final int f4943g;
    /* renamed from: h */
    private final float f4944h;

    public fzz(ViewGroup viewGroup, View view, ViewMagnet viewMagnet) {
        this.f4942f = viewGroup;
        this.f4941e = viewMagnet;
        this.f4939c = fzz.m2443b(viewGroup);
        this.f4940d = fzz.m2441a(viewGroup);
        Resources resources = view.getResources();
        this.f4944h = resources.getDimension(R.dimen.max_options_translation_distance);
        this.f4943g = resources.getColor(R.color.optionsbar_background_opened, null);
        this.f4938b = new gbt((int) resources.getDimension(R.dimen.optionsbar_bubble_initial_size), view);
        Shape shape = this.f4938b;
        this.f4937a = new ShapeDrawable(shape);
        this.f4937a.getPaint().setColor(this.f4943g);
        view.setBackground(this.f4937a);
    }

    /* renamed from: a */
    public final ValueAnimator m2445a(View view, boolean z) {
        ValueAnimator ofFloat;
        this.f4938b.f5035a = view;
        if (z) {
            ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        } else {
            ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        }
        ofFloat.setDuration(267).setInterpolator(new ks());
        ofFloat.addUpdateListener(new gae(this));
        if (z) {
            ofFloat.addListener(new gaf(this));
        } else {
            ofFloat.addListener(new gag(this));
        }
        return ofFloat;
    }

    /* renamed from: a */
    private final void m2442a(boolean z, int i, List list, float f, View view, gak gak) {
        ValueAnimator duration;
        float f2 = (((float) (fzz.m2444c(view).x - i)) / f) * this.f4944h;
        if (z) {
            duration = ValueAnimator.ofFloat(new float[]{0.0f, f2}).setDuration(267);
        } else {
            duration = ValueAnimator.ofFloat(new float[]{f2, 0.0f}).setDuration(267);
        }
        duration.setInterpolator(new ks());
        duration.addUpdateListener(new gad(gak));
        list.add(duration);
    }

    /* renamed from: b */
    public final Animator m2446b(View view, boolean z) {
        float f;
        int i = fzz.m2444c(view).x;
        Collection arrayList = new ArrayList();
        if (i > this.f4942f.getWidth() / 2) {
            f = (float) i;
        } else {
            f = (float) (this.f4942f.getWidth() - i);
        }
        for (int i2 = 0; i2 < this.f4942f.getChildCount(); i2++) {
            View childAt = this.f4942f.getChildAt(i2);
            if (childAt != view) {
                m2442a(z, i, arrayList, f, childAt, new gaa(childAt));
            }
        }
        gak gac = new gac(this);
        m2442a(z, i, arrayList, f, this.f4941e.getMagnetView(), gac);
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    public static ValueAnimator m2441a(View view) {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(100);
        duration.setInterpolator(new ks());
        duration.addUpdateListener(new gah(view));
        duration.addListener(new gai(view));
        return duration;
    }

    /* renamed from: b */
    public static ValueAnimator m2443b(View view) {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(100);
        duration.setInterpolator(new ks());
        duration.addUpdateListener(new gaj(view));
        duration.addListener(new gab(view));
        return duration;
    }

    /* renamed from: c */
    private static Point m2444c(View view) {
        int top = view.getTop();
        int paddingTop = view.getPaddingTop();
        int width = view.getWidth();
        int paddingRight = view.getPaddingRight();
        int paddingLeft = view.getPaddingLeft();
        return new Point((((width - paddingRight) - paddingLeft) / 2) + (view.getLeft() + view.getPaddingLeft()), (top + paddingTop) + (((view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop()) / 2));
    }
}
