package p000;

/* compiled from: PG */
/* renamed from: kmb */
public final class kmb extends kvf {
    /* renamed from: a */
    public float f22434a;
    /* renamed from: b */
    public float f22435b;
    /* renamed from: c */
    public float f22436c;
    /* renamed from: d */
    public float f22437d;

    public kmb() {
        this.f22434a = 0.0f;
        this.f22435b = 0.0f;
        this.f22436c = 0.0f;
        this.f22437d = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22434a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        if (Float.floatToIntBits(this.f22435b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        if (Float.floatToIntBits(this.f22436c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (Float.floatToIntBits(this.f22437d) == Float.floatToIntBits(0.0f)) {
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
                case 13:
                    this.f22434a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 21:
                    this.f22435b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 29:
                    this.f22436c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 37:
                    this.f22437d = Float.intBitsToFloat(kvc.m5406d());
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
        if (Float.floatToIntBits(this.f22434a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22434a);
        }
        if (Float.floatToIntBits(this.f22435b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22435b);
        }
        if (Float.floatToIntBits(this.f22436c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22436c);
        }
        if (Float.floatToIntBits(this.f22437d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22437d);
        }
        super.writeTo(kvd);
    }
}
