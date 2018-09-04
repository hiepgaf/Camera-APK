package p000;

/* compiled from: PG */
/* renamed from: kjt */
public final class kjt extends kvf {
    /* renamed from: a */
    public kjj f22117a;
    /* renamed from: b */
    public long f22118b;
    /* renamed from: c */
    public long f22119c;
    /* renamed from: d */
    public kjw f22120d;

    public kjt() {
        this.f22117a = null;
        this.f22118b = 0;
        this.f22119c = 0;
        this.f22120d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22117a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        long j = this.f22118b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.f22119c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        kvl = this.f22120d;
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
                    if (this.f22117a == null) {
                        this.f22117a = new kjj();
                    }
                    kvc.m5399a(this.f22117a);
                    continue;
                case 16:
                    this.f22118b = kvc.m5411g();
                    continue;
                case 24:
                    this.f22119c = kvc.m5411g();
                    continue;
                case 34:
                    if (this.f22120d == null) {
                        this.f22120d = new kjw();
                    }
                    kvc.m5399a(this.f22120d);
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
        kvl kvl = this.f22117a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        long j = this.f22118b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.f22119c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        kvl = this.f22120d;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
