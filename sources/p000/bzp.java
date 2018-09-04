package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: bzp */
public final class bzp implements kov {
    /* renamed from: a */
    private final /* synthetic */ iwz f11545a;
    /* renamed from: b */
    private final /* synthetic */ ExifInterface f11546b;
    /* renamed from: c */
    private final /* synthetic */ fwa f11547c;
    /* renamed from: d */
    private final /* synthetic */ ikb f11548d;
    /* renamed from: e */
    private final /* synthetic */ kbn f11549e;
    /* renamed from: f */
    private final /* synthetic */ bzo f11550f;

    public bzp(bzo bzo, iwz iwz, ExifInterface exifInterface, fwa fwa, ikb ikb, kbn kbn) {
        this.f11550f = bzo;
        this.f11545a = iwz;
        this.f11546b = exifInterface;
        this.f11547c = fwa;
        this.f11548d = ikb;
        this.f11549e = kbn;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f11547c.f4754c.m2405a();
        this.f11547c.f4755d.close();
    }

    public final /* synthetic */ void b_(Object obj) {
        ExifInterface exifInterface;
        obj = (foz) obj;
        this.f11545a.close();
        String str = (String) jri.m13152b(this.f11546b.getTagStringValue(ExifInterface.TAG_SOFTWARE));
        if (str.charAt(str.length() - 1) != 'b') {
            exifInterface = this.f11546b;
            int i = ExifInterface.TAG_SOFTWARE;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 1);
            stringBuilder.append(str);
            stringBuilder.append('y');
            exifInterface.m8480a(exifInterface.m8479a(i, stringBuilder.toString()));
        }
        exifInterface = ((foz) jri.m13152b(obj)).f4655d;
        new itg(this.f11546b).m4199a((int) ((ite) jri.m13152b(exifInterface.m8491e(ExifInterface.f12389a))).m4187c(), (int) ((ite) jri.m13152b(exifInterface.m8491e(ExifInterface.f12390b))).m4187c(), isx.m4158a(isx.m4159a(exifInterface)), kau.f19138a);
        this.f11550f.m1081a(this.f11547c, this.f11548d, this.f11549e, obj.f4653b, obj.f4656e, obj.f4654c, this.f11546b);
    }
}
