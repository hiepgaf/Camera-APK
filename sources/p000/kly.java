package p000;

/* compiled from: PG */
/* renamed from: kly */
public final class kly extends kvf {
    /* renamed from: a */
    public int f22423a;
    /* renamed from: b */
    public kma[] f22424b;
    /* renamed from: c */
    private int f22425c;
    /* renamed from: d */
    private int f22426d;
    /* renamed from: e */
    private int f22427e;

    public kly() {
        this.f22423a = 0;
        this.f22424b = kma.m16609a();
        this.f22425c = 0;
        this.f22426d = 0;
        this.f22427e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22423a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        kma[] kmaArr = this.f22424b;
        if (kmaArr != null && kmaArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kma[] kmaArr2 = this.f22424b;
                if (computeSerializedSize >= kmaArr2.length) {
                    break;
                }
                kvl kvl = kmaArr2[computeSerializedSize];
                if (kvl != null) {
                    i += kvd.m5418a(2, kvl);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        i = this.f22425c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        i = this.f22426d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        i = this.f22427e;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(5, i);
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
                    this.f22423a = kvc.m5410f();
                    continue;
                case 18:
                    int a = kvn.m5457a(kvc, 18);
                    Object obj = this.f22424b;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kma[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kma();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kma();
                    kvc.m5399a(obj2[i]);
                    this.f22424b = obj2;
                    continue;
                case 24:
                    this.f22425c = kvc.m5410f();
                    continue;
                case 32:
                    this.f22426d = kvc.m5410f();
                    continue;
                case 40:
                    this.f22427e = kvc.m5410f();
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
        int i = this.f22423a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        kma[] kmaArr = this.f22424b;
        if (kmaArr != null && kmaArr.length > 0) {
            i = 0;
            while (true) {
                kma[] kmaArr2 = this.f22424b;
                if (i >= kmaArr2.length) {
                    break;
                }
                kvl kvl = kmaArr2[i];
                if (kvl != null) {
                    kvd.m5434b(2, kvl);
                }
                i++;
            }
        }
        i = this.f22425c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        i = this.f22426d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        i = this.f22427e;
        if (i != 0) {
            kvd.m5431b(5, i);
        }
        super.writeTo(kvd);
    }
}
