package p000;

/* compiled from: PG */
/* renamed from: kld */
public final class kld extends kvf {
    /* renamed from: a */
    public String f22324a;
    /* renamed from: b */
    public long f22325b;
    /* renamed from: c */
    public long f22326c;
    /* renamed from: d */
    public long f22327d;
    /* renamed from: e */
    public long f22328e;
    /* renamed from: f */
    public long f22329f;
    /* renamed from: g */
    public long f22330g;
    /* renamed from: h */
    public long f22331h;
    /* renamed from: i */
    public long f22332i;
    /* renamed from: j */
    public long f22333j;

    public kld() {
        this.f22324a = "";
        this.f22325b = 0;
        this.f22326c = 0;
        this.f22327d = 0;
        this.f22328e = 0;
        this.f22329f = 0;
        this.f22330g = 0;
        this.f22331h = 0;
        this.f22332i = 0;
        this.f22333j = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f22324a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f22324a);
        }
        long j = this.f22325b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.f22326c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        j = this.f22327d;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(4, j);
        }
        j = this.f22328e;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(5, j);
        }
        j = this.f22329f;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(6, j);
        }
        j = this.f22330g;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(7, j);
        }
        j = this.f22331h;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(8, j);
        }
        j = this.f22332i;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(9, j);
        }
        j = this.f22333j;
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
                case 10:
                    this.f22324a = kvc.m5412h();
                    continue;
                case 16:
                    this.f22325b = kvc.m5411g();
                    continue;
                case 24:
                    this.f22326c = kvc.m5411g();
                    continue;
                case 32:
                    this.f22327d = kvc.m5411g();
                    continue;
                case 40:
                    this.f22328e = kvc.m5411g();
                    continue;
                case 48:
                    this.f22329f = kvc.m5411g();
                    continue;
                case 56:
                    this.f22330g = kvc.m5411g();
                    continue;
                case 64:
                    this.f22331h = kvc.m5411g();
                    continue;
                case 72:
                    this.f22332i = kvc.m5411g();
                    continue;
                case 80:
                    this.f22333j = kvc.m5411g();
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
        String str = this.f22324a;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f22324a);
        }
        long j = this.f22325b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.f22326c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        j = this.f22327d;
        if (j != 0) {
            kvd.m5432b(4, j);
        }
        j = this.f22328e;
        if (j != 0) {
            kvd.m5432b(5, j);
        }
        j = this.f22329f;
        if (j != 0) {
            kvd.m5432b(6, j);
        }
        j = this.f22330g;
        if (j != 0) {
            kvd.m5432b(7, j);
        }
        j = this.f22331h;
        if (j != 0) {
            kvd.m5432b(8, j);
        }
        j = this.f22332i;
        if (j != 0) {
            kvd.m5432b(9, j);
        }
        j = this.f22333j;
        if (j != 0) {
            kvd.m5432b(10, j);
        }
        super.writeTo(kvd);
    }
}
