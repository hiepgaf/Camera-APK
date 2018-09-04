package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: ivp */
final class ivp implements iwi {
    /* renamed from: a */
    private final /* synthetic */ ivl f18628a;

    ivp(ivl ivl) {
        this.f18628a = ivl;
    }

    /* renamed from: a */
    public final void mo449a(iwg iwg) {
    }

    /* renamed from: b */
    public final void mo451b(iwg iwg) {
        this.f18628a.f18614d.m17780a(new iwf());
        iwg.close();
        Surface c = iwg.mo2984c();
        if (c != null) {
            c.release();
        }
        if (!this.f18628a.f18612b.mo3049a()) {
            this.f18628a.f18611a.mo520f("Capture session was closed, closing the capture session lifetime.");
            this.f18628a.f18612b.close();
        }
    }

    /* renamed from: c */
    public final void mo452c(iwg iwg) {
        this.f18628a.f18611a.mo520f("Capture session failed to configure!");
        Throwable iwf = new iwf("The capture session configuration failed!");
        this.f18628a.f18614d.m17780a(iwf);
        iwg.close();
        if (!this.f18628a.f18612b.mo3049a()) {
            this.f18628a.f18611a.mo520f("Capture session was closed, closing the capture session lifetime.");
            this.f18628a.f18612b.close();
            if (!this.f18628a.f18614d.isCancelled()) {
                this.f18628a.f18613c.mo2693a(iwf);
            }
        }
    }

    /* renamed from: d */
    public final void mo453d(iwg iwg) {
        if (this.f18628a.f18614d.mo3557a((Object) iwg)) {
            this.f18628a.f18612b.mo1879a(new ivq(iwg));
            return;
        }
        iwg.close();
    }

    /* renamed from: e */
    public final void mo454e(iwg iwg) {
    }

    /* renamed from: a */
    public final void mo450a(iwg iwg, Surface surface) {
    }
}
