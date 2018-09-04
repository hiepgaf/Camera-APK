package p000;

/* compiled from: PG */
/* renamed from: klm */
public final class klm extends kvf {
    /* renamed from: a */
    public int f22369a;
    /* renamed from: b */
    public int f22370b;

    public klm() {
        this.f22369a = 0;
        this.f22370b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22369a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22370b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final klm m16600a(kvc kvc) {
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
                        if (f < 0 || f > 3) {
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum Gesture");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22369a = f;
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
                        if (f < 0 || f > 2) {
                            stringBuilder = new StringBuilder(36);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum Mode");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22370b = f;
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
        return m16600a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22369a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22370b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        super.writeTo(kvd);
    }
}
