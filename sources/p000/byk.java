package p000;

/* compiled from: PG */
/* renamed from: byk */
public final class byk implements gqd {
    /* renamed from: a */
    private static final String f11454a = bli.m862a("HdrPlusPrewarm");
    /* renamed from: b */
    private final kwk f11455b;
    /* renamed from: c */
    private final fhc f11456c;
    /* renamed from: d */
    private final ird f11457d;

    public byk(kwk kwk, fhc fhc, ird ird) {
        this.f11455b = kwk;
        this.f11456c = fhc;
        this.f11457d = ird;
    }

    public final void run() {
        Object obj = 1;
        if (this.f11456c.f4552a == go.av && this.f11456c.f4552a == go.av) {
            obj = null;
        }
        if (obj != null) {
            this.f11457d.mo1903a("HdrPlus#initialize");
            this.f11455b.mo345a();
            this.f11457d.mo1904b();
            return;
        }
        bli.m863a(f11454a, "HdrPlus is not supported on this device.");
    }
}
