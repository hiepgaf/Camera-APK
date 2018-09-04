package p000;

import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;

/* compiled from: PG */
/* renamed from: dmn */
final class dmn implements iri {
    /* renamed from: a */
    private final /* synthetic */ CameraDeviceInstrumentationSession f13583a;
    /* renamed from: b */
    private final /* synthetic */ kpw f13584b;
    /* renamed from: c */
    private final /* synthetic */ dmf f13585c;

    dmn(dmf dmf, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession, kpw kpw) {
        this.f13585c = dmf;
        this.f13583a = cameraDeviceInstrumentationSession;
        this.f13584b = kpw;
    }

    /* renamed from: a */
    public final void mo1150a() {
        if (!this.f13584b.isDone()) {
            knk knk = this.f13584b;
            String valueOf = String.valueOf(this.f13585c.f21098e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.m17780a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: b */
    public final void mo1153b() {
        if (!this.f13584b.isDone()) {
            knk knk = this.f13584b;
            String valueOf = String.valueOf(this.f13585c.f21098e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.m17780a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: a */
    public final void mo1151a(int i) {
        String str = dmf.f21096c;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Camera fatal error: errorCode=");
        stringBuilder.append(i);
        bli.m866b(str, stringBuilder.toString());
        if (i == 4) {
            this.f13585c.f21104k.mo2960a();
        } else if (!this.f13584b.isDone()) {
            knk knk = this.f13584b;
            String valueOf = String.valueOf(this.f13585c.f21098e);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder2.append("Camera device ");
            stringBuilder2.append(valueOf);
            stringBuilder2.append(" has been disconnected.");
            knk.m17780a(new isr(stringBuilder2.toString()));
        }
    }

    /* renamed from: a */
    public final void mo1152a(iwl iwl) {
        this.f13583a.m8425c();
        this.f13584b.mo3557a(new dvm(iwl, this.f13583a));
    }
}
