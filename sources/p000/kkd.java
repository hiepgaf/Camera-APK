package p000;

/* compiled from: PG */
/* renamed from: kkd */
public final class kkd extends kvf {
    /* renamed from: a */
    public int f22172a;
    /* renamed from: b */
    public int f22173b;
    /* renamed from: c */
    public String f22174c;
    /* renamed from: d */
    public boolean f22175d;
    /* renamed from: e */
    public boolean f22176e;
    /* renamed from: f */
    public boolean f22177f;
    /* renamed from: g */
    public long f22178g;
    /* renamed from: h */
    public int f22179h;
    /* renamed from: i */
    private boolean f22180i;
    /* renamed from: j */
    private boolean f22181j;
    /* renamed from: k */
    private boolean f22182k;
    /* renamed from: l */
    private String f22183l;

    public kkd() {
        this.f22172a = 0;
        this.f22180i = false;
        this.f22181j = false;
        this.f22182k = false;
        this.f22183l = "";
        this.f22173b = 0;
        this.f22174c = "";
        this.f22175d = false;
        this.f22176e = false;
        this.f22177f = false;
        this.f22178g = 0;
        this.f22179h = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22172a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        if (this.f22180i) {
            computeSerializedSize += kvd.m5423b(16) + 1;
        }
        if (this.f22181j) {
            computeSerializedSize += kvd.m5423b(24) + 1;
        }
        if (this.f22182k) {
            computeSerializedSize += kvd.m5423b(32) + 1;
        }
        String str = this.f22183l;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(5, this.f22183l);
        }
        i = this.f22173b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(6, i);
        }
        str = this.f22174c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(7, this.f22174c);
        }
        if (this.f22175d) {
            computeSerializedSize += kvd.m5423b(64) + 1;
        }
        if (this.f22176e) {
            computeSerializedSize += kvd.m5423b(72) + 1;
        }
        if (this.f22177f) {
            computeSerializedSize += kvd.m5423b(80) + 1;
        }
        long j = this.f22178g;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(11, j);
        }
        i = this.f22179h;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(12, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kkd m16577a(kvc kvc) {
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
                            stringBuilder = new StringBuilder(48);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ForegroundSource");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22172a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                    break;
                case 16:
                    this.f22180i = kvc.m5405c();
                    continue;
                case 24:
                    this.f22181j = kvc.m5405c();
                    continue;
                case 32:
                    this.f22182k = kvc.m5405c();
                    continue;
                case 42:
                    this.f22183l = kvc.m5412h();
                    continue;
                case 48:
                    b = kvc.m5401b();
                    try {
                        this.f22173b = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 58:
                    this.f22174c = kvc.m5412h();
                    continue;
                case 64:
                    this.f22175d = kvc.m5405c();
                    continue;
                case 72:
                    this.f22176e = kvc.m5405c();
                    continue;
                case 80:
                    this.f22177f = kvc.m5405c();
                    continue;
                case 88:
                    this.f22178g = kvc.m5411g();
                    continue;
                case 96:
                    b = kvc.m5401b();
                    try {
                        f = kvc.m5410f();
                        if (f < 0 || f > 7) {
                            stringBuilder = new StringBuilder(65);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ForegroundSourceLaunchMethodExtra");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22179h = f;
                        continue;
                    } catch (IllegalArgumentException e3) {
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
        return m16577a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22172a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        boolean z = this.f22180i;
        if (z) {
            kvd.m5429a(2, z);
        }
        z = this.f22181j;
        if (z) {
            kvd.m5429a(3, z);
        }
        z = this.f22182k;
        if (z) {
            kvd.m5429a(4, z);
        }
        String str = this.f22183l;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(5, this.f22183l);
        }
        i = this.f22173b;
        if (i != 0) {
            kvd.m5431b(6, i);
        }
        str = this.f22174c;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(7, this.f22174c);
        }
        z = this.f22175d;
        if (z) {
            kvd.m5429a(8, z);
        }
        z = this.f22176e;
        if (z) {
            kvd.m5429a(9, z);
        }
        z = this.f22177f;
        if (z) {
            kvd.m5429a(10, z);
        }
        long j = this.f22178g;
        if (j != 0) {
            kvd.m5432b(11, j);
        }
        i = this.f22179h;
        if (i != 0) {
            kvd.m5431b(12, i);
        }
        super.writeTo(kvd);
    }
}
