package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bhp */
final /* synthetic */ class bhp implements Runnable {
    /* renamed from: a */
    private final bho f1153a;
    /* renamed from: b */
    private final Surface f1154b;
    /* renamed from: c */
    private final Surface f1155c;
    /* renamed from: d */
    private final kbg f1156d;
    /* renamed from: e */
    private final kpw f1157e;
    /* renamed from: f */
    private final kbg f1158f;

    bhp(bho bho, Surface surface, Surface surface2, kbg kbg, kpw kpw, kbg kbg2) {
        this.f1153a = bho;
        this.f1154b = surface;
        this.f1155c = surface2;
        this.f1156d = kbg;
        this.f1157e = kpw;
        this.f1158f = kbg2;
    }

    public final void run() {
        bho bho = this.f1153a;
        Surface surface = this.f1154b;
        Surface surface2 = this.f1155c;
        kbg kbg = this.f1156d;
        knk knk = this.f1157e;
        kbg kbg2 = this.f1158f;
        bli.m863a(bho.f10885a, "Execute CameraCaptureSession-creation task on camera handler thread.");
        List arrayList = new ArrayList();
        arrayList.add(surface);
        arrayList.add(surface2);
        if (kbg.mo2084b()) {
            arrayList.add((Surface) kbg.mo2081a());
        }
        iwi bhq = new bhq(knk);
        try {
            if (kbg2.mo2084b()) {
                iwv iwv = new iwv((byte) 0);
                iwv.f7521a = Integer.valueOf(0);
                iwv.f7522b = arrayList;
                Executor executor = bho.f10887c;
                if (executor == null) {
                    throw new NullPointerException("Null executor");
                }
                iwv.f7523c = executor;
                iwv.f7524d = bhq;
                iwo iwo = (iwo) kbg2.mo2081a();
                if (iwo == null) {
                    throw new NullPointerException("Null sessionParameters");
                }
                iwv.f7525e = iwo;
                bho.f10886b.mo2989a(iwv.m4301a());
                return;
            }
            bho.f10886b.mo2990a(arrayList, bhq, null);
        } catch (Throwable e) {
            bli.m867b(bho.f10885a, "CameraDeviceProxy has been closed. (ResourceUnavailableException)", e);
            knk.m17780a(e);
        }
    }
}
