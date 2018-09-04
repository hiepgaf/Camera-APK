package p000;

/* compiled from: PG */
/* renamed from: kjh */
public final class kjh extends kvf {
    /* renamed from: a */
    private static volatile kjh[] f22070a;
    /* renamed from: b */
    private long f22071b;
    /* renamed from: c */
    private long f22072c;
    /* renamed from: d */
    private float f22073d;
    /* renamed from: e */
    private float f22074e;
    /* renamed from: f */
    private float f22075f;
    /* renamed from: g */
    private float f22076g;
    /* renamed from: h */
    private int f22077h;
    /* renamed from: i */
    private int f22078i;
    /* renamed from: j */
    private int f22079j;
    /* renamed from: k */
    private int f22080k;
    /* renamed from: l */
    private kls f22081l;
    /* renamed from: m */
    private float f22082m;
    /* renamed from: n */
    private float f22083n;

    public kjh() {
        this.f22071b = 0;
        this.f22072c = 0;
        this.f22073d = 0.0f;
        this.f22074e = 0.0f;
        this.f22075f = 0.0f;
        this.f22076g = 0.0f;
        this.f22077h = 0;
        this.f22078i = 0;
        this.f22079j = 0;
        this.f22080k = 0;
        this.f22081l = null;
        this.f22082m = 0.0f;
        this.f22083n = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22071b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.f22072c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        if (Float.floatToIntBits(this.f22073d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (Float.floatToIntBits(this.f22074e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        if (Float.floatToIntBits(this.f22075f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(40) + 4;
        }
        if (Float.floatToIntBits(this.f22076g) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(48) + 4;
        }
        int i = this.f22077h;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(7, i);
        }
        i = this.f22078i;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(8, i);
        }
        i = this.f22079j;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(9, i);
        }
        i = this.f22080k;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(10, i);
        }
        kvl kvl = this.f22081l;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(20, kvl);
        }
        if (Float.floatToIntBits(this.f22082m) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(168) + 4;
        }
        if (Float.floatToIntBits(this.f22083n) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(176) + 4);
    }

    /* renamed from: a */
    public static kjh[] m16556a() {
        if (f22070a == null) {
            synchronized (kvj.f8655b) {
                if (f22070a == null) {
                    f22070a = new kjh[0];
                }
            }
        }
        return f22070a;
    }

    /* renamed from: a */
    private final kjh m16555a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22071b = kvc.m5411g();
                    continue;
                case 16:
                    this.f22072c = kvc.m5411g();
                    continue;
                case 29:
                    this.f22073d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 37:
                    this.f22074e = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 45:
                    this.f22075f = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 53:
                    this.f22076g = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 56:
                    this.f22077h = kvc.m5410f();
                    continue;
                case 64:
                    this.f22078i = kvc.m5410f();
                    continue;
                case 72:
                    this.f22079j = kvc.m5410f();
                    continue;
                case 80:
                    int b = kvc.m5401b();
                    try {
                        this.f22080k = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 162:
                    if (this.f22081l == null) {
                        this.f22081l = new kls();
                    }
                    kvc.m5399a(this.f22081l);
                    continue;
                case 173:
                    this.f22082m = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 181:
                    this.f22083n = Float.intBitsToFloat(kvc.m5406d());
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
        return m16555a(kvc);
    }

    public final void writeTo(kvd kvd) {
        long j = this.f22071b;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.f22072c;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        if (Float.floatToIntBits(this.f22073d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22073d);
        }
        if (Float.floatToIntBits(this.f22074e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22074e);
        }
        if (Float.floatToIntBits(this.f22075f) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f22075f);
        }
        if (Float.floatToIntBits(this.f22076g) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(6, this.f22076g);
        }
        int i = this.f22077h;
        if (i != 0) {
            kvd.m5431b(7, i);
        }
        i = this.f22078i;
        if (i != 0) {
            kvd.m5431b(8, i);
        }
        i = this.f22079j;
        if (i != 0) {
            kvd.m5431b(9, i);
        }
        i = this.f22080k;
        if (i != 0) {
            kvd.m5431b(10, i);
        }
        kvl kvl = this.f22081l;
        if (kvl != null) {
            kvd.m5434b(20, kvl);
        }
        if (Float.floatToIntBits(this.f22082m) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(21, this.f22082m);
        }
        if (Float.floatToIntBits(this.f22083n) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(22, this.f22083n);
        }
        super.writeTo(kvd);
    }
}
