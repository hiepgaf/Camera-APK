package p000;

/* compiled from: PG */
/* renamed from: kjx */
public final class kjx extends kvf {
    /* renamed from: a */
    public int f22129a;
    /* renamed from: b */
    public int f22130b;
    /* renamed from: c */
    public long f22131c;
    /* renamed from: d */
    public long f22132d;
    /* renamed from: e */
    public int f22133e;
    /* renamed from: f */
    public boolean f22134f;

    public kjx() {
        this.f22129a = 0;
        this.f22130b = 0;
        this.f22131c = 0;
        this.f22132d = 0;
        this.f22133e = 0;
        this.f22134f = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    private static int m16571a(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum Camera");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22129a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22130b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        long j = this.f22131c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        j = this.f22132d;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(4, j);
        }
        i = this.f22133e;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(5, i);
        }
        if (this.f22134f) {
            return computeSerializedSize + (kvd.m5423b(48) + 1);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjx m16572a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        this.f22129a = kjx.m16571a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.m5401b();
                    try {
                        this.f22130b = kjx.m16571a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 24:
                    this.f22131c = kvc.m5411g();
                    continue;
                case 32:
                    this.f22132d = kvc.m5411g();
                    continue;
                case 40:
                    b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 1) {
                            StringBuilder stringBuilder = new StringBuilder(44);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ChangeMethod");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22133e = f;
                        continue;
                    } catch (IllegalArgumentException e3) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 48:
                    this.f22134f = kvc.m5405c();
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
        return m16572a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22129a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22130b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        long j = this.f22131c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        j = this.f22132d;
        if (j != 0) {
            kvd.m5432b(4, j);
        }
        i = this.f22133e;
        if (i != 0) {
            kvd.m5431b(5, i);
        }
        boolean z = this.f22134f;
        if (z) {
            kvd.m5429a(6, z);
        }
        super.writeTo(kvd);
    }
}
