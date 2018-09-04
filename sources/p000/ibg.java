package p000;

/* renamed from: ibg */
public final class ibg extends ibm {
    /* renamed from: c */
    private static volatile ibg[] f21647c;
    /* renamed from: a */
    public String f21648a;
    /* renamed from: b */
    public ibh f21649b;

    public ibg() {
        this.f21648a = "";
        this.f21649b = null;
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    public static ibg[] m15974b() {
        if (f21647c == null) {
            synchronized (ibq.f6911a) {
                if (f21647c == null) {
                    f21647c = new ibg[0];
                }
            }
        }
        return f21647c;
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int a = super.mo1800a() + ibl.m3625b(1, this.f21648a);
        ibr ibr = this.f21649b;
        return ibr != null ? a + ibl.m3624b(2, ibr) : a;
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        ibl.m3635a(1, this.f21648a);
        ibr ibr = this.f21649b;
        if (ibr != null) {
            ibl.m3634a(2, ibr);
        }
        super.mo1801a(ibl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibg)) {
            return false;
        }
        ibg ibg = (ibg) obj;
        String str = this.f21648a;
        if (str != null) {
            if (!str.equals(ibg.f21648a)) {
                return false;
            }
        } else if (ibg.f21648a != null) {
            return false;
        }
        ibh ibh = this.f21649b;
        if (ibh != null) {
            if (!ibh.equals(ibg.f21649b)) {
                return false;
            }
        } else if (ibg.f21649b != null) {
            return false;
        }
        return (this.o == null || this.o.m3640a()) ? ibg.o == null || ibg.o.m3640a() : this.o.equals(ibg.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.f21648a;
        hashCode = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        ibh ibh = this.f21649b;
        int hashCode2 = ((ibh != null ? ibh.hashCode() : 0) + hashCode) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return hashCode2 + i;
    }
}
