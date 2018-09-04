package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: cgx */
final class cgx implements abn {
    /* renamed from: a */
    private final /* synthetic */ cgu f11930a;

    cgx(cgu cgu) {
        this.f11930a = cgu;
    }

    /* renamed from: a */
    public final void mo5a(int i) {
        bli.m873e(cgu.f11914a, "CameraExceptionHandler: onCameraError");
        Iterator it = this.f11930a.f11924k.iterator();
        while (it.hasNext()) {
            ((abi) it.next()).mo2578a(i);
        }
    }

    /* renamed from: a */
    public final void mo7a(RuntimeException runtimeException, String str, int i, int i2) {
        bli.m873e(cgu.f11914a, "CameraExceptionHandler: onCameraException");
        Iterator it = this.f11930a.f11924k.iterator();
        while (it.hasNext()) {
            ((abi) it.next()).mo2580a(runtimeException, str, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo6a(RuntimeException runtimeException) {
        bli.m873e(cgu.f11914a, "CameraExceptionHandler: onDispatchThreadException");
        Iterator it = this.f11930a.f11924k.iterator();
        while (it.hasNext()) {
            ((abi) it.next()).mo2579a(runtimeException);
        }
    }
}
