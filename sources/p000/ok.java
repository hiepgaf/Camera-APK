package p000;

import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: ok */
final class ok implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ol f8997a;
    /* renamed from: b */
    private final /* synthetic */ MenuItem f8998b;
    /* renamed from: c */
    private final /* synthetic */ op f8999c;
    /* renamed from: d */
    private final /* synthetic */ oj f9000d;

    ok(oj ojVar, ol olVar, MenuItem menuItem, op opVar) {
        this.f9000d = ojVar;
        this.f8997a = olVar;
        this.f8998b = menuItem;
        this.f8999c = opVar;
    }

    public final void run() {
        ol olVar = this.f8997a;
        if (olVar != null) {
            this.f9000d.f19470a.f22494f = true;
            olVar.f9002b.m14248a(false);
            this.f9000d.f19470a.f22494f = false;
        }
        if (this.f8998b.isEnabled() && this.f8998b.hasSubMenu()) {
            this.f8999c.m14249a(this.f8998b, null, 4);
        }
    }
}
