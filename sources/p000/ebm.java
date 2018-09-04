package p000;

import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: ebm */
public final class ebm {
    /* renamed from: a */
    private final kwk f3509a;
    /* renamed from: b */
    private final BottomBarController f3510b;
    /* renamed from: c */
    private FrameLayout f3511c;

    public ebm(kwk kwk, BottomBarController bottomBarController) {
        this.f3509a = kwk;
        this.f3510b = bottomBarController;
    }

    /* renamed from: a */
    public final void m1744a(int i) {
        if (this.f3511c == null) {
            this.f3511c = ((hes) this.f3509a.mo345a()).f6111a;
        }
        this.f3511c.setImportantForAccessibility(i);
        this.f3510b.setImportantForAccessibility(i);
    }
}
