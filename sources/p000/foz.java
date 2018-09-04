package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: foz */
public final class foz {
    /* renamed from: a */
    public final long f4652a;
    /* renamed from: b */
    public final byte[] f4653b;
    /* renamed from: c */
    public final int f4654c;
    /* renamed from: d */
    public final ExifInterface f4655d;
    /* renamed from: e */
    public final iqp f4656e;
    /* renamed from: f */
    public final boolean f4657f;

    private foz(long j, byte[] bArr, iqp iqp, int i, ExifInterface exifInterface, boolean z) {
        this.f4652a = j;
        this.f4653b = bArr;
        this.f4654c = i;
        this.f4656e = iqp;
        this.f4655d = exifInterface;
        this.f4657f = z;
    }

    /* renamed from: a */
    public static foz m2358a(long j, byte[] bArr, iqp iqp, int i, ExifInterface exifInterface, hju hju, boolean z) {
        if (hju != null) {
            hju.m3211a(exifInterface);
        }
        return new foz(j, bArr, iqp, i, exifInterface, z);
    }
}
