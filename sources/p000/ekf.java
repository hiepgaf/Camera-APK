package p000;

import android.view.WindowManager;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekf */
final class ekf implements aaf {
    /* renamed from: a */
    public final /* synthetic */ ejy f15226a;

    ekf(ejy ejy) {
        this.f15226a = ejy;
    }

    /* renamed from: a */
    public final void mo1198a(byte[] bArr) {
        ejy ejy;
        emc emc;
        ejy ejy2 = this.f15226a;
        ejy2.f3744t = false;
        eje eje = ejy2.f3727c;
        WindowManager a = ejy2.f3742r.m1098a();
        ejy ejy3 = this.f15226a;
        if (eje.m1761a(a, ejy3.f3741q, ejy3.f3720L, false, 0) != null) {
            this.f15226a.m1826f();
            ejy = this.f15226a;
            ejy.f3746v = false;
            ejy.f3727c.f3657b.m7a(ejy.f3719K, new ekg(this));
        }
        ejy3 = this.f15226a;
        float[] a2 = eld.m1855a(ejy3.f3732h.m1858b());
        String str = new String();
        float f = 0.0f;
        for (int i = 0; i < 9; i++) {
            float f2 = a2[i];
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 16);
            stringBuilder.append(str);
            stringBuilder.append(f2);
            stringBuilder.append(" ");
            str = stringBuilder.toString();
            f += a2[i];
        }
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 16);
        stringBuilder2.append(str);
        stringBuilder2.append(f);
        stringBuilder2.append("\n");
        try {
            ejy3.f3740p.write(stringBuilder2.toString());
            ejy3.f3740p.flush();
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        ejy = this.f15226a;
        ejy.f3710B.post(new ekh(ejy, bArr));
        if (LightCycle.m1307f() == LightCycle.m1308g()) {
            ejy = this.f15226a;
            ejy.f3726b.f3798s = false;
            if (ejy.f3709A == null || LightCycle.m1308g() != 1) {
                emc = this.f15226a.f3750z;
                if (emc != null) {
                    emc.mo1141a(null);
                }
            } else {
                this.f15226a.f3709A.mo1141a(null);
            }
        }
        emc = this.f15226a.f3713E;
        if (emc != null) {
            emc.mo1141a(null);
        }
    }
}
