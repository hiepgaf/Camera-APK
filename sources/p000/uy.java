package p000;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

/* compiled from: PG */
/* renamed from: uy */
public final class uy extends jd {
    /* renamed from: c */
    public final RecyclerView f19646c;
    /* renamed from: d */
    public final jd f19647d = new uz(this);

    public uy(RecyclerView recyclerView) {
        this.f19646c = recyclerView;
    }

    /* renamed from: a */
    public final void mo683a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo683a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f19646c.m473j()) {
            ug ugVar = ((RecyclerView) view).f683k;
            if (ugVar != null) {
                ugVar.mo2465a(accessibilityEvent);
            }
        }
    }

    /* renamed from: a */
    public final void mo684a(View view, kk kkVar) {
        super.mo684a(view, kkVar);
        kkVar.m4986a(RecyclerView.class.getName());
        if (!this.f19646c.m473j()) {
            ug ugVar = this.f19646c.f683k;
            if (ugVar != null) {
                RecyclerView recyclerView = ugVar.f9309g;
                up upVar = recyclerView.f676d;
                uv uvVar = recyclerView.f656A;
                if (recyclerView.canScrollVertically(-1) || ugVar.f9309g.canScrollHorizontally(-1)) {
                    kkVar.m4983a(8192);
                    kkVar.m4993d(true);
                }
                if (ugVar.f9309g.canScrollVertically(1) || ugVar.f9309g.canScrollHorizontally(1)) {
                    kkVar.m4983a(4096);
                    kkVar.m4993d(true);
                }
                kkVar.f8327a.setCollectionInfo((CollectionInfo) new km(CollectionInfo.obtain(ugVar.mo3347b(upVar, uvVar), ugVar.mo3339a(upVar, uvVar), false, 0)).f8331a);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2056a(View view, int i, Bundle bundle) {
        if (super.mo2056a(view, i, bundle)) {
            return true;
        }
        if (this.f19646c.m473j()) {
            return false;
        }
        ug ugVar = this.f19646c.f683k;
        if (ugVar == null) {
            return false;
        }
        RecyclerView recyclerView = ugVar.f9309g;
        up upVar = recyclerView.f676d;
        uv uvVar = recyclerView.f656A;
        if (recyclerView == null) {
            return false;
        }
        int t;
        int i2;
        switch (i) {
            case 4096:
                if (recyclerView.canScrollVertically(1)) {
                    t = (ugVar.f9319q - ugVar.m5980t()) - ugVar.m5977q();
                } else {
                    t = 0;
                }
                if (!ugVar.f9309g.canScrollHorizontally(1)) {
                    i2 = t;
                    t = 0;
                    break;
                }
                i2 = t;
                t = (ugVar.f9318p - ugVar.m5978r()) - ugVar.m5979s();
                break;
            case 8192:
                if (recyclerView.canScrollVertically(-1)) {
                    t = -((ugVar.f9319q - ugVar.m5980t()) - ugVar.m5977q());
                } else {
                    t = 0;
                }
                if (!ugVar.f9309g.canScrollHorizontally(-1)) {
                    i2 = t;
                    t = 0;
                    break;
                }
                i2 = t;
                t = -((ugVar.f9318p - ugVar.m5978r()) - ugVar.m5979s());
                break;
            default:
                t = 0;
                i2 = 0;
                break;
        }
        if (i2 == 0 && t == 0) {
            return false;
        }
        ugVar.f9309g.m465c(t, i2);
        return true;
    }
}
