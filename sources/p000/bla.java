package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: bla */
public final class bla {
    /* renamed from: a */
    private final jxy f1258a = jxr.m4678a();

    /* renamed from: b */
    private static File m857b(File file) {
        File file2 = new File(file.getParentFile(), ".deletemarkers");
        file2.mkdir();
        try {
            new File(file2, ".nomedia").createNewFile();
        } catch (Throwable e) {
            Log.e("BurstMdCleanupHndlr", "Cannot create nomedia file", e);
        }
        return new File(file2, String.valueOf(file.getName()).concat(".deletemarker"));
    }

    /* renamed from: a */
    public final boolean m858a(File file) {
        int i = 0;
        if (!this.f1258a.mo2063b(file) && !this.f1258a.mo2066e(file)) {
            return false;
        }
        File parentFile = file.getParentFile();
        String valueOf;
        StringBuilder stringBuilder;
        if (parentFile == null) {
            valueOf = String.valueOf(parentFile);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
            stringBuilder.append("Directory ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" doesn't contain a parent");
            Log.e("BurstMdCleanupHndlr", stringBuilder.toString());
        } else {
            try {
                bla.m857b(file).createNewFile();
                File[] listFiles = parentFile.listFiles();
                if (listFiles == null) {
                    valueOf = String.valueOf(parentFile);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    stringBuilder.append("Couldn't list files in ");
                    stringBuilder.append(valueOf);
                    Log.e("BurstMdCleanupHndlr", stringBuilder.toString());
                } else {
                    for (File file2 : listFiles) {
                        if ((this.f1258a.mo2063b(file2) || this.f1258a.mo2066e(file2)) && !bla.m857b(file2).exists()) {
                            break;
                        }
                    }
                    File file3 = new File(parentFile, ".deletemarkers");
                    int length = listFiles.length;
                    while (i < length) {
                        File file4 = listFiles[i];
                        if (!(file4.equals(file3) || bla.m857b(file4).exists())) {
                            jqk.m13101b(file4);
                        }
                        i++;
                    }
                    jqk.m13101b(file3);
                }
            } catch (Throwable e) {
                Log.e("BurstMdCleanupHndlr", "Cannot create delete marker", e);
            }
        }
        return true;
    }
}
