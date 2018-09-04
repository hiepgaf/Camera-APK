package p000;

/* compiled from: PG */
/* renamed from: kjw */
public final class kjw extends kvf {
    /* renamed from: a */
    public int f22127a;
    /* renamed from: b */
    public int f22128b;

    public kjw() {
        this.f22127a = 0;
        this.f22128b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    private static int m16569a(int i) {
        if (i >= 0 && i <= 7) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CaptureCommand");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22127a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22128b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjw m16570a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        this.f22127a = kjw.m16569a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.m5401b();
                    try {
                        this.f22128b = kjw.m16569a(kvc.m5410f());
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
        return m16570a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22127a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22128b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        super.writeTo(kvd);
    }
}
