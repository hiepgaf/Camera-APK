package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: hju */
public final class hju {
    /* renamed from: a */
    public static final bsc f6280a = new bsc("camera.debug_hw_ver");
    /* renamed from: b */
    private final hjf f6281b;

    public hju(hjf hjf, bsn bsn) {
        this.f6281b = hjf;
    }

    /* renamed from: a */
    public final void m3211a(ExifInterface exifInterface) {
        int i = ExifInterface.f12391c;
        exifInterface.f12416P.m4152a(ExifInterface.m8476g(i), exifInterface.m8490d(i));
        if (this.f6281b.m3196d()) {
            exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12393e, (Object) "QCAM-AA"));
            exifInterface.m8480a(exifInterface.m8479a(ExifInterface.f12392d, (Object) "QCAM-AA"));
        }
    }
}
