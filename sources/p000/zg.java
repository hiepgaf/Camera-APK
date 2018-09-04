package p000;

import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;

/* compiled from: PG */
/* renamed from: zg */
final class zg {
    /* renamed from: a */
    public final ShutterCallback f9573a;
    /* renamed from: b */
    public final PictureCallback f9574b;
    /* renamed from: c */
    public final PictureCallback f9575c;
    /* renamed from: d */
    public final PictureCallback f9576d;

    zg(ShutterCallback shutterCallback, PictureCallback pictureCallback, PictureCallback pictureCallback2, PictureCallback pictureCallback3) {
        this.f9573a = shutterCallback;
        this.f9574b = pictureCallback;
        this.f9575c = pictureCallback2;
        this.f9576d = pictureCallback3;
    }
}
