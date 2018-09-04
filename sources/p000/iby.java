package p000;

/* renamed from: iby */
public final class iby extends ibm implements Cloneable {
    /* renamed from: a */
    private int f21697a;

    public iby() {
        this.f21697a = -1;
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    private final iby m16008b() {
        try {
            return (iby) super.mo3121c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int a = super.mo1800a();
        int i = this.f21697a;
        return i != -1 ? a + ibl.m3622b(1, i) : a;
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        int i = this.f21697a;
        if (i != -1) {
            ibl.m3632a(1, i);
        }
        super.mo1801a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo3121c() {
        return (iby) clone();
    }

    public final /* synthetic */ Object clone() {
        return m16008b();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo1803d() {
        return (iby) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iby)) {
            return false;
        }
        iby iby = (iby) obj;
        return this.f21697a == iby.f21697a ? (this.o == null || this.o.m3640a()) ? iby.o == null || iby.o.m3640a() : this.o.equals(iby.o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f21697a) * 31) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return i + hashCode;
    }
}
