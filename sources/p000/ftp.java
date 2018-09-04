package p000;

import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ftp */
final class ftp {
    /* renamed from: a */
    private final String f4713a;

    ftp(String str) {
        this.f4713a = str;
    }

    /* renamed from: a */
    public final OutputStream m2385a(String str, String str2) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), this.f4713a);
        if (file.exists() || file.mkdirs()) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
            stringBuilder.append(str);
            stringBuilder.append(".");
            stringBuilder.append(str2);
            return new FileOutputStream(new File(file, stringBuilder.toString()));
        }
        throw new IOException("Unable to create or find media storage directory");
    }
}
