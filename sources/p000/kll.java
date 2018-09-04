package p000;

/* compiled from: PG */
/* renamed from: kll */
public final class kll extends kvf {
    /* renamed from: a */
    public int f22364a;
    /* renamed from: b */
    public int f22365b;
    /* renamed from: c */
    public float f22366c;
    /* renamed from: d */
    public int f22367d;
    /* renamed from: e */
    private boolean f22368e;

    public kll() {
        this.f22368e = false;
        this.f22364a = 0;
        this.f22365b = 0;
        this.f22366c = 0.0f;
        this.f22367d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f22368e) {
            computeSerializedSize += kvd.m5423b(8) + 1;
        }
        int i = this.f22364a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22365b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        if (Float.floatToIntBits(this.f22366c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        i = this.f22367d;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(5, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kll m16599a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22368e = kvc.m5405c();
                    continue;
                case 16:
                    this.f22364a = kvc.m5410f();
                    continue;
                case 24:
                    this.f22365b = kvc.m5410f();
                    continue;
                case 37:
                    this.f22366c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 40:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 3) {
                            StringBuilder stringBuilder = new StringBuilder(39);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum Quality");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22367d = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
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
        return m16599a(kvc);
    }

    public final void writeTo(kvd kvd) {
        boolean z = this.f22368e;
        if (z) {
            kvd.m5429a(1, z);
        }
        int i = this.f22364a;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22365b;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        if (Float.floatToIntBits(this.f22366c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22366c);
        }
        i = this.f22367d;
        if (i != 0) {
            kvd.m5431b(5, i);
        }
        super.writeTo(kvd);
    }
}
