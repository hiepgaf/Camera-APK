package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;

/* compiled from: PG */
/* renamed from: brb */
final class brb implements Runnable {
    /* renamed from: a */
    private final gfw f1483a;
    /* renamed from: b */
    private final kpw f1484b;

    public brb(gfw gfw, kpw kpw) {
        this.f1483a = gfw;
        this.f1484b = kpw;
    }

    public final void run() {
        try {
            kpk kpk = this.f1483a.f5151d;
            if (kpk != null) {
                iwp iwp = (iwp) kpk.get();
                ixa ixa = (ixa) this.f1483a.f5149b.mo2718e().get(0);
                ixa ixa2 = (ixa) this.f1483a.f5149b.mo2718e().get(1);
                ixa ixa3 = (ixa) this.f1483a.f5149b.mo2718e().get(2);
                Face[] faceArr = (Face[]) iwp.mo3143a(CaptureResult.STATISTICS_FACES);
                Rect rect = (Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION);
                if (faceArr != null) {
                    int length = faceArr.length;
                    if (length > 0 && rect != null) {
                        Rect[] rectArr = new Rect[length];
                        for (int i = 0; i < faceArr.length; i++) {
                            Rect bounds = faceArr[i].getBounds();
                            rectArr[i] = new Rect(((bounds.left - rect.left) * this.f1483a.f5149b.mo2720g()) / rect.width(), ((bounds.top - rect.top) * this.f1483a.f5149b.mo2717d()) / rect.height(), ((bounds.right - rect.left) * this.f1483a.f5149b.mo2720g()) / rect.width(), ((bounds.bottom - rect.top) * this.f1483a.f5149b.mo2717d()) / rect.height());
                        }
                        byte[] nativeFaceBeautification = FaceBeautificationNative.nativeFaceBeautification(this.f1483a.f5149b.mo2716c(), this.f1483a.f5149b.mo2720g(), this.f1483a.f5149b.mo2717d(), ixa.mo637a(), ixa.mo638b(), ixa.mo639c(), ixa2.mo637a(), ixa2.mo638b(), ixa2.mo639c(), ixa3.mo637a(), ixa3.mo638b(), ixa3.mo639c(), rectArr);
                        grg grg = this.f1483a.f5152e;
                        if (grg != null) {
                            grg.mo1518a((kkc) kvl.mergeFrom(new kkc(), nativeFaceBeautification));
                        }
                    }
                }
            }
            this.f1484b.mo3557a(this.f1483a);
        } catch (Throwable th) {
            this.f1484b.m17780a(th);
        }
    }
}
