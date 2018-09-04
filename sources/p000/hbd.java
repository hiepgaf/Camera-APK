package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: hbd */
public final class hbd extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ ShutterButton f5891a;

    public hbd(ShutterButton shutterButton) {
        this.f5891a = shutterButton;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (this.f5891a.buttonRect.contains(motionEvent.getX(), motionEvent.getY()) && this.f5891a.clickEnabled && this.f5891a.isLongPressInProgress.compareAndSet(false, true) && this.f5891a.listener != null) {
            this.f5891a.listener.onShutterButtonLongPressed();
        }
    }
}
