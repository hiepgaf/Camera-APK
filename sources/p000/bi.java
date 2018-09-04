package p000;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;

/* compiled from: PG */
/* renamed from: bi */
public final class bi implements Runnable {
    /* renamed from: a */
    private final View f1179a;
    /* renamed from: b */
    private final boolean f1180b;
    /* renamed from: c */
    private final /* synthetic */ SwipeDismissBehavior f1181c;

    bi(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f1181c = swipeDismissBehavior;
        this.f1179a = view;
        this.f1180b = z;
    }

    public final void run() {
        lo loVar = this.f1181c.f9904a;
        if (loVar != null && loVar.m5533b()) {
            jm.m4556a(this.f1179a, (Runnable) this);
        } else if (!this.f1180b) {
        }
    }
}
