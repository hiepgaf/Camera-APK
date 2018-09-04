package p000;

import android.opengl.Matrix;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekk */
final class ekk extends Thread {
    /* renamed from: a */
    private final /* synthetic */ eki f3806a;

    ekk(eki eki) {
        this.f3806a = eki;
    }

    public final void run() {
        eki eki;
        LightCycle.m1320s();
        this.f3806a.f3783d.m1843a();
        if (this.f3806a.f3762I.m1825e() == 0) {
            this.f3806a.f3783d.m1846b();
            if (this.f3806a.f3802w == go.al) {
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                this.f3806a.f3783d.m1845a(fArr);
            }
            eki = this.f3806a;
            eks eks = eki.f3787h;
            eks.f3830g = false;
            eks.f3831h = false;
            eks.f3829f = 0;
            eki.f3762I.f3717I.f3808b = -1.0d;
            eki.f3795p = true;
            if (!eki.f3805z) {
                eki.f3784e.m1324b(eki.f3754A);
            }
        }
        eki = this.f3806a;
        boolean z = eki.f3805z;
        if (z) {
            eki.f3784e.m1323a(z, eki.f3762I.f3739o);
        }
    }
}
