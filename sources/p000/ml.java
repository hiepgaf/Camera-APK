package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: ml */
final class ml extends kh {
    /* renamed from: a */
    private final /* synthetic */ mg f22479a;

    ml(mg mgVar) {
        this.f22479a = mgVar;
    }

    /* renamed from: b */
    public final void mo2167b() {
        this.f22479a.f19367g.setAlpha(1.0f);
        this.f22479a.f19370j.m4770a(null);
        this.f22479a.f19370j = null;
    }

    /* renamed from: c */
    public final void mo2168c() {
        this.f22479a.f19367g.setVisibility(0);
        this.f22479a.f19367g.sendAccessibilityEvent(32);
        if (this.f22479a.f19367g.getParent() instanceof View) {
            jm.m4543B((View) this.f22479a.f19367g.getParent());
        }
    }
}
