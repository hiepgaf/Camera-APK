package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: caw */
public final class caw implements kov {
    /* renamed from: a */
    private final /* synthetic */ iwz f11576a;
    /* renamed from: b */
    private final /* synthetic */ ExifInterface f11577b;
    /* renamed from: c */
    private final /* synthetic */ String f11578c;
    /* renamed from: d */
    private final /* synthetic */ gdy f11579d;
    /* renamed from: e */
    private final /* synthetic */ hjo f11580e;
    /* renamed from: f */
    private final /* synthetic */ long f11581f;
    /* renamed from: g */
    private final /* synthetic */ gdv f11582g;

    public caw(gdv gdv, iwz iwz, ExifInterface exifInterface, String str, gdy gdy, hjo hjo, long j) {
        this.f11582g = gdv;
        this.f11576a = iwz;
        this.f11577b = exifInterface;
        this.f11578c = str;
        this.f11579d = gdy;
        this.f11580e = hjo;
        this.f11581f = j;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f11576a.close();
        this.f11580e.close();
        this.f11582g.f5100b.m16918a(this.f11581f);
    }

    public final /* synthetic */ void b_(Object obj) {
        foz foz = (foz) obj;
        this.f11576a.close();
        String tagStringValue = this.f11577b.getTagStringValue(ExifInterface.TAG_SOFTWARE);
        if (tagStringValue.charAt(tagStringValue.length() - 1) != 'b') {
            ExifInterface exifInterface = this.f11577b;
            int i = ExifInterface.TAG_SOFTWARE;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(tagStringValue).length() + 1);
            stringBuilder.append(tagStringValue);
            stringBuilder.append('y');
            exifInterface.m8480a(exifInterface.m8479a(i, stringBuilder.toString()));
        }
        ExifInterface exifInterface2 = foz.f4655d;
        new itg(this.f11577b).m4199a((int) exifInterface2.m8491e(ExifInterface.f12389a).m4187c(), (int) exifInterface2.m8491e(ExifInterface.f12390b).m4187c(), isx.m4158a(isx.m4159a(exifInterface2)), kau.f19138a);
        this.f11582g.f5100b.m16917a(foz, 100, false, this.f11578c, this.f11577b, this.f11579d);
        this.f11582g.f5100b.f22634j = true;
        this.f11580e.close();
        this.f11582g.f5100b.m16918a(this.f11581f);
    }
}
