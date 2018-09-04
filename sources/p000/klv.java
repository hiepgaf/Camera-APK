package p000;

/* compiled from: PG */
/* renamed from: klv */
public final class klv extends kvf {
    /* renamed from: a */
    public kmb f22409a;
    /* renamed from: b */
    public kmb f22410b;
    /* renamed from: c */
    public kmb f22411c;
    /* renamed from: d */
    public kmb f22412d;
    /* renamed from: e */
    public kmb f22413e;

    public klv() {
        this.f22409a = null;
        this.f22410b = null;
        this.f22411c = null;
        this.f22412d = null;
        this.f22413e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22409a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        kvl = this.f22410b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(2, kvl);
        }
        kvl = this.f22411c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(3, kvl);
        }
        kvl = this.f22412d;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(4, kvl);
        }
        kvl = this.f22413e;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(5, kvl);
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
                    if (this.f22409a == null) {
                        this.f22409a = new kmb();
                    }
                    kvc.m5399a(this.f22409a);
                    continue;
                case 18:
                    if (this.f22410b == null) {
                        this.f22410b = new kmb();
                    }
                    kvc.m5399a(this.f22410b);
                    continue;
                case 26:
                    if (this.f22411c == null) {
                        this.f22411c = new kmb();
                    }
                    kvc.m5399a(this.f22411c);
                    continue;
                case 34:
                    if (this.f22412d == null) {
                        this.f22412d = new kmb();
                    }
                    kvc.m5399a(this.f22412d);
                    continue;
                case 42:
                    if (this.f22413e == null) {
                        this.f22413e = new kmb();
                    }
                    kvc.m5399a(this.f22413e);
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
        kvl kvl = this.f22409a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        kvl = this.f22410b;
        if (kvl != null) {
            kvd.m5434b(2, kvl);
        }
        kvl = this.f22411c;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        kvl = this.f22412d;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        kvl = this.f22413e;
        if (kvl != null) {
            kvd.m5434b(5, kvl);
        }
        super.writeTo(kvd);
    }
}
