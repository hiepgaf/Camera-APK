package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: hfv */
final class hfv implements OnLayoutChangeListener {
    /* renamed from: a */
    private final /* synthetic */ hfu f6176a;

    hfv(hfu hfu) {
        this.f6176a = hfu;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        hfu hfu = this.f6176a;
        if (hfu.f6172c == i10) {
            if (hfu.f6171b == i9) {
                return;
            }
        }
        hfu.f6171b = i9;
        hfu.f6172c = i10;
    }
}
