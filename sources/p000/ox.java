package p000;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

/* compiled from: PG */
/* renamed from: ox */
final class ox extends of implements OnActionExpandListener {
    /* renamed from: a */
    private final /* synthetic */ ou f19538a;

    ox(ou ouVar, OnActionExpandListener onActionExpandListener) {
        this.f19538a = ouVar;
        super(onActionExpandListener);
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionCollapse(this.f19538a.m14225a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionExpand(this.f19538a.m14225a(menuItem));
    }
}
