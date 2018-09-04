package p000;

/* compiled from: PG */
/* renamed from: fhb */
public final class fhb implements fha {
    /* renamed from: a */
    private final boolean f16010a;
    /* renamed from: b */
    private final boolean f16011b;
    /* renamed from: c */
    private final boolean f16012c;

    public fhb(aaz aaz, fhc fhc) {
        boolean z;
        boolean z2 = true;
        this.f16010a = aaz.m35a(abd.HDR);
        if (fhc.f4552a != go.av) {
            z = true;
        } else {
            z = false;
        }
        this.f16011b = z;
        if (!(aaz.m33a(abb.AUTO) || aaz.m33a(abb.ON))) {
            z2 = false;
        }
        this.f16012c = z2;
    }

    /* renamed from: a */
    public final boolean mo1125a() {
        return this.f16012c;
    }

    /* renamed from: b */
    public final boolean mo1126b() {
        return this.f16011b;
    }

    /* renamed from: c */
    public final boolean mo1127c() {
        return this.f16010a;
    }
}
