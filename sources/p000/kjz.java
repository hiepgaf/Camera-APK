package p000;

/* compiled from: PG */
/* renamed from: kjz */
public final class kjz extends kvf {
    /* renamed from: a */
    private static volatile kjz[] f22140a;
    /* renamed from: b */
    private long f22141b;
    /* renamed from: c */
    private int f22142c;
    /* renamed from: d */
    private float f22143d;
    /* renamed from: e */
    private int f22144e;

    public kjz() {
        this.f22141b = 0;
        this.f22142c = 0;
        this.f22143d = 0.0f;
        this.f22144e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22141b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        int i = this.f22142c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        if (Float.floatToIntBits(this.f22143d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        i = this.f22144e;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(4, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static kjz[] m16575a() {
        if (f22140a == null) {
            synchronized (kvj.f8655b) {
                if (f22140a == null) {
                    f22140a = new kjz[0];
                }
            }
        }
        return f22140a;
    }

    /* renamed from: a */
    private final kjz m16574a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22141b = kvc.m5411g();
                    continue;
                case 16:
                    b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if ((f < 0 || f > 2) && (f < 10 || f > 19)) {
                            StringBuilder stringBuilder = new StringBuilder(41);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum EventType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22142c = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 29:
                    this.f22143d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 32:
                    b = kvc.m5401b();
                    try {
                        this.f22144e = kjj.m16558a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
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
        return m16574a(kvc);
    }

    public final void writeTo(kvd kvd) {
        long j = this.f22141b;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        int i = this.f22142c;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        if (Float.floatToIntBits(this.f22143d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22143d);
        }
        i = this.f22144e;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        super.writeTo(kvd);
    }
}
