package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: ve */
public abstract class ve extends ub {
    /* renamed from: a */
    private boolean f19649a = true;

    /* renamed from: a */
    public abstract boolean mo3330a(ux uxVar);

    /* renamed from: a */
    public abstract boolean mo3331a(ux uxVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo3333a(ux uxVar, ux uxVar2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo3335b(ux uxVar);

    /* renamed from: a */
    public final boolean mo2489a(ux uxVar, ue ueVar, ue ueVar2) {
        if (ueVar != null) {
            int i = ueVar.f9304a;
            int i2 = ueVar2.f9304a;
            if (!(i == i2 && ueVar.f9305b == ueVar2.f9305b)) {
                return mo3331a(uxVar, i, ueVar.f9305b, i2, ueVar2.f9305b);
            }
        }
        return mo3330a(uxVar);
    }

    /* renamed from: a */
    public final boolean mo2490a(ux uxVar, ux uxVar2, ue ueVar, ue ueVar2) {
        int i;
        int i2;
        int i3 = ueVar.f9304a;
        int i4 = ueVar.f9305b;
        if (uxVar2.m6035p()) {
            i = ueVar.f9304a;
            i2 = ueVar.f9305b;
        } else {
            i = ueVar2.f9304a;
            i2 = ueVar2.f9305b;
        }
        return mo3333a(uxVar, uxVar2, i3, i4, i, i2);
    }

    /* renamed from: b */
    public final boolean mo2491b(ux uxVar, ue ueVar, ue ueVar2) {
        int i;
        int i2;
        int i3 = ueVar.f9304a;
        int i4 = ueVar.f9305b;
        View view = uxVar.f9369a;
        if (ueVar2 != null) {
            i = ueVar2.f9304a;
        } else {
            i = view.getLeft();
        }
        if (ueVar2 != null) {
            i2 = ueVar2.f9305b;
        } else {
            i2 = view.getTop();
        }
        if (uxVar.m6029j() || (i3 == i && i4 == i2)) {
            return mo3335b(uxVar);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return mo3331a(uxVar, i3, i4, i, i2);
    }

    /* renamed from: c */
    public final boolean mo2492c(ux uxVar, ue ueVar, ue ueVar2) {
        int i = ueVar.f9304a;
        int i2 = ueVar2.f9304a;
        if (i == i2 && ueVar.f9305b == ueVar2.f9305b) {
            m5911f(uxVar);
            return false;
        }
        return mo3331a(uxVar, i, ueVar.f9305b, i2, ueVar2.f9305b);
    }

    /* renamed from: e */
    public final boolean mo2493e(ux uxVar) {
        return !this.f19649a || uxVar.m6027h();
    }
}
