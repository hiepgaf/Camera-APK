package p000;

import java.util.Arrays;

/* renamed from: ibw */
public final class ibw extends ibm implements Cloneable {
    /* renamed from: a */
    public long f21677a;
    /* renamed from: b */
    public long f21678b;
    /* renamed from: c */
    public byte[] f21679c;
    /* renamed from: d */
    public long f21680d;
    /* renamed from: e */
    public byte[] f21681e;
    /* renamed from: f */
    private String f21682f;
    /* renamed from: g */
    private ibx[] f21683g;
    /* renamed from: h */
    private byte[] f21684h;
    /* renamed from: i */
    private ibu f21685i;
    /* renamed from: j */
    private String f21686j;
    /* renamed from: k */
    private String f21687k;
    /* renamed from: l */
    private ibt f21688l;
    /* renamed from: m */
    private String f21689m;
    /* renamed from: n */
    private ibv f21690n;
    /* renamed from: q */
    private String f21691q;
    /* renamed from: r */
    private int[] f21692r;
    /* renamed from: s */
    private iby f21693s;

    public ibw() {
        this.f21677a = 0;
        this.f21678b = 0;
        this.f21682f = "";
        this.f21683g = ibx.m16002b();
        this.f21684h = ibs.f6918f;
        this.f21685i = null;
        this.f21679c = ibs.f6918f;
        this.f21686j = "";
        this.f21687k = "";
        this.f21688l = null;
        this.f21689m = "";
        this.f21680d = 180000;
        this.f21690n = null;
        this.f21681e = ibs.f6918f;
        this.f21691q = "";
        this.f21692r = ibs.f6913a;
        this.f21693s = null;
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    private final ibw m15997b() {
        try {
            ibw ibw = (ibw) super.mo3121c();
            ibx[] ibxArr = this.f21683g;
            if (ibxArr != null) {
                int length = ibxArr.length;
                if (length > 0) {
                    ibw.f21683g = new ibx[length];
                    int i = 0;
                    while (true) {
                        ibxArr = this.f21683g;
                        if (i >= ibxArr.length) {
                            break;
                        }
                        ibx ibx = ibxArr[i];
                        if (ibx != null) {
                            ibw.f21683g[i] = (ibx) ibx.clone();
                        }
                        i++;
                    }
                }
            }
            ibu ibu = this.f21685i;
            if (ibu != null) {
                ibw.f21685i = (ibu) ibu.clone();
            }
            ibt ibt = this.f21688l;
            if (ibt != null) {
                ibw.f21688l = (ibt) ibt.clone();
            }
            ibv ibv = this.f21690n;
            if (ibv != null) {
                ibw.f21690n = (ibv) ibv.clone();
            }
            Object obj = this.f21692r;
            if (obj != null && obj.length > 0) {
                ibw.f21692r = (int[]) obj.clone();
            }
            iby iby = this.f21693s;
            if (iby != null) {
                ibw.f21693s = (iby) iby.clone();
            }
            return ibw;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo3121c() {
        return (ibw) clone();
    }

    public final /* synthetic */ Object clone() {
        return m15997b();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo1803d() {
        return (ibw) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibw)) {
            return false;
        }
        ibw ibw = (ibw) obj;
        if (this.f21677a != ibw.f21677a || this.f21678b != ibw.f21678b) {
            return false;
        }
        String str = this.f21682f;
        if (str != null) {
            if (!str.equals(ibw.f21682f)) {
                return false;
            }
        } else if (ibw.f21682f != null) {
            return false;
        }
        if (!ibq.m3654a(this.f21683g, ibw.f21683g) || !Arrays.equals(this.f21684h, ibw.f21684h)) {
            return false;
        }
        ibu ibu = this.f21685i;
        if (ibu != null) {
            if (!ibu.equals(ibw.f21685i)) {
                return false;
            }
        } else if (ibw.f21685i != null) {
            return false;
        }
        if (!Arrays.equals(this.f21679c, ibw.f21679c)) {
            return false;
        }
        str = this.f21686j;
        if (str != null) {
            if (!str.equals(ibw.f21686j)) {
                return false;
            }
        } else if (ibw.f21686j != null) {
            return false;
        }
        str = this.f21687k;
        if (str != null) {
            if (!str.equals(ibw.f21687k)) {
                return false;
            }
        } else if (ibw.f21687k != null) {
            return false;
        }
        ibt ibt = this.f21688l;
        if (ibt != null) {
            if (!ibt.equals(ibw.f21688l)) {
                return false;
            }
        } else if (ibw.f21688l != null) {
            return false;
        }
        str = this.f21689m;
        if (str != null) {
            if (!str.equals(ibw.f21689m)) {
                return false;
            }
        } else if (ibw.f21689m != null) {
            return false;
        }
        if (this.f21680d != ibw.f21680d) {
            return false;
        }
        ibv ibv = this.f21690n;
        if (ibv != null) {
            if (!ibv.equals(ibw.f21690n)) {
                return false;
            }
        } else if (ibw.f21690n != null) {
            return false;
        }
        if (!Arrays.equals(this.f21681e, ibw.f21681e)) {
            return false;
        }
        str = this.f21691q;
        if (str != null) {
            if (!str.equals(ibw.f21691q)) {
                return false;
            }
        } else if (ibw.f21691q != null) {
            return false;
        }
        if (!ibq.m3652a(this.f21692r, ibw.f21692r)) {
            return false;
        }
        iby iby = this.f21693s;
        if (iby != null) {
            if (!iby.equals(ibw.f21693s)) {
                return false;
            }
        } else if (ibw.f21693s != null) {
            return false;
        }
        return (this.o == null || this.o.m3640a()) ? ibw.o == null || ibw.o.m3640a() : this.o.equals(ibw.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode();
        long j = this.f21677a;
        long j2 = this.f21678b;
        int i2 = ((((((hashCode + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) * 31;
        String str = this.f21682f;
        i2 = ((((((((((str != null ? str.hashCode() : 0) + i2) * 31) * 31) * 31) + 1237) * 31) + ibq.m3648a(this.f21683g)) * 31) + Arrays.hashCode(this.f21684h)) * 31;
        ibu ibu = this.f21685i;
        i2 = ((((ibu != null ? ibu.hashCode() : 0) + i2) * 31) + Arrays.hashCode(this.f21679c)) * 31;
        str = this.f21686j;
        i2 = ((str != null ? str.hashCode() : 0) + i2) * 31;
        str = this.f21687k;
        i2 = ((str != null ? str.hashCode() : 0) + i2) * 31;
        ibt ibt = this.f21688l;
        i2 = ((ibt != null ? ibt.hashCode() : 0) + i2) * 31;
        str = this.f21689m;
        hashCode = str != null ? str.hashCode() : 0;
        j2 = this.f21680d;
        i2 = (((hashCode + i2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        ibv ibv = this.f21690n;
        i2 = ((((ibv != null ? ibv.hashCode() : 0) + i2) * 31) + Arrays.hashCode(this.f21681e)) * 31;
        str = this.f21691q;
        i2 = ((((((str != null ? str.hashCode() : 0) + i2) * 31) * 31) + ibq.m3646a(this.f21692r)) * 31) * 31;
        iby iby = this.f21693s;
        hashCode = ((iby != null ? iby.hashCode() : 0) + i2) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int i;
        int i2 = 0;
        int a = super.mo1800a();
        long j = this.f21677a;
        if (j != 0) {
            a += ibl.m3623b(1, j);
        }
        String str = this.f21682f;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3625b(2, this.f21682f);
        }
        ibx[] ibxArr = this.f21683g;
        if (ibxArr != null && ibxArr.length > 0) {
            i = a;
            a = 0;
            while (true) {
                ibx[] ibxArr2 = this.f21683g;
                if (a >= ibxArr2.length) {
                    break;
                }
                ibr ibr = ibxArr2[a];
                if (ibr != null) {
                    i += ibl.m3624b(3, ibr);
                }
                a++;
            }
            a = i;
        }
        if (!Arrays.equals(this.f21684h, ibs.f6918f)) {
            a += ibl.m3626b(4, this.f21684h);
        }
        if (!Arrays.equals(this.f21679c, ibs.f6918f)) {
            a += ibl.m3626b(6, this.f21679c);
        }
        ibr ibr2 = this.f21688l;
        if (ibr2 != null) {
            a += ibl.m3624b(7, ibr2);
        }
        str = this.f21686j;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3625b(8, this.f21686j);
        }
        ibr2 = this.f21685i;
        if (ibr2 != null) {
            a += ibl.m3624b(9, ibr2);
        }
        str = this.f21687k;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3625b(13, this.f21687k);
        }
        str = this.f21689m;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3625b(14, this.f21689m);
        }
        j = this.f21680d;
        if (j != 180000) {
            a += ibl.m3628c(ibl.m3619a(j)) + ibl.m3627c(120);
        }
        ibr2 = this.f21690n;
        if (ibr2 != null) {
            a += ibl.m3624b(16, ibr2);
        }
        j = this.f21678b;
        if (j != 0) {
            a += ibl.m3623b(17, j);
        }
        i = !Arrays.equals(this.f21681e, ibs.f6918f) ? ibl.m3626b(18, this.f21681e) + a : a;
        int[] iArr = this.f21692r;
        if (iArr == null) {
            a = i;
        } else if (iArr.length > 0) {
            int length;
            a = 0;
            while (true) {
                int[] iArr2 = this.f21692r;
                length = iArr2.length;
                if (i2 >= length) {
                    break;
                }
                a += ibl.m3615a(iArr2[i2]);
                i2++;
            }
            a = (a + i) + (length + length);
        } else {
            a = i;
        }
        ibr ibr3 = this.f21693s;
        if (ibr3 != null) {
            a += ibl.m3624b(23, ibr3);
        }
        String str2 = this.f21691q;
        return (str2 == null || str2.equals("")) ? a : a + ibl.m3625b(24, this.f21691q);
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        int i = 0;
        long j = this.f21677a;
        if (j != 0) {
            ibl.m3633a(1, j);
        }
        String str = this.f21682f;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(2, this.f21682f);
        }
        ibx[] ibxArr = this.f21683g;
        if (ibxArr != null && ibxArr.length > 0) {
            int i2 = 0;
            while (true) {
                ibx[] ibxArr2 = this.f21683g;
                if (i2 >= ibxArr2.length) {
                    break;
                }
                ibr ibr = ibxArr2[i2];
                if (ibr != null) {
                    ibl.m3634a(3, ibr);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.f21684h, ibs.f6918f)) {
            ibl.m3636a(4, this.f21684h);
        }
        if (!Arrays.equals(this.f21679c, ibs.f6918f)) {
            ibl.m3636a(6, this.f21679c);
        }
        ibr ibr2 = this.f21688l;
        if (ibr2 != null) {
            ibl.m3634a(7, ibr2);
        }
        str = this.f21686j;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(8, this.f21686j);
        }
        ibr2 = this.f21685i;
        if (ibr2 != null) {
            ibl.m3634a(9, ibr2);
        }
        str = this.f21687k;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(13, this.f21687k);
        }
        str = this.f21689m;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(14, this.f21689m);
        }
        j = this.f21680d;
        if (j != 180000) {
            ibl.m3639c(15, 0);
            ibl.m3638b(ibl.m3619a(j));
        }
        ibr2 = this.f21690n;
        if (ibr2 != null) {
            ibl.m3634a(16, ibr2);
        }
        j = this.f21678b;
        if (j != 0) {
            ibl.m3633a(17, j);
        }
        if (!Arrays.equals(this.f21681e, ibs.f6918f)) {
            ibl.m3636a(18, this.f21681e);
        }
        int[] iArr = this.f21692r;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                iArr = this.f21692r;
                if (i >= iArr.length) {
                    break;
                }
                ibl.m3632a(20, iArr[i]);
                i++;
            }
        }
        ibr ibr3 = this.f21693s;
        if (ibr3 != null) {
            ibl.m3634a(23, ibr3);
        }
        String str2 = this.f21691q;
        if (!(str2 == null || str2.equals(""))) {
            ibl.m3635a(24, this.f21691q);
        }
        super.mo1801a(ibl);
    }
}
