package p000;

/* compiled from: PG */
/* renamed from: kjo */
public final class kjo extends kvf {
    /* renamed from: a */
    public int f22098a;
    /* renamed from: b */
    public String f22099b;
    /* renamed from: c */
    public String f22100c;
    /* renamed from: d */
    public int f22101d;
    /* renamed from: e */
    public int f22102e;
    /* renamed from: f */
    public int f22103f;
    /* renamed from: g */
    private int f22104g;

    public kjo() {
        this.f22098a = 0;
        this.f22099b = "";
        this.f22100c = "";
        this.f22101d = 0;
        this.f22102e = 0;
        this.f22104g = 0;
        this.f22103f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22098a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        String str = this.f22099b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(2, this.f22099b);
        }
        str = this.f22100c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(3, this.f22100c);
        }
        i = this.f22101d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        i = this.f22102e;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(5, i);
        }
        i = this.f22104g;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(6, i);
        }
        i = this.f22103f;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(7, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kjo m16566a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            int f;
            StringBuilder stringBuilder;
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 9) {
                            stringBuilder = new StringBuilder(45);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum FailureReason");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22098a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    this.f22099b = kvc.m5412h();
                    continue;
                case 26:
                    this.f22100c = kvc.m5412h();
                    continue;
                case 32:
                    this.f22101d = kvc.m5410f();
                    continue;
                case 40:
                    this.f22102e = kvc.m5410f();
                    continue;
                case 48:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 2) {
                            stringBuilder = new StringBuilder(41);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum CameraApi");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22104g = f;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 56:
                    this.f22103f = kvc.m5410f();
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
        return m16566a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22098a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        String str = this.f22099b;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(2, this.f22099b);
        }
        str = this.f22100c;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(3, this.f22100c);
        }
        i = this.f22101d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        i = this.f22102e;
        if (i != 0) {
            kvd.m5431b(5, i);
        }
        i = this.f22104g;
        if (i != 0) {
            kvd.m5431b(6, i);
        }
        i = this.f22103f;
        if (i != 0) {
            kvd.m5431b(7, i);
        }
        super.writeTo(kvd);
    }
}
