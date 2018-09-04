package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ce */
public final class ce extends bu {
    /* renamed from: A */
    private InsetDrawable f11729A;

    public ce(cs csVar, cv cvVar) {
        super(csVar, cvVar);
    }

    /* renamed from: a */
    private final Animator m8050a(float f, float f2) {
        Animator animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.x, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.x, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    /* renamed from: a */
    final void mo650a(Rect rect) {
        if (this.y.f2780a.f9939b) {
            float a = this.y.m1523a();
            float elevation = this.x.getElevation() + this.p;
            int ceil = (int) Math.ceil((double) cu.m8754a(elevation, a, false));
            int ceil2 = (int) Math.ceil((double) cu.m8755b(elevation, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: b */
    final void mo652b() {
    }

    /* renamed from: c */
    final ci mo654c() {
        return new cj();
    }

    /* renamed from: d */
    final GradientDrawable mo655d() {
        return new cf();
    }

    /* renamed from: a */
    final void mo651a(int[] iArr) {
    }

    /* renamed from: a */
    final void mo648a(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(r, m8050a(f, f3));
        stateListAnimator.addState(s, m8050a(f, f2));
        stateListAnimator.addState(t, m8050a(f, f2));
        stateListAnimator.addState(u, m8050a(f, f2));
        Animator animatorSet = new AnimatorSet();
        List arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.x, "elevation", new float[]{f}).setDuration(0));
        arrayList.add(ObjectAnimator.ofFloat(this.x, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(a);
        stateListAnimator.addState(v, animatorSet);
        stateListAnimator.addState(w, m8050a(0.0f, 0.0f));
        this.x.setStateListAnimator(stateListAnimator);
        if (this.y.f2780a.f9939b) {
            m984h();
        }
    }

    /* renamed from: b */
    final void mo653b(Rect rect) {
        if (this.y.f2780a.f9939b) {
            this.f11729A = new InsetDrawable(this.k, rect.left, rect.top, rect.right, rect.bottom);
            this.y.m1524a(this.f11729A);
            return;
        }
        this.y.m1524a(this.k);
    }

    /* renamed from: e */
    final boolean mo656e() {
        return false;
    }

    /* renamed from: a */
    final void mo649a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        this.j = m970a();
        this.j.setTintList(colorStateList);
        if (mode != null) {
            this.j.setTintMode(mode);
        }
        if (i > 0) {
            this.l = m971a(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{this.l, this.j});
        } else {
            this.l = null;
            layerDrawable = this.j;
        }
        this.k = new RippleDrawable(ct.m1492a(colorStateList2), layerDrawable, null);
        this.m = this.k;
        this.y.m1524a(this.k);
    }
}
