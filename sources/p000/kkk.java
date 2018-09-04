package p000;

/* compiled from: PG */
/* renamed from: kkk */
public final class kkk extends kvf {
    /* renamed from: a */
    private int f22253a;
    /* renamed from: b */
    private String f22254b;
    /* renamed from: c */
    private kkr f22255c;

    public kkk() {
        this.f22253a = 0;
        this.f22254b = "";
        this.f22255c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22253a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        String str = this.f22254b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(2, this.f22254b);
        }
        kvl kvl = this.f22255c;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(3, kvl);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kkk m16581a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 17) {
                            StringBuilder stringBuilder = new StringBuilder(42);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ActionType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22253a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 18:
                    this.f22254b = kvc.m5412h();
                    continue;
                case 26:
                    if (this.f22255c == null) {
                        this.f22255c = new kkr();
                    }
                    kvc.m5399a(this.f22255c);
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
        return m16581a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22253a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        String str = this.f22254b;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(2, this.f22254b);
        }
        kvl kvl = this.f22255c;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        super.writeTo(kvd);
    }
}
