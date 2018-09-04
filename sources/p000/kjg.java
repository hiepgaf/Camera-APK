package p000;

/* compiled from: PG */
/* renamed from: kjg */
public final class kjg extends kvf {
    /* renamed from: a */
    private float f22067a;
    /* renamed from: b */
    private float f22068b;
    /* renamed from: c */
    private kjh[] f22069c;

    public kjg() {
        this.f22067a = 0.0f;
        this.f22068b = 0.0f;
        this.f22069c = kjh.m16556a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.f22067a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(8) + 4;
        }
        if (Float.floatToIntBits(this.f22068b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        kjh[] kjhArr = this.f22069c;
        if (kjhArr == null || kjhArr.length <= 0) {
            return computeSerializedSize;
        }
        int i = computeSerializedSize;
        computeSerializedSize = 0;
        while (true) {
            kjh[] kjhArr2 = this.f22069c;
            if (computeSerializedSize >= kjhArr2.length) {
                return i;
            }
            kvl kvl = kjhArr2[computeSerializedSize];
            if (kvl != null) {
                i += kvd.m5418a(10, kvl);
            }
            computeSerializedSize++;
        }
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 13:
                    this.f22067a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 21:
                    this.f22068b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 82:
                    int a = kvn.m5457a(kvc, 82);
                    Object obj = this.f22069c;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kjh[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kjh();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kjh();
                    kvc.m5399a(obj2[i]);
                    this.f22069c = obj2;
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
        if (Float.floatToIntBits(this.f22067a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(1, this.f22067a);
        }
        if (Float.floatToIntBits(this.f22068b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22068b);
        }
        kjh[] kjhArr = this.f22069c;
        if (kjhArr != null && kjhArr.length > 0) {
            int i = 0;
            while (true) {
                kjh[] kjhArr2 = this.f22069c;
                if (i >= kjhArr2.length) {
                    break;
                }
                kvl kvl = kjhArr2[i];
                if (kvl != null) {
                    kvd.m5434b(10, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
