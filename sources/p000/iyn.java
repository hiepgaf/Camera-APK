package p000;

/* compiled from: PG */
/* renamed from: iyn */
public final class iyn extends kvf {
    /* renamed from: a */
    private int f21814a;
    /* renamed from: b */
    private int f21815b;
    /* renamed from: c */
    private int f21816c;
    /* renamed from: d */
    private int f21817d;

    public iyn() {
        this.f21814a = 0;
        this.f21815b = 0;
        this.f21816c = 0;
        this.f21817d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f21814a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f21815b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f21816c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        i = this.f21817d;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(4, i);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f21814a = kvc.m5410f();
                    continue;
                case 16:
                    this.f21815b = kvc.m5410f();
                    continue;
                case 24:
                    this.f21816c = kvc.m5410f();
                    continue;
                case 32:
                    this.f21817d = kvc.m5410f();
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
        int i = this.f21814a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f21815b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f21816c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        i = this.f21817d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        super.writeTo(kvd);
    }
}
