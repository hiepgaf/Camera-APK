package p000;

/* compiled from: PG */
/* renamed from: kkc */
public final class kkc extends kvf {
    /* renamed from: a */
    private int f22168a;
    /* renamed from: b */
    private int[] f22169b;
    /* renamed from: c */
    private int[] f22170c;
    /* renamed from: d */
    private int f22171d;

    public kkc() {
        this.f22168a = 0;
        this.f22169b = kvn.f8662e;
        this.f22170c = kvn.f8662e;
        this.f22171d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f22168a;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5415a(1, i2);
        }
        int[] iArr = this.f22169b;
        if (iArr != null && iArr.length > 0) {
            i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f22169b;
                if (i2 >= iArr2.length) {
                    break;
                }
                i3 += kvd.m5414a(iArr2[i2]);
                i2++;
            }
            computeSerializedSize = ((computeSerializedSize + i3) + 1) + kvd.m5423b(i3);
        }
        iArr = this.f22170c;
        if (iArr != null && iArr.length > 0) {
            i2 = 0;
            while (true) {
                int[] iArr3 = this.f22170c;
                if (i >= iArr3.length) {
                    break;
                }
                i2 += kvd.m5414a(iArr3[i]);
                i++;
            }
            computeSerializedSize = ((computeSerializedSize + i2) + 1) + kvd.m5423b(i2);
        }
        i2 = this.f22171d;
        if (i2 != 0) {
            return computeSerializedSize + kvd.m5415a(4, i2);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            int a;
            Object obj;
            Object obj2;
            int c;
            Object obj3;
            Object obj4;
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22168a = kvc.m5410f();
                    continue;
                case 16:
                    a = kvn.m5457a(kvc, 16);
                    obj = this.f22169b;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new int[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = kvc.m5410f();
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = kvc.m5410f();
                    this.f22169b = obj2;
                    continue;
                case 18:
                    c = kvc.m5404c(kvc.m5410f());
                    a = kvc.m5401b();
                    i = 0;
                    while (kvc.m5397a() > 0) {
                        kvc.m5410f();
                        i++;
                    }
                    kvc.m5407d(a);
                    obj3 = this.f22169b;
                    if (obj3 != null) {
                        a = obj3.length;
                    } else {
                        a = 0;
                    }
                    obj4 = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(obj3, 0, obj4, 0, a);
                    }
                    while (a < obj4.length) {
                        obj4[a] = kvc.m5410f();
                        a++;
                    }
                    this.f22169b = obj4;
                    kvc.m5402b(c);
                    continue;
                case 24:
                    a = kvn.m5457a(kvc, 24);
                    obj = this.f22170c;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new int[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = kvc.m5410f();
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = kvc.m5410f();
                    this.f22170c = obj2;
                    continue;
                case 26:
                    c = kvc.m5404c(kvc.m5410f());
                    a = kvc.m5401b();
                    i = 0;
                    while (kvc.m5397a() > 0) {
                        kvc.m5410f();
                        i++;
                    }
                    kvc.m5407d(a);
                    obj3 = this.f22170c;
                    if (obj3 != null) {
                        a = obj3.length;
                    } else {
                        a = 0;
                    }
                    obj4 = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(obj3, 0, obj4, 0, a);
                    }
                    while (a < obj4.length) {
                        obj4[a] = kvc.m5410f();
                        a++;
                    }
                    this.f22170c = obj4;
                    kvc.m5402b(c);
                    continue;
                case 32:
                    this.f22171d = kvc.m5410f();
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
        int i;
        int[] iArr;
        int i2 = 0;
        int i3 = this.f22168a;
        if (i3 != 0) {
            kvd.m5431b(1, i3);
        }
        int[] iArr2 = this.f22169b;
        if (iArr2 != null && iArr2.length > 0) {
            i3 = 0;
            i = 0;
            while (true) {
                iArr = this.f22169b;
                if (i3 >= iArr.length) {
                    break;
                }
                i += kvd.m5414a(iArr[i3]);
                i3++;
            }
            kvd.m5439e(18);
            kvd.m5439e(i);
            i3 = 0;
            while (true) {
                int[] iArr3 = this.f22169b;
                if (i3 >= iArr3.length) {
                    break;
                }
                kvd.m5435c(iArr3[i3]);
                i3++;
            }
        }
        iArr2 = this.f22170c;
        if (iArr2 != null && iArr2.length > 0) {
            i3 = 0;
            i = 0;
            while (true) {
                iArr = this.f22170c;
                if (i3 >= iArr.length) {
                    break;
                }
                i += kvd.m5414a(iArr[i3]);
                i3++;
            }
            kvd.m5439e(26);
            kvd.m5439e(i);
            while (true) {
                iArr2 = this.f22170c;
                if (i2 >= iArr2.length) {
                    break;
                }
                kvd.m5435c(iArr2[i2]);
                i2++;
            }
        }
        i3 = this.f22171d;
        if (i3 != 0) {
            kvd.m5431b(4, i3);
        }
        super.writeTo(kvd);
    }
}
