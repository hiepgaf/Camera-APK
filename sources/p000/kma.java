package p000;

/* compiled from: PG */
/* renamed from: kma */
public final class kma extends kvf {
    /* renamed from: c */
    private static volatile kma[] f22431c;
    /* renamed from: a */
    public String f22432a;
    /* renamed from: b */
    public int f22433b;

    public kma() {
        this.f22432a = "";
        this.f22433b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f22432a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f22432a);
        }
        int i = this.f22433b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static kma[] m16609a() {
        if (f22431c == null) {
            synchronized (kvj.f8655b) {
                if (f22431c == null) {
                    f22431c = new kma[0];
                }
            }
        }
        return f22431c;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f22432a = kvc.m5412h();
                    continue;
                case 16:
                    this.f22433b = kvc.m5410f();
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
        String str = this.f22432a;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f22432a);
        }
        int i = this.f22433b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        super.writeTo(kvd);
    }
}
