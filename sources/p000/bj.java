package p000;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: bj */
public final class bj extends lr {
    /* renamed from: a */
    private final /* synthetic */ BottomSheetBehavior f10953a;

    public bj(BottomSheetBehavior bottomSheetBehavior) {
        this.f10953a = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final int mo429a(View view, int i) {
        return view.getLeft();
    }

    /* renamed from: b */
    public final int mo432b(View view, int i) {
        int i2;
        int b = this.f10953a.m6695b();
        BottomSheetBehavior bottomSheetBehavior = this.f10953a;
        if (bottomSheetBehavior.f9915e) {
            i2 = bottomSheetBehavior.f9918h;
        } else {
            i2 = bottomSheetBehavior.f9914d;
        }
        return df.m1576a(i, b, i2);
    }

    /* renamed from: a */
    public final int mo502a() {
        BottomSheetBehavior bottomSheetBehavior = this.f10953a;
        if (bottomSheetBehavior.f9915e) {
            return bottomSheetBehavior.f9918h;
        }
        return bottomSheetBehavior.f9914d;
    }

    /* renamed from: a */
    public final void mo430a(int i) {
        if (i == 1) {
            this.f10953a.m6696b(1);
        }
    }

    /* renamed from: d */
    public final void mo434d(View view, int i) {
        this.f10953a.m6686a();
    }

    /* renamed from: a */
    public final void mo431a(View view, float f, float f2) {
        int i;
        int i2 = 3;
        int top;
        if (f2 < 0.0f) {
            BottomSheetBehavior bottomSheetBehavior = this.f10953a;
            if (bottomSheetBehavior.f9911a) {
                i = bottomSheetBehavior.f9912b;
            } else {
                top = view.getTop();
                int i3 = this.f10953a.f9913c;
                if (top > i3) {
                    i2 = 6;
                    i = i3;
                } else {
                    i = 0;
                }
            }
        } else {
            BottomSheetBehavior bottomSheetBehavior2 = this.f10953a;
            if (bottomSheetBehavior2.f9915e && bottomSheetBehavior2.m6694a(view, f2)) {
                i = this.f10953a.f9918h;
                i2 = 5;
            } else if (f2 == 0.0f) {
                top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = this.f10953a;
                if (!bottomSheetBehavior3.f9911a) {
                    int i4 = bottomSheetBehavior3.f9913c;
                    if (top < i4) {
                        if (top >= Math.abs(top - bottomSheetBehavior3.f9914d)) {
                            i = this.f10953a.f9913c;
                            i2 = 6;
                        } else {
                            i = 0;
                        }
                    } else if (Math.abs(top - i4) < Math.abs(top - this.f10953a.f9914d)) {
                        i = this.f10953a.f9913c;
                        i2 = 6;
                    } else {
                        i = this.f10953a.f9914d;
                        i2 = 4;
                    }
                } else if (Math.abs(top - bottomSheetBehavior3.f9912b) < Math.abs(top - this.f10953a.f9914d)) {
                    i = this.f10953a.f9912b;
                } else {
                    i = this.f10953a.f9914d;
                    i2 = 4;
                }
            } else {
                i = this.f10953a.f9914d;
                i2 = 4;
            }
        }
        if (this.f10953a.f9917g.m5534b(view.getLeft(), i)) {
            this.f10953a.m6696b(2);
            jm.m4556a(view, new bm(this.f10953a, view, i2));
            return;
        }
        this.f10953a.m6696b(i2);
    }

    /* renamed from: e */
    public final boolean mo435e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f10953a;
        int i2 = bottomSheetBehavior.f9916f;
        if (i2 == 1) {
            return false;
        }
        if (bottomSheetBehavior.f9922l) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f9921k == i) {
            View view2 = (View) bottomSheetBehavior.f9920j.get();
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference = this.f10953a.f9919i;
        return weakReference != null && weakReference.get() == view;
    }
}
