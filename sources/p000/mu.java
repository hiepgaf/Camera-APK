package p000;

import android.view.Menu;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: mu */
final class mu implements pf {
    /* renamed from: a */
    private final /* synthetic */ mg f19392a;

    mu(mg mgVar) {
        this.f19392a = mgVar;
    }

    /* renamed from: a */
    public final void mo2353a(op opVar, boolean z) {
        Menu menu;
        Menu d = opVar.mo3318d();
        mg mgVar = this.f19392a;
        if (d != opVar) {
            menu = d;
        } else {
            Object obj = opVar;
        }
        mt a = mgVar.m14061a(menu);
        if (a == null) {
            return;
        }
        if (d != opVar) {
            this.f19392a.m14063a(a.f8834a, a, d);
            this.f19392a.m14068a(a, true);
            return;
        }
        this.f19392a.m14068a(a, z);
    }

    /* renamed from: a */
    public final boolean mo2354a(op opVar) {
        if (opVar == null) {
            mg mgVar = this.f19392a;
            if (mgVar.f19372l) {
                Callback callback = mgVar.f19363c.getCallback();
                if (!(callback == null || this.f19392a.f19374n)) {
                    callback.onMenuOpened(108, opVar);
                }
            }
        }
        return true;
    }
}
