package p000;

/* compiled from: PG */
/* renamed from: klq */
public final class klq extends kvf {
    /* renamed from: h */
    private static volatile klq[] f22382h;
    /* renamed from: a */
    public kke f22383a;
    /* renamed from: b */
    public kke f22384b;
    /* renamed from: c */
    public kke[] f22385c;
    /* renamed from: d */
    public kke[] f22386d;
    /* renamed from: e */
    public int f22387e;
    /* renamed from: f */
    public int f22388f;
    /* renamed from: g */
    public int f22389g;
    /* renamed from: i */
    private int f22390i;
    /* renamed from: j */
    private kke[] f22391j;

    public klq() {
        this.f22390i = 0;
        this.f22383a = null;
        this.f22384b = null;
        this.f22385c = kke.m16578a();
        this.f22391j = kke.m16578a();
        this.f22386d = kke.m16578a();
        this.f22387e = 0;
        this.f22388f = 0;
        this.f22389g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        kke[] kkeArr;
        kvl kvl;
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f22390i;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5415a(1, i2);
        }
        kvl kvl2 = this.f22383a;
        if (kvl2 != null) {
            computeSerializedSize += kvd.m5418a(2, kvl2);
        }
        kvl2 = this.f22384b;
        if (kvl2 != null) {
            computeSerializedSize += kvd.m5418a(3, kvl2);
        }
        kke[] kkeArr2 = this.f22385c;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kkeArr = this.f22385c;
                if (computeSerializedSize >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[computeSerializedSize];
                if (kvl != null) {
                    i2 += kvd.m5418a(10, kvl);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        kkeArr2 = this.f22391j;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = 0;
            while (true) {
                kkeArr = this.f22391j;
                if (i2 >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[i2];
                if (kvl != null) {
                    computeSerializedSize += kvd.m5418a(11, kvl);
                }
                i2++;
            }
        }
        kkeArr2 = this.f22386d;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            while (true) {
                kkeArr2 = this.f22386d;
                if (i >= kkeArr2.length) {
                    break;
                }
                kvl2 = kkeArr2[i];
                if (kvl2 != null) {
                    computeSerializedSize += kvd.m5418a(12, kvl2);
                }
                i++;
            }
        }
        i = this.f22387e;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(22, i);
        }
        i = this.f22388f;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(23, i);
        }
        i = this.f22389g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(24, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static klq[] m16604a() {
        if (f22382h == null) {
            synchronized (kvj.f8655b) {
                if (f22382h == null) {
                    f22382h = new klq[0];
                }
            }
        }
        return f22382h;
    }

    /* renamed from: a */
    private final klq m16603a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            Object obj;
            Object obj2;
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        this.f22390i = kjj.m16560b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    if (this.f22383a == null) {
                        this.f22383a = new kke();
                    }
                    kvc.m5399a(this.f22383a);
                    continue;
                case 26:
                    if (this.f22384b == null) {
                        this.f22384b = new kke();
                    }
                    kvc.m5399a(this.f22384b);
                    continue;
                case 82:
                    b = kvn.m5457a(kvc, 82);
                    obj = this.f22385c;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new kke[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kke();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kke();
                    kvc.m5399a(obj2[i]);
                    this.f22385c = obj2;
                    continue;
                case 90:
                    b = kvn.m5457a(kvc, 90);
                    obj = this.f22391j;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new kke[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kke();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kke();
                    kvc.m5399a(obj2[i]);
                    this.f22391j = obj2;
                    continue;
                case 98:
                    b = kvn.m5457a(kvc, 98);
                    obj = this.f22386d;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new kke[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kke();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kke();
                    kvc.m5399a(obj2[i]);
                    this.f22386d = obj2;
                    continue;
                case 176:
                    this.f22387e = kvc.m5410f();
                    continue;
                case 184:
                    this.f22388f = kvc.m5410f();
                    continue;
                case 192:
                    this.f22389g = kvc.m5410f();
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
        return m16603a(kvc);
    }

    public final void writeTo(kvd kvd) {
        kke[] kkeArr;
        kvl kvl;
        int i = 0;
        int i2 = this.f22390i;
        if (i2 != 0) {
            kvd.m5431b(1, i2);
        }
        kvl kvl2 = this.f22383a;
        if (kvl2 != null) {
            kvd.m5434b(2, kvl2);
        }
        kvl2 = this.f22384b;
        if (kvl2 != null) {
            kvd.m5434b(3, kvl2);
        }
        kke[] kkeArr2 = this.f22385c;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = 0;
            while (true) {
                kkeArr = this.f22385c;
                if (i2 >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[i2];
                if (kvl != null) {
                    kvd.m5434b(10, kvl);
                }
                i2++;
            }
        }
        kkeArr2 = this.f22391j;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            i2 = 0;
            while (true) {
                kkeArr = this.f22391j;
                if (i2 >= kkeArr.length) {
                    break;
                }
                kvl = kkeArr[i2];
                if (kvl != null) {
                    kvd.m5434b(11, kvl);
                }
                i2++;
            }
        }
        kkeArr2 = this.f22386d;
        if (kkeArr2 != null && kkeArr2.length > 0) {
            while (true) {
                kkeArr2 = this.f22386d;
                if (i >= kkeArr2.length) {
                    break;
                }
                kvl2 = kkeArr2[i];
                if (kvl2 != null) {
                    kvd.m5434b(12, kvl2);
                }
                i++;
            }
        }
        i2 = this.f22387e;
        if (i2 != 0) {
            kvd.m5431b(22, i2);
        }
        i2 = this.f22388f;
        if (i2 != 0) {
            kvd.m5431b(23, i2);
        }
        i2 = this.f22389g;
        if (i2 != 0) {
            kvd.m5431b(24, i2);
        }
        super.writeTo(kvd);
    }
}
