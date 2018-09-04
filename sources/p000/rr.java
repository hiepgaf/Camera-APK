package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: rr */
public final class rr {
    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9144a;

    public rr(RecyclerView recyclerView) {
        this.f9144a = recyclerView;
    }

    /* renamed from: a */
    public final View m5778a(int i) {
        return this.f9144a.getChildAt(i);
    }

    /* renamed from: a */
    public final int m5777a(View view) {
        return this.f9144a.indexOfChild(view);
    }

    /* renamed from: b */
    public final void m5780b(View view) {
        ux c = RecyclerView.m428c(view);
        if (c != null) {
            this.f9144a.m457a(c, c.f9381m);
            c.f9381m = 0;
        }
    }

    /* renamed from: b */
    public final void m5779b(int i) {
        View childAt = this.f9144a.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m428c(childAt);
            childAt.clearAnimation();
        }
        this.f9144a.removeViewAt(i);
    }
}
