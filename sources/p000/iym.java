package p000;

/* compiled from: PG */
/* renamed from: iym */
public final class iym extends kvf {
    /* renamed from: a */
    private long f21800a;
    /* renamed from: b */
    private long f21801b;
    /* renamed from: c */
    private long f21802c;
    /* renamed from: d */
    private float f21803d;
    /* renamed from: e */
    private float f21804e;
    /* renamed from: f */
    private long f21805f;
    /* renamed from: g */
    private iyn f21806g;
    /* renamed from: h */
    private float f21807h;
    /* renamed from: i */
    private int f21808i;
    /* renamed from: j */
    private int f21809j;
    /* renamed from: k */
    private int f21810k;
    /* renamed from: l */
    private iyn f21811l;
    /* renamed from: m */
    private int f21812m;
    /* renamed from: n */
    private int f21813n;

    public iym() {
        this.f21800a = 0;
        this.f21801b = 0;
        this.f21802c = 0;
        this.f21803d = 0.0f;
        this.f21804e = 0.0f;
        this.f21805f = 0;
        this.f21806g = null;
        this.f21807h = 0.0f;
        this.f21808i = 0;
        this.f21809j = 0;
        this.f21810k = 0;
        this.f21811l = null;
        this.f21812m = 0;
        this.f21813n = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f21800a;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.f21801b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.f21802c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        if (Float.floatToIntBits(this.f21803d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        if (Float.floatToIntBits(this.f21804e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(40) + 4;
        }
        j = this.f21805f;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(6, j);
        }
        kvl kvl = this.f21806g;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(7, kvl);
        }
        if (Float.floatToIntBits(this.f21807h) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(64) + 4;
        }
        int i = this.f21808i;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(9, i);
        }
        i = this.f21809j;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(10, i);
        }
        i = this.f21810k;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(11, i);
        }
        kvl = this.f21811l;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(12, kvl);
        }
        i = this.f21812m;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(13, i);
        }
        i = this.f21813n;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(14, i);
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
                    this.f21800a = kvc.m5411g();
                    continue;
                case 16:
                    this.f21801b = kvc.m5411g();
                    continue;
                case 24:
                    this.f21802c = kvc.m5411g();
                    continue;
                case 37:
                    this.f21803d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 45:
                    this.f21804e = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 48:
                    this.f21805f = kvc.m5411g();
                    continue;
                case 58:
                    if (this.f21806g == null) {
                        this.f21806g = new iyn();
                    }
                    kvc.m5399a(this.f21806g);
                    continue;
                case 69:
                    this.f21807h = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 72:
                    this.f21808i = kvc.m5410f();
                    continue;
                case 80:
                    this.f21809j = kvc.m5410f();
                    continue;
                case 88:
                    this.f21810k = kvc.m5410f();
                    continue;
                case 98:
                    if (this.f21811l == null) {
                        this.f21811l = new iyn();
                    }
                    kvc.m5399a(this.f21811l);
                    continue;
                case 104:
                    this.f21812m = kvc.m5410f();
                    continue;
                case 112:
                    this.f21813n = kvc.m5410f();
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
        long j = this.f21800a;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.f21801b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.f21802c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        if (Float.floatToIntBits(this.f21803d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f21803d);
        }
        if (Float.floatToIntBits(this.f21804e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f21804e);
        }
        j = this.f21805f;
        if (j != 0) {
            kvd.m5432b(6, j);
        }
        kvl kvl = this.f21806g;
        if (kvl != null) {
            kvd.m5434b(7, kvl);
        }
        if (Float.floatToIntBits(this.f21807h) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(8, this.f21807h);
        }
        int i = this.f21808i;
        if (i != 0) {
            kvd.m5431b(9, i);
        }
        i = this.f21809j;
        if (i != 0) {
            kvd.m5431b(10, i);
        }
        i = this.f21810k;
        if (i != 0) {
            kvd.m5431b(11, i);
        }
        kvl = this.f21811l;
        if (kvl != null) {
            kvd.m5434b(12, kvl);
        }
        i = this.f21812m;
        if (i != 0) {
            kvd.m5431b(13, i);
        }
        i = this.f21813n;
        if (i != 0) {
            kvd.m5431b(14, i);
        }
        super.writeTo(kvd);
    }
}
