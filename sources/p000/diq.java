package p000;

import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;

/* compiled from: PG */
/* renamed from: diq */
final class diq implements iri {
    /* renamed from: a */
    private final /* synthetic */ CameraDeviceInstrumentationSession f13417a;
    /* renamed from: b */
    private final /* synthetic */ kpw f13418b;
    /* renamed from: c */
    private final /* synthetic */ din f13419c;

    diq(din din, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession, kpw kpw) {
        this.f13419c = din;
        this.f13417a = cameraDeviceInstrumentationSession;
        this.f13418b = kpw;
    }

    /* renamed from: a */
    public final void mo1150a() {
        if (!this.f13418b.isDone()) {
            knk knk = this.f13418b;
            String valueOf = String.valueOf(this.f13419c.f21078z);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been closed.");
            knk.m17780a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: b */
    public final void mo1153b() {
        if (!this.f13418b.isDone()) {
            knk knk = this.f13418b;
            String valueOf = String.valueOf(this.f13419c.f21078z);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.m17780a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: a */
    public final void mo1151a(int i) {
        String str = din.f21031a;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Camera fatal error: errorCode=");
        stringBuilder.append(i);
        bli.m866b(str, stringBuilder.toString());
        if (i == 4) {
            this.f13419c.f21051T.mo2960a();
        } else if (!this.f13418b.isDone()) {
            this.f13418b.m17780a(new isg(i));
        }
    }

    /* renamed from: a */
    public final void mo1152a(iwl iwl) {
        this.f13417a.m8425c();
        this.f13418b.mo3557a(new dvm(iwl, this.f13417a));
    }
}
