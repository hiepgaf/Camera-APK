package p000;

/* compiled from: PG */
/* renamed from: kkj */
public final class kkj extends kvf {
    /* renamed from: a */
    private int f22251a;
    /* renamed from: b */
    private kki f22252b;

    public kkj() {
        this.f22251a = -1;
        this.f22251a = -1;
        this.f22252b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f22251a == 0) {
            return computeSerializedSize + kvd.m5418a(1, this.f22252b);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    if (this.f22252b == null) {
                        this.f22252b = new kki();
                    }
                    kvc.m5399a(this.f22252b);
                    this.f22251a = 0;
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
        if (this.f22251a == 0) {
            kvd.m5434b(1, this.f22252b);
        }
        super.writeTo(kvd);
    }
}
