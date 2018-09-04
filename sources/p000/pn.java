package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: pn */
public final class pn extends op implements SubMenu {
    /* renamed from: k */
    public op f22537k;
    /* renamed from: l */
    private ot f22538l;

    public pn(Context context, op opVar, ot otVar) {
        super(context);
        this.f22537k = opVar;
        this.f22538l = otVar;
    }

    /* renamed from: a */
    public final boolean mo3315a(ot otVar) {
        return this.f22537k.mo3315a(otVar);
    }

    /* renamed from: a */
    final boolean mo3314a(op opVar, MenuItem menuItem) {
        return super.mo3314a(opVar, menuItem) || this.f22537k.mo3314a(opVar, menuItem);
    }

    /* renamed from: b */
    public final boolean mo3317b(ot otVar) {
        return this.f22537k.mo3317b(otVar);
    }

    /* renamed from: b */
    public final String mo3316b() {
        int itemId;
        ot otVar = this.f22538l;
        if (otVar != null) {
            itemId = otVar.getItemId();
        } else {
            itemId = 0;
        }
        if (itemId == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo3316b());
        stringBuilder.append(":");
        stringBuilder.append(itemId);
        return stringBuilder.toString();
    }

    public final MenuItem getItem() {
        return this.f22538l;
    }

    /* renamed from: d */
    public final op mo3318d() {
        return this.f22537k.mo3318d();
    }

    /* renamed from: f */
    public final boolean mo3319f() {
        return this.f22537k.mo3319f();
    }

    /* renamed from: g */
    public final boolean mo3320g() {
        return this.f22537k.mo3320g();
    }

    /* renamed from: h */
    public final boolean mo3321h() {
        return this.f22537k.mo3321h();
    }

    /* renamed from: a */
    public final void mo3313a(oq oqVar) {
        this.f22537k.mo3313a(oqVar);
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f22537k.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        super.m14243a(0, null, i, null, null);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.m14243a(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.m14243a(i, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m14243a(0, charSequence, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.m14243a(0, null, 0, null, view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f22538l.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f22538l.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f22537k.setQwertyMode(z);
    }
}
