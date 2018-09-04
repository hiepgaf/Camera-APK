package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.OverScroller;

/* compiled from: PG */
/* renamed from: bb */
final class bb implements Runnable {
    /* renamed from: a */
    private final CoordinatorLayout f1057a;
    /* renamed from: b */
    private final View f1058b;
    /* renamed from: c */
    private final /* synthetic */ ba f1059c;

    bb(ba baVar, CoordinatorLayout coordinatorLayout, View view) {
        this.f1059c = baVar;
        this.f1057a = coordinatorLayout;
        this.f1058b = view;
    }

    public final void run() {
        if (this.f1058b != null) {
            OverScroller overScroller = this.f1059c.f19852a;
            if (overScroller == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                ba baVar = this.f1059c;
                baVar.mo3351a(baVar.f19852a.getCurrY(), (int) kvl.UNSET_ENUM_VALUE, (int) LfuScheduler.MAX_PRIORITY);
                jm.m4556a(this.f1058b, (Runnable) this);
                return;
            }
            this.f1059c.a_(this.f1058b);
        }
    }
}
