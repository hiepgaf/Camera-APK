package p000;

/* compiled from: PG */
/* renamed from: klk */
public final class klk extends kvf {
    /* renamed from: a */
    public boolean f22361a;
    /* renamed from: b */
    public boolean f22362b;
    /* renamed from: c */
    public long f22363c;

    public klk() {
        this.f22361a = false;
        this.f22362b = false;
        this.f22363c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f22361a) {
            computeSerializedSize += kvd.m5423b(64) + 1;
        }
        if (this.f22362b) {
            computeSerializedSize += kvd.m5423b(72) + 1;
        }
        long j = this.f22363c;
        if (j != 0) {
            return computeSerializedSize + kvd.m5416a(10, j);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 64:
                    this.f22361a = kvc.m5405c();
                    continue;
                case 72:
                    this.f22362b = kvc.m5405c();
                    continue;
                case 80:
                    this.f22363c = kvc.m5411g();
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
        boolean z = this.f22361a;
        if (z) {
            kvd.m5429a(8, z);
        }
        z = this.f22362b;
        if (z) {
            kvd.m5429a(9, z);
        }
        long j = this.f22363c;
        if (j != 0) {
            kvd.m5432b(10, j);
        }
        super.writeTo(kvd);
    }
}
