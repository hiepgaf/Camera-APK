package p000;

/* compiled from: PG */
/* renamed from: kjk */
public final class kjk extends kvf {
    /* renamed from: a */
    private int f22089a;

    public kjk() {
        this.f22089a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22089a;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(1, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjk m16561a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.m5401b();
                    try {
                        this.f22089a = kjn.m16564a(kvc.m5410f());
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
        return m16561a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22089a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        super.writeTo(kvd);
    }
}
