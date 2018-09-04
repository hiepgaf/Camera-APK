package p000;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* renamed from: ob */
public final class ob extends sp {
    /* renamed from: c */
    private final /* synthetic */ ActionMenuItemView f19458c;

    public ob(ActionMenuItemView actionMenuItemView) {
        this.f19458c = actionMenuItemView;
        super(actionMenuItemView);
    }

    /* renamed from: a */
    public final pj mo2433a() {
        oc ocVar = this.f19458c.f10006c;
        if (ocVar == null) {
            return null;
        }
        pz pzVar = ocVar.f8993a.f22545l;
        if (pzVar != null) {
            return pzVar.m5669b();
        }
        return null;
    }

    /* renamed from: b */
    protected final boolean mo2434b() {
        ActionMenuItemView actionMenuItemView = this.f19458c;
        or orVar = actionMenuItemView.f10005b;
        if (orVar == null || !orVar.mo285a(actionMenuItemView.f10004a)) {
            return false;
        }
        pj a = mo2433a();
        if (a == null || !a.mo2473e()) {
            return false;
        }
        return true;
    }
}
