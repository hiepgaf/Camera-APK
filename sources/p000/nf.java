package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: nf */
final class nf extends kh {
    /* renamed from: a */
    private final /* synthetic */ ne f22481a;

    nf(ne neVar) {
        this.f22481a = neVar;
    }

    /* renamed from: b */
    public final void mo2167b() {
        View view;
        ne neVar = this.f22481a;
        if (neVar.f19411j) {
            view = neVar.f19407f;
            if (view != null) {
                view.setTranslationY(0.0f);
                this.f22481a.f19404c.setTranslationY(0.0f);
            }
        }
        this.f22481a.f19404c.setVisibility(8);
        this.f22481a.f19404c.m410a(false);
        neVar = this.f22481a;
        neVar.f19414m = null;
        no noVar = neVar.f19410i;
        if (noVar != null) {
            noVar.mo2355a(neVar.f19409h);
            neVar.f19409h = null;
            neVar.f19410i = null;
        }
        view = this.f22481a.f19403b;
        if (view != null) {
            jm.m4543B(view);
        }
    }
}
