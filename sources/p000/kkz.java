package p000;

/* compiled from: PG */
/* renamed from: kkz */
public final class kkz extends kvf {
    /* renamed from: f */
    private static volatile kkz[] f22306f;
    /* renamed from: a */
    public int f22307a;
    /* renamed from: b */
    public float f22308b;
    /* renamed from: c */
    public float f22309c;
    /* renamed from: d */
    public float f22310d;
    /* renamed from: e */
    public long f22311e;
    /* renamed from: g */
    private kkb[] f22312g;

    public kkz() {
        this.f22307a = 0;
        this.f22308b = 0.0f;
        this.f22309c = 0.0f;
        this.f22310d = 0.0f;
        this.f22311e = 0;
        this.f22312g = kkb.m16576a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22307a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        if (Float.floatToIntBits(this.f22308b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        if (Float.floatToIntBits(this.f22309c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (Float.floatToIntBits(this.f22310d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        long j = this.f22311e;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(5, j);
        }
        kkb[] kkbArr = this.f22312g;
        if (kkbArr == null || kkbArr.length <= 0) {
            return computeSerializedSize;
        }
        i = computeSerializedSize;
        computeSerializedSize = 0;
        while (true) {
            kkb[] kkbArr2 = this.f22312g;
            if (computeSerializedSize >= kkbArr2.length) {
                return i;
            }
            kvl kvl = kkbArr2[computeSerializedSize];
            if (kvl != null) {
                i += kvd.m5418a(6, kvl);
            }
            computeSerializedSize++;
        }
    }

    /* renamed from: a */
    public static kkz[] m16588a() {
        if (f22306f == null) {
            synchronized (kvj.f8655b) {
                if (f22306f == null) {
                    f22306f = new kkz[0];
                }
            }
        }
        return f22306f;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22307a = kvc.m5410f();
                    continue;
                case 21:
                    this.f22308b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 29:
                    this.f22309c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 37:
                    this.f22310d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 40:
                    this.f22311e = kvc.m5411g();
                    continue;
                case 50:
                    int a = kvn.m5457a(kvc, 50);
                    Object obj = this.f22312g;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kkb[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kkb();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kkb();
                    kvc.m5399a(obj2[i]);
                    this.f22312g = obj2;
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
        int i = this.f22307a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        if (Float.floatToIntBits(this.f22308b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22308b);
        }
        if (Float.floatToIntBits(this.f22309c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22309c);
        }
        if (Float.floatToIntBits(this.f22310d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22310d);
        }
        long j = this.f22311e;
        if (j != 0) {
            kvd.m5432b(5, j);
        }
        kkb[] kkbArr = this.f22312g;
        if (kkbArr != null && kkbArr.length > 0) {
            i = 0;
            while (true) {
                kkb[] kkbArr2 = this.f22312g;
                if (i >= kkbArr2.length) {
                    break;
                }
                kvl kvl = kkbArr2[i];
                if (kvl != null) {
                    kvd.m5434b(6, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
