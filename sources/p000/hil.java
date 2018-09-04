package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hil */
public final class hil {
    /* renamed from: a */
    public int f6232a;
    /* renamed from: b */
    private final Animator f6233b;
    /* renamed from: c */
    private final Animator f6234c;
    /* renamed from: d */
    private final View f6235d;

    public hil(View view) {
        this(view, view);
    }

    public hil(View view, Object obj) {
        this.f6232a = -1;
        this.f6235d = view;
        this.f6233b = AnimatorInflater.loadAnimator(view.getContext(), R.animator.return_to_zero_rotation_clockwise);
        this.f6233b.setTarget(obj);
        this.f6234c = AnimatorInflater.loadAnimator(view.getContext(), R.animator.return_to_zero_rotation_ccw);
        this.f6234c.setTarget(obj);
    }

    /* renamed from: a */
    public final void m3179a() {
        this.f6232a = this.f6235d.getDisplay().getRotation();
    }

    /* renamed from: b */
    public final void m3180b() {
        if (this.f6232a == -1) {
            throw new RuntimeException("onAttachedToWindow not called yet; current rotation unknown.");
        }
        int b = hdy.m3084b(this.f6235d.getContext());
        int i = this.f6232a;
        if (b == (i + 1) % 4) {
            this.f6233b.start();
        } else if (b == (i + 3) % 4) {
            this.f6234c.start();
        }
        this.f6232a = b;
    }
}
