package p000;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: ctk */
final class ctk implements OnDoubleTapListener {
    /* renamed from: a */
    private final /* synthetic */ cti f2697a;

    ctk(cti cti) {
        this.f2697a = cti;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        cth cth = this.f2697a.f12624a;
        return (cth == null || motionEvent == null) ? false : cth.mo1083a(motionEvent.getX(), motionEvent.getY());
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        cth cth = this.f2697a.f12624a;
        return (cth == null || motionEvent == null) ? false : cth.mo1092f(motionEvent.getX(), motionEvent.getY());
    }
}
