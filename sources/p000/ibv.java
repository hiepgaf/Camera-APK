package p000;

import java.util.Arrays;

/* renamed from: ibv */
public final class ibv extends ibm implements Cloneable {
    /* renamed from: a */
    private byte[] f21674a;
    /* renamed from: b */
    private String f21675b;
    /* renamed from: c */
    private byte[][] f21676c;

    public ibv() {
        this.f21674a = ibs.f6918f;
        this.f21675b = "";
        this.f21676c = ibs.f6917e;
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    private final ibv m15992b() {
        try {
            ibv ibv = (ibv) super.mo3121c();
            Object obj = this.f21676c;
            if (obj != null && obj.length > 0) {
                ibv.f21676c = (byte[][]) obj.clone();
            }
            return ibv;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int i = 0;
        int a = super.mo1800a();
        if (!Arrays.equals(this.f21674a, ibs.f6918f)) {
            a += ibl.m3626b(1, this.f21674a);
        }
        byte[][] bArr = this.f21676c;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f21676c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += ibl.m3618a(bArr3);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        String str = this.f21675b;
        return (str == null || str.equals("")) ? a : a + ibl.m3625b(4, this.f21675b);
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        if (!Arrays.equals(this.f21674a, ibs.f6918f)) {
            ibl.m3636a(1, this.f21674a);
        }
        byte[][] bArr = this.f21676c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f21676c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    ibl.m3636a(2, bArr3);
                }
                i++;
            }
        }
        String str = this.f21675b;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(4, this.f21675b);
        }
        super.mo1801a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo3121c() {
        return (ibv) clone();
    }

    public final /* synthetic */ Object clone() {
        return m15992b();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo1803d() {
        return (ibv) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibv)) {
            return false;
        }
        ibv ibv = (ibv) obj;
        if (!Arrays.equals(this.f21674a, ibv.f21674a)) {
            return false;
        }
        String str = this.f21675b;
        if (str != null) {
            if (!str.equals(ibv.f21675b)) {
                return false;
            }
        } else if (ibv.f21675b != null) {
            return false;
        }
        return ibq.m3655a(this.f21676c, ibv.f21676c) ? (this.o == null || this.o.m3640a()) ? ibv.o == null || ibv.o.m3640a() : this.o.equals(ibv.o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f21674a)) * 31;
        String str = this.f21675b;
        int hashCode2 = ((((((str != null ? str.hashCode() : 0) + hashCode) * 31) + ibq.m3649a(this.f21676c)) * 31) + 1237) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return hashCode2 + i;
    }
}
