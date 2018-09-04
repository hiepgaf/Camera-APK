package p000;

/* renamed from: ibx */
public final class ibx extends ibm implements Cloneable {
    /* renamed from: a */
    private static volatile ibx[] f21694a;
    /* renamed from: b */
    private String f21695b;
    /* renamed from: c */
    private String f21696c;

    public ibx() {
        this.f21695b = "";
        this.f21696c = "";
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    public static ibx[] m16002b() {
        if (f21694a == null) {
            synchronized (ibq.f6911a) {
                if (f21694a == null) {
                    f21694a = new ibx[0];
                }
            }
        }
        return f21694a;
    }

    /* renamed from: f */
    private final ibx m16003f() {
        try {
            return (ibx) super.mo3121c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int a = super.mo1800a();
        String str = this.f21695b;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3625b(1, this.f21695b);
        }
        str = this.f21696c;
        return (str == null || str.equals("")) ? a : a + ibl.m3625b(2, this.f21696c);
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        String str = this.f21695b;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(1, this.f21695b);
        }
        str = this.f21696c;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(2, this.f21696c);
        }
        super.mo1801a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo3121c() {
        return (ibx) clone();
    }

    public final /* synthetic */ Object clone() {
        return m16003f();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo1803d() {
        return (ibx) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibx)) {
            return false;
        }
        ibx ibx = (ibx) obj;
        String str = this.f21695b;
        if (str != null) {
            if (!str.equals(ibx.f21695b)) {
                return false;
            }
        } else if (ibx.f21695b != null) {
            return false;
        }
        str = this.f21696c;
        if (str != null) {
            if (!str.equals(ibx.f21696c)) {
                return false;
            }
        } else if (ibx.f21696c != null) {
            return false;
        }
        return (this.o == null || this.o.m3640a()) ? ibx.o == null || ibx.o.m3640a() : this.o.equals(ibx.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.f21695b;
        hashCode = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        str = this.f21696c;
        int hashCode2 = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return hashCode2 + i;
    }
}
