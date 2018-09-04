package p000;

import android.view.Menu;
import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: mn */
final class mn implements no {
    /* renamed from: a */
    public final /* synthetic */ mg f19388a;
    /* renamed from: b */
    private no f19389b;

    public mn(mg mgVar, no noVar) {
        this.f19388a = mgVar;
        this.f19389b = noVar;
    }

    /* renamed from: a */
    public final boolean mo2357a(nn nnVar, MenuItem menuItem) {
        return this.f19389b.mo2357a(nnVar, menuItem);
    }

    /* renamed from: a */
    public final boolean mo2356a(nn nnVar, Menu menu) {
        return this.f19389b.mo2356a(nnVar, menu);
    }

    /* renamed from: a */
    public final void mo2355a(nn nnVar) {
        this.f19389b.mo2355a(nnVar);
        mg mgVar = this.f19388a;
        if (mgVar.f19368h != null) {
            mgVar.f19363c.getDecorView().removeCallbacks(this.f19388a.f19369i);
        }
        mgVar = this.f19388a;
        if (mgVar.f19367g != null) {
            mgVar.m14092l();
            mgVar = this.f19388a;
            mgVar.f19370j = jm.m4547a(mgVar.f19367g).m4768a(0.0f);
            this.f19388a.f19370j.m4770a(new mo(this));
        }
        mgVar = this.f19388a;
        me meVar = mgVar.f19364d;
        if (meVar != null) {
            nn nnVar2 = mgVar.f19366f;
            meVar.mo2369b();
        }
        this.f19388a.f19366f = null;
    }

    /* renamed from: b */
    public final boolean mo2358b(nn nnVar, Menu menu) {
        return this.f19389b.mo2358b(nnVar, menu);
    }
}
