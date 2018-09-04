package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: azn */
final class azn implements iqt {
    /* renamed from: a */
    private final /* synthetic */ CameraManager f10568a;
    /* renamed from: b */
    private final /* synthetic */ ayp f10569b;
    /* renamed from: c */
    private final /* synthetic */ azr f10570c;

    azn(CameraManager cameraManager, ayp ayp, azr azr) {
        this.f10568a = cameraManager;
        this.f10569b = ayp;
        this.f10570c = azr;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String a : this.f10568a.getCameraIdList()) {
                    arrayList.add(this.f10569b.m753a(iur.m4253a(a)));
                }
                azr azr = this.f10570c;
                azr.f1037a.f1040a.Reset();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((azp) obj2).mo348a(azr.f1037a.m760a());
                }
                bsn bsn = azr.f1038b;
            } catch (CameraAccessException e) {
            }
        }
    }
}
