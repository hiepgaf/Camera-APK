package p000;

/* compiled from: PG */
/* renamed from: klo */
public final class klo extends kvf {
    /* renamed from: a */
    public int f22374a;
    /* renamed from: b */
    public String f22375b;
    /* renamed from: c */
    public boolean f22376c;
    /* renamed from: d */
    public boolean f22377d;
    /* renamed from: e */
    public String f22378e;
    /* renamed from: f */
    public String f22379f;

    public klo() {
        this.f22374a = 0;
        this.f22375b = "";
        this.f22376c = false;
        this.f22377d = false;
        this.f22378e = "";
        this.f22379f = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22374a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        String str = this.f22375b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(2, this.f22375b);
        }
        if (this.f22376c) {
            computeSerializedSize += kvd.m5423b(24) + 1;
        }
        if (this.f22377d) {
            computeSerializedSize += kvd.m5423b(32) + 1;
        }
        str = this.f22378e;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(5, this.f22378e);
        }
        str = this.f22379f;
        if (str == null || str.equals("")) {
            return computeSerializedSize;
        }
        return computeSerializedSize + kvd.m5417a(6, this.f22379f);
    }

    /* renamed from: a */
    private final klo m16601a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 2) {
                            StringBuilder stringBuilder = new StringBuilder(36);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum Type");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22374a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    this.f22375b = kvc.m5412h();
                    continue;
                case 24:
                    this.f22376c = kvc.m5405c();
                    continue;
                case 32:
                    this.f22377d = kvc.m5405c();
                    continue;
                case 42:
                    this.f22378e = kvc.m5412h();
                    continue;
                case 50:
                    this.f22379f = kvc.m5412h();
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
        return m16601a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22374a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        String str = this.f22375b;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(2, this.f22375b);
        }
        boolean z = this.f22376c;
        if (z) {
            kvd.m5429a(3, z);
        }
        z = this.f22377d;
        if (z) {
            kvd.m5429a(4, z);
        }
        str = this.f22378e;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(5, this.f22378e);
        }
        str = this.f22379f;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(6, this.f22379f);
        }
        super.writeTo(kvd);
    }
}
