package p000;

/* compiled from: PG */
/* renamed from: iyq */
public final class iyq extends kvf {
    /* renamed from: a */
    public iyp f21825a;

    public iyq() {
        this.f21825a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f21825a;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(1, kvl);
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
                    if (this.f21825a == null) {
                        this.f21825a = new iyp();
                    }
                    kvc.m5399a(this.f21825a);
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
        kvl kvl = this.f21825a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        super.writeTo(kvd);
    }
}
