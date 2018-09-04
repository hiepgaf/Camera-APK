package p000;

/* compiled from: PG */
/* renamed from: klg */
public final class klg extends kvf {
    /* renamed from: a */
    public int f22345a;
    /* renamed from: b */
    public int f22346b;
    /* renamed from: c */
    public int f22347c;
    /* renamed from: d */
    public int f22348d;
    /* renamed from: e */
    public boolean f22349e;
    /* renamed from: f */
    public boolean f22350f;
    /* renamed from: g */
    public int f22351g;

    public klg() {
        this.f22345a = 0;
        this.f22346b = 0;
        this.f22347c = 0;
        this.f22348d = 0;
        this.f22349e = false;
        this.f22350f = false;
        this.f22351g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22345a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22346b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22347c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        i = this.f22348d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        if (this.f22349e) {
            computeSerializedSize += kvd.m5423b(40) + 1;
        }
        if (this.f22350f) {
            computeSerializedSize += kvd.m5423b(48) + 1;
        }
        i = this.f22351g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(7, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final klg m16593a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22345a = kvc.m5410f();
                    continue;
                case 16:
                    this.f22346b = kvc.m5410f();
                    continue;
                case 24:
                    this.f22347c = kvc.m5410f();
                    continue;
                case 32:
                    this.f22348d = kvc.m5410f();
                    continue;
                case 40:
                    this.f22349e = kvc.m5405c();
                    continue;
                case 48:
                    this.f22350f = kvc.m5405c();
                    continue;
                case 56:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 3) {
                            StringBuilder stringBuilder = new StringBuilder(46);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum MicrovideoMode");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22351g = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
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
        return m16593a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22345a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22346b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22347c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        i = this.f22348d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        boolean z = this.f22349e;
        if (z) {
            kvd.m5429a(5, z);
        }
        z = this.f22350f;
        if (z) {
            kvd.m5429a(6, z);
        }
        i = this.f22351g;
        if (i != 0) {
            kvd.m5431b(7, i);
        }
        super.writeTo(kvd);
    }
}
