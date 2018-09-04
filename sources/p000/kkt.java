package p000;

/* compiled from: PG */
/* renamed from: kkt */
public final class kkt extends kvf {
    /* renamed from: a */
    private kku[] f22281a;

    public kkt() {
        this.f22281a = kku.m16583a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kku[] kkuArr = this.f22281a;
        if (kkuArr != null && kkuArr.length > 0) {
            int i = 0;
            while (true) {
                kku[] kkuArr2 = this.f22281a;
                if (i >= kkuArr2.length) {
                    break;
                }
                kvl kvl = kkuArr2[i];
                if (kvl != null) {
                    computeSerializedSize += kvd.m5418a(1, kvl);
                }
                i++;
            }
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
                    int a = kvn.m5457a(kvc, 10);
                    Object obj = this.f22281a;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kku[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kku();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kku();
                    kvc.m5399a(obj2[i]);
                    this.f22281a = obj2;
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
        kku[] kkuArr = this.f22281a;
        if (kkuArr != null && kkuArr.length > 0) {
            int i = 0;
            while (true) {
                kku[] kkuArr2 = this.f22281a;
                if (i >= kkuArr2.length) {
                    break;
                }
                kvl kvl = kkuArr2[i];
                if (kvl != null) {
                    kvd.m5434b(1, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
