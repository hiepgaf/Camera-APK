package p000;

import android.app.KeyguardManager;

/* renamed from: gyn */
public final /* synthetic */ class gyn implements Runnable {
    /* renamed from: a */
    private final gyl f5810a;
    /* renamed from: b */
    private final kpw f5811b;

    public gyn(gyl gyl, kpw kpw) {
        this.f5810a = gyl;
        this.f5811b = kpw;
    }

    public final void run() {
        gyl gyl = this.f5810a;
        knk knk = this.f5811b;
        KeyguardManager keyguardManager = (KeyguardManager) gyl.f5804b.getSystemService("keyguard");
        if (keyguardManager.isKeyguardLocked()) {
            keyguardManager.requestDismissKeyguard(gyl.f5804b, new gyp(gyl, knk));
            return;
        }
        gyl.f5806d.launchLensActivity(gyl.f5804b);
        knk.mo3557a(Boolean.valueOf(true));
    }
}
