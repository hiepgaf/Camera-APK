package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: glh */
final class glh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ glf f5367a;

    glh(glf glf) {
        this.f5367a = glf;
    }

    public final void run() {
        if (this.f5367a.f21516b.m2654b()) {
            try {
                ExifInterface exifInterface;
                glf glf = this.f5367a;
                byte[] d = glf.f21517c.mo1620d(glf.f21516b.m2653a());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(d, 0, d.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                try {
                    exifInterface = new ExifInterface();
                    exifInterface.m8485a(d);
                } catch (IOException e) {
                    glf glf2 = this.f5367a;
                    String valueOf = String.valueOf(e.getMessage());
                    String str = "Could not read exif: ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    glf2.m15823b(valueOf);
                    exifInterface = null;
                }
                glx.m11179a(this.f5367a, new ByteArrayInputStream(d), i, i2, 0, exifInterface);
            } catch (IOException e2) {
            }
        }
    }
}
