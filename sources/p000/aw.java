package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* renamed from: aw */
public final class aw {
    /* renamed from: a */
    public int f972a = 0;
    /* renamed from: b */
    public int f973b = 1;
    /* renamed from: c */
    private long f974c = 0;
    /* renamed from: d */
    private long f975d = 300;
    /* renamed from: e */
    private TimeInterpolator f976e = null;

    public aw(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f974c = j;
        this.f975d = j2;
        this.f976e = timeInterpolator;
    }

    /* renamed from: a */
    public final void m706a(Animator animator) {
        animator.setStartDelay(this.f974c);
        animator.setDuration(this.f975d);
        animator.setInterpolator(m705a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f972a);
            valueAnimator.setRepeatMode(this.f973b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aw awVar = (aw) obj;
        if (this.f974c == awVar.f974c && this.f975d == awVar.f975d && this.f972a == awVar.f972a && this.f973b == awVar.f973b) {
            return m705a().getClass().equals(awVar.m705a().getClass());
        }
        return false;
    }

    /* renamed from: a */
    private final TimeInterpolator m705a() {
        TimeInterpolator timeInterpolator = this.f976e;
        return timeInterpolator == null ? as.f928a : timeInterpolator;
    }

    public final int hashCode() {
        long j = this.f974c;
        long j2 = this.f975d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + m705a().getClass().hashCode()) * 31) + this.f972a) * 31) + this.f973b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" delay: ");
        stringBuilder.append(this.f974c);
        stringBuilder.append(" duration: ");
        stringBuilder.append(this.f975d);
        stringBuilder.append(" interpolator: ");
        stringBuilder.append(m705a().getClass());
        stringBuilder.append(" repeatCount: ");
        stringBuilder.append(this.f972a);
        stringBuilder.append(" repeatMode: ");
        stringBuilder.append(this.f973b);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
