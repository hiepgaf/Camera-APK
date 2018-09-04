package p000;

/* compiled from: PG */
/* renamed from: kjy */
public final class kjy extends kvf {
    /* renamed from: a */
    public int f22135a;
    /* renamed from: b */
    public int f22136b;
    /* renamed from: c */
    public kmd f22137c;
    /* renamed from: d */
    public klr f22138d;
    /* renamed from: e */
    private long f22139e;

    public kjy() {
        this.f22135a = 0;
        this.f22136b = 0;
        this.f22139e = 0;
        this.f22137c = null;
        this.f22138d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22135a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22136b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        long j = this.f22139e;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        kvl kvl = this.f22137c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(10, kvl);
        }
        kvl = this.f22138d;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(11, kvl);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjy m16573a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 10) {
                            StringBuilder stringBuilder = new StringBuilder(43);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ControlType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22135a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.m5401b();
                    try {
                        this.f22136b = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 24:
                    this.f22139e = kvc.m5411g();
                    continue;
                case 82:
                    if (this.f22137c == null) {
                        this.f22137c = new kmd();
                    }
                    kvc.m5399a(this.f22137c);
                    continue;
                case 90:
                    if (this.f22138d == null) {
                        this.f22138d = new klr();
                    }
                    kvc.m5399a(this.f22138d);
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

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        return m16573a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22135a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22136b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        long j = this.f22139e;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        kvl kvl = this.f22137c;
        if (kvl != null) {
            kvd.m5434b(10, kvl);
        }
        kvl = this.f22138d;
        if (kvl != null) {
            kvd.m5434b(11, kvl);
        }
        super.writeTo(kvd);
    }
}
