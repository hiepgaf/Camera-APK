package p000;

/* compiled from: PG */
/* renamed from: bxa */
public final class bxa implements kbn {
    /* renamed from: a */
    private final Object f11386a = new Object();
    /* renamed from: b */
    private final boolean f11387b;
    /* renamed from: c */
    private final fwa f11388c;
    /* renamed from: d */
    private fqv f11389d;
    /* renamed from: e */
    private final /* synthetic */ ccy f11390e;

    public bxa(ccy ccy, fwa fwa, boolean z) {
        this.f11390e = ccy;
        this.f11387b = z;
        this.f11388c = fwa;
    }

    /* renamed from: a */
    public final fqv m7836a() {
        fqv fqv;
        jri.m13154b(this.f11387b, (Object) "Started RAW session when not requested");
        jri.m13154b(this.f11390e.f11683e.mo2084b(), (Object) "Starting RAW session with no image saver");
        synchronized (this.f11386a) {
            if (this.f11389d == null) {
                this.f11389d = ((fqu) this.f11390e.f11683e.mo2081a()).m10673c(this.f11388c);
            }
            fqv = this.f11389d;
        }
        return fqv;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo605b() {
        return m7836a();
    }
}
