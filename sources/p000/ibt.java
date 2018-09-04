package p000;

/* renamed from: ibt */
public final class ibt extends ibm implements Cloneable {
    /* renamed from: a */
    private String[] f21667a;
    /* renamed from: b */
    private String[] f21668b;
    /* renamed from: c */
    private int[] f21669c;
    /* renamed from: d */
    private long[] f21670d;
    /* renamed from: e */
    private long[] f21671e;

    public ibt() {
        this.f21667a = ibs.f6916d;
        this.f21668b = ibs.f6916d;
        this.f21669c = ibs.f6913a;
        this.f21670d = ibs.f6914b;
        this.f21671e = ibs.f6914b;
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    private final ibt m15982b() {
        try {
            ibt ibt = (ibt) super.mo3121c();
            Object obj = this.f21667a;
            if (obj != null && obj.length > 0) {
                ibt.f21667a = (String[]) obj.clone();
            }
            obj = this.f21668b;
            if (obj != null && obj.length > 0) {
                ibt.f21668b = (String[]) obj.clone();
            }
            obj = this.f21669c;
            if (obj != null && obj.length > 0) {
                ibt.f21669c = (int[]) obj.clone();
            }
            obj = this.f21670d;
            if (obj != null && obj.length > 0) {
                ibt.f21670d = (long[]) obj.clone();
            }
            obj = this.f21671e;
            if (obj != null && obj.length > 0) {
                ibt.f21671e = (long[]) obj.clone();
            }
            return ibt;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        int i;
        String[] strArr;
        String str;
        int i2 = 0;
        String[] strArr2 = this.f21667a;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.f21667a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    ibl.m3635a(1, str);
                }
                i++;
            }
        }
        strArr2 = this.f21668b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.f21668b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    ibl.m3635a(2, str);
                }
                i++;
            }
        }
        int[] iArr = this.f21669c;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            while (true) {
                int[] iArr2 = this.f21669c;
                if (i >= iArr2.length) {
                    break;
                }
                ibl.m3632a(3, iArr2[i]);
                i++;
            }
        }
        long[] jArr = this.f21670d;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            while (true) {
                long[] jArr2 = this.f21670d;
                if (i >= jArr2.length) {
                    break;
                }
                ibl.m3633a(4, jArr2[i]);
                i++;
            }
        }
        jArr = this.f21671e;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                jArr = this.f21671e;
                if (i2 >= jArr.length) {
                    break;
                }
                ibl.m3633a(5, jArr[i2]);
                i2++;
            }
        }
        super.mo1801a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo3121c() {
        return (ibt) clone();
    }

    public final /* synthetic */ Object clone() {
        return m15982b();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo1803d() {
        return (ibt) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibt)) {
            return false;
        }
        ibt ibt = (ibt) obj;
        return (ibq.m3654a(this.f21667a, ibt.f21667a) && ibq.m3654a(this.f21668b, ibt.f21668b) && ibq.m3652a(this.f21669c, ibt.f21669c) && ibq.m3653a(this.f21670d, ibt.f21670d) && ibq.m3653a(this.f21671e, ibt.f21671e)) ? (this.o == null || this.o.m3640a()) ? ibt.o == null || ibt.o.m3640a() : this.o.equals(ibt.o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + ibq.m3648a(this.f21667a)) * 31) + ibq.m3648a(this.f21668b)) * 31) + ibq.m3646a(this.f21669c)) * 31) + ibq.m3647a(this.f21670d)) * 31) + ibq.m3647a(this.f21671e)) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return i + hashCode;
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int i;
        int i2;
        int i3;
        String[] strArr;
        String str;
        int length;
        int i4 = 0;
        int a = super.mo1800a();
        String[] strArr2 = this.f21667a;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.f21667a;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += ibl.m3617a(str);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        strArr2 = this.f21668b;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.f21668b;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += ibl.m3617a(str);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        int[] iArr = this.f21669c;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            i2 = 0;
            while (true) {
                int[] iArr2 = this.f21669c;
                length = iArr2.length;
                if (i >= length) {
                    break;
                }
                i2 += ibl.m3615a(iArr2[i]);
                i++;
            }
            a = (a + i2) + length;
        }
        long[] jArr = this.f21670d;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            i2 = 0;
            while (true) {
                long[] jArr2 = this.f21670d;
                length = jArr2.length;
                if (i >= length) {
                    break;
                }
                i2 += ibl.m3628c(jArr2[i]);
                i++;
            }
            a = (a + i2) + length;
        }
        jArr = this.f21671e;
        if (jArr == null || jArr.length <= 0) {
            return a;
        }
        i = 0;
        while (true) {
            long[] jArr3 = this.f21671e;
            i3 = jArr3.length;
            if (i4 >= i3) {
                return (i + a) + i3;
            }
            i += ibl.m3628c(jArr3[i4]);
            i4++;
        }
    }
}
