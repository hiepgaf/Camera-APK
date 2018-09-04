package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ept */
public final class ept {
    /* renamed from: a */
    private static final Charset f4061a = Charset.forName("UTF-8");
    /* renamed from: b */
    private static ept f4062b;
    /* renamed from: c */
    private final MessageDigest f4063c;
    /* renamed from: d */
    private final Object f4064d = new Object();

    static {
        bli.m862a("FilenameHasher");
    }

    private ept(MessageDigest messageDigest) {
        this.f4063c = messageDigest;
    }

    /* renamed from: a */
    public static ept m1984a() {
        if (f4062b == null) {
            try {
                f4062b = new ept(MessageDigest.getInstance("SHA-1"));
            } catch (Throwable e) {
                throw new RuntimeException("Cannot initialize file name hasher", e);
            }
        }
        return f4062b;
    }

    /* renamed from: a */
    public final String m1986a(String str) {
        return m1985b(str).substring(0, 10);
    }

    /* renamed from: b */
    private final String m1985b(String str) {
        StringBuilder stringBuilder;
        synchronized (this.f4064d) {
            byte[] digest = this.f4063c.digest(str.getBytes(f4061a));
            stringBuilder = new StringBuilder();
            for (byte b : digest) {
                stringBuilder.append(Integer.toString((b & Illuminant.kOther) + 256, 16).substring(1));
            }
        }
        return stringBuilder.toString();
    }
}
