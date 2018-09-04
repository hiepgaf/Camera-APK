package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: acz */
final class acz {
    /* renamed from: a */
    public static final Charset f289a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    static void m145a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
        }
    }

    /* renamed from: a */
    static void m146a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String valueOf = String.valueOf(file);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("not a readable directory: ");
            stringBuilder.append(valueOf);
            throw new IOException(stringBuilder.toString());
        }
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            File file2 = listFiles[i];
            if (file2.isDirectory()) {
                acz.m146a(file2);
            }
            if (file2.delete()) {
                i++;
            } else {
                valueOf = String.valueOf(file2);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                stringBuilder.append("failed to delete file: ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            }
        }
    }
}
