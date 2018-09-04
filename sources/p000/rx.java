package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: rx */
final class rx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ArrayList f9164a;
    /* renamed from: b */
    private final /* synthetic */ rv f9165b;

    rx(rv rvVar, ArrayList arrayList) {
        this.f9165b = rvVar;
        this.f9164a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9164a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            View view;
            View view2;
            int i2 = i + 1;
            se seVar = (se) arrayList.get(i);
            ub ubVar = this.f9165b;
            ux uxVar = seVar.f9190a;
            if (uxVar != null) {
                view = uxVar.f9369a;
            } else {
                view = null;
            }
            ux uxVar2 = seVar.f9191b;
            if (uxVar2 != null) {
                view2 = uxVar2.f9369a;
            } else {
                view2 = null;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(ubVar.f9302l);
                ubVar.f22565g.add(seVar.f9190a);
                duration.translationX((float) (seVar.f9194e - seVar.f9192c));
                duration.translationY((float) (seVar.f9195f - seVar.f9193d));
                duration.alpha(0.0f).setListener(new sc(ubVar, seVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                ubVar.f22565g.add(seVar.f9191b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(ubVar.f9302l).alpha(1.0f).setListener(new sd(ubVar, seVar, animate, view2)).start();
                i = i2;
            } else {
                i = i2;
            }
        }
        this.f9164a.clear();
        this.f9165b.f22561c.remove(this.f9164a);
    }
}
