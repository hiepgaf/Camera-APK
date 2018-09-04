package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* compiled from: PG */
/* renamed from: bau */
public final class bau implements eoc, eol, gqd {
    /* renamed from: a */
    private static final String f10622a = bli.m862a("CameraAssistant");
    /* renamed from: b */
    private static bsq f10623b = new bsq("camera.bind_assistant", true);
    /* renamed from: c */
    private boolean f10624c;
    /* renamed from: d */
    private final Context f10625d;
    /* renamed from: e */
    private final bsn f10626e;
    /* renamed from: f */
    private final enr f10627f;
    /* renamed from: g */
    private final ikd f10628g;
    /* renamed from: h */
    private ServiceConnection f10629h;

    public bau(Context context, bsn bsn, enr enr, ikd ikd) {
        this.f10625d = context;
        this.f10626e = bsn;
        this.f10627f = enr;
        this.f10628g = ikd;
    }

    /* renamed from: f */
    public final void mo378f() {
        if (this.f10624c) {
            this.f10625d.unbindService(this.f10629h);
            this.f10624c = false;
            bli.m869c(f10622a, "unbound photos service");
        }
    }

    public final void run() {
        if (!this.f10626e.m954a(f10623b)) {
            bli.m863a(f10622a, "binding disabled by flags");
        } else if (this.f10624c) {
            bli.m863a(f10622a, "already bound");
        } else {
            eio.m1756a(this.f10628g, this.f10627f, this);
            try {
                this.f10629h = new bav();
                Intent intent = new Intent();
                intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
                this.f10624c = this.f10625d.bindService(intent, this.f10629h, 5);
                String str = f10622a;
                boolean z = this.f10624c;
                StringBuilder stringBuilder = new StringBuilder(28);
                stringBuilder.append("bound photos service = ");
                stringBuilder.append(z);
                bli.m869c(str, stringBuilder.toString());
            } catch (Throwable e) {
                bli.m874e(f10622a, "Either Photos service does not exist or does not have permission to connect.", e);
            }
        }
    }
}
