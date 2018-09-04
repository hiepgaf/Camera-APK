package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: qz */
final class qz extends PopupWindow {
    public qz(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        vk a = vk.m6047a(context, attributeSet, ni.bH, i, i2);
        if (a.m6060f(ni.bJ)) {
            setOverlapAnchor(a.m6050a(ni.bJ, false));
        }
        setBackgroundDrawable(a.m6052b(ni.bI));
        a.f9419b.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
