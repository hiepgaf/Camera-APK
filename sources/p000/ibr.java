package p000;

/* renamed from: ibr */
public class ibr {
    /* renamed from: p */
    public volatile int f6912p = -1;

    /* renamed from: a */
    public static final byte[] m3656a(ibr ibr) {
        byte[] bArr = new byte[ibr.m3660e()];
        try {
            ibl a = ibl.m3620a(bArr, bArr.length);
            ibr.mo1801a(a);
            if (a.f6903a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    protected int mo1800a() {
        return 0;
    }

    /* renamed from: a */
    public void mo1801a(ibl ibl) {
    }

    public /* synthetic */ Object clone() {
        return mo1803d();
    }

    /* renamed from: d */
    public ibr mo1803d() {
        return (ibr) super.clone();
    }

    /* renamed from: e */
    public final int m3660e() {
        int a = mo1800a();
        this.f6912p = a;
        return a;
    }

    public String toString() {
        return htl.m3402a(this);
    }
}
