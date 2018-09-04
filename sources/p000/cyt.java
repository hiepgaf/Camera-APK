package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cyt */
final class cyt extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ cyd f20826a;

    cyt(cyd cyd) {
        this.f20826a = cyd;
    }

    public final void onCameraSwitch(int i) {
        cyd cyd = this.f20826a;
        if (!cyd.f22732F) {
            boolean c = cyd.f22764o.m1697c();
            cyd.f22756g.mo1531a(cyd.f22758i.f2813b, "pref_camera_id_key", i);
            grd grd = (grd) cyd.f22742P.cameraChange().create();
            iqo iqo = cyd.f22743Q;
            if (iqo != null) {
                iqo.close();
                cyd.f22743Q = null;
            }
            boolean c2 = cyd.f22764o.m1697c();
            AtomicReference atomicReference = new AtomicReference();
            Long valueOf = Long.valueOf(System.nanoTime());
            cyd.f22748V.mo348a(Boolean.valueOf(false));
            atomicReference.set(ilq.m3823a(cyd.f22748V, new cyg(cyd, grd, c, c2, valueOf, atomicReference)));
            cyd.f22743Q = (iqo) atomicReference.get();
            cyd.f22767r.m4139a(cyd.f22743Q);
            czp czp = cyd.f22728B;
            if (czp != null) {
                czp.m8906a(c2 ^ 1);
            }
            String str = cyd.f22726c;
            StringBuilder stringBuilder = new StringBuilder(44);
            stringBuilder.append("Start to switch camera. cameraId=");
            stringBuilder.append(i);
            bli.m863a(str, stringBuilder.toString());
            cyd.m16980a(true, true);
        }
    }

    public final void onThumbnailButtonClicked() {
        this.f20826a.f22737K = true;
    }
}
