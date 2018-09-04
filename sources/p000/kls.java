package p000;

/* compiled from: PG */
/* renamed from: kls */
public final class kls extends kvf {
    /* renamed from: a */
    private long f22394a;
    /* renamed from: b */
    private float f22395b;
    /* renamed from: c */
    private float f22396c;
    /* renamed from: d */
    private float f22397d;

    public kls() {
        this.f22394a = 0;
        this.f22395b = 0.0f;
        this.f22396c = 0.0f;
        this.f22397d = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22394a;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        if (Float.floatToIntBits(this.f22395b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        if (Float.floatToIntBits(this.f22396c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (Float.floatToIntBits(this.f22397d) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(32) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22394a = kvc.m5411g();
                    continue;
                case 21:
                    this.f22395b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 29:
                    this.f22396c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 37:
                    this.f22397d = Float.intBitsToFloat(kvc.m5406d());
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
        long j = this.f22394a;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        if (Float.floatToIntBits(this.f22395b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22395b);
        }
        if (Float.floatToIntBits(this.f22396c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22396c);
        }
        if (Float.floatToIntBits(this.f22397d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22397d);
        }
        super.writeTo(kvd);
    }
}
