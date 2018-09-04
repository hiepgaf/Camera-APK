package p000;

/* compiled from: PG */
/* renamed from: kkb */
public final class kkb extends kvf {
    /* renamed from: h */
    private static volatile kkb[] f22160h;
    /* renamed from: a */
    public float f22161a;
    /* renamed from: b */
    public float f22162b;
    /* renamed from: c */
    public float f22163c;
    /* renamed from: d */
    public float f22164d;
    /* renamed from: e */
    public float f22165e;
    /* renamed from: f */
    public float f22166f;
    /* renamed from: g */
    public float f22167g;

    public kkb() {
        this.f22161a = 0.0f;
        this.f22162b = 0.0f;
        this.f22163c = 0.0f;
        this.f22164d = 0.0f;
        this.f22165e = 0.0f;
        this.f22166f = 0.0f;
        this.f22167g = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22161a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        if (Float.floatToIntBits(this.f22162b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        if (Float.floatToIntBits(this.f22163c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (Float.floatToIntBits(this.f22164d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        if (Float.floatToIntBits(this.f22165e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(40) + 4;
        }
        if (Float.floatToIntBits(this.f22166f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(48) + 4;
        }
        if (Float.floatToIntBits(this.f22167g) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(56) + 4);
    }

    /* renamed from: a */
    public static kkb[] m16576a() {
        if (f22160h == null) {
            synchronized (kvj.f8655b) {
                if (f22160h == null) {
                    f22160h = new kkb[0];
                }
            }
        }
        return f22160h;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f22161a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 21:
                    this.f22162b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 29:
                    this.f22163c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 37:
                    this.f22164d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 45:
                    this.f22165e = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 53:
                    this.f22166f = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 61:
                    this.f22167g = Float.intBitsToFloat(kvc.m5406d());
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
        if (Float.floatToIntBits(this.f22161a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22161a);
        }
        if (Float.floatToIntBits(this.f22162b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22162b);
        }
        if (Float.floatToIntBits(this.f22163c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22163c);
        }
        if (Float.floatToIntBits(this.f22164d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22164d);
        }
        if (Float.floatToIntBits(this.f22165e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f22165e);
        }
        if (Float.floatToIntBits(this.f22166f) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(6, this.f22166f);
        }
        if (Float.floatToIntBits(this.f22167g) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(7, this.f22167g);
        }
        super.writeTo(kvd);
    }
}
