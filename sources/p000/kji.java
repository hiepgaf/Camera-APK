package p000;

/* compiled from: PG */
/* renamed from: kji */
public final class kji extends kvf {
    /* renamed from: a */
    public long f22084a;
    /* renamed from: b */
    public long f22085b;
    /* renamed from: c */
    public int f22086c;

    public kji() {
        this.f22084a = 0;
        this.f22085b = 0;
        this.f22086c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22084a;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.f22085b;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        int i = this.f22086c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(3, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kji m16557a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22084a = kvc.m5411g();
                    continue;
                case 16:
                    this.f22085b = kvc.m5411g();
                    continue;
                case 24:
                    int b = kvc.m5401b();
                    try {
                        this.f22086c = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
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
        return m16557a(kvc);
    }

    public final void writeTo(kvd kvd) {
        long j = this.f22084a;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.f22085b;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        int i = this.f22086c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        super.writeTo(kvd);
    }
}
