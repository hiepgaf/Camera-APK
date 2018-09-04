package p000;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: uz */
public final class uz extends jd {
    /* renamed from: c */
    private final uy f19648c;

    public uz(uy uyVar) {
        this.f19648c = uyVar;
    }

    /* renamed from: a */
    public final void mo684a(View view, kk kkVar) {
        super.mo684a(view, kkVar);
        if (!this.f19648c.f19646c.m473j()) {
            ug ugVar = this.f19648c.f19646c.f683k;
            if (ugVar != null) {
                ugVar.m5937a(view, kkVar);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2056a(View view, int i, Bundle bundle) {
        if (super.mo2056a(view, i, bundle)) {
            return true;
        }
        if (this.f19648c.f19646c.m473j()) {
            return false;
        }
        ug ugVar = this.f19648c.f19646c.f683k;
        if (ugVar == null) {
            return false;
        }
        RecyclerView recyclerView = ugVar.f9309g;
        up upVar = recyclerView.f676d;
        uv uvVar = recyclerView.f656A;
        return false;
    }
}
