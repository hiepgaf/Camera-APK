package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: hcn */
public final class hcn implements AutoCloseable {
    /* renamed from: a */
    public final hde f5985a;
    /* renamed from: b */
    public final kpw f5986b = kpw.m18056d();

    public hcn(View view, int i, View view2, int i2, int i3) {
        jri.m13152b((Object) view);
        jri.m13152b((Object) view2);
        hde hde = new hde(view2.getContext());
        hde.setWillNotDraw(false);
        hde.setLayerType(1, hde.f6016b);
        hde.setOnClickListener(new hdf(hde));
        hde.f6032r = new hdg(hde);
        this.f5985a = hde;
        View view3 = this.f5985a;
        view3.f6021g = view;
        view3.f6019e = new PopupWindow(view3);
        view3.addView(view);
        view3 = this.f5985a;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int a = hcn.m3073a(view3);
        int i4 = view2.getResources().getDisplayMetrics().heightPixels;
        int a2 = hcn.m3073a(view2);
        boolean z;
        if (i == 1) {
            if (a < iArr[1]) {
                a = 1;
            } else {
                z = false;
            }
        } else if (a < (i4 - a2) - iArr[1]) {
            a = 1;
        } else {
            z = false;
        }
        if (a == 0) {
            if (i == 1) {
                i = 2;
            } else {
                i = 1;
            }
        }
        hde = this.f5985a;
        hde.f6023i = view2;
        view3 = hde.f6023i;
        if (view3 != null) {
            int[] iArr2 = hde.f6015a;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            view3.measure(makeMeasureSpec, makeMeasureSpec);
            view3.getLocationOnScreen(iArr2);
            if (view3.getWidth() != 0) {
                makeMeasureSpec = view3.getWidth();
            } else {
                makeMeasureSpec = view3.getMeasuredWidth();
            }
            if (view3.getHeight() != 0) {
                a = view3.getHeight();
            } else {
                a = view3.getMeasuredHeight();
            }
            int i5 = iArr2[0];
            int i6 = iArr2[1];
            hde.f6024j = new Rect(i5, i6, makeMeasureSpec + i5, a + i6);
        }
        hde.f6022h = i;
        hde.f6025k = i2;
        hde.f6026l = 0;
    }

    public final void close() {
        hde hde = this.f5985a;
        if (hde != null) {
            hde.m3079a();
            this.f5985a.close();
        }
        this.f5986b.mo3557a(null);
    }

    /* renamed from: a */
    private static int m3073a(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        height = MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(height, height);
        return view.getMeasuredHeight();
    }
}
