package p000;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: tu */
public final class tu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ RecyclerView f9293a;

    public tu(RecyclerView recyclerView) {
        this.f9293a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.f9293a;
        if (recyclerView.f689q && !recyclerView.isLayoutRequested()) {
            recyclerView = this.f9293a;
            if (recyclerView.f688p) {
                boolean z = recyclerView.f690r;
                recyclerView.m445a();
                return;
            }
            recyclerView.requestLayout();
        }
    }
}
