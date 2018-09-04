package p000;

/* compiled from: PG */
/* renamed from: kky */
public final class kky extends kvf {
    /* renamed from: a */
    public int f22305a;

    public kky() {
        this.f22305a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f22305a;
        if (i != 0) {
            return computeSerializedSize + kvd.m5415a(1, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    private final kky m16587a(kvc kvc) {
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
                            StringBuilder stringBuilder = new StringBuilder(48);
                            stringBuilder.append(f);
                            stringBuilder.append(" is not a valid enum ProcessingResult");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        this.f22305a = f;
                        continue;
                    } catch (IllegalArgumentException e) {
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
        return m16587a(kvc);
    }

    public final void writeTo(kvd kvd) {
        int i = this.f22305a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        super.writeTo(kvd);
    }
}
