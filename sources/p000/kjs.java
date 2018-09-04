package p000;

/* compiled from: PG */
/* renamed from: kjs */
public final class kjs extends kvf {
    /* renamed from: a */
    public kjj f22114a;
    /* renamed from: b */
    public long f22115b;
    /* renamed from: c */
    public long f22116c;

    public kjs() {
        this.f22114a = null;
        this.f22115b = 0;
        this.f22116c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22114a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        long j = this.f22115b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.f22116c;
        if (j != 0) {
            return computeSerializedSize + kvd.m5416a(3, j);
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
                    if (this.f22114a == null) {
                        this.f22114a = new kjj();
                    }
                    kvc.m5399a(this.f22114a);
                    continue;
                case 16:
                    this.f22115b = kvc.m5411g();
                    continue;
                case 24:
                    this.f22116c = kvc.m5411g();
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
        kvl kvl = this.f22114a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        long j = this.f22115b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.f22116c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        super.writeTo(kvd);
    }
}
