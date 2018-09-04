package p000;

/* compiled from: PG */
/* renamed from: kkv */
public final class kkv extends kvf {
    /* renamed from: a */
    private int f22285a;
    /* renamed from: b */
    private kkj f22286b;
    /* renamed from: c */
    private float f22287c;
    /* renamed from: d */
    private int f22288d;

    public kkv() {
        this.f22285a = 0;
        this.f22286b = null;
        this.f22287c = 0.0f;
        this.f22288d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22285a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        kvl kvl = this.f22286b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(2, kvl);
        }
        if (Float.floatToIntBits(this.f22287c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        i = this.f22288d;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(4, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kkv m16584a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 9) {
                            StringBuilder stringBuilder = new StringBuilder(46);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum TextEntityType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22285a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    if (this.f22286b == null) {
                        this.f22286b = new kkj();
                    }
                    kvc.m5399a(this.f22286b);
                    continue;
                case 29:
                    this.f22287c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 32:
                    this.f22288d = kvc.m5410f();
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

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        return m16584a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22285a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        kvl kvl = this.f22286b;
        if (kvl != null) {
            kvd.m5434b(2, kvl);
        }
        if (Float.floatToIntBits(this.f22287c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22287c);
        }
        i = this.f22288d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        super.writeTo(kvd);
    }
}
