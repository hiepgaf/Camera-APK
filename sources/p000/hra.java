package p000;

/* compiled from: PG */
/* renamed from: hra */
public final class hra extends kvf implements Cloneable {
    /* renamed from: a */
    public String f21617a;
    /* renamed from: b */
    public String f21618b;
    /* renamed from: c */
    public int f21619c;
    /* renamed from: d */
    public int f21620d;

    public hra() {
        this.f21617a = "";
        this.f21618b = "";
        this.f21619c = -1;
        this.f21620d = -1;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    private static int m15932a(int i) {
        if (i >= -1 && i <= 6) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum LensAvailabilityStatus");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final hra m15934a() {
        try {
            return (hra) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: clone */
    public final /* synthetic */ kvf m18073clone() {
        return m15934a();
    }

    /* renamed from: clone */
    public final /* synthetic */ kvl m18074clone() {
        return m15934a();
    }

    public final /* synthetic */ Object clone() {
        return m15934a();
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f21617a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f21617a);
        }
        str = this.f21618b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(2, this.f21618b);
        }
        int i = this.f21619c;
        if (i != -1) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        i = this.f21620d;
        if (i != -1) {
            return computeSerializedSize + kvd.m5415a(4, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final hra m15933a(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f21617a = kvc.m5412h();
                    continue;
                case 18:
                    this.f21618b = kvc.m5412h();
                    continue;
                case 24:
                    b = kvc.m5401b();
                    try {
                        this.f21619c = hra.m15932a(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 32:
                    b = kvc.m5401b();
                    try {
                        this.f21620d = hra.m15932a(kvc.m5410f());
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
        return m15933a(kvc);
    }

    public final void writeTo(kvd kvd) {
        String str = this.f21617a;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f21617a);
        }
        str = this.f21618b;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(2, this.f21618b);
        }
        int i = this.f21619c;
        if (i != -1) {
            kvd.m5431b(3, i);
        }
        i = this.f21620d;
        if (i != -1) {
            kvd.m5431b(4, i);
        }
        super.writeTo(kvd);
    }
}
