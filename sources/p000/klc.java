package p000;

/* compiled from: PG */
/* renamed from: klc */
public final class klc extends kvf {
    /* renamed from: a */
    public int f22318a;
    /* renamed from: b */
    public int f22319b;
    /* renamed from: c */
    public String f22320c;
    /* renamed from: d */
    public float f22321d;
    /* renamed from: e */
    public float f22322e;
    /* renamed from: f */
    private String f22323f;

    public klc() {
        this.f22318a = 0;
        this.f22323f = "";
        this.f22319b = 0;
        this.f22320c = "";
        this.f22321d = 0.0f;
        this.f22322e = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22318a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        String str = this.f22323f;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(2, this.f22323f);
        }
        i = this.f22319b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        str = this.f22320c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(4, this.f22320c);
        }
        if (Float.floatToIntBits(this.f22321d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(40) + 4;
        }
        if (Float.floatToIntBits(this.f22322e) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(48) + 4);
    }

    /* renamed from: a */
    private final klc m16591a(kvc kvc) {
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
                        if (f < 0 || f > 7) {
                            StringBuilder stringBuilder = new StringBuilder(47);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum InteractionType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22318a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    this.f22323f = kvc.m5412h();
                    continue;
                case 24:
                    b = kvc.m5401b();
                    try {
                        this.f22319b = klh.m16594a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 34:
                    this.f22320c = kvc.m5412h();
                    continue;
                case 45:
                    this.f22321d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 53:
                    this.f22322e = Float.intBitsToFloat(kvc.m5406d());
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
        return m16591a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22318a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        String str = this.f22323f;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(2, this.f22323f);
        }
        i = this.f22319b;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        str = this.f22320c;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(4, this.f22320c);
        }
        if (Float.floatToIntBits(this.f22321d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f22321d);
        }
        if (Float.floatToIntBits(this.f22322e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(6, this.f22322e);
        }
        super.writeTo(kvd);
    }
}
