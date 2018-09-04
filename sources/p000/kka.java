package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* renamed from: kka */
public final class kka extends kvf {
    /* renamed from: a */
    public String f22145a;
    /* renamed from: b */
    public String f22146b;
    /* renamed from: c */
    public float f22147c;
    /* renamed from: d */
    public int f22148d;
    /* renamed from: e */
    public float f22149e;
    /* renamed from: f */
    public float f22150f;
    /* renamed from: g */
    public boolean f22151g;
    /* renamed from: h */
    public int f22152h;
    /* renamed from: i */
    public int f22153i;
    /* renamed from: j */
    public int f22154j;
    /* renamed from: k */
    public boolean f22155k;
    /* renamed from: l */
    public int f22156l;
    /* renamed from: m */
    public float f22157m;
    /* renamed from: n */
    private String f22158n;
    /* renamed from: o */
    private float f22159o;

    public kka() {
        this.f22145a = "";
        this.f22158n = "";
        this.f22146b = "";
        this.f22147c = 0.0f;
        this.f22148d = 0;
        this.f22149e = 0.0f;
        this.f22150f = 0.0f;
        this.f22159o = 0.0f;
        this.f22151g = false;
        this.f22152h = 0;
        this.f22153i = 0;
        this.f22154j = 0;
        this.f22155k = false;
        this.f22156l = 0;
        this.f22157m = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f22145a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.f22145a);
        }
        str = this.f22158n;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(2, this.f22158n);
        }
        str = this.f22146b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(3, this.f22146b);
        }
        if (Float.floatToIntBits(this.f22147c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        int i = this.f22148d;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(5, i);
        }
        if (Float.floatToIntBits(this.f22149e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(48) + 4;
        }
        if (Float.floatToIntBits(this.f22150f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(56) + 4;
        }
        if (Float.floatToIntBits(this.f22159o) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(64) + 4;
        }
        if (this.f22151g) {
            computeSerializedSize += kvd.m5423b(72) + 1;
        }
        i = this.f22152h;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(10, i);
        }
        i = this.f22153i;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(11, i);
        }
        i = this.f22154j;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(12, i);
        }
        if (this.f22155k) {
            computeSerializedSize += kvd.m5423b(104) + 1;
        }
        i = this.f22156l;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(14, i);
        }
        if (Float.floatToIntBits(this.f22157m) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5423b(120) + 4);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.f22145a = kvc.m5412h();
                    continue;
                case 18:
                    this.f22158n = kvc.m5412h();
                    continue;
                case 26:
                    this.f22146b = kvc.m5412h();
                    continue;
                case 37:
                    this.f22147c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 40:
                    this.f22148d = kvc.m5410f();
                    continue;
                case 53:
                    this.f22149e = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 61:
                    this.f22150f = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 69:
                    this.f22159o = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 72:
                    this.f22151g = kvc.m5405c();
                    continue;
                case 80:
                    this.f22152h = kvc.m5410f();
                    continue;
                case 88:
                    this.f22153i = kvc.m5410f();
                    continue;
                case 96:
                    this.f22154j = kvc.m5410f();
                    continue;
                case 104:
                    this.f22155k = kvc.m5405c();
                    continue;
                case 112:
                    this.f22156l = kvc.m5410f();
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_cgemm /*125*/:
                    this.f22157m = Float.intBitsToFloat(kvc.m5406d());
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
        String str = this.f22145a;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.f22145a);
        }
        str = this.f22158n;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(2, this.f22158n);
        }
        str = this.f22146b;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(3, this.f22146b);
        }
        if (Float.floatToIntBits(this.f22147c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22147c);
        }
        int i = this.f22148d;
        if (i != 0) {
            kvd.m5431b(5, i);
        }
        if (Float.floatToIntBits(this.f22149e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(6, this.f22149e);
        }
        if (Float.floatToIntBits(this.f22150f) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(7, this.f22150f);
        }
        if (Float.floatToIntBits(this.f22159o) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(8, this.f22159o);
        }
        boolean z = this.f22151g;
        if (z) {
            kvd.m5429a(9, z);
        }
        i = this.f22152h;
        if (i != 0) {
            kvd.m5431b(10, i);
        }
        i = this.f22153i;
        if (i != 0) {
            kvd.m5431b(11, i);
        }
        i = this.f22154j;
        if (i != 0) {
            kvd.m5431b(12, i);
        }
        z = this.f22155k;
        if (z) {
            kvd.m5429a(13, z);
        }
        i = this.f22156l;
        if (i != 0) {
            kvd.m5431b(14, i);
        }
        if (Float.floatToIntBits(this.f22157m) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(15, this.f22157m);
        }
        super.writeTo(kvd);
    }
}
