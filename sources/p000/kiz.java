package p000;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: kiz */
public final class kiz {
    static {
        kja kja = new kja();
        kib kib = new kib();
    }

    /* renamed from: d */
    private static kiq m4973d(File file) {
        return new kjc(file);
    }

    /* renamed from: a */
    public static void m4969a(File file) {
        jri.m13152b((Object) file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                stringBuilder.append("Unable to create parent directories of ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m4970a(File file, File file2) {
        jri.m13152b((Object) file);
        jri.m13152b((Object) file2);
        jri.m13149a(file.equals(file2) ^ 1, "Source %s and destination %s must be different", (Object) file, (Object) file2);
        if (!file.renameTo(file2)) {
            jri.m13149a(file.equals(file2) ^ 1, "Source %s and destination %s must be different", (Object) file, (Object) file2);
            kiz.m4973d(file).m4960a(new kjb(file2, new kiy[0]));
            if (!file.delete()) {
                String valueOf;
                StringBuilder stringBuilder;
                if (file2.delete()) {
                    valueOf = String.valueOf(file);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    stringBuilder.append("Unable to delete ");
                    stringBuilder.append(valueOf);
                    throw new IOException(stringBuilder.toString());
                }
                valueOf = String.valueOf(file2);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                stringBuilder.append("Unable to delete ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: b */
    public static byte[] m4971b(File file) {
        return kiz.m4973d(file).mo2184b();
    }

    /* renamed from: c */
    public static void m4972c(File file) {
        jri.m13152b((Object) file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            String valueOf = String.valueOf(file);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("Unable to update modification time of ");
            stringBuilder.append(valueOf);
            throw new IOException(stringBuilder.toString());
        }
    }
}
