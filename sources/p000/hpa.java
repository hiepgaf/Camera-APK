package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: hpa */
final /* synthetic */ class hpa implements OnTouchListener {
    /* renamed from: a */
    private final hox f6422a;

    hpa(hox hox) {
        this.f6422a = hox;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        hox hox = this.f6422a;
        if (motionEvent.getAction() == 1) {
            hox.f17964b.am();
        }
        return false;
    }
}
