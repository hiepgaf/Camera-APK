package p000;

/* compiled from: PG */
/* renamed from: kjf */
public final class kjf extends kvf {
    /* renamed from: a */
    private float f22063a;
    /* renamed from: b */
    private int f22064b;
    /* renamed from: c */
    private int f22065c;
    /* renamed from: d */
    private float f22066d;

    public kjf() {
        this.f22063a = 0.0f;
        this.f22064b = 0;
        this.f22065c = 0;
        this.f22066d = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22063a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        int i = this.f22064b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22065c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        if (Float.floatToIntBits(this.f22066d) == Float.floatToIntBits(0.0f)) {
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
                    this.f22063a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 16:
                    this.f22064b = kvc.m5410f();
                    continue;
                case 24:
                    this.f22065c = kvc.m5410f();
                    continue;
                case 37:
                    this.f22066d = Float.intBitsToFloat(kvc.m5406d());
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
        if (Float.floatToIntBits(this.f22063a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22063a);
        }
        int i = this.f22064b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22065c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        if (Float.floatToIntBits(this.f22066d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22066d);
        }
        super.writeTo(kvd);
    }
}
