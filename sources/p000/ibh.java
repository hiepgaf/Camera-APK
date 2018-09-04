package p000;

/* renamed from: ibh */
public final class ibh extends ibm {
    /* renamed from: c */
    private static volatile ibh[] f21650c;
    /* renamed from: a */
    public int f21651a;
    /* renamed from: b */
    public ibi f21652b;

    public ibh() {
        this.f21651a = 1;
        this.f21652b = null;
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    public static ibh[] m15977b() {
        if (f21650c == null) {
            synchronized (ibq.f6911a) {
                if (f21650c == null) {
                    f21650c = new ibh[0];
                }
            }
        }
        return f21650c;
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int a = super.mo1800a() + ibl.m3622b(1, this.f21651a);
        ibr ibr = this.f21652b;
        return ibr != null ? a + ibl.m3624b(2, ibr) : a;
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        ibl.m3632a(1, this.f21651a);
        ibr ibr = this.f21652b;
        if (ibr != null) {
            ibl.m3634a(2, ibr);
        }
        super.mo1801a(ibl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibh)) {
            return false;
        }
        ibh ibh = (ibh) obj;
        if (this.f21651a != ibh.f21651a) {
            return false;
        }
        ibi ibi = this.f21652b;
        if (ibi != null) {
            if (!ibi.equals(ibh.f21652b)) {
                return false;
            }
        } else if (ibh.f21652b != null) {
            return false;
        }
        return (this.o == null || this.o.m3640a()) ? ibh.o == null || ibh.o.m3640a() : this.o.equals(ibh.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f21651a) * 31;
        ibi ibi = this.f21652b;
        int hashCode2 = ((ibi != null ? ibi.hashCode() : 0) + hashCode) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return hashCode2 + i;
    }
}
