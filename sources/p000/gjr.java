package p000;

import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: gjr */
final class gjr extends View {
    public gjr(Context context, gjt gjt) {
        super(context);
        setVisibility(8);
    }

    /* renamed from: a */
    final kpk m2571a() {
        kpk d = kpw.m18056d();
        Choreographer.getInstance().postFrameCallback(new gjs(this, d));
        return d;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
