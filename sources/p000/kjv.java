package p000;

/* compiled from: PG */
/* renamed from: kjv */
public final class kjv extends kvf {
    /* renamed from: a */
    public kjj f22125a;
    /* renamed from: b */
    public long f22126b;

    public kjv() {
        this.f22125a = null;
        this.f22126b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22125a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        long j = this.f22126b;
        if (j != 0) {
            return computeSerializedSize + kvd.m5416a(2, j);
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
                    if (this.f22125a == null) {
                        this.f22125a = new kjj();
                    }
                    kvc.m5399a(this.f22125a);
                    continue;
                case 16:
                    this.f22126b = kvc.m5411g();
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
        kvl kvl = this.f22125a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        long j = this.f22126b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        super.writeTo(kvd);
    }
}
