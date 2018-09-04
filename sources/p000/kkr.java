package p000;

/* compiled from: PG */
/* renamed from: kkr */
public final class kkr extends kvf {
    /* renamed from: a */
    private int f22273a;
    /* renamed from: b */
    private long f22274b;
    /* renamed from: c */
    private kkh f22275c;
    /* renamed from: d */
    private kkv f22276d;
    /* renamed from: e */
    private kkq f22277e;
    /* renamed from: f */
    private kko f22278f;

    public kkr() {
        this.f22273a = -1;
        this.f22274b = 0;
        this.f22273a = -1;
        this.f22275c = null;
        this.f22273a = -1;
        this.f22276d = null;
        this.f22273a = -1;
        this.f22277e = null;
        this.f22273a = -1;
        this.f22278f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f22274b;
        if (j != 0) {
            computeSerializedSize += kvd.m5424b(j);
        }
        if (this.f22273a == 0) {
            computeSerializedSize += kvd.m5418a(2, this.f22275c);
        }
        if (this.f22273a == 1) {
            computeSerializedSize += kvd.m5418a(3, this.f22276d);
        }
        if (this.f22273a == 2) {
            computeSerializedSize += kvd.m5418a(4, this.f22277e);
        }
        if (this.f22273a == 3) {
            return computeSerializedSize + kvd.m5418a(5, this.f22278f);
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
                    this.f22274b = kvc.m5411g();
                    continue;
                case 18:
                    if (this.f22275c == null) {
                        this.f22275c = new kkh();
                    }
                    kvc.m5399a(this.f22275c);
                    this.f22273a = 0;
                    continue;
                case 26:
                    if (this.f22276d == null) {
                        this.f22276d = new kkv();
                    }
                    kvc.m5399a(this.f22276d);
                    this.f22273a = 1;
                    continue;
                case 34:
                    if (this.f22277e == null) {
                        this.f22277e = new kkq();
                    }
                    kvc.m5399a(this.f22277e);
                    this.f22273a = 2;
                    continue;
                case 42:
                    if (this.f22278f == null) {
                        this.f22278f = new kko();
                    }
                    kvc.m5399a(this.f22278f);
                    this.f22273a = 3;
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
        long j = this.f22274b;
        if (j != 0) {
            kvd.m5437c(j);
        }
        if (this.f22273a == 0) {
            kvd.m5434b(2, this.f22275c);
        }
        if (this.f22273a == 1) {
            kvd.m5434b(3, this.f22276d);
        }
        if (this.f22273a == 2) {
            kvd.m5434b(4, this.f22277e);
        }
        if (this.f22273a == 3) {
            kvd.m5434b(5, this.f22278f);
        }
        super.writeTo(kvd);
    }
}
