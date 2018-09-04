package p000;

/* compiled from: PG */
/* renamed from: kkw */
public final class kkw extends kvf {
    /* renamed from: a */
    public String f22289a;
    /* renamed from: b */
    public boolean f22290b;
    /* renamed from: c */
    public int f22291c;

    public kkw() {
        this.f22289a = "";
        this.f22290b = false;
        this.f22291c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f22289a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f22289a);
        }
        if (this.f22290b) {
            computeSerializedSize += kvd.m5423b(16) + 1;
        }
        int i = this.f22291c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(3, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kkw m16585a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f22289a = kvc.m5412h();
                    continue;
                case 16:
                    this.f22290b = kvc.m5405c();
                    continue;
                case 24:
                    int b = kvc.m5401b();
                    try {
                        this.f22291c = kjn.m16564a(kvc.m5410f());
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
        return m16585a(kvc);
    }

    public final void writeTo(kvd kvd) {
        String str = this.f22289a;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f22289a);
        }
        boolean z = this.f22290b;
        if (z) {
            kvd.m5429a(2, z);
        }
        int i = this.f22291c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        super.writeTo(kvd);
    }
}
