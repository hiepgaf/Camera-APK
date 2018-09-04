package p000;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.List;

/* compiled from: PG */
/* renamed from: hbh */
public final class hbh {
    /* renamed from: a */
    public static final Interpolator f5906a = new LinearInterpolator();
    /* renamed from: w */
    private static final String f5907w = bli.m862a(hbh.class.getSimpleName());
    /* renamed from: b */
    public final ShutterButton f5908b;
    /* renamed from: c */
    public hcj f5909c;
    /* renamed from: d */
    public hcj f5910d;
    /* renamed from: e */
    public ValueAnimator f5911e;
    /* renamed from: f */
    public ValueAnimator f5912f;
    /* renamed from: g */
    public ValueAnimator f5913g;
    /* renamed from: h */
    public ValueAnimator f5914h;
    /* renamed from: i */
    public ValueAnimator f5915i;
    /* renamed from: j */
    public ValueAnimator f5916j;
    /* renamed from: k */
    public ValueAnimator f5917k;
    /* renamed from: l */
    public ValueAnimator f5918l;
    /* renamed from: m */
    public ValueAnimator f5919m;
    /* renamed from: n */
    public ValueAnimator f5920n;
    /* renamed from: o */
    public ValueAnimator f5921o;
    /* renamed from: p */
    public ValueAnimator f5922p;
    /* renamed from: q */
    public ValueAnimator f5923q;
    /* renamed from: r */
    public ValueAnimator f5924r;
    /* renamed from: s */
    public List f5925s;
    /* renamed from: t */
    public final ArgbEvaluator f5926t = new ArgbEvaluator();
    /* renamed from: u */
    public final Interpolator f5927u;
    /* renamed from: v */
    public final Interpolator f5928v;
    /* renamed from: x */
    private final Interpolator f5929x;
    /* renamed from: y */
    private final boolean f5930y;

    public hbh(ShutterButton shutterButton, boolean z) {
        this.f5908b = shutterButton;
        this.f5930y = z;
        this.f5927u = AnimationUtils.loadInterpolator(shutterButton.getContext(), R.interpolator.custom_40_in_60_out);
        this.f5928v = AnimationUtils.loadInterpolator(shutterButton.getContext(), R.interpolator.custom_60_in_60_out);
        this.f5929x = AnimationUtils.loadInterpolator(shutterButton.getContext(), 17563661);
    }

    /* renamed from: a */
    public final hbz m3013a(Animator animator) {
        return new hbz(this, animator);
    }

    /* renamed from: a */
    public final ValueAnimator m3011a(int i, int i2, AnimatorUpdateListener animatorUpdateListener) {
        jri.m13139a(this.f5908b, (Object) "Trying to create animators for null shutterbutton");
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i, i2}).setDuration(40);
        duration.addUpdateListener(animatorUpdateListener);
        duration.setInterpolator(this.f5929x);
        return duration;
    }

    /* renamed from: a */
    public final ViewPropertyAnimator m3012a(float f, int i) {
        ViewPropertyAnimator animate = this.f5908b.animate();
        animate.setDuration((long) i);
        animate.setInterpolator(this.f5929x);
        animate.scaleX(f).scaleY(f);
        return animate;
    }

    /* renamed from: a */
    public final void m3014a() {
        String format = String.format("Unsupported transition from %s -> %s", new Object[]{this.f5909c.mo1706e(), this.f5910d.mo1706e()});
        if (this.f5930y) {
            throw new IllegalArgumentException(format);
        }
        bli.m873e(f5907w, format);
    }
}
