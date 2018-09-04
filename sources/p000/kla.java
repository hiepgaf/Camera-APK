package p000;

/* compiled from: PG */
/* renamed from: kla */
public final class kla extends kvf {
    /* renamed from: a */
    public int f22313a;
    /* renamed from: b */
    public kkz[] f22314b;

    public kla() {
        this.f22313a = 0;
        this.f22314b = kkz.m16588a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22313a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        kkz[] kkzArr = this.f22314b;
        if (kkzArr == null || kkzArr.length <= 0) {
            return computeSerializedSize;
        }
        i = computeSerializedSize;
        computeSerializedSize = 0;
        while (true) {
            kkz[] kkzArr2 = this.f22314b;
            if (computeSerializedSize >= kkzArr2.length) {
                return i;
            }
            kvl kvl = kkzArr2[computeSerializedSize];
            if (kvl != null) {
                i += kvd.m5418a(2, kvl);
            }
            computeSerializedSize++;
        }
    }

    /* renamed from: a */
    private final kla m16589a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 2) {
                            StringBuilder stringBuilder = new StringBuilder(49);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ScoringMetricType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22313a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    b = kvn.m5457a(kvc, 18);
                    Object obj = this.f22314b;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kkz[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kkz();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kkz();
                    kvc.m5399a(obj2[i]);
                    this.f22314b = obj2;
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
        return m16589a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22313a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        kkz[] kkzArr = this.f22314b;
        if (kkzArr != null && kkzArr.length > 0) {
            i = 0;
            while (true) {
                kkz[] kkzArr2 = this.f22314b;
                if (i >= kkzArr2.length) {
                    break;
                }
                kvl kvl = kkzArr2[i];
                if (kvl != null) {
                    kvd.m5434b(2, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
