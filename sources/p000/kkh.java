package p000;

/* compiled from: PG */
/* renamed from: kkh */
public final class kkh extends kvf {
    /* renamed from: a */
    private int f22240a;
    /* renamed from: b */
    private int f22241b;
    /* renamed from: c */
    private int f22242c;
    /* renamed from: d */
    private int f22243d;
    /* renamed from: e */
    private kkj f22244e;
    /* renamed from: f */
    private float f22245f;

    public kkh() {
        this.f22240a = 0;
        this.f22241b = 0;
        this.f22242c = 0;
        this.f22243d = 0;
        this.f22244e = null;
        this.f22245f = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22240a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22241b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22242c;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        i = this.f22243d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(4, i);
        }
        kvl kvl = this.f22244e;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(5, kvl);
        }
        if (Float.floatToIntBits(this.f22245f) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(48) + 4);
    }

    /* renamed from: a */
    private final kkh m16580a(kvc kvc) {
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
                        if (f < 0 || f > 2) {
                            stringBuilder = new StringBuilder(43);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum BarcodeType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22240a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 9) {
                            stringBuilder = new StringBuilder(44);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum OneDCodeType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22241b = f;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 24:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 4) {
                            stringBuilder = new StringBuilder(44);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum TwoDCodeType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22242c = f;
                        continue;
                    } catch (IllegalArgumentException e3) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 32:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 12) {
                            stringBuilder = new StringBuilder(50);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum BarcodeContentType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22243d = f;
                        continue;
                    } catch (IllegalArgumentException e4) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 42:
                    if (this.f22244e == null) {
                        this.f22244e = new kkj();
                    }
                    kvc.m5399a(this.f22244e);
                    continue;
                case 53:
                    this.f22245f = Float.intBitsToFloat(kvc.m5406d());
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
        return m16580a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22240a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22241b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22242c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        i = this.f22243d;
        if (i != 0) {
            kvd.m5431b(4, i);
        }
        kvl kvl = this.f22244e;
        if (kvl != null) {
            kvd.m5434b(5, kvl);
        }
        if (Float.floatToIntBits(this.f22245f) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(6, this.f22245f);
        }
        super.writeTo(kvd);
    }
}
