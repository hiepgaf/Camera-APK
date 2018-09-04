package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ry */
final class ry implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ArrayList f9166a;
    /* renamed from: b */
    private final /* synthetic */ rv f9167b;

    ry(rv rvVar, ArrayList arrayList) {
        this.f9167b = rvVar;
        this.f9166a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9166a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ux uxVar = (ux) arrayList.get(i);
            ub ubVar = this.f9167b;
            View view = uxVar.f9369a;
            ViewPropertyAnimator animate = view.animate();
            ubVar.f22562d.add(uxVar);
            animate.alpha(1.0f).setDuration(ubVar.f9299i).setListener(new sa(ubVar, uxVar, view, animate)).start();
            i = i2;
        }
        this.f9166a.clear();
        this.f9167b.f22559a.remove(this.f9166a);
    }
}
