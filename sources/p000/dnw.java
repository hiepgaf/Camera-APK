package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: dnw */
final class dnw implements dob {
    /* renamed from: a */
    public final /* synthetic */ dnt f21149a;

    dnw(dnt dnt) {
        this.f21149a = dnt;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        bdy bdy = ((dlp) obj).f3129a;
        ((doa) this.f21149a.m991d()).f13610c.execute(new dnx(this));
        bbv bbv = new bbv("StSrtPrev", ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS);
        if (this.f21149a.f21142d.mo1936r() || this.f21149a.f21142d.mo1937s()) {
            asu asu = ((doa) this.f21149a.m991d()).f13598C;
            dnt dnt = this.f21149a;
            bdy.mo1879a(asu.mo354a(bdy, dnt.f21142d, dnt.f21144f.mo2681b(), kau.f19138a, ilq.m3818a(Boolean.valueOf(false))));
        }
        Context context = ((doa) this.f21149a.m991d()).f13611d;
        this.f21149a.m991d();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        bug bug = this.f21149a;
        ffc ffc = bug.f21142d;
        AudioManager audioManager = (AudioManager) cbu.m1099a(((doa) bug.m991d()).f13627t.f1837a, "audio");
        gpn gpn = ((doa) this.f21149a.m991d()).f13620m;
        hjf.m3193a();
        dkd dke = new dke(audioManager, gpn, notificationManager);
        hkc hkc = new hkc();
        dnt dnt2 = this.f21149a;
        return new dmo(bug, dke, bbv, bdy, dnt2.f21144f, dnt2.f21146h);
    }
}
