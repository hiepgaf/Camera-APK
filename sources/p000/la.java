package p000;

import android.annotation.TargetApi;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: la */
final class la implements OnApplyWindowInsetsListener {
    la() {
    }

    @TargetApi(21)
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z;
        boolean z2 = false;
        kz kzVar = (kz) view;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z = true;
        } else {
            z = false;
        }
        kzVar.f8758i = windowInsets;
        kzVar.f8759j = z;
        if (!z && kzVar.getBackground() == null) {
            z2 = true;
        }
        kzVar.setWillNotDraw(z2);
        kzVar.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
