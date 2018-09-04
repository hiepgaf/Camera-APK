package p000;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* renamed from: hdi */
final /* synthetic */ class hdi implements Runnable {
    /* renamed from: a */
    private final hde f6043a;
    /* renamed from: b */
    private final WeakReference f6044b;

    hdi(hde hde, WeakReference weakReference) {
        this.f6043a = hde;
        this.f6044b = weakReference;
    }

    public final void run() {
        hde hde = this.f6043a;
        WeakReference weakReference = this.f6044b;
        synchronized (hde.f6028n) {
            Activity activity = (Activity) weakReference.get();
            if (!(hde.f6027m || activity == null || activity.isFinishing())) {
                PopupWindow popupWindow = hde.f6019e;
                if (popupWindow != null) {
                    View view = hde.f6023i;
                    if (view != null) {
                        popupWindow.showAtLocation(view, 0, 0, 0);
                    }
                }
            }
        }
    }
}
