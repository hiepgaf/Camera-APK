package p000;

/* compiled from: PG */
/* renamed from: kjl */
public final class kjl extends kvf {
    /* renamed from: a */
    private long f22090a;
    /* renamed from: b */
    private int f22091b;
    /* renamed from: c */
    private kjn f22092c;
    /* renamed from: d */
    private kjk f22093d;
    /* renamed from: e */
    private kjm f22094e;

    public kjl() {
        this.f22090a = 0;
        this.f22091b = 0;
        this.f22092c = null;
        this.f22093d = null;
        this.f22094e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22090a;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        int i = this.f22091b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        kvl kvl = this.f22092c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(3, kvl);
        }
        kvl = this.f22093d;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(4, kvl);
        }
        kvl = this.f22094e;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(5, kvl);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjl m16562a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22090a = kvc.m5411g();
                    continue;
                case 16:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 4) {
                            StringBuilder stringBuilder = new StringBuilder(42);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ActionType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22091b = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 26:
                    if (this.f22092c == null) {
                        this.f22092c = new kjn();
                    }
                    kvc.m5399a(this.f22092c);
                    continue;
                case 34:
                    if (this.f22093d == null) {
                        this.f22093d = new kjk();
                    }
                    kvc.m5399a(this.f22093d);
                    continue;
                case 42:
                    if (this.f22094e == null) {
                        this.f22094e = new kjm();
                    }
                    kvc.m5399a(this.f22094e);
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
        return m16562a(kvc);
    }

    public final void writeTo(kvd kvd) {
        long j = this.f22090a;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        int i = this.f22091b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        kvl kvl = this.f22092c;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        kvl = this.f22093d;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        kvl = this.f22094e;
        if (kvl != null) {
            kvd.m5434b(5, kvl);
        }
        super.writeTo(kvd);
    }
}
