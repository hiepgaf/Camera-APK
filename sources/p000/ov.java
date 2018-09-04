package p000;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: ov */
class ov extends jf {
    /* renamed from: b */
    public final ActionProvider f19535b;
    /* renamed from: c */
    private final /* synthetic */ ou f19536c;

    public ov(ou ouVar, ActionProvider actionProvider) {
        this.f19536c = ouVar;
        this.f19535b = actionProvider;
    }

    /* renamed from: a */
    public final boolean mo2446a() {
        return this.f19535b.hasSubMenu();
    }

    /* renamed from: c */
    public final View mo2447c() {
        return this.f19535b.onCreateActionView();
    }

    /* renamed from: d */
    public final boolean mo2448d() {
        return this.f19535b.onPerformDefaultAction();
    }

    /* renamed from: a */
    public final void mo2445a(SubMenu subMenu) {
        this.f19535b.onPrepareSubMenu(this.f19536c.m14226a(subMenu));
    }
}
