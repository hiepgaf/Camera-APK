package p000;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: tv */
public final class tv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ RecyclerView f9294a;

    public tv(RecyclerView recyclerView) {
        this.f9294a = recyclerView;
    }

    public final void run() {
        ub ubVar = this.f9294a.f696x;
        if (ubVar != null) {
            ubVar.mo3338d();
        }
        this.f9294a.f660E = false;
    }
}
