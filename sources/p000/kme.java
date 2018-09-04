package p000;

/* compiled from: PG */
/* renamed from: kme */
public final class kme extends kvf {
    /* renamed from: a */
    public float f22444a;
    /* renamed from: b */
    public float f22445b;
    /* renamed from: c */
    public float f22446c;
    /* renamed from: d */
    public float f22447d;

    public kme() {
        this.f22444a = 0.0f;
        this.f22445b = 0.0f;
        this.f22446c = 0.0f;
        this.f22447d = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22444a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        if (Float.floatToIntBits(this.f22445b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        if (Float.floatToIntBits(this.f22446c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (Float.floatToIntBits(this.f22447d) == Float.floatToIntBits(0.0f)) {
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
                    this.f22444a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 21:
                    this.f22445b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 29:
                    this.f22446c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 37:
                    this.f22447d = Float.intBitsToFloat(kvc.m5406d());
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
        if (Float.floatToIntBits(this.f22444a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22444a);
        }
        if (Float.floatToIntBits(this.f22445b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22445b);
        }
        if (Float.floatToIntBits(this.f22446c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22446c);
        }
        if (Float.floatToIntBits(this.f22447d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22447d);
        }
        super.writeTo(kvd);
    }
}
