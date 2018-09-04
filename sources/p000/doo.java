package p000;

import android.annotation.TargetApi;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: doo */
public final class doo implements don {
    /* renamed from: a */
    private static final String f13641a = bli.m862a("McdlOneCameraOpnr");
    /* renamed from: b */
    private final fhc f13642b;
    /* renamed from: c */
    private final fbn f13643c;
    /* renamed from: d */
    private final irh f13644d;
    /* renamed from: e */
    private final ird f13645e;
    /* renamed from: f */
    private final ise f13646f;

    doo(ise ise, fhc fhc, fbn fbn, irh irh, ird ird) {
        this.f13646f = ise;
        this.f13642b = fhc;
        this.f13643c = fbn;
        this.f13644d = irh;
        this.f13645e = ird;
    }

    /* renamed from: a */
    public final fbj mo1165a(iur iur, iqo iqo, dof dof, fxg fxg, doz doz) {
        String str = f13641a;
        String valueOf = String.valueOf(iur);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Opening Camera: ");
        stringBuilder.append(valueOf);
        bli.m869c(str, stringBuilder.toString());
        this.f13645e.mo1903a("OneCamera#open");
        this.f13645e.mo1903a("CameraDevice#future");
        Object b = this.f13646f.m4140b();
        b.mo1879a(iqo);
        Object irg = new irg(iur, b);
        CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession = (CameraDeviceInstrumentationSession) Instrumentation.instance().cameraDevice().create();
        kow.m13622a(irg.f18518a, new dop(cameraDeviceInstrumentationSession), kpq.f8410a);
        cameraDeviceInstrumentationSession.m8424b();
        this.f13644d.m4080a(iur, irg);
        this.f13645e.mo1904b();
        this.f13645e.mo1903a("OneCharacteristics#get");
        ffc b2 = this.f13643c.m10176b(iur);
        this.f13645e.mo1904b();
        this.f13645e.mo1903a("OneCamera#select");
        dox a = doz.mo1166a(irg.f18518a, b2, dof, this.f13642b, fxg, cameraDeviceInstrumentationSession);
        this.f13645e.mo1904b();
        fbj fbj = (fbj) b.mo1879a(a.mo1167a());
        this.f13645e.mo1904b();
        return fbj;
    }
}
