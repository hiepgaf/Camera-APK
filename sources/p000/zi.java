package p000;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: zi */
final class zi implements PictureCallback {
    /* renamed from: a */
    public final aaf f9579a;
    /* renamed from: b */
    private final Handler f9580b;

    private zi(Handler handler, aaf aaf) {
        this.f9580b = handler;
        this.f9579a = aaf;
    }

    /* renamed from: a */
    public static zi m6254a(Handler handler, aah aah, aaf aaf) {
        if (handler == null || aah == null || aaf == null) {
            return null;
        }
        return new zi(handler, aaf);
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.f9580b.post(new zj(this, bArr));
    }
}
