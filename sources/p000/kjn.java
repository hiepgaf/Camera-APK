package p000;

/* compiled from: PG */
/* renamed from: kjn */
public final class kjn extends kvf {
    /* renamed from: a */
    private int f22096a;
    /* renamed from: b */
    private int f22097b;

    public kjn() {
        this.f22096a = 0;
        this.f22097b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public static int m16564a(int i) {
        if ((i >= 0 && i <= 3) || ((i >= 10 && i <= 11) || ((i >= 20 && i <= 22) || (i >= 30 && i <= 32)))) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum MediaType");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22096a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22097b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjn m16565a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 3) {
                            StringBuilder stringBuilder = new StringBuilder(41);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum QueryType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22096a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.m5401b();
                    try {
                        this.f22097b = kjn.m16564a(kvc.m5410f());
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
        return m16565a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22096a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22097b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        super.writeTo(kvd);
    }
}
