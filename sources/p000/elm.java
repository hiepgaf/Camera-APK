package p000;

import android.preference.PreferenceManager;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: elm */
final class elm extends Thread {
    /* renamed from: a */
    private final /* synthetic */ eln f3933a;
    /* renamed from: b */
    private final /* synthetic */ elp f3934b;

    elm(eln eln, elp elp) {
        this.f3933a = eln;
        this.f3934b = elp;
    }

    public final void run() {
        ell.m9748a(this.f3933a);
        elp elp = this.f3934b;
        des des = elp.f3943b;
        if (des.f22800H) {
            float a = LightCycle.m1288a(elp.f3942a.f3937c);
            if (a > 0.0f) {
                bli.m863a(des.f22792c, "FOV Calibration Succeeded!");
                PreferenceManager.getDefaultSharedPreferences(elp.f3943b.f22830p.mo2748b()).edit().putFloat("photoSphereCalibratedFieldOfView", a).apply();
                return;
            }
            bli.m863a(des.f22792c, "FOV Calibration failed!");
            return;
        }
        gey gey = des.f22820f;
        eln eln = elp.f3942a;
        irs f = des.ag;
        des des2 = elp.f3943b;
        gey.mo1468a(new ekw(eln, f, des2.f22798F, des2.f22799G));
    }
}
