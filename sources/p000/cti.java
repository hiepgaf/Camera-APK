package p000;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: cti */
public final class cti implements ctg {
    /* renamed from: a */
    public cth f12624a;
    /* renamed from: b */
    private final GestureDetector f12625b;
    /* renamed from: c */
    private final ScaleGestureDetector f12626c;
    /* renamed from: d */
    private final SimpleOnGestureListener f12627d = new ctj(this);
    /* renamed from: e */
    private final OnDoubleTapListener f12628e = new ctk(this);
    /* renamed from: f */
    private final SimpleOnScaleGestureListener f12629f = new ctl(this);

    static {
        bli.m862a("FilmstripGesture");
    }

    public cti(Context context) {
        jri.m13152b((Object) context);
        this.f12625b = new GestureDetector(context, this.f12627d, null, true);
        this.f12625b.setOnDoubleTapListener(this.f12628e);
        this.f12626c = new ScaleGestureDetector(context, this.f12629f);
        this.f12626c.setQuickScaleEnabled(false);
    }

    /* renamed from: a */
    public final boolean mo1081a(MotionEvent motionEvent) {
        jri.m13152b((Object) motionEvent);
        boolean onTouchEvent = this.f12625b.onTouchEvent(motionEvent);
        boolean onTouchEvent2 = this.f12626c.onTouchEvent(motionEvent);
        cth cth;
        if (motionEvent.getAction() == 1) {
            cth = this.f12624a;
            if (cth != null) {
                cth.mo1093g(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getAction() == 5) {
            cth = this.f12624a;
            if (cth != null) {
                cth.mo1086a(motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerCount(), motionEvent.getEventTime());
            }
        } else if (motionEvent.getAction() == 6) {
            cth = this.f12624a;
            if (cth != null) {
                cth.mo1088b(motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerCount(), motionEvent.getEventTime());
            }
        }
        return onTouchEvent | onTouchEvent2;
    }

    /* renamed from: a */
    public final void mo1080a(cth cth) {
        this.f12624a = cth;
    }
}
