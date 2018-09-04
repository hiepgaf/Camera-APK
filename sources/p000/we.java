package p000;

/* compiled from: PG */
/* renamed from: we */
public final class we {
    /* renamed from: a */
    public static wg f9447a = new wg();
    /* renamed from: b */
    private static wh f9448b = null;

    /* renamed from: a */
    public static wd m6118a() {
        return new wt();
    }

    /* renamed from: b */
    public static synchronized wh m6122b() {
        wh whVar;
        synchronized (we.class) {
            if (f9448b == null) {
                try {
                    f9448b = new wf();
                } catch (Throwable th) {
                    System.out.println(th);
                }
            }
            whVar = f9448b;
        }
        return whVar;
    }

    /* renamed from: a */
    public static wd m6120a(byte[] bArr) {
        return wv.m6176a((Object) bArr);
    }

    /* renamed from: a */
    public static wd m6119a(String str) {
        return wv.m6176a((Object) str);
    }

    /* renamed from: a */
    public static byte[] m6121a(wd wdVar, xk xkVar) {
        if (wdVar instanceof wt) {
            return tz.m5882a((wt) wdVar, xkVar);
        }
        throw new UnsupportedOperationException("The serializing service works onlywith the XMPMeta implementation of this library");
    }
}
