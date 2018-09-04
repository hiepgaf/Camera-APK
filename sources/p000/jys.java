package p000;

/* compiled from: PG */
/* renamed from: jys */
final class jys implements jtv {
    /* renamed from: a */
    private final jtv f19120a;
    /* renamed from: b */
    private final String f19121b;
    /* renamed from: c */
    private final jyy f19122c;

    public jys(jtv jtv, String str, jyy jyy) {
        String valueOf;
        String str2;
        Object str3;
        this.f19120a = jtv;
        if (str != null) {
            valueOf = String.valueOf(str);
            str2 = "_";
            str3 = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
        } else {
            str3 = "";
        }
        str2 = String.valueOf(jtv.getClass().getSimpleName());
        valueOf = String.valueOf(str3);
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        this.f19121b = valueOf;
        this.f19122c = jyy;
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        jzf a = this.f19120a.mo2049a(j);
        this.f19122c.m13350a(this.f19121b, j, a.mo2076a());
        return a;
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
        this.f19120a.mo2051b(j);
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
        this.f19120a.mo2052c(j);
    }

    /* renamed from: a */
    public final void mo2050a() {
        this.f19120a.mo2050a();
    }

    public final String toString() {
        return this.f19120a.toString();
    }
}
