package p000;

/* compiled from: PG */
/* renamed from: kkm */
public final class kkm extends kvf {
    /* renamed from: a */
    private long f22260a;
    /* renamed from: b */
    private kkr f22261b;
    /* renamed from: c */
    private kkn f22262c;
    /* renamed from: d */
    private int f22263d;
    /* renamed from: e */
    private int f22264e;

    public kkm() {
        this.f22260a = 0;
        this.f22261b = null;
        this.f22262c = null;
        this.f22263d = 0;
        this.f22264e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22260a;
        if (j != 0) {
            computeSerializedSize += kvd.m5424b(j);
        }
        kvl kvl = this.f22261b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(2, kvl);
        }
        kvl = this.f22262c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(3, kvl);
        }
        int i = this.f22263d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        i = this.f22264e;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(5, i);
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
                    this.f22260a = kvc.m5411g();
                    continue;
                case 18:
                    if (this.f22261b == null) {
                        this.f22261b = new kkr();
                    }
                    kvc.m5399a(this.f22261b);
                    continue;
                case 26:
                    if (this.f22262c == null) {
                        this.f22262c = new kkn();
                    }
                    kvc.m5399a(this.f22262c);
                    continue;
                case 32:
                    this.f22263d = kvc.m5410f();
                    continue;
                case 40:
                    this.f22264e = kvc.m5410f();
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
        long j = this.f22260a;
        if (j != 0) {
            kvd.m5437c(j);
        }
        kvl kvl = this.f22261b;
        if (kvl != null) {
            kvd.m5434b(2, kvl);
        }
        kvl = this.f22262c;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        int i = this.f22263d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        i = this.f22264e;
        if (i != 0) {
            kvd.m5431b(5, i);
        }
        super.writeTo(kvd);
    }
}
