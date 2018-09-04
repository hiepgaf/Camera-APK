package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.SizeF;

/* renamed from: bqw */
public final /* synthetic */ class bqw implements Runnable {
    /* renamed from: a */
    private final brm f1460a;
    /* renamed from: b */
    private final ffc f1461b;

    public bqw(brm brm, ffc ffc) {
        this.f1460a = brm;
        this.f1461b = ffc;
    }

    public final void run() {
        brm brm = this.f1460a;
        Rect rect = (Rect) this.f1461b.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null) {
            Log.w("faceMetadataDistributor", "Cannot set active size with null active array");
            return;
        }
        float f = (float) (rect.right - rect.left);
        float f2 = (float) (rect.bottom - rect.top);
        synchronized (brm) {
            brm.f11229a = kbg.m4745c(new SizeF(f, f2));
        }
    }
}
