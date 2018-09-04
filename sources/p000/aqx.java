package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* renamed from: aqx */
public final class aqx implements ara {
    /* renamed from: a */
    private final int f10164a;
    /* renamed from: b */
    private final boolean f10165b;

    public aqx(int i, boolean z) {
        this.f10164a = i;
        this.f10165b = z;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo339a(Object obj, arb arb) {
        Drawable drawable = (Drawable) obj;
        Drawable e = arb.mo3555e();
        if (e == null) {
            e = new ColorDrawable(0);
        }
        Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{e, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f10165b);
        transitionDrawable.startTransition(this.f10164a);
        arb.mo3554d(transitionDrawable);
        return true;
    }
}
