package p000;

/* compiled from: PG */
/* renamed from: kkl */
public final class kkl extends kvf {
    /* renamed from: a */
    private kkm f22256a;
    /* renamed from: b */
    private kkk f22257b;
    /* renamed from: c */
    private kkp f22258c;
    /* renamed from: d */
    private kks f22259d;

    public kkl() {
        this.f22256a = null;
        this.f22257b = null;
        this.f22258c = null;
        this.f22259d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22256a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        kvl = this.f22257b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(2, kvl);
        }
        kvl = this.f22258c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(3, kvl);
        }
        kvl = this.f22259d;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(4, kvl);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    if (this.f22256a == null) {
                        this.f22256a = new kkm();
                    }
                    kvc.m5399a(this.f22256a);
                    continue;
                case 18:
                    if (this.f22257b == null) {
                        this.f22257b = new kkk();
                    }
                    kvc.m5399a(this.f22257b);
                    continue;
                case 26:
                    if (this.f22258c == null) {
                        this.f22258c = new kkp();
                    }
                    kvc.m5399a(this.f22258c);
                    continue;
                case 34:
                    if (this.f22259d == null) {
                        this.f22259d = new kks();
                    }
                    kvc.m5399a(this.f22259d);
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
        kvl kvl = this.f22256a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        kvl = this.f22257b;
        if (kvl != null) {
            kvd.m5434b(2, kvl);
        }
        kvl = this.f22258c;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        kvl = this.f22259d;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
