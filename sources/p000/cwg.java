package p000;

/* compiled from: PG */
/* renamed from: cwg */
public final class cwg implements cvz {
    /* renamed from: a */
    private static final String f12701a = bli.m862a("SimpleModuleAgent");
    /* renamed from: b */
    private final cwa f12702b;
    /* renamed from: c */
    private final kwk f12703c;

    public cwg(cwa cwa, kwk kwk) {
        this.f12702b = cwa;
        this.f12703c = kwk;
    }

    /* renamed from: a */
    public final kpk mo1105a() {
        String str = f12701a;
        String valueOf = String.valueOf(this.f12702b.f2813b);
        String str2 = "Creating module: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m869c(str, valueOf);
        return (kpk) this.f12703c.mo345a();
    }

    /* renamed from: b */
    public final cwa mo1106b() {
        return this.f12702b;
    }
}
