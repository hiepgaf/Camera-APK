package p000;

/* compiled from: PG */
/* renamed from: klu */
public final class klu extends kvf {
    /* renamed from: a */
    public boolean f22401a;
    /* renamed from: b */
    public boolean f22402b;
    /* renamed from: c */
    public boolean f22403c;
    /* renamed from: d */
    public boolean f22404d;
    /* renamed from: e */
    public boolean f22405e;
    /* renamed from: f */
    public boolean f22406f;
    /* renamed from: g */
    public float f22407g;
    /* renamed from: h */
    private boolean f22408h;

    public klu() {
        this.f22401a = false;
        this.f22408h = false;
        this.f22402b = false;
        this.f22403c = false;
        this.f22404d = false;
        this.f22405e = false;
        this.f22406f = false;
        this.f22407g = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f22401a) {
            computeSerializedSize += kvd.m5423b(8) + 1;
        }
        if (this.f22408h) {
            computeSerializedSize += kvd.m5423b(16) + 1;
        }
        if (this.f22402b) {
            computeSerializedSize += kvd.m5423b(24) + 1;
        }
        if (this.f22403c) {
            computeSerializedSize += kvd.m5423b(32) + 1;
        }
        if (this.f22404d) {
            computeSerializedSize += kvd.m5423b(40) + 1;
        }
        if (this.f22405e) {
            computeSerializedSize += kvd.m5423b(48) + 1;
        }
        if (this.f22406f) {
            computeSerializedSize += kvd.m5423b(56) + 1;
        }
        if (Float.floatToIntBits(this.f22407g) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(64) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22401a = kvc.m5405c();
                    continue;
                case 16:
                    this.f22408h = kvc.m5405c();
                    continue;
                case 24:
                    this.f22402b = kvc.m5405c();
                    continue;
                case 32:
                    this.f22403c = kvc.m5405c();
                    continue;
                case 40:
                    this.f22404d = kvc.m5405c();
                    continue;
                case 48:
                    this.f22405e = kvc.m5405c();
                    continue;
                case 56:
                    this.f22406f = kvc.m5405c();
                    continue;
                case 69:
                    this.f22407g = Float.intBitsToFloat(kvc.m5406d());
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

    public final void writeTo(kvd kvd) {
        boolean z = this.f22401a;
        if (z) {
            kvd.m5429a(1, z);
        }
        z = this.f22408h;
        if (z) {
            kvd.m5429a(2, z);
        }
        z = this.f22402b;
        if (z) {
            kvd.m5429a(3, z);
        }
        z = this.f22403c;
        if (z) {
            kvd.m5429a(4, z);
        }
        z = this.f22404d;
        if (z) {
            kvd.m5429a(5, z);
        }
        z = this.f22405e;
        if (z) {
            kvd.m5429a(6, z);
        }
        z = this.f22406f;
        if (z) {
            kvd.m5429a(7, z);
        }
        if (Float.floatToIntBits(this.f22407g) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(8, this.f22407g);
        }
        super.writeTo(kvd);
    }
}
