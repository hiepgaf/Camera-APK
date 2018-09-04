package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cnc */
public class cnc {
    /* renamed from: a */
    public static final String f2200a = cnc.class.getSimpleName();
    /* renamed from: b */
    public final cne f2201b;
    /* renamed from: c */
    public RecyclerView f2202c;
    /* renamed from: d */
    public cnk f2203d;
    /* renamed from: e */
    public Context f2204e;
    /* renamed from: f */
    public boolean f2205f = false;
    /* renamed from: g */
    private uf f2206g;

    public cnc(cne cne) {
        this.f2201b = cne;
    }

    /* renamed from: a */
    public static int m1196a(Configuration configuration) {
        if (configuration.orientation == 1) {
            return 4;
        }
        return 6;
    }

    /* renamed from: a */
    public final void m1197a() {
        if (this.f2205f) {
            this.f2203d.f9295a.m5875b();
        } else {
            bli.m873e(f2200a, "NotifyDatasetChanged does nothing (BurstEditor has not been created).");
        }
    }

    /* renamed from: a */
    public final void m1198a(int i) {
        uf ufVar = this.f2206g;
        if (ufVar != null) {
            this.f2202c.m450a(ufVar);
        }
        this.f2206g = new cnm(this.f2204e.getResources().getDimensionPixelOffset(R.dimen.burst_grid_item_margin), i, new cnd(this, i));
        RecyclerView recyclerView = this.f2202c;
        uf ufVar2 = this.f2206g;
        ug ugVar = recyclerView.f683k;
        if (ugVar != null) {
            ugVar.mo2466a("Cannot add item decoration during a scroll  or layout");
        }
        if (recyclerView.f685m.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        recyclerView.f685m.add(ufVar2);
        recyclerView.m475l();
        recyclerView.requestLayout();
    }

    /* renamed from: b */
    public final cng m1199b(int i) {
        if (this.f2205f) {
            return (cng) this.f2202c.m444a(i);
        }
        bli.m873e(f2200a, "viewHolderForPosition does nothing (BurstEditor has not been created).");
        return null;
    }
}
