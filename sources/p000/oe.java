package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* compiled from: PG */
/* renamed from: oe */
class oe extends of {
    /* renamed from: a */
    public final Context f19467a;
    /* renamed from: b */
    public Map f19468b;
    /* renamed from: c */
    public Map f19469c;

    oe(Context context, Object obj) {
        super(obj);
        this.f19467a = context;
    }

    /* renamed from: a */
    final MenuItem m14225a(MenuItem menuItem) {
        if (!(menuItem instanceof hg)) {
            return menuItem;
        }
        hg hgVar = (hg) menuItem;
        if (this.f19468b == null) {
            this.f19468b = new ih();
        }
        MenuItem menuItem2 = (MenuItem) this.f19468b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = ha.m2961a(this.f19467a, hgVar);
        this.f19468b.put(hgVar, menuItem2);
        return menuItem2;
    }

    /* renamed from: a */
    final SubMenu m14226a(SubMenu subMenu) {
        if (!(subMenu instanceof hh)) {
            return subMenu;
        }
        hh hhVar = (hh) subMenu;
        if (this.f19469c == null) {
            this.f19469c = new ih();
        }
        SubMenu subMenu2 = (SubMenu) this.f19469c.get(hhVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = new po(this.f19467a, hhVar);
        this.f19469c.put(hhVar, subMenu2);
        return subMenu2;
    }
}
