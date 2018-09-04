package p000;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: iup */
final class iup implements iuo {
    /* renamed from: a */
    private final Object f18592a = new Object();
    /* renamed from: b */
    private final CameraManager f18593b;
    /* renamed from: c */
    private final iui f18594c;
    /* renamed from: d */
    private final iqz f18595d;
    /* renamed from: e */
    private List f18596e;

    public iup(CameraManager cameraManager, iui iui, iqz iqz) {
        this.f18593b = cameraManager;
        this.f18594c = iui;
        this.f18595d = iqz.mo512a("CameraHWManager");
    }

    /* renamed from: a */
    public final boolean mo1345a() {
        for (iur iur : mo1344a(iut.BACK)) {
            if (iur.f7481a != null) {
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(iur.m4255a(), cameraInfo);
                if (!cameraInfo.canDisableShutterSound) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final List mo1347b() {
        return m12500e();
    }

    /* renamed from: a */
    public final List mo1344a(iut iut) {
        List arrayList = new ArrayList();
        for (iur iur : m12500e()) {
            if (this.f18594c.m4211a(iur).mo1921c() == iut) {
                arrayList.add(iur);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final iur mo1348c() {
        List e = m12500e();
        if (!e.isEmpty()) {
            return (iur) e.get(0);
        }
        this.f18595d.mo520f("No camera's found on this device!");
        return null;
    }

    /* renamed from: b */
    public final iur mo1346b(iut iut) {
        for (iur iur : m12500e()) {
            if (this.f18594c.m4211a(iur).mo1921c() == iut) {
                return iur;
            }
        }
        iqz iqz = this.f18595d;
        String a = iut.m4257a(iut);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 32);
        stringBuilder.append("No ");
        stringBuilder.append(a);
        stringBuilder.append(" camera found on this device!");
        iqz.mo520f(stringBuilder.toString());
        return null;
    }

    /* renamed from: a */
    public final iun mo1343a(iur iur) {
        return this.f18594c.m4211a(iur);
    }

    /* renamed from: e */
    private final List m12500e() {
        synchronized (this.f18592a) {
            List list = this.f18596e;
            if (list == null || list.isEmpty()) {
                try {
                    Object cameraIdList = this.f18593b.getCameraIdList();
                    jri.m13152b(cameraIdList);
                    Collection arrayList = new ArrayList(r4);
                    for (String a : cameraIdList) {
                        arrayList.add(iur.m4253a(a));
                    }
                    this.f18596e = ken.m13458a(arrayList);
                } catch (Throwable e) {
                    throw new IllegalStateException("Unable to read camera list.", e);
                }
            }
        }
        return this.f18596e;
    }

    /* renamed from: c */
    public final boolean mo1349c(iut iut) {
        for (iur a : m12500e()) {
            if (this.f18594c.m4211a(a).mo1921c() == iut) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo1350d() {
        for (iur a : m12500e()) {
            if (this.f18594c.m4211a(a).mo1943y()) {
                return true;
            }
        }
        return false;
    }
}
