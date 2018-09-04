package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gml */
final class gml implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gmi f5439a;

    gml(gmi gmi) {
        this.f5439a = gmi;
    }

    public final void run() {
        if (this.f5439a.f23267b.m2654b()) {
            try {
                ExifInterface exifInterface;
                gmi gmi = this.f5439a;
                byte[] d = gmi.f23268c.mo1620d(gmi.f23267b.m2653a());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(d, 0, d.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                try {
                    exifInterface = new ExifInterface();
                    exifInterface.m8485a(d);
                } catch (IOException e) {
                    gmi gmi2 = this.f5439a;
                    String valueOf = String.valueOf(e.getMessage());
                    String str = "Could not read exif: ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    gmi2.m15783b(valueOf);
                    exifInterface = null;
                }
                this.f5439a.mo1479a(new ByteArrayInputStream(d), new glz(new iqp(i, i2), ixx.JPEG).m2614a(exifInterface).m2615a(Integer.valueOf(0)));
            } catch (IOException e2) {
            }
        }
    }
}
