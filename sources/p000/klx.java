package p000;

/* compiled from: PG */
/* renamed from: klx */
public final class klx extends kvf {
    /* renamed from: a */
    public float f22417a;
    /* renamed from: b */
    public int f22418b;
    /* renamed from: c */
    public klz f22419c;
    /* renamed from: d */
    public klt[] f22420d;
    /* renamed from: e */
    public klv f22421e;
    /* renamed from: f */
    public kly f22422f;

    public klx() {
        this.f22417a = 0.0f;
        this.f22418b = 0;
        this.f22419c = null;
        this.f22420d = klt.m16607a();
        this.f22421e = null;
        this.f22422f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22417a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        int i = this.f22418b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        kvl kvl = this.f22419c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(3, kvl);
        }
        klt[] kltArr = this.f22420d;
        if (kltArr != null && kltArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                klt[] kltArr2 = this.f22420d;
                if (computeSerializedSize >= kltArr2.length) {
                    break;
                }
                kvl kvl2 = kltArr2[computeSerializedSize];
                if (kvl2 != null) {
                    i += kvd.m5418a(4, kvl2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        kvl = this.f22421e;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(5, kvl);
        }
        kvl = this.f22422f;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(6, kvl);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f22417a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 16:
                    this.f22418b = kvc.m5410f();
                    continue;
                case 26:
                    if (this.f22419c == null) {
                        this.f22419c = new klz();
                    }
                    kvc.m5399a(this.f22419c);
                    continue;
                case 34:
                    int a = kvn.m5457a(kvc, 34);
                    Object obj = this.f22420d;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new klt[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new klt();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new klt();
                    kvc.m5399a(obj2[i]);
                    this.f22420d = obj2;
                    continue;
                case 42:
                    if (this.f22421e == null) {
                        this.f22421e = new klv();
                    }
                    kvc.m5399a(this.f22421e);
                    continue;
                case 50:
                    if (this.f22422f == null) {
                        this.f22422f = new kly();
                    }
                    kvc.m5399a(this.f22422f);
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
        if (Float.floatToIntBits(this.f22417a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22417a);
        }
        int i = this.f22418b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        kvl kvl = this.f22419c;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        klt[] kltArr = this.f22420d;
        if (kltArr != null && kltArr.length > 0) {
            i = 0;
            while (true) {
                klt[] kltArr2 = this.f22420d;
                if (i >= kltArr2.length) {
                    break;
                }
                kvl kvl2 = kltArr2[i];
                if (kvl2 != null) {
                    kvd.m5434b(4, kvl2);
                }
                i++;
            }
        }
        kvl = this.f22421e;
        if (kvl != null) {
            kvd.m5434b(5, kvl);
        }
        kvl = this.f22422f;
        if (kvl != null) {
            kvd.m5434b(6, kvl);
        }
        super.writeTo(kvd);
    }
}
