package p000;

/* compiled from: PG */
/* renamed from: klt */
public final class klt extends kvf {
    /* renamed from: c */
    private static volatile klt[] f22398c;
    /* renamed from: a */
    public int f22399a;
    /* renamed from: b */
    public int f22400b;

    public klt() {
        this.f22399a = 0;
        this.f22400b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22399a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22400b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static klt[] m16607a() {
        if (f22398c == null) {
            synchronized (kvj.f8655b) {
                if (f22398c == null) {
                    f22398c = new klt[0];
                }
            }
        }
        return f22398c;
    }

    /* renamed from: a */
    private final klt m16606a(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    int b = kvc.m5401b();
                    try {
                        int f = kvc.m5410f();
                        if (f < 0 || f > 7) {
                            StringBuilder stringBuilder = new StringBuilder(44);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ArtifactType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22399a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    this.f22400b = kvc.m5410f();
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
        return m16606a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22399a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22400b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        super.writeTo(kvd);
    }
}
