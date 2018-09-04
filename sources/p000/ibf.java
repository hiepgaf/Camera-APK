package p000;

/* renamed from: ibf */
public final class ibf extends ibm {
    /* renamed from: a */
    public ibg[] f21646a;

    public ibf() {
        this.f21646a = ibg.m15974b();
        this.o = null;
        this.p = -1;
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int a = super.mo1800a();
        ibg[] ibgArr = this.f21646a;
        if (ibgArr != null && ibgArr.length > 0) {
            int i = 0;
            while (true) {
                ibg[] ibgArr2 = this.f21646a;
                if (i >= ibgArr2.length) {
                    break;
                }
                ibr ibr = ibgArr2[i];
                if (ibr != null) {
                    a += ibl.m3624b(1, ibr);
                }
                i++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        ibg[] ibgArr = this.f21646a;
        if (ibgArr != null && ibgArr.length > 0) {
            int i = 0;
            while (true) {
                ibg[] ibgArr2 = this.f21646a;
                if (i >= ibgArr2.length) {
                    break;
                }
                ibr ibr = ibgArr2[i];
                if (ibr != null) {
                    ibl.m3634a(1, ibr);
                }
                i++;
            }
        }
        super.mo1801a(ibl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibf)) {
            return false;
        }
        ibf ibf = (ibf) obj;
        return ibq.m3654a(this.f21646a, ibf.f21646a) ? (this.o == null || this.o.m3640a()) ? ibf.o == null || ibf.o.m3640a() : this.o.equals(ibf.o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + ibq.m3648a(this.f21646a)) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return i + hashCode;
    }
}
