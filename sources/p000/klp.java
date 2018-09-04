package p000;

/* compiled from: PG */
/* renamed from: klp */
public final class klp extends kvf {
    /* renamed from: a */
    public int f22380a;
    /* renamed from: b */
    public int f22381b;

    public klp() {
        this.f22380a = 0;
        this.f22381b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22380a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f22381b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(2, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final klp m16602a(kvc kvc) {
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
                            stringBuilder = new StringBuilder(36);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum Type");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22380a = f;
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
                            stringBuilder = new StringBuilder(37);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum State");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22381b = f;
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
        return m16602a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22380a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f22381b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        super.writeTo(kvd);
    }
}
