package p000;

import android.graphics.RectF;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;

/* compiled from: PG */
/* renamed from: hsn */
public final class hsn extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ RGBZFocusControls f6585a;

    public hsn(RGBZFocusControls rGBZFocusControls) {
        this.f6585a = rGBZFocusControls;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        RGBZFocusControls rGBZFocusControls = this.f6585a;
        RectF rectF = rGBZFocusControls.f12355b;
        if (rawX < rectF.right && rawX > rectF.left && rawY < rectF.bottom && rawY > rectF.top) {
            rGBZFocusControls.m8442a(true, (int) rawX, (int) rawY);
        }
        return true;
    }
}
