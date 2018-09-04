package p000;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

/* compiled from: PG */
/* renamed from: oy */
final class oy extends of implements OnMenuItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ ou f19539a;

    oy(ou ouVar, OnMenuItemClickListener onMenuItemClickListener) {
        this.f19539a = ouVar;
        super(onMenuItemClickListener);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((OnMenuItemClickListener) this.d).onMenuItemClick(this.f19539a.m14225a(menuItem));
    }
}
