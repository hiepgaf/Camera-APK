package p000;

/* compiled from: PG */
/* renamed from: kln */
public final class kln extends kvf {
    /* renamed from: a */
    public int f22371a;
    /* renamed from: b */
    public int f22372b;
    /* renamed from: c */
    public int f22373c;

    public kln() {
        this.f22371a = 0;
        this.f22372b = 0;
        this.f22373c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22371a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22372b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22373c;
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
                    this.f22371a = kvc.m5410f();
                    continue;
                case 16:
                    this.f22372b = kvc.m5410f();
                    continue;
                case 24:
                    this.f22373c = kvc.m5410f();
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
        int i = this.f22371a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22372b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22373c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        super.writeTo(kvd);
    }
}
