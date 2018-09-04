package p000;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gsm */
public final class gsm implements gsl {
    /* renamed from: a */
    private static final Object f17300a = new Object();

    gsm() {
    }

    /* renamed from: a */
    public final void mo1616a(File file) {
        kiz.m4969a(file);
    }

    /* renamed from: b */
    public final void mo1618b(File file) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo1618b(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        String valueOf = String.valueOf(file2.getAbsolutePath());
                        String str = "Failed to delete file: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            valueOf = str.concat(valueOf);
                        }
                        throw new IOException(valueOf);
                    }
                }
                file.delete();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo1619c(File file) {
        boolean z = true;
        synchronized (f17300a) {
            if (!(file.isDirectory() || file.mkdirs())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo1617a(File file, File file2) {
        if (!file.equals(file2) && !file.renameTo(file2)) {
            kiz.m4970a(file, file2);
        }
    }

    /* renamed from: d */
    public final byte[] mo1620d(File file) {
        return kiz.m4971b(file);
    }

    /* renamed from: e */
    public final void mo1621e(File file) {
        kiz.m4972c(file);
    }
}
