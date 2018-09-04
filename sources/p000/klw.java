package p000;

/* compiled from: PG */
/* renamed from: klw */
public final class klw extends kvf {
    /* renamed from: a */
    public String f22414a;
    /* renamed from: b */
    public int f22415b;
    /* renamed from: c */
    public int f22416c;

    public klw() {
        this.f22414a = "";
        this.f22415b = 0;
        this.f22416c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f22414a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f22414a);
        }
        int i = this.f22415b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        i = this.f22416c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(3, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final klw m16608a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            int f;
            StringBuilder stringBuilder;
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f22414a = kvc.m5412h();
                    continue;
                case 16:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 5) {
                            stringBuilder = new StringBuilder(44);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum CreationType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22415b = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 24:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 1) {
                            stringBuilder = new StringBuilder(47);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum GenerationCause");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22416c = f;
                        continue;
                    } catch (IllegalArgumentException e2) {
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
        return m16608a(kvc);
    }

    public final void writeTo(kvd kvd) {
        String str = this.f22414a;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f22414a);
        }
        int i = this.f22415b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        i = this.f22416c;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        super.writeTo(kvd);
    }
}
