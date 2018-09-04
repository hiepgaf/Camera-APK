package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: rw */
final class rw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ArrayList f9162a;
    /* renamed from: b */
    private final /* synthetic */ rv f9163b;

    rw(rv rvVar, ArrayList arrayList) {
        this.f9163b = rvVar;
        this.f9162a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9162a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            sf sfVar = (sf) arrayList.get(i);
            ub ubVar = this.f9163b;
            ux uxVar = sfVar.f9196a;
            int i3 = sfVar.f9197b;
            int i4 = sfVar.f9198c;
            int i5 = sfVar.f9199d;
            i = sfVar.f9200e;
            View view = uxVar.f9369a;
            i3 = i5 - i3;
            i4 = i - i4;
            if (i3 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i4 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            ubVar.f22563e.add(uxVar);
            animate.setDuration(ubVar.f9301k).setListener(new sb(ubVar, uxVar, i3, view, i4, animate)).start();
            i = i2;
        }
        this.f9162a.clear();
        this.f9163b.f22560b.remove(this.f9162a);
    }
}
