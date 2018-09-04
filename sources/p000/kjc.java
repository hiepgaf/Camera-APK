package p000;

import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: kjc */
final class kjc extends kiq {
    /* renamed from: a */
    private final File f19225a;

    kjc(File file) {
        this.f19225a = (File) jri.m13152b((Object) file);
    }

    /* renamed from: d */
    private final FileInputStream m13567d() {
        return new FileInputStream(this.f19225a);
    }

    /* renamed from: a */
    public final /* synthetic */ InputStream mo2183a() {
        return m13567d();
    }

    /* renamed from: b */
    public final byte[] mo2184b() {
        kiu a = kiu.m4965a();
        try {
            FileInputStream fileInputStream = (FileInputStream) a.m4966a(m13567d());
            byte[] toByteArray = ByteStreams.toByteArray(fileInputStream, fileInputStream.getChannel().size());
            a.close();
            return toByteArray;
        } catch (Throwable th) {
            a.close();
        }
    }

    /* renamed from: c */
    public final kbg mo2185c() {
        if (this.f19225a.isFile()) {
            return kbg.m4745c(Long.valueOf(this.f19225a.length()));
        }
        return kau.f19138a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19225a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("Files.asByteSource(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
