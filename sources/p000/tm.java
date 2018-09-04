package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: tm */
final class tm implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ tg f9282a;

    tm(tg tgVar) {
        this.f9282a = tgVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            PopupWindow popupWindow = this.f9282a.f19629r;
            if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < this.f9282a.f19629r.getWidth() && y >= 0 && y < this.f9282a.f19629r.getHeight()) {
                tg tgVar = this.f9282a;
                tgVar.f19626o.postDelayed(tgVar.f19625n, 250);
                return false;
            }
        }
        if (action == 1) {
            tgVar = this.f9282a;
            tgVar.f19626o.removeCallbacks(tgVar.f19625n);
        }
        return false;
    }
}
