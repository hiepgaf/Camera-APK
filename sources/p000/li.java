package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: li */
final class li implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ lh f8778a;

    li(lh lhVar) {
        this.f8778a = lhVar;
    }

    public final void run() {
        View view;
        int i;
        int i2 = 0;
        lh lhVar = this.f8778a;
        int i3 = lhVar.f19338b.f8790h;
        int i4 = lhVar.f19337a;
        if (i4 != 3) {
            int i5 = 0;
        } else {
            boolean z = true;
        }
        int i6;
        if (i5 != 0) {
            View a = lhVar.f19339c.m5493a(3);
            if (a != null) {
                i6 = -a.getWidth();
            } else {
                i6 = 0;
            }
            i6 += i3;
            view = a;
            i = i6;
        } else {
            i6 = lhVar.f19339c.getWidth() - i3;
            view = lhVar.f19339c.m5493a(5);
            i = i6;
        }
        if (view == null) {
            return;
        }
        if (((i5 != 0 && view.getLeft() < i) || (i4 != 3 && view.getLeft() > i)) && lhVar.f19339c.m5499b(view) == 0) {
            le leVar = (le) view.getLayoutParams();
            lhVar.f19338b.m5531a(view, i, view.getTop());
            leVar.f8776c = true;
            lhVar.f19339c.invalidate();
            lhVar.m14039b();
            kz kzVar = lhVar.f19339c;
            if (!kzVar.f8756g) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                i = kzVar.getChildCount();
                while (i2 < i) {
                    kzVar.getChildAt(i2).dispatchTouchEvent(obtain);
                    i2++;
                }
                obtain.recycle();
                kzVar.f8756g = true;
            }
        }
    }
}
