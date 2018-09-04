package p000;

import android.view.Surface;

/* renamed from: dio */
final /* synthetic */ class dio implements iju {
    /* renamed from: a */
    private final din f13416a;

    dio(din din) {
        this.f13416a = din;
    }

    /* renamed from: a */
    public final kpk mo368a(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        din din = this.f13416a;
        iwl iwl = (iwl) obj;
        Surface surface = (Surface) obj2;
        bli.m869c(din.f21031a, "Viewfinder#swapAndStartSurfaceViewViewfinder onSuccess.");
        bli.m869c(din.f21031a, "Call CamcorderDevice#createCaptureSession.");
        ffc ffc = din.f21054b.f1113a;
        iqt ilb = new ilb(ffc.mo1932n());
        ilp fze = new fze(din.f21056d, ffc);
        boolean a = din.f21075w.m1642a(din.f21076x, din.f21077y, din.f21034C.f13496a);
        String str = din.f21031a;
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("Torch Enabled: ");
        stringBuilder.append(a);
        bli.m869c(str, stringBuilder.toString());
        if (ffc.mo1911A()) {
            a = din.f21075w.m1644b();
        } else {
            a = false;
        }
        str = din.f21031a;
        stringBuilder = new StringBuilder(34);
        stringBuilder.append("Video Stabilization Enabled: ");
        stringBuilder.append(a);
        bli.m869c(str, stringBuilder.toString());
        if (!din.f21032A.m3195c()) {
            z = false;
        } else if (din.f21076x != inc.FPS_30) {
            z = false;
        } else if (din.f21077y != ine.RES_2160P) {
            z = true;
        } else {
            z = false;
        }
        if (!din.f21032A.m3194b()) {
            z2 = false;
        } else if (din.f21060h == iut.FRONT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (din.f21032A.m3195c()) {
            z2 = true;
        } else if (din.f21032A.m3196d()) {
            z2 = true;
        }
        hjf hjf = din.f21032A;
        ivy ivy = hjf.f6267b;
        if (ivy.f7508d) {
            z3 = true;
        } else if (ivy.f7509e) {
            z3 = true;
        } else if (hjf.m3195c()) {
            z3 = true;
        } else if (din.f21032A.m3196d()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (din.f21076x.m3876d()) {
            z3 = false;
        }
        if (!din.f21032A.m3194b() && !din.f21032A.m3195c() && !din.f21032A.m3196d()) {
            z4 = false;
        } else if (din.f21060h == iut.BACK) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean d = din.f21075w.m1647d();
        if (!din.f21032A.m3195c() && !din.f21032A.m3196d()) {
            z5 = false;
        } else if (din.f21032A.f6268c.f7503d) {
            z5 = true;
        } else {
            z5 = false;
        }
        imw a2 = imw.m3846h().m3855a(z5).m3856b(z3).m3858d(z4).m3857c(z2).m3859e(a).m3861g(d).m3860f(z).m3854a();
        bfe bfe = din.f21055c;
        fbr fbr = din.f21033B;
        ilp ilp = fbr.f4463b;
        ilp ilp2 = din.f21036E.f23177a;
        return bfe.mo2679a(iwl, ilp, ilp2, fze, din.f21066n.f13500b, ilb, surface, ffc, ilp, fbr.f4462a, din.f21035D, ilp2, din.f21056d, din.f21037F, a2, din.f21039H);
    }
}
