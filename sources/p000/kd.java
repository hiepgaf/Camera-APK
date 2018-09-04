package p000;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: kd */
public final class kd {
    /* renamed from: a */
    public WeakReference f8211a;

    kd(View view) {
        this.f8211a = new WeakReference(view);
    }

    /* renamed from: a */
    public final kd m4768a(float f) {
        View view = (View) this.f8211a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public final void m4772a() {
        View view = (View) this.f8211a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public final kd m4769a(long j) {
        View view = (View) this.f8211a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public final kd m4770a(kg kgVar) {
        View view = (View) this.f8211a.get();
        if (view != null) {
            if (kgVar != null) {
                view.animate().setListener(new ke(kgVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final kd m4771a(ki kiVar) {
        View view = (View) this.f8211a.get();
        if (view != null) {
            AnimatorUpdateListener kfVar;
            if (kiVar != null) {
                kfVar = new kf(kiVar);
            } else {
                kfVar = null;
            }
            view.animate().setUpdateListener(kfVar);
        }
        return this;
    }

    /* renamed from: b */
    public final kd m4773b(float f) {
        View view = (View) this.f8211a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
