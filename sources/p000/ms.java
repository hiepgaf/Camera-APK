package p000;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: ms */
final class ms extends ContentFrameLayout {
    /* renamed from: i */
    private final /* synthetic */ mg f19391i;

    public ms(mg mgVar, Context context) {
        this.f19391i = mgVar;
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f19391i.m14071a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            boolean z;
            if (x < -5) {
                z = true;
            } else if (y < -5) {
                z = true;
            } else if (x > getWidth() + 5) {
                z = true;
            } else if (y <= getHeight() + 5) {
                x = 0;
            } else {
                z = true;
            }
            if (x != 0) {
                mg mgVar = this.f19391i;
                mgVar.m14068a(mgVar.m14083e(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(nj.m5620b(getContext(), i));
    }
}
