package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: glx */
public final class glx implements kwk {
    /* renamed from: a */
    private final kwk f17036a;
    /* renamed from: b */
    private final kwk f17037b;
    /* renamed from: c */
    private final kwk f17038c;

    public glx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17036a = kwk;
        this.f17037b = kwk2;
        this.f17038c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f17036a;
        kwk kwk2 = this.f17037b;
        kwk kwk3 = this.f17038c;
        kwk.mo345a();
        return (gln) ktm.m13963a(new glo((gnu) kwk3.mo345a(), new ikd(), new iya(), (irs) kwk2.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static kpk m11179a(get get, InputStream inputStream, int i, int i2, int i3, ExifInterface exifInterface) {
        return get.mo1479a(inputStream, new glz(new iqp(i, i2), ixx.JPEG).m2614a(exifInterface).m2615a(Integer.valueOf(i3)));
    }

    @Deprecated
    /* renamed from: a */
    public static kpk m11180a(get get, byte[] bArr, int i, int i2, int i3, ExifInterface exifInterface) {
        return glx.m11179a(get, new ByteArrayInputStream(bArr), i, i2, i3, exifInterface);
    }
}
