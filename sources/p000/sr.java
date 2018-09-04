package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: sr */
final class sr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ sp f9229a;

    sr(sp spVar) {
        this.f9229a = spVar;
    }

    public final void run() {
        sp spVar = this.f9229a;
        spVar.m5814d();
        View view = spVar.f9219a;
        if (view.isEnabled() && !view.isLongClickable() && spVar.mo2434b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            spVar.f9220b = true;
        }
    }
}
