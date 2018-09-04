package p000;

/* compiled from: PG */
/* renamed from: klh */
public final class klh extends kvf {
    /* renamed from: a */
    public int f22352a;
    /* renamed from: b */
    public int f22353b;
    /* renamed from: c */
    public int f22354c;
    /* renamed from: d */
    public float f22355d;
    /* renamed from: e */
    public long f22356e;
    /* renamed from: f */
    public long f22357f;

    public klh() {
        this.f22352a = 0;
        this.f22353b = 0;
        this.f22354c = 0;
        this.f22355d = 0.0f;
        this.f22356e = 0;
        this.f22357f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public static int m16594a(int i) {
        if (i >= 0 && i <= 6) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum InteractionCause");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static int m16596b(int i) {
        if ((i >= 0 && i <= 2) || ((i >= 5 && i <= 15) || (i >= 17 && i <= 22))) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum Mode");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22352a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22353b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22354c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        if (Float.floatToIntBits(this.f22355d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        long j = this.f22356e;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(5, j);
        }
        j = this.f22357f;
        if (j != 0) {
            return computeSerializedSize + kvd.m5416a(6, j);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final klh m16595a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        this.f22352a = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.m5401b();
                    try {
                        this.f22353b = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 24:
                    b = kvc.m5401b();
                    try {
                        this.f22354c = klh.m16594a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e3) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 37:
                    this.f22355d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 40:
                    this.f22356e = kvc.m5411g();
                    continue;
                case 48:
                    this.f22357f = kvc.m5411g();
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
        return m16595a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22352a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22353b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22354c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        if (Float.floatToIntBits(this.f22355d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22355d);
        }
        long j = this.f22356e;
        if (j != 0) {
            kvd.m5432b(5, j);
        }
        j = this.f22357f;
        if (j != 0) {
            kvd.m5432b(6, j);
        }
        super.writeTo(kvd);
    }
}
