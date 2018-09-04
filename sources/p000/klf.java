package p000;

/* compiled from: PG */
/* renamed from: klf */
public final class klf extends kvf {
    /* renamed from: b */
    private static volatile klf[] f22339b;
    /* renamed from: a */
    public float f22340a;
    /* renamed from: c */
    private float f22341c;
    /* renamed from: d */
    private float f22342d;
    /* renamed from: e */
    private boolean f22343e;
    /* renamed from: f */
    private float f22344f;

    public klf() {
        this.f22340a = 0.0f;
        this.f22341c = 0.0f;
        this.f22342d = 0.0f;
        this.f22343e = false;
        this.f22344f = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22340a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        if (Float.floatToIntBits(this.f22341c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        if (Float.floatToIntBits(this.f22342d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (this.f22343e) {
            computeSerializedSize += kvd.m5423b(32) + 1;
        }
        if (Float.floatToIntBits(this.f22344f) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(40) + 4);
    }

    /* renamed from: a */
    public static klf[] m16592a() {
        if (f22339b == null) {
            synchronized (kvj.f8655b) {
                if (f22339b == null) {
                    f22339b = new klf[0];
                }
            }
        }
        return f22339b;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f22340a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 21:
                    this.f22341c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 29:
                    this.f22342d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 32:
                    this.f22343e = kvc.m5405c();
                    continue;
                case 45:
                    this.f22344f = Float.intBitsToFloat(kvc.m5406d());
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
        if (Float.floatToIntBits(this.f22340a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22340a);
        }
        if (Float.floatToIntBits(this.f22341c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22341c);
        }
        if (Float.floatToIntBits(this.f22342d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22342d);
        }
        boolean z = this.f22343e;
        if (z) {
            kvd.m5429a(4, z);
        }
        if (Float.floatToIntBits(this.f22344f) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f22344f);
        }
        super.writeTo(kvd);
    }
}
