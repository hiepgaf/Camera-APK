package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: kvw */
final class kvw extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ kvr f8716a;

    kvw(kvr kvr) {
        this.f8716a = kvr;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f8716a.f8676c != go.cf) {
            return false;
        }
        kvr kvr = this.f8716a;
        float f = kvr.f8674a;
        float f2 = kvr.f8677d;
        if (f == f2) {
            f2 = kvr.f8678e;
        }
        this.f8716a.postOnAnimation(new kvu(kvr, f2, motionEvent.getX(), motionEvent.getY(), false));
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        kvv kvv = this.f8716a.f8681h;
        if (kvv != null) {
            kvv.m5473a();
        }
        kvr kvr = this.f8716a;
        kvr.f8681h = new kvv(kvr, (int) f, (int) f2);
        kvr = this.f8716a;
        kvr.postOnAnimation(kvr.f8681h);
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.f8716a.performLongClick();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.f8716a.performClick();
    }
}
