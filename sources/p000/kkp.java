package p000;

/* compiled from: PG */
/* renamed from: kkp */
public final class kkp extends kvf {
    /* renamed from: a */
    private int f22268a;
    /* renamed from: b */
    private kkt f22269b;

    public kkp() {
        this.f22268a = 0;
        this.f22269b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22268a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        kvl kvl = this.f22269b;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(2, kvl);
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
                    this.f22268a = kvc.m5410f();
                    continue;
                case 18:
                    if (this.f22269b == null) {
                        this.f22269b = new kkt();
                    }
                    kvc.m5399a(this.f22269b);
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
        int i = this.f22268a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        kvl kvl = this.f22269b;
        if (kvl != null) {
            kvd.m5434b(2, kvl);
        }
        super.writeTo(kvd);
    }
}
