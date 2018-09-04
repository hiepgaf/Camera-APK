package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: av */
public final class av {
    /* renamed from: a */
    private final iz f970a = new iz();

    /* renamed from: a */
    public static av m702a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return av.m701a(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static av m701a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return av.m703a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            List arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return av.m703a(arrayList);
        } catch (Throwable e) {
            Throwable th = e;
            String valueOf = String.valueOf(Integer.toHexString(i));
            String str = "Can't load animation resource ID #0x";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.w("MotionSpec", valueOf, th);
            return null;
        }
    }

    /* renamed from: a */
    private static av m703a(List list) {
        av avVar = new av();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = as.f928a;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = as.f929b;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = as.f930c;
                }
                aw awVar = new aw(startDelay, duration, interpolator);
                awVar.f972a = objectAnimator.getRepeatCount();
                awVar.f973b = objectAnimator.getRepeatMode();
                avVar.f970a.put(propertyName, awVar);
                i++;
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Animator must be an ObjectAnimator: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return avVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f970a.equals(((av) obj).f970a);
    }

    /* renamed from: a */
    public final aw m704a(String str) {
        if (this.f970a.get(str) != null) {
            return (aw) this.f970a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        return this.f970a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" timings: ");
        stringBuilder.append(this.f970a);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
