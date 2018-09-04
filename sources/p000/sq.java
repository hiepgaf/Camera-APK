package p000;

import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: sq */
final class sq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ sp f9228a;

    sq(sp spVar) {
        this.f9228a = spVar;
    }

    public final void run() {
        ViewParent parent = this.f9228a.f9219a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
