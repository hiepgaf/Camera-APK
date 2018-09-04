package p000;

/* compiled from: PG */
/* renamed from: klr */
public final class klr extends kvf {
    /* renamed from: a */
    public int f22392a;
    /* renamed from: b */
    public boolean f22393b;

    public klr() {
        this.f22392a = 0;
        this.f22393b = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22392a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        if (this.f22393b) {
            return computeSerializedSize + (kvd.m5423b(16) + 1);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final klr m16605a(kvc kvc) {
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
                            StringBuilder stringBuilder = new StringBuilder(37);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum State");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22392a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    this.f22393b = kvc.m5405c();
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
        return m16605a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22392a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        boolean z = this.f22393b;
        if (z) {
            kvd.m5429a(2, z);
        }
        super.writeTo(kvd);
    }
}
