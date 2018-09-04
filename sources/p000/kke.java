package p000;

/* compiled from: PG */
/* renamed from: kke */
public final class kke extends kvf {
    /* renamed from: h */
    private static volatile kke[] f22184h;
    /* renamed from: a */
    public long f22185a;
    /* renamed from: b */
    public long f22186b;
    /* renamed from: c */
    public long f22187c;
    /* renamed from: d */
    public int f22188d;
    /* renamed from: e */
    public int f22189e;
    /* renamed from: f */
    public int f22190f;
    /* renamed from: g */
    public int f22191g;

    public kke() {
        this.f22185a = 0;
        this.f22186b = 0;
        this.f22187c = 0;
        this.f22188d = 0;
        this.f22189e = 0;
        this.f22190f = 0;
        this.f22191g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22185a;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.f22186b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.f22187c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        int i = this.f22188d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        i = this.f22189e;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(5, i);
        }
        i = this.f22190f;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(6, i);
        }
        i = this.f22191g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(7, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static kke[] m16578a() {
        if (f22184h == null) {
            synchronized (kvj.f8655b) {
                if (f22184h == null) {
                    f22184h = new kke[0];
                }
            }
        }
        return f22184h;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22185a = kvc.m5411g();
                    continue;
                case 16:
                    this.f22186b = kvc.m5411g();
                    continue;
                case 24:
                    this.f22187c = kvc.m5411g();
                    continue;
                case 32:
                    this.f22188d = kvc.m5410f();
                    continue;
                case 40:
                    this.f22189e = kvc.m5410f();
                    continue;
                case 48:
                    this.f22190f = kvc.m5410f();
                    continue;
                case 56:
                    this.f22191g = kvc.m5410f();
                    continue;
                default:
                    if (!super.storeUnknownField(kvc, i)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void writeTo(kvd kvd) {
        long j = this.f22185a;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.f22186b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.f22187c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        int i = this.f22188d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        i = this.f22189e;
        if (i != 0) {
            kvd.m5431b(5, i);
        }
        i = this.f22190f;
        if (i != 0) {
            kvd.m5431b(6, i);
        }
        i = this.f22191g;
        if (i != 0) {
            kvd.m5431b(7, i);
        }
        super.writeTo(kvd);
    }
}
