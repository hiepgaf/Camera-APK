package p000;

/* compiled from: PG */
/* renamed from: klz */
public final class klz extends kvf {
    /* renamed from: a */
    public int f22428a;
    /* renamed from: b */
    public int f22429b;
    /* renamed from: c */
    public int f22430c;

    public klz() {
        this.f22428a = 0;
        this.f22429b = 0;
        this.f22430c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22428a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22429b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22430c;
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
                case 8:
                    this.f22428a = kvc.m5410f();
                    continue;
                case 16:
                    this.f22429b = kvc.m5410f();
                    continue;
                case 24:
                    this.f22430c = kvc.m5410f();
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
        int i = this.f22428a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22429b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22430c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        super.writeTo(kvd);
    }
}
