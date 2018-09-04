package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bhq */
final class bhq implements iwi {
    /* renamed from: a */
    private final /* synthetic */ kpw f10888a;

    bhq(kpw kpw) {
        this.f10888a = kpw;
    }

    /* renamed from: a */
    public final void mo449a(iwg iwg) {
        bli.m863a(bho.f10885a, "onActive");
    }

    /* renamed from: b */
    public final void mo451b(iwg iwg) {
        bli.m863a(bho.f10885a, "onClosed");
    }

    /* renamed from: c */
    public final void mo452c(iwg iwg) {
        bli.m866b(bho.f10885a, "onConfigureFailed");
        this.f10888a.m17780a(new isr("CameraCaptureSession.onConfigureFailed"));
    }

    /* renamed from: d */
    public final void mo453d(iwg iwg) {
        this.f10888a.mo3557a(new bhj(iwg));
        bli.m863a(bho.f10885a, "onConfigured");
    }

    /* renamed from: e */
    public final void mo454e(iwg iwg) {
        bli.m863a(bho.f10885a, "onReady");
    }

    /* renamed from: a */
    public final void mo450a(iwg iwg, Surface surface) {
        bli.m863a(bho.f10885a, "onSurfacePrepared");
    }
}
