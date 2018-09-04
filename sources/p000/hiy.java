package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: hiy */
public final class hiy {
    /* renamed from: a */
    public static /* synthetic */ hix m3192a(Animator animator) {
        if (animator != null) {
            return new hiz(animator);
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(1);
        throw new NullPointerException(stringBuilder.toString());
    }
}
