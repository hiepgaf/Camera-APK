package p000;

/* compiled from: PG */
/* renamed from: kjj */
public final class kjj extends kvf {
    /* renamed from: a */
    public int f22087a;
    /* renamed from: b */
    private int f22088b;

    public kjj() {
        this.f22088b = 0;
        this.f22087a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public static int m16558a(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CameraDirection");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static int m16560b(int i) {
        if ((i >= 0 && i <= 1) || (i >= 9 && i <= 14)) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CaptureMode");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22088b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22087a;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjj m16559a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        this.f22088b = kjj.m16558a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.m5401b();
                    try {
                        this.f22087a = kjj.m16560b(kvc.m5410f());
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
        return m16559a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22088b;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22087a;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        super.writeTo(kvd);
    }
}
