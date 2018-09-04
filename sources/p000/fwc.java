package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: fwc */
public final class fwc {
    /* renamed from: a */
    public final byte[] f4756a;
    /* renamed from: b */
    public final iqp f4757b;
    /* renamed from: c */
    public final int f4758c;
    /* renamed from: d */
    public final ExifInterface f4759d;

    public fwc(byte[] bArr, iqp iqp, int i, ExifInterface exifInterface, hju hju) {
        this.f4756a = bArr;
        this.f4757b = iqp;
        this.f4758c = i;
        if (hju != null) {
            hju.m3211a(exifInterface);
        }
        this.f4759d = exifInterface;
    }
}
