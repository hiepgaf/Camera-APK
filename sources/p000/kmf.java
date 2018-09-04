package p000;

/* compiled from: PG */
/* renamed from: kmf */
public final class kmf extends kvf {
    /* renamed from: a */
    public float f22448a;
    /* renamed from: b */
    public long f22449b;
    /* renamed from: c */
    public int f22450c;
    /* renamed from: d */
    public int f22451d;
    /* renamed from: e */
    public float f22452e;
    /* renamed from: f */
    public boolean f22453f;
    /* renamed from: g */
    public int f22454g;

    public kmf() {
        this.f22448a = 0.0f;
        this.f22449b = 0;
        this.f22450c = 0;
        this.f22451d = 0;
        this.f22452e = 0.0f;
        this.f22453f = false;
        this.f22454g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22448a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        long j = this.f22449b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        int i = this.f22450c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        i = this.f22451d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        if (Float.floatToIntBits(this.f22452e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(40) + 4;
        }
        if (this.f22453f) {
            computeSerializedSize += kvd.m5423b(48) + 1;
        }
        i = this.f22454g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(7, i);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f22448a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 16:
                    this.f22449b = kvc.m5411g();
                    continue;
                case 24:
                    this.f22450c = kvc.m5410f();
                    continue;
                case 32:
                    this.f22451d = kvc.m5410f();
                    continue;
                case 45:
                    this.f22452e = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 48:
                    this.f22453f = kvc.m5405c();
                    continue;
                case 56:
                    this.f22454g = kvc.m5410f();
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
        if (Float.floatToIntBits(this.f22448a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22448a);
        }
        long j = this.f22449b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        int i = this.f22450c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        i = this.f22451d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        if (Float.floatToIntBits(this.f22452e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f22452e);
        }
        boolean z = this.f22453f;
        if (z) {
            kvd.m5429a(6, z);
        }
        i = this.f22454g;
        if (i != 0) {
            kvd.m5431b(7, i);
        }
        super.writeTo(kvd);
    }
}
