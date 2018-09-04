package p000;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zk */
final class zk implements PreviewCallback {
    /* renamed from: a */
    public final aag f9583a;
    /* renamed from: b */
    public final aah f9584b;
    /* renamed from: c */
    private final Handler f9585c;

    private zk(Handler handler, aah aah, aag aag) {
        this.f9585c = handler;
        this.f9584b = aah;
        this.f9583a = aag;
    }

    /* renamed from: a */
    public static zk m6255a(Handler handler, aah aah, aag aag) {
        if (handler == null || aah == null || aag == null) {
            return null;
        }
        return new zk(handler, aah, aag);
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f9585c.post(new zl(this, bArr));
    }
}
