package p000;

/* compiled from: PG */
/* renamed from: iyo */
public final class iyo extends kvf {
    /* renamed from: a */
    public long f21818a;
    /* renamed from: b */
    public long f21819b;
    /* renamed from: c */
    public iyq f21820c;
    /* renamed from: d */
    private boolean f21821d;

    public iyo() {
        this.f21818a = 0;
        this.f21819b = 0;
        this.f21821d = false;
        this.f21820c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f21818a;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.f21819b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        if (this.f21821d) {
            computeSerializedSize += kvd.m5423b(24) + 1;
        }
        kvl kvl = this.f21820c;
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
                case 8:
                    this.f21818a = kvc.m5411g();
                    continue;
                case 16:
                    this.f21819b = kvc.m5411g();
                    continue;
                case 24:
                    this.f21821d = kvc.m5405c();
                    continue;
                case 34:
                    if (this.f21820c == null) {
                        this.f21820c = new iyq();
                    }
                    kvc.m5399a(this.f21820c);
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
        long j = this.f21818a;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.f21819b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        boolean z = this.f21821d;
        if (z) {
            kvd.m5429a(3, z);
        }
        kvl kvl = this.f21820c;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        super.writeTo(kvd);
    }
}
