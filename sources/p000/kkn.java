package p000;

/* compiled from: PG */
/* renamed from: kkn */
public final class kkn extends kvf {
    /* renamed from: a */
    private float f22265a;
    /* renamed from: b */
    private float f22266b;

    public kkn() {
        this.f22265a = 0.0f;
        this.f22266b = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22265a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        if (Float.floatToIntBits(this.f22266b) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(16) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f22265a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 21:
                    this.f22266b = Float.intBitsToFloat(kvc.m5406d());
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
        if (Float.floatToIntBits(this.f22265a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22265a);
        }
        if (Float.floatToIntBits(this.f22266b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22266b);
        }
        super.writeTo(kvd);
    }
}
