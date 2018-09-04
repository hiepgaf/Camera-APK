package p000;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: cry */
final class cry implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2632a;

    cry(crw crw) {
        this.f2632a = crw;
    }

    public final void onClick(View view) {
        crw crw = this.f2632a;
        if (crw.f2620i) {
            Activity activity = (Activity) crw.f2612a.get();
            if (activity != null) {
                activity.openContextMenu(view);
                return;
            }
            return;
        }
        crx crx = crw.f2614c;
        if (crx != null) {
            crx.m1451b();
        }
    }
}
