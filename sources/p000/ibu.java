package p000;

/* renamed from: ibu */
public final class ibu extends ibm implements Cloneable {
    /* renamed from: a */
    private String f21672a;
    /* renamed from: b */
    private String f21673b;

    public ibu() {
        this.f21672a = "";
        this.f21673b = "";
        this.o = null;
        this.p = -1;
    }

    /* renamed from: b */
    private final ibu m15987b() {
        try {
            return (ibu) super.mo3121c();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo1800a() {
        int a = super.mo1800a();
        String str = this.f21672a;
        if (!(str == null || str.equals(""))) {
            a += ibl.m3625b(2, this.f21672a);
        }
        str = this.f21673b;
        return (str == null || str.equals("")) ? a : a + ibl.m3625b(3, this.f21673b);
    }

    /* renamed from: a */
    public final void mo1801a(ibl ibl) {
        String str = this.f21672a;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(2, this.f21672a);
        }
        str = this.f21673b;
        if (!(str == null || str.equals(""))) {
            ibl.m3635a(3, this.f21673b);
        }
        super.mo1801a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo3121c() {
        return (ibu) clone();
    }

    public final /* synthetic */ Object clone() {
        return m15987b();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo1803d() {
        return (ibu) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibu)) {
            return false;
        }
        ibu ibu = (ibu) obj;
        String str = this.f21672a;
        if (str != null) {
            if (!str.equals(ibu.f21672a)) {
                return false;
            }
        } else if (ibu.f21672a != null) {
            return false;
        }
        str = this.f21673b;
        if (str != null) {
            if (!str.equals(ibu.f21673b)) {
                return false;
            }
        } else if (ibu.f21673b != null) {
            return false;
        }
        return (this.o == null || this.o.m3640a()) ? ibu.o == null || ibu.o.m3640a() : this.o.equals(ibu.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) * 31;
        String str = this.f21672a;
        hashCode = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        str = this.f21673b;
        int hashCode2 = ((str != null ? str.hashCode() : 0) + hashCode) * 31;
        if (!(this.o == null || this.o.m3640a())) {
            i = this.o.hashCode();
        }
        return hashCode2 + i;
    }
}
