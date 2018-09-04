package p000;

/* compiled from: PG */
/* renamed from: kki */
public final class kki extends kvf {
    /* renamed from: a */
    private int f22246a;
    /* renamed from: b */
    private int f22247b;
    /* renamed from: c */
    private int f22248c;
    /* renamed from: d */
    private int f22249d;
    /* renamed from: e */
    private float f22250e;

    public kki() {
        this.f22246a = 0;
        this.f22247b = 0;
        this.f22248c = 0;
        this.f22249d = 0;
        this.f22250e = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22246a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22247b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22248c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        i = this.f22249d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        if (Float.floatToIntBits(this.f22250e) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(40) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22246a = kvc.m5410f();
                    continue;
                case 16:
                    this.f22247b = kvc.m5410f();
                    continue;
                case 24:
                    this.f22248c = kvc.m5410f();
                    continue;
                case 32:
                    this.f22249d = kvc.m5410f();
                    continue;
                case 45:
                    this.f22250e = Float.intBitsToFloat(kvc.m5406d());
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
        int i = this.f22246a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22247b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22248c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        i = this.f22249d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        if (Float.floatToIntBits(this.f22250e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f22250e);
        }
        super.writeTo(kvd);
    }
}
