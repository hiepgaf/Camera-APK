package p000;

/* compiled from: PG */
/* renamed from: kmd */
public final class kmd extends kvf {
    /* renamed from: a */
    public kme f22439a;
    /* renamed from: b */
    public float f22440b;
    /* renamed from: c */
    public boolean f22441c;
    /* renamed from: d */
    private kkb[] f22442d;
    /* renamed from: e */
    private kls f22443e;

    public kmd() {
        this.f22439a = null;
        this.f22440b = 0.0f;
        this.f22442d = kkb.m16576a();
        this.f22443e = null;
        this.f22441c = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.f22439a;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        if (Float.floatToIntBits(this.f22440b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        kkb[] kkbArr = this.f22442d;
        if (kkbArr != null && kkbArr.length > 0) {
            int i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kkb[] kkbArr2 = this.f22442d;
                if (computeSerializedSize >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[computeSerializedSize];
                if (kvl2 != null) {
                    i += kvd.m5418a(3, kvl2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        kvl = this.f22443e;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(4, kvl);
        }
        if (this.f22441c) {
            return computeSerializedSize + (kvd.m5423b(40) + 1);
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
                    if (this.f22439a == null) {
                        this.f22439a = new kme();
                    }
                    kvc.m5399a(this.f22439a);
                    continue;
                case 21:
                    this.f22440b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 26:
                    int a = kvn.m5457a(kvc, 26);
                    Object obj = this.f22442d;
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
                    this.f22442d = obj2;
                    continue;
                case 34:
                    if (this.f22443e == null) {
                        this.f22443e = new kls();
                    }
                    kvc.m5399a(this.f22443e);
                    continue;
                case 40:
                    this.f22441c = kvc.m5405c();
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
        kvl kvl = this.f22439a;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        if (Float.floatToIntBits(this.f22440b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22440b);
        }
        kkb[] kkbArr = this.f22442d;
        if (kkbArr != null && kkbArr.length > 0) {
            int i = 0;
            while (true) {
                kkb[] kkbArr2 = this.f22442d;
                if (i >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[i];
                if (kvl2 != null) {
                    kvd.m5434b(3, kvl2);
                }
                i++;
            }
        }
        kvl = this.f22443e;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        boolean z = this.f22441c;
        if (z) {
            kvd.m5429a(5, z);
        }
        super.writeTo(kvd);
    }
}
