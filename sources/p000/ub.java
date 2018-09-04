package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ub */
public abstract class ub {
    /* renamed from: a */
    private ArrayList f9297a = new ArrayList();
    /* renamed from: h */
    public ud f9298h = null;
    /* renamed from: i */
    public long f9299i = 120;
    /* renamed from: j */
    public long f9300j = 120;
    /* renamed from: k */
    public long f9301k = 250;
    /* renamed from: l */
    public long f9302l = 250;

    /* renamed from: a */
    public abstract boolean mo2489a(ux uxVar, ue ueVar, ue ueVar2);

    /* renamed from: a */
    public abstract boolean mo2490a(ux uxVar, ux uxVar2, ue ueVar, ue ueVar2);

    /* renamed from: b */
    public abstract void mo3334b();

    /* renamed from: b */
    public abstract boolean mo2491b(ux uxVar, ue ueVar, ue ueVar2);

    /* renamed from: c */
    public abstract void mo3336c(ux uxVar);

    /* renamed from: c */
    public abstract boolean mo3337c();

    /* renamed from: c */
    public abstract boolean mo2492c(ux uxVar, ue ueVar, ue ueVar2);

    /* renamed from: d */
    public abstract void mo3338d();

    /* renamed from: d */
    public static int m5898d(ux uxVar) {
        int i = uxVar.f9378j & 14;
        if (uxVar.m6027h()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = uxVar.f9372d;
        int e = uxVar.m6024e();
        if (i2 == -1 || e == -1 || i2 == e) {
            return i;
        }
        return i | DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
    }

    /* renamed from: e */
    public boolean mo2493e(ux uxVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo3332a(ux uxVar, List list) {
        return mo2493e(uxVar);
    }

    /* renamed from: f */
    public final void m5911f(ux uxVar) {
        int i = 1;
        ud udVar = this.f9298h;
        if (udVar != null) {
            uxVar.m6019a(true);
            if (uxVar.f9376h != null && uxVar.f9377i == null) {
                uxVar.f9376h = null;
            }
            uxVar.f9377i = null;
            if ((uxVar.f9378j & 16) == 0) {
                RecyclerView recyclerView = udVar.f9303a;
                View view = uxVar.f9369a;
                recyclerView.m479p();
                rp rpVar = recyclerView.f678f;
                int a = rpVar.f9139a.m5777a(view);
                if (a == -1) {
                    rpVar.m5769d(view);
                } else if (rpVar.f9140b.m5774c(a)) {
                    rpVar.f9140b.m5775d(a);
                    rpVar.m5769d(view);
                    rpVar.f9139a.m5779b(a);
                } else {
                    i = 0;
                }
                if (i != 0) {
                    ux c = RecyclerView.m428c(view);
                    recyclerView.f676d.m6005b(c);
                    recyclerView.f676d.m6000a(c);
                }
                recyclerView.m466c(i ^ 1);
                if (i == 0 && uxVar.m6031l()) {
                    udVar.f9303a.removeDetachedView(uxVar.f9369a, false);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m5909e() {
        int size = this.f9297a.size();
        for (int i = 0; i < size; i++) {
            ((uc) this.f9297a.get(i)).m5912a();
        }
        this.f9297a.clear();
    }

    /* renamed from: f */
    public static ue m5899f() {
        return new ue();
    }
}
