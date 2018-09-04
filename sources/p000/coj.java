package p000;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: coj */
final class coj implements kaw {
    /* renamed from: a */
    private final File f12217a;
    /* renamed from: b */
    private final bdb f12218b;
    /* renamed from: c */
    private final kbg f12219c;

    coj(File file, bdb bdb, kbg kbg, cny cny) {
        jri.m13152b((Object) file);
        jri.m13152b((Object) bdb);
        jri.m13152b((Object) kbg);
        jri.m13152b((Object) cny);
        this.f12217a = file;
        this.f12218b = bdb;
        this.f12219c = kbg;
    }

    /* renamed from: a */
    private final kah m8370a(foz foz) {
        jri.m13152b((Object) foz);
        try {
            byte[] bArr = foz.f4653b;
            File file = this.f12217a;
            ExifInterface exifInterface = foz.f4655d;
            OutputStream fileOutputStream = new FileOutputStream(file);
            kbg kbg = this.f12219c;
            if (kbg.mo2084b()) {
                itg itg = new itg(exifInterface);
                itg.m4200a((Location) kbg.mo2081a());
                exifInterface = itg.f7455a;
            }
            bdf.m801b(bArr, exifInterface.m8481a(fileOutputStream), this.f12218b.f1079a);
            try {
                return jqk.m13089a(new kab(jqk.m13097b(cny.m1205a(this.f12217a))));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable e2) {
            kqg.f8420a.mo2210b(e2);
            throw new RuntimeException(e2);
        }
    }
}
