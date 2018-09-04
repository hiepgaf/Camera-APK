package p000;

/* compiled from: PG */
/* renamed from: kku */
public final class kku extends kvf {
    /* renamed from: a */
    private static volatile kku[] f22282a;
    /* renamed from: b */
    private String f22283b;
    /* renamed from: c */
    private String f22284c;

    public kku() {
        this.f22283b = "";
        this.f22284c = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f22283b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f22283b);
        }
        str = this.f22284c;
        if (str == null || str.equals("")) {
            return computeSerializedSize;
        }
        return computeSerializedSize + kvd.m5417a(2, this.f22284c);
    }

    /* renamed from: a */
    public static kku[] m16583a() {
        if (f22282a == null) {
            synchronized (kvj.f8655b) {
                if (f22282a == null) {
                    f22282a = new kku[0];
                }
            }
        }
        return f22282a;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f22283b = kvc.m5412h();
                    continue;
                case 18:
                    this.f22284c = kvc.m5412h();
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
        String str = this.f22283b;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f22283b);
        }
        str = this.f22284c;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(2, this.f22284c);
        }
        super.writeTo(kvd);
    }
}
