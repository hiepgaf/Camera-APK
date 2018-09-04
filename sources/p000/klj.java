package p000;

/* compiled from: PG */
/* renamed from: klj */
public final class klj extends kvf {
    /* renamed from: a */
    public int f22359a;
    /* renamed from: b */
    public float f22360b;

    public klj() {
        this.f22359a = 0;
        this.f22360b = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22359a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        if (Float.floatToIntBits(this.f22360b) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(16) + 4);
    }

    /* renamed from: a */
    private final klj m16598a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 4) {
                            StringBuilder stringBuilder = new StringBuilder(40);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum PanoType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22359a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 21:
                    this.f22360b = Float.intBitsToFloat(kvc.m5406d());
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
        return m16598a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22359a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        if (Float.floatToIntBits(this.f22360b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22360b);
        }
        super.writeTo(kvd);
    }
}
