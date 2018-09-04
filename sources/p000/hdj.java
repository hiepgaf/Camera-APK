package p000;

import android.app.Activity;
import android.transition.Fade;
import android.transition.Transition;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* renamed from: hdj */
final /* synthetic */ class hdj implements Runnable {
    /* renamed from: a */
    private final hde f6045a;
    /* renamed from: b */
    private final WeakReference f6046b;
    /* renamed from: c */
    private final Transition f6047c;

    hdj(hde hde, WeakReference weakReference, Transition transition) {
        this.f6045a = hde;
        this.f6046b = weakReference;
        this.f6047c = transition;
    }

    public final void run() {
        hde hde = this.f6045a;
        WeakReference weakReference = this.f6046b;
        Transition transition = this.f6047c;
        synchronized (hde.f6028n) {
            PopupWindow popupWindow = hde.f6019e;
            Activity activity = (Activity) weakReference.get();
            if (!(hde.f6027m || activity == null || activity.isFinishing() || popupWindow == null)) {
                Transition fade = new Fade();
                transition.setDuration(300);
                transition.setInterpolator(new ks());
                popupWindow.setExitTransition(fade);
            }
        }
    }
}
