package p000;

/* compiled from: PG */
/* renamed from: kkx */
public final class kkx extends kvf {
    /* renamed from: a */
    public boolean f22292a;
    /* renamed from: b */
    public boolean f22293b;
    /* renamed from: c */
    public boolean f22294c;
    /* renamed from: d */
    public boolean f22295d;
    /* renamed from: e */
    public boolean f22296e;
    /* renamed from: f */
    public boolean f22297f;
    /* renamed from: g */
    public boolean f22298g;
    /* renamed from: h */
    public boolean f22299h;
    /* renamed from: i */
    public boolean f22300i;
    /* renamed from: j */
    private int f22301j;
    /* renamed from: k */
    private int f22302k;
    /* renamed from: l */
    private float f22303l;
    /* renamed from: m */
    private int f22304m;

    public kkx() {
        this.f22301j = 0;
        this.f22302k = 0;
        this.f22292a = false;
        this.f22293b = false;
        this.f22294c = false;
        this.f22295d = false;
        this.f22296e = false;
        this.f22297f = false;
        this.f22298g = false;
        this.f22299h = false;
        this.f22300i = false;
        this.f22303l = 0.0f;
        this.f22304m = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22301j;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22302k;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        if (this.f22292a) {
            computeSerializedSize += kvd.m5423b(24) + 1;
        }
        if (this.f22293b) {
            computeSerializedSize += kvd.m5423b(32) + 1;
        }
        if (this.f22294c) {
            computeSerializedSize += kvd.m5423b(40) + 1;
        }
        if (this.f22295d) {
            computeSerializedSize += kvd.m5423b(48) + 1;
        }
        if (this.f22296e) {
            computeSerializedSize += kvd.m5423b(56) + 1;
        }
        if (this.f22297f) {
            computeSerializedSize += kvd.m5423b(64) + 1;
        }
        if (this.f22298g) {
            computeSerializedSize += kvd.m5423b(72) + 1;
        }
        if (this.f22299h) {
            computeSerializedSize += kvd.m5423b(80) + 1;
        }
        if (this.f22300i) {
            computeSerializedSize += kvd.m5423b(88) + 1;
        }
        if (Float.floatToIntBits(this.f22303l) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(96) + 4;
        }
        i = this.f22304m;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(13, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kkx m16586a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22301j = kvc.m5410f();
                    continue;
                case 16:
                    this.f22302k = kvc.m5410f();
                    continue;
                case 24:
                    this.f22292a = kvc.m5405c();
                    continue;
                case 32:
                    this.f22293b = kvc.m5405c();
                    continue;
                case 40:
                    this.f22294c = kvc.m5405c();
                    continue;
                case 48:
                    this.f22295d = kvc.m5405c();
                    continue;
                case 56:
                    this.f22296e = kvc.m5405c();
                    continue;
                case 64:
                    this.f22297f = kvc.m5405c();
                    continue;
                case 72:
                    this.f22298g = kvc.m5405c();
                    continue;
                case 80:
                    this.f22299h = kvc.m5405c();
                    continue;
                case 88:
                    this.f22300i = kvc.m5405c();
                    continue;
                case 101:
                    this.f22303l = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 104:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 3) {
                            StringBuilder stringBuilder = new StringBuilder(39);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum Quality");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22304m = f;
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
        return m16586a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22301j;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22302k;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        boolean z = this.f22292a;
        if (z) {
            kvd.m5429a(3, z);
        }
        z = this.f22293b;
        if (z) {
            kvd.m5429a(4, z);
        }
        z = this.f22294c;
        if (z) {
            kvd.m5429a(5, z);
        }
        z = this.f22295d;
        if (z) {
            kvd.m5429a(6, z);
        }
        z = this.f22296e;
        if (z) {
            kvd.m5429a(7, z);
        }
        z = this.f22297f;
        if (z) {
            kvd.m5429a(8, z);
        }
        z = this.f22298g;
        if (z) {
            kvd.m5429a(9, z);
        }
        z = this.f22299h;
        if (z) {
            kvd.m5429a(10, z);
        }
        z = this.f22300i;
        if (z) {
            kvd.m5429a(11, z);
        }
        if (Float.floatToIntBits(this.f22303l) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(12, this.f22303l);
        }
        i = this.f22304m;
        if (i != 0) {
            kvd.m5431b(13, i);
        }
        super.writeTo(kvd);
    }
}
