package p000;

/* compiled from: PG */
/* renamed from: kjq */
public final class kjq extends kvf {
    /* renamed from: a */
    public int f22106a;
    /* renamed from: b */
    public kkx f22107b;
    /* renamed from: c */
    public kll f22108c;
    /* renamed from: d */
    public klu f22109d;

    public kjq() {
        this.f22106a = 0;
        this.f22107b = null;
        this.f22108c = null;
        this.f22109d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22106a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        kvl kvl = this.f22107b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(2, kvl);
        }
        kvl = this.f22108c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(3, kvl);
        }
        kvl = this.f22109d;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(4, kvl);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjq m16568a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.m5401b();
                    try {
                        this.f22106a = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    if (this.f22107b == null) {
                        this.f22107b = new kkx();
                    }
                    kvc.m5399a(this.f22107b);
                    continue;
                case 26:
                    if (this.f22108c == null) {
                        this.f22108c = new kll();
                    }
                    kvc.m5399a(this.f22108c);
                    continue;
                case 34:
                    if (this.f22109d == null) {
                        this.f22109d = new klu();
                    }
                    kvc.m5399a(this.f22109d);
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

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        return m16568a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22106a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        kvl kvl = this.f22107b;
        if (kvl != null) {
            kvd.m5434b(2, kvl);
        }
        kvl = this.f22108c;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        kvl = this.f22109d;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
