package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: ddt */
final class ddt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ dds f3012a;

    ddt(dds dds) {
        this.f3012a = dds;
    }

    public final void run() {
        dak H = ((dbu) this.f3012a.f20948a.m991d()).mo2909H();
        H.m1572a(false);
        H.f2910f.m1335a();
        if (((dbm) this.f3012a.f20948a.f20928d.f10663a).mo2893c().mo2898d().f4780d.mo2860b() != fxj.OFF) {
            boolean z;
            int a = ((dbu) this.f3012a.f20948a.m991d()).mo2913L().mo1441a().m4041a();
            if (((dbm) this.f3012a.f20948a.f20928d.f10663a).mo2892b().mo1921c() == iut.FRONT) {
                z = true;
            } else {
                z = false;
            }
            kow.m13622a(kow.m13619a(new dal(H, a, z), H.f2907c), new dan(H), iel.m3714a());
        }
        ((dbm) this.f3012a.f20948a.f20928d.f10663a).mo2889a().mo1548a(R.raw.camera_shutter);
    }
}
