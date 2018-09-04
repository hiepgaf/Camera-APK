package p000;

/* compiled from: PG */
/* renamed from: kkq */
public final class kkq extends kvf {
    /* renamed from: a */
    private kkj f22270a;
    /* renamed from: b */
    private float f22271b;
    /* renamed from: c */
    private int f22272c;

    public kkq() {
        this.f22270a = null;
        this.f22271b = 0.0f;
        this.f22272c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22270a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        if (Float.floatToIntBits(this.f22271b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        int i = this.f22272c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(3, i);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    if (this.f22270a == null) {
                        this.f22270a = new kkj();
                    }
                    kvc.m5399a(this.f22270a);
                    continue;
                case 21:
                    this.f22271b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 24:
                    this.f22272c = kvc.m5410f();
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
        kvl kvl = this.f22270a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        if (Float.floatToIntBits(this.f22271b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22271b);
        }
        int i = this.f22272c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        super.writeTo(kvd);
    }
}
