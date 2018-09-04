package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

@TargetApi(9)
/* compiled from: PG */
/* renamed from: gnv */
public final class gnv implements gnu {
    /* renamed from: a */
    private static final String f17136a = bli.m862a("SesnStorageMgrImpl");
    /* renamed from: b */
    private final kbg f17137b;
    /* renamed from: c */
    private final kbg f17138c;
    /* renamed from: d */
    private final gsl f17139d;

    private gnv(File file, File file2, gsl gsl) {
        jri.m13152b((Object) gsl);
        this.f17137b = kbg.m4744b(file);
        this.f17138c = kbg.m4744b(file2);
        this.f17139d = gsl;
    }

    /* renamed from: a */
    private final void m11223a(File file) {
        File[] listFiles = file.listFiles(new gnw());
        if (listFiles != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (File file2 : listFiles) {
                String str = f17136a;
                String valueOf = String.valueOf(file2.getAbsolutePath());
                String str2 = "Check for potential clean-up: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m871d(str, valueOf);
                if (file2.lastModified() < -86400000 + currentTimeMillis) {
                    try {
                        this.f17139d.mo1618b(file2);
                    } catch (IOException e) {
                        str = f17136a;
                        valueOf = String.valueOf(file2.getAbsolutePath());
                        String str3 = "Could not clean up ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str3);
                        } else {
                            valueOf = str3.concat(valueOf);
                        }
                        bli.m873e(str, valueOf);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static gnu m11222a(Context context, gsl gsl) {
        File externalFilesDir;
        if (Environment.isExternalStorageEmulated()) {
            externalFilesDir = context.getExternalFilesDir(null);
        } else {
            externalFilesDir = context.getNoBackupFilesDir();
        }
        return new gnv(externalFilesDir, context.getExternalFilesDir(null), gsl);
    }

    /* renamed from: a */
    public final File mo1508a(String str, String str2) {
        File file = new File(new File(mo1507a(str), str2), String.valueOf(str2).concat(".jpg"));
        kiz.m4969a(file);
        if ((file.createNewFile() && file.canWrite()) || file.canWrite()) {
            return file;
        }
        throw new IOException("Temporary output file is not writeable.");
    }

    /* renamed from: a */
    public final File mo1507a(String str) {
        if (this.f17137b.mo2084b()) {
            File file = new File((File) this.f17137b.mo2081a(), str);
            String valueOf;
            StringBuilder stringBuilder;
            if (!this.f17139d.mo1619c(file)) {
                valueOf = String.valueOf(file);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Could not create session directory: ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            } else if (file.isDirectory()) {
                m11223a(file);
                m11223a(new File((File) this.f17138c.mo2081a(), str));
                return file;
            } else {
                valueOf = String.valueOf(file);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                stringBuilder.append("Session directory is not a directory: ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            }
        }
        throw new IOException("Could retrieve baseDirectory.");
    }
}
