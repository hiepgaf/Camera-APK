package p000;

/* compiled from: PG */
/* renamed from: kle */
public final class kle extends kvf {
    /* renamed from: a */
    private String f22334a;
    /* renamed from: b */
    private float f22335b;
    /* renamed from: c */
    private long f22336c;
    /* renamed from: d */
    private long f22337d;
    /* renamed from: e */
    private long[] f22338e;

    public kle() {
        this.f22334a = "";
        this.f22335b = 0.0f;
        this.f22336c = 0;
        this.f22337d = 0;
        this.f22338e = kvn.f8663f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f22334a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f22334a);
        }
        if (Float.floatToIntBits(this.f22335b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        long j = this.f22336c;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        j = this.f22337d;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(4, j);
        }
        long[] jArr = this.f22338e;
        if (jArr == null || jArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        while (true) {
            long[] jArr2 = this.f22338e;
            int length = jArr2.length;
            if (i >= length) {
                return (computeSerializedSize + i2) + length;
            }
            i2 += kvd.m5419a(jArr2[i]);
            i++;
        }
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            int a;
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f22334a = kvc.m5412h();
                    continue;
                case 21:
                    this.f22335b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 24:
                    this.f22336c = kvc.m5411g();
                    continue;
                case 32:
                    this.f22337d = kvc.m5411g();
                    continue;
                case 40:
                    a = kvn.m5457a(kvc, 40);
                    Object obj = this.f22338e;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new long[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = kvc.m5411g();
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = kvc.m5411g();
                    this.f22338e = obj2;
                    continue;
                case 42:
                    int c = kvc.m5404c(kvc.m5410f());
                    a = kvc.m5401b();
                    i = 0;
                    while (kvc.m5397a() > 0) {
                        kvc.m5411g();
                        i++;
                    }
                    kvc.m5407d(a);
                    Object obj3 = this.f22338e;
                    if (obj3 != null) {
                        a = obj3.length;
                    } else {
                        a = 0;
                    }
                    Object obj4 = new long[(i + a)];
                    if (a != 0) {
                        System.arraycopy(obj3, 0, obj4, 0, a);
                    }
                    while (a < obj4.length) {
                        obj4[a] = kvc.m5411g();
                        a++;
                    }
                    this.f22338e = obj4;
                    kvc.m5402b(c);
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
        String str = this.f22334a;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f22334a);
        }
        if (Float.floatToIntBits(this.f22335b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22335b);
        }
        long j = this.f22336c;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        j = this.f22337d;
        if (j != 0) {
            kvd.m5432b(4, j);
        }
        long[] jArr = this.f22338e;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.f22338e;
                if (i >= jArr2.length) {
                    break;
                }
                kvd.m5432b(5, jArr2[i]);
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
