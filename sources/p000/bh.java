package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bh */
public final class bh implements jk {
    /* renamed from: a */
    private final /* synthetic */ CoordinatorLayout f10848a;

    public bh(CoordinatorLayout coordinatorLayout) {
        this.f10848a = coordinatorLayout;
    }

    /* renamed from: a */
    public final kj mo439a(View view, kj kjVar) {
        boolean z = true;
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.f10848a;
        if (!Objects.equals(coordinatorLayout.f9960b, kjVar)) {
            boolean z2;
            coordinatorLayout.f9960b = kjVar;
            if (kjVar == null) {
                z2 = false;
            } else if (kjVar.m4980d() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            coordinatorLayout.f9961c = z2;
            if (coordinatorLayout.f9961c) {
                z = false;
            } else if (coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (!kjVar.m4981e()) {
                int childCount = coordinatorLayout.getChildCount();
                while (i < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (jm.m4573g(childAt) && ((dm) childAt.getLayoutParams()).f3132a != null && kjVar.m4981e()) {
                        break;
                    }
                    i++;
                }
            }
            coordinatorLayout.requestLayout();
        }
        return kjVar;
    }
}
