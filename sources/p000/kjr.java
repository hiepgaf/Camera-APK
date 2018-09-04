package p000;

/* compiled from: PG */
/* renamed from: kjr */
public final class kjr extends kvf {
    /* renamed from: a */
    public kjj f22110a;
    /* renamed from: b */
    public long f22111b;
    /* renamed from: c */
    public long f22112c;
    /* renamed from: d */
    public kjw f22113d;

    public kjr() {
        this.f22110a = null;
        this.f22111b = 0;
        this.f22112c = 0;
        this.f22113d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22110a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        long j = this.f22111b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.f22112c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        kvl = this.f22113d;
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
                    if (this.f22110a == null) {
                        this.f22110a = new kjj();
                    }
                    kvc.m5399a(this.f22110a);
                    continue;
                case 16:
                    this.f22111b = kvc.m5411g();
                    continue;
                case 24:
                    this.f22112c = kvc.m5411g();
                    continue;
                case 34:
                    if (this.f22113d == null) {
                        this.f22113d = new kjw();
                    }
                    kvc.m5399a(this.f22113d);
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
        kvl kvl = this.f22110a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        long j = this.f22111b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.f22112c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        kvl = this.f22113d;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
