package p000;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: cze */
public final class cze {
    /* renamed from: a */
    public PreviewOverlay f2850a;
    /* renamed from: b */
    public hfl f2851b;
    /* renamed from: c */
    public hfh f2852c;
    /* renamed from: d */
    private final View f2853d;

    static {
        bli.m862a("CaptureModuleUI");
    }

    public cze(View view) {
        this.f2853d = view;
        m1554a();
    }

    /* renamed from: a */
    public final void m1554a() {
        hkg a = hkg.m3221a(this.f2853d);
        FrameLayout frameLayout = (FrameLayout) a.m3223a((int) R.id.module_layout);
        frameLayout.removeAllViews();
        this.f2850a = (PreviewOverlay) a.m3223a((int) R.id.preview_overlay);
        hfl hfl = (hfl) hhz.m3162d(new hfl(frameLayout.getContext()));
        frameLayout.addView(hfl);
        this.f2851b = hfl;
        this.f2852c = (hfh) hhz.m3162d(new hfh(frameLayout));
    }

    /* renamed from: a */
    public final void m1556a(hfk hfk) {
        this.f2852c.f17744b = hfk;
    }

    /* renamed from: a */
    public final void m1555a(int i) {
        this.f2852c.m11789a(i);
    }
}
