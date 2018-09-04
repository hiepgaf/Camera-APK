package p000;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* compiled from: PG */
/* renamed from: bm */
public final class bm implements Runnable {
    /* renamed from: a */
    private final View f1269a;
    /* renamed from: b */
    private final int f1270b;
    /* renamed from: c */
    private final /* synthetic */ BottomSheetBehavior f1271c;

    public bm(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1271c = bottomSheetBehavior;
        this.f1269a = view;
        this.f1270b = i;
    }

    public final void run() {
        lo loVar = this.f1271c.f9917g;
        if (loVar == null || !loVar.m5533b()) {
            this.f1271c.m6696b(this.f1270b);
        } else {
            jm.m4556a(this.f1269a, (Runnable) this);
        }
    }
}
