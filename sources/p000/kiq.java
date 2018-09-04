package p000;

import com.google.common.io.ByteStreams;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: kiq */
public abstract class kiq {
    protected kiq() {
    }

    /* renamed from: a */
    public abstract InputStream mo2183a();

    /* renamed from: a */
    public final long m4960a(kip kip) {
        jri.m13152b((Object) kip);
        kiu a = kiu.m4965a();
        try {
            long copy = ByteStreams.copy((InputStream) a.m4966a(mo2183a()), (OutputStream) a.m4966a(kip.mo2182a()));
            a.close();
            return copy;
        } catch (Throwable th) {
            a.close();
        }
    }

    /* renamed from: b */
    public byte[] mo2184b() {
        kiu a = kiu.m4965a();
        try {
            byte[] toByteArray;
            InputStream inputStream = (InputStream) a.m4966a(mo2183a());
            kbg c = mo2185c();
            if (c.mo2084b()) {
                toByteArray = ByteStreams.toByteArray(inputStream, ((Long) c.mo2081a()).longValue());
            } else {
                toByteArray = ByteStreams.toByteArray(inputStream);
            }
            a.close();
            return toByteArray;
        } catch (Throwable th) {
            a.close();
        }
    }

    /* renamed from: c */
    public kbg mo2185c() {
        return kau.f19138a;
    }
}
