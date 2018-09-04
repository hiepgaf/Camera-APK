package p000;

/* compiled from: PG */
/* renamed from: klb */
public final class klb extends kvf {
    /* renamed from: c */
    private static volatile klb[] f22315c;
    /* renamed from: a */
    public long f22316a;
    /* renamed from: b */
    public long f22317b;

    public klb() {
        this.f22316a = 0;
        this.f22317b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22316a;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.f22317b;
        if (j != 0) {
            return computeSerializedSize + kvd.m5416a(2, j);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static klb[] m16590a() {
        if (f22315c == null) {
            synchronized (kvj.f8655b) {
                if (f22315c == null) {
                    f22315c = new klb[0];
                }
            }
        }
        return f22315c;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22316a = kvc.m5411g();
                    continue;
                case 16:
                    this.f22317b = kvc.m5411g();
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
        long j = this.f22316a;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.f22317b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        super.writeTo(kvd);
    }
}
