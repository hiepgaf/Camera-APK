package p000;

/* compiled from: PG */
/* renamed from: kkg */
public final class kkg extends kvf {
    /* renamed from: a */
    private int f22230a;
    /* renamed from: b */
    private long f22231b;
    /* renamed from: c */
    private long f22232c;
    /* renamed from: d */
    private long f22233d;
    /* renamed from: e */
    private long f22234e;
    /* renamed from: f */
    private float f22235f;
    /* renamed from: g */
    private boolean f22236g;
    /* renamed from: h */
    private int f22237h;
    /* renamed from: i */
    private long f22238i;
    /* renamed from: j */
    private long f22239j;

    public kkg() {
        this.f22230a = 0;
        this.f22231b = 0;
        this.f22232c = 0;
        this.f22233d = 0;
        this.f22234e = 0;
        this.f22235f = 0.0f;
        this.f22236g = false;
        this.f22237h = 0;
        this.f22238i = 0;
        this.f22239j = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22230a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        long j = this.f22231b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.f22232c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        j = this.f22233d;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(4, j);
        }
        j = this.f22234e;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(5, j);
        }
        if (Float.floatToIntBits(this.f22235f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(48) + 4;
        }
        if (this.f22236g) {
            computeSerializedSize += kvd.m5423b(56) + 1;
        }
        i = this.f22237h;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(8, i);
        }
        j = this.f22238i;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(9, j);
        }
        j = this.f22239j;
        if (j != 0) {
            return computeSerializedSize + kvd.m5416a(10, j);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kkg m16579a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            int f;
            StringBuilder stringBuilder;
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 6) {
                            stringBuilder = new StringBuilder(50);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ImaxCaptureFailure");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22230a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    this.f22231b = kvc.m5411g();
                    continue;
                case 24:
                    this.f22232c = kvc.m5411g();
                    continue;
                case 32:
                    this.f22233d = kvc.m5411g();
                    continue;
                case 40:
                    this.f22234e = kvc.m5411g();
                    continue;
                case 53:
                    this.f22235f = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 56:
                    this.f22236g = kvc.m5405c();
                    continue;
                case 64:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 2) {
                            stringBuilder = new StringBuilder(46);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ImaxResolution");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22237h = f;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 72:
                    this.f22238i = kvc.m5411g();
                    continue;
                case 80:
                    this.f22239j = kvc.m5411g();
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
        return m16579a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22230a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        long j = this.f22231b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.f22232c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        j = this.f22233d;
        if (j != 0) {
            kvd.m5432b(4, j);
        }
        j = this.f22234e;
        if (j != 0) {
            kvd.m5432b(5, j);
        }
        if (Float.floatToIntBits(this.f22235f) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(6, this.f22235f);
        }
        boolean z = this.f22236g;
        if (z) {
            kvd.m5429a(7, z);
        }
        i = this.f22237h;
        if (i != 0) {
            kvd.m5431b(8, i);
        }
        j = this.f22238i;
        if (j != 0) {
            kvd.m5432b(9, j);
        }
        j = this.f22239j;
        if (j != 0) {
            kvd.m5432b(10, j);
        }
        super.writeTo(kvd);
    }
}
