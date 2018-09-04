package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: hic */
public final class hic {
    /* renamed from: a */
    public int f6218a;
    /* renamed from: b */
    public final AnimatorSet f6219b = new AnimatorSet();
    /* renamed from: c */
    private Interpolator f6220c;
    /* renamed from: d */
    private Builder f6221d;

    private hic(int i, Interpolator interpolator) {
        this.f6218a = i;
        this.f6220c = interpolator;
    }

    /* renamed from: a */
    public final hic m3164a(Object obj, String str, float f, float f2) {
        Animator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{f, f2});
        ofFloat.setDuration((long) this.f6218a);
        ofFloat.setInterpolator(this.f6220c);
        Builder builder = this.f6221d;
        if (builder == null) {
            this.f6221d = this.f6219b.play(ofFloat);
        } else {
            builder.with(ofFloat);
        }
        return this;
    }

    /* renamed from: a */
    public final hic m3165a(Object obj, String str, int i, int i2) {
        Animator ofArgb = ObjectAnimator.ofArgb(obj, str, new int[]{i, i2});
        ofArgb.setDuration((long) this.f6218a);
        ofArgb.setInterpolator(this.f6220c);
        Builder builder = this.f6221d;
        if (builder == null) {
            this.f6221d = this.f6219b.play(ofArgb);
        } else {
            builder.with(ofArgb);
        }
        return this;
    }

    /* renamed from: a */
    public static hic m3163a(int i, Interpolator interpolator) {
        return new hic(i, interpolator);
    }
}
