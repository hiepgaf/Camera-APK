package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: eo */
public final class eo extends fv {
    public eo(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f16553p = i;
    }

    /* renamed from: b */
    public final void mo1223b(fl flVar) {
        super.mo1223b(flVar);
        flVar.f4607a.put("android:fade:transitionAlpha", Float.valueOf(fo.f4639a.mo1419a(flVar.f4608b)));
    }

    /* renamed from: a */
    private final Animator m15635a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        fo.m2352a(view, f);
        Animator ofFloat = ObjectAnimator.ofFloat(view, fo.f4640b, new float[]{f2});
        ofFloat.addListener(new eq(view));
        mo1366a(new ep(view));
        return ofFloat;
    }

    /* renamed from: a */
    private static float m15634a(fl flVar, float f) {
        if (flVar == null) {
            return f;
        }
        Float f2 = (Float) flVar.f4607a.get("android:fade:transitionAlpha");
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* renamed from: a */
    public final Animator mo3020a(View view, fl flVar) {
        float f = 0.0f;
        float a = eo.m15634a(flVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m15635a(view, f, 1.0f);
    }

    /* renamed from: b */
    public final Animator mo3021b(View view, fl flVar) {
        fo.m2355b();
        return m15635a(view, eo.m15634a(flVar, 1.0f), 0.0f);
    }
}
