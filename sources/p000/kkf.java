package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.libraries.smartburst.filterfw.FrameType;

/* compiled from: PG */
/* renamed from: kkf */
public final class kkf extends kvf {
    /* renamed from: A */
    public float f22192A;
    /* renamed from: B */
    public boolean f22193B;
    /* renamed from: C */
    public float f22194C;
    /* renamed from: D */
    public float f22195D;
    /* renamed from: E */
    public float f22196E;
    /* renamed from: F */
    public boolean f22197F;
    /* renamed from: G */
    private boolean f22198G;
    /* renamed from: H */
    private float f22199H;
    /* renamed from: I */
    private int[] f22200I;
    /* renamed from: J */
    private int[] f22201J;
    /* renamed from: K */
    private float f22202K;
    /* renamed from: L */
    private int f22203L;
    /* renamed from: a */
    public float f22204a;
    /* renamed from: b */
    public float f22205b;
    /* renamed from: c */
    public float f22206c;
    /* renamed from: d */
    public float f22207d;
    /* renamed from: e */
    public float f22208e;
    /* renamed from: f */
    public float f22209f;
    /* renamed from: g */
    public float f22210g;
    /* renamed from: h */
    public float f22211h;
    /* renamed from: i */
    public int f22212i;
    /* renamed from: j */
    public int f22213j;
    /* renamed from: k */
    public float[] f22214k;
    /* renamed from: l */
    public int f22215l;
    /* renamed from: m */
    public int f22216m;
    /* renamed from: n */
    public float f22217n;
    /* renamed from: o */
    public float f22218o;
    /* renamed from: p */
    public boolean f22219p;
    /* renamed from: q */
    public boolean f22220q;
    /* renamed from: r */
    public float[] f22221r;
    /* renamed from: s */
    public boolean[] f22222s;
    /* renamed from: t */
    public float f22223t;
    /* renamed from: u */
    public float f22224u;
    /* renamed from: v */
    public float f22225v;
    /* renamed from: w */
    public float f22226w;
    /* renamed from: x */
    public float f22227x;
    /* renamed from: y */
    public float f22228y;
    /* renamed from: z */
    public float f22229z;

    public kkf() {
        this.f22198G = false;
        this.f22204a = 0.0f;
        this.f22205b = 0.0f;
        this.f22206c = 0.0f;
        this.f22207d = 0.0f;
        this.f22208e = 0.0f;
        this.f22199H = 0.0f;
        this.f22209f = 0.0f;
        this.f22210g = 0.0f;
        this.f22211h = 0.0f;
        this.f22212i = 0;
        this.f22213j = 0;
        this.f22214k = kvn.f8664g;
        this.f22200I = kvn.f8662e;
        this.f22201J = kvn.f8662e;
        this.f22215l = 0;
        this.f22216m = 0;
        this.f22202K = 0.0f;
        this.f22217n = 0.0f;
        this.f22218o = 0.0f;
        this.f22219p = false;
        this.f22220q = false;
        this.f22221r = kvn.f8664g;
        this.f22222s = kvn.f8665h;
        this.f22223t = 0.0f;
        this.f22224u = 0.0f;
        this.f22225v = 0.0f;
        this.f22226w = 0.0f;
        this.f22227x = 0.0f;
        this.f22228y = 0.0f;
        this.f22229z = 0.0f;
        this.f22192A = 0.0f;
        this.f22203L = 0;
        this.f22193B = false;
        this.f22194C = 0.0f;
        this.f22195D = 0.0f;
        this.f22196E = 0.0f;
        this.f22197F = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int i;
        int i2 = 0;
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f22198G) {
            computeSerializedSize += kvd.m5423b(8) + 1;
        }
        if (Float.floatToIntBits(this.f22204a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(16) + 4;
        }
        if (Float.floatToIntBits(this.f22205b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(24) + 4;
        }
        if (Float.floatToIntBits(this.f22206c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(32) + 4;
        }
        if (Float.floatToIntBits(this.f22207d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(40) + 4;
        }
        if (Float.floatToIntBits(this.f22208e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(48) + 4;
        }
        if (Float.floatToIntBits(this.f22199H) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(56) + 4;
        }
        if (Float.floatToIntBits(this.f22209f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(64) + 4;
        }
        if (Float.floatToIntBits(this.f22210g) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(72) + 4;
        }
        if (Float.floatToIntBits(this.f22211h) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(80) + 4;
        }
        int i3 = this.f22212i;
        if (i3 != 0) {
            computeSerializedSize += kvd.m5415a(12, i3);
        }
        i3 = this.f22213j;
        if (i3 != 0) {
            computeSerializedSize += kvd.m5415a(13, i3);
        }
        float[] fArr = this.f22214k;
        if (fArr != null) {
            i3 = fArr.length;
            if (i3 > 0) {
                i = (computeSerializedSize + (i3 << 2)) + i3;
            } else {
                i = computeSerializedSize;
            }
        } else {
            i = computeSerializedSize;
        }
        int[] iArr = this.f22200I;
        if (iArr == null) {
            computeSerializedSize = i;
        } else if (iArr.length > 0) {
            int length;
            computeSerializedSize = 0;
            i3 = 0;
            while (true) {
                int[] iArr2 = this.f22200I;
                length = iArr2.length;
                if (computeSerializedSize >= length) {
                    break;
                }
                i3 += kvd.m5414a(iArr2[computeSerializedSize]);
                computeSerializedSize++;
            }
            computeSerializedSize = (i + i3) + length;
        } else {
            computeSerializedSize = i;
        }
        int[] iArr3 = this.f22201J;
        if (iArr3 != null && iArr3.length > 0) {
            int length2;
            i3 = 0;
            while (true) {
                int[] iArr4 = this.f22201J;
                length2 = iArr4.length;
                if (i2 >= length2) {
                    break;
                }
                i3 += kvd.m5414a(iArr4[i2]);
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (length2 + length2);
        }
        i2 = this.f22215l;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5415a(17, i2);
        }
        i2 = this.f22216m;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5415a(18, i2);
        }
        if (Float.floatToIntBits(this.f22202K) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(152) + 4;
        }
        if (Float.floatToIntBits(this.f22217n) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(160) + 4;
        }
        if (Float.floatToIntBits(this.f22218o) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(168) + 4;
        }
        if (this.f22219p) {
            computeSerializedSize += kvd.m5423b(176) + 1;
        }
        if (this.f22220q) {
            computeSerializedSize += kvd.m5423b(184) + 1;
        }
        float[] fArr2 = this.f22221r;
        if (fArr2 != null) {
            i2 = fArr2.length;
            if (i2 > 0) {
                computeSerializedSize = (computeSerializedSize + (i2 << 2)) + (i2 + i2);
            }
        }
        boolean[] zArr = this.f22222s;
        if (zArr != null) {
            i2 = zArr.length;
            if (i2 > 0) {
                computeSerializedSize = (computeSerializedSize + i2) + (i2 + i2);
            }
        }
        if (Float.floatToIntBits(this.f22223t) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(208) + 4;
        }
        if (Float.floatToIntBits(this.f22224u) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b((int) XmpUtil.M_SOI) + 4;
        }
        if (Float.floatToIntBits(this.f22225v) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(224) + 4;
        }
        if (Float.floatToIntBits(this.f22226w) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(232) + 4;
        }
        if (Float.floatToIntBits(this.f22227x) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(240) + 4;
        }
        if (Float.floatToIntBits(this.f22228y) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(248) + 4;
        }
        if (Float.floatToIntBits(this.f22229z) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(256) + 4;
        }
        if (Float.floatToIntBits(this.f22192A) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(264) + 4;
        }
        i2 = this.f22203L;
        if (i2 != 0) {
            computeSerializedSize += kvd.m5415a(34, i2);
        }
        if (this.f22193B) {
            computeSerializedSize += kvd.m5423b(280) + 1;
        }
        if (Float.floatToIntBits(this.f22194C) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(288) + 4;
        }
        if (Float.floatToIntBits(this.f22195D) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(296) + 4;
        }
        if (Float.floatToIntBits(this.f22196E) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(304) + 4;
        }
        if (this.f22197F) {
            return computeSerializedSize + (kvd.m5423b(312) + 1);
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            int c;
            int i2;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f22198G = kvc.m5405c();
                    continue;
                case 21:
                    this.f22204a = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 29:
                    this.f22205b = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 37:
                    this.f22206c = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 45:
                    this.f22207d = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 53:
                    this.f22208e = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 61:
                    this.f22199H = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 69:
                    this.f22209f = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 77:
                    this.f22210g = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 85:
                    this.f22211h = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 96:
                    this.f22212i = kvc.m5410f();
                    continue;
                case 104:
                    this.f22213j = kvc.m5410f();
                    continue;
                case 114:
                    i = kvc.m5410f();
                    c = kvc.m5404c(i);
                    i2 = i / 4;
                    obj = this.f22214k;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new float[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length) {
                        obj2[i] = Float.intBitsToFloat(kvc.m5406d());
                        i++;
                    }
                    this.f22214k = obj2;
                    kvc.m5402b(c);
                    continue;
                case 117:
                    c = kvn.m5457a(kvc, 117);
                    obj2 = this.f22214k;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new float[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = Float.intBitsToFloat(kvc.m5406d());
                        kvc.m5413i();
                        i++;
                    }
                    obj3[i] = Float.intBitsToFloat(kvc.m5406d());
                    this.f22214k = obj3;
                    continue;
                case 120:
                    c = kvn.m5457a(kvc, 120);
                    obj2 = this.f22200I;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new int[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.m5410f();
                        kvc.m5413i();
                        i++;
                    }
                    obj3[i] = kvc.m5410f();
                    this.f22200I = obj3;
                    continue;
                case 122:
                    i2 = kvc.m5404c(kvc.m5410f());
                    c = kvc.m5401b();
                    i = 0;
                    while (kvc.m5397a() > 0) {
                        kvc.m5410f();
                        i++;
                    }
                    kvc.m5407d(c);
                    obj = this.f22200I;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    obj4 = new int[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.m5410f();
                        c++;
                    }
                    this.f22200I = obj4;
                    kvc.m5402b(i2);
                    continue;
                case 128:
                    c = kvn.m5457a(kvc, 128);
                    obj2 = this.f22201J;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new int[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.m5410f();
                        kvc.m5413i();
                        i++;
                    }
                    obj3[i] = kvc.m5410f();
                    this.f22201J = obj3;
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                    i2 = kvc.m5404c(kvc.m5410f());
                    c = kvc.m5401b();
                    i = 0;
                    while (kvc.m5397a() > 0) {
                        kvc.m5410f();
                        i++;
                    }
                    kvc.m5407d(c);
                    obj = this.f22201J;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    obj4 = new int[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.m5410f();
                        c++;
                    }
                    this.f22201J = obj4;
                    kvc.m5402b(i2);
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ztrsm /*136*/:
                    this.f22215l = kvc.m5410f();
                    continue;
                case 144:
                    this.f22216m = kvc.m5410f();
                    continue;
                case 157:
                    this.f22202K = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case ShutterButton.DISABLED_FILTER_COLOR_VALUE /*165*/:
                    this.f22217n = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 173:
                    this.f22218o = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 176:
                    this.f22219p = kvc.m5405c();
                    continue;
                case 184:
                    this.f22220q = kvc.m5405c();
                    continue;
                case 194:
                    i = kvc.m5410f();
                    c = kvc.m5404c(i);
                    i2 = i / 4;
                    obj = this.f22221r;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new float[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length) {
                        obj2[i] = Float.intBitsToFloat(kvc.m5406d());
                        i++;
                    }
                    this.f22221r = obj2;
                    kvc.m5402b(c);
                    continue;
                case 197:
                    c = kvn.m5457a(kvc, 197);
                    obj2 = this.f22221r;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new float[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = Float.intBitsToFloat(kvc.m5406d());
                        kvc.m5413i();
                        i++;
                    }
                    obj3[i] = Float.intBitsToFloat(kvc.m5406d());
                    this.f22221r = obj3;
                    continue;
                case 200:
                    c = kvn.m5457a(kvc, 200);
                    obj2 = this.f22222s;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new boolean[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.m5405c();
                        kvc.m5413i();
                        i++;
                    }
                    obj3[i] = kvc.m5405c();
                    this.f22222s = obj3;
                    continue;
                case 202:
                    i2 = kvc.m5404c(kvc.m5410f());
                    c = kvc.m5401b();
                    i = 0;
                    while (kvc.m5397a() > 0) {
                        kvc.m5405c();
                        i++;
                    }
                    kvc.m5407d(c);
                    obj = this.f22222s;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    obj4 = new boolean[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.m5405c();
                        c++;
                    }
                    this.f22222s = obj4;
                    kvc.m5402b(i2);
                    continue;
                case 213:
                    this.f22223t = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 221:
                    this.f22224u = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 229:
                    this.f22225v = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 237:
                    this.f22226w = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 245:
                    this.f22227x = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 253:
                    this.f22228y = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 261:
                    this.f22229z = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 269:
                    this.f22192A = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 272:
                    this.f22203L = kvc.m5410f();
                    continue;
                case 280:
                    this.f22193B = kvc.m5405c();
                    continue;
                case 293:
                    this.f22194C = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case FrameType.ELEMENT_RGBA8888 /*301*/:
                    this.f22195D = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 309:
                    this.f22196E = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 312:
                    this.f22197F = kvc.m5405c();
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
        float[] fArr;
        int[] iArr;
        int i = 0;
        boolean z = this.f22198G;
        if (z) {
            kvd.m5429a(1, z);
        }
        if (Float.floatToIntBits(this.f22204a) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(2, this.f22204a);
        }
        if (Float.floatToIntBits(this.f22205b) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(3, this.f22205b);
        }
        if (Float.floatToIntBits(this.f22206c) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(4, this.f22206c);
        }
        if (Float.floatToIntBits(this.f22207d) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.f22207d);
        }
        if (Float.floatToIntBits(this.f22208e) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(6, this.f22208e);
        }
        if (Float.floatToIntBits(this.f22199H) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(7, this.f22199H);
        }
        if (Float.floatToIntBits(this.f22209f) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(8, this.f22209f);
        }
        if (Float.floatToIntBits(this.f22210g) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(9, this.f22210g);
        }
        if (Float.floatToIntBits(this.f22211h) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(10, this.f22211h);
        }
        int i2 = this.f22212i;
        if (i2 != 0) {
            kvd.m5431b(12, i2);
        }
        i2 = this.f22213j;
        if (i2 != 0) {
            kvd.m5431b(13, i2);
        }
        float[] fArr2 = this.f22214k;
        if (fArr2 != null && fArr2.length > 0) {
            i2 = 0;
            while (true) {
                fArr = this.f22214k;
                if (i2 >= fArr.length) {
                    break;
                }
                kvd.m5428a(14, fArr[i2]);
                i2++;
            }
        }
        int[] iArr2 = this.f22200I;
        if (iArr2 != null && iArr2.length > 0) {
            i2 = 0;
            while (true) {
                iArr = this.f22200I;
                if (i2 >= iArr.length) {
                    break;
                }
                kvd.m5431b(15, iArr[i2]);
                i2++;
            }
        }
        iArr2 = this.f22201J;
        if (iArr2 != null && iArr2.length > 0) {
            i2 = 0;
            while (true) {
                iArr = this.f22201J;
                if (i2 >= iArr.length) {
                    break;
                }
                kvd.m5431b(16, iArr[i2]);
                i2++;
            }
        }
        i2 = this.f22215l;
        if (i2 != 0) {
            kvd.m5431b(17, i2);
        }
        i2 = this.f22216m;
        if (i2 != 0) {
            kvd.m5431b(18, i2);
        }
        if (Float.floatToIntBits(this.f22202K) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(19, this.f22202K);
        }
        if (Float.floatToIntBits(this.f22217n) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(20, this.f22217n);
        }
        if (Float.floatToIntBits(this.f22218o) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(21, this.f22218o);
        }
        z = this.f22219p;
        if (z) {
            kvd.m5429a(22, z);
        }
        z = this.f22220q;
        if (z) {
            kvd.m5429a(23, z);
        }
        fArr2 = this.f22221r;
        if (fArr2 != null && fArr2.length > 0) {
            i2 = 0;
            while (true) {
                fArr = this.f22221r;
                if (i2 >= fArr.length) {
                    break;
                }
                kvd.m5428a(24, fArr[i2]);
                i2++;
            }
        }
        boolean[] zArr = this.f22222s;
        if (zArr != null && zArr.length > 0) {
            while (true) {
                zArr = this.f22222s;
                if (i >= zArr.length) {
                    break;
                }
                kvd.m5429a(25, zArr[i]);
                i++;
            }
        }
        if (Float.floatToIntBits(this.f22223t) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(26, this.f22223t);
        }
        if (Float.floatToIntBits(this.f22224u) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(27, this.f22224u);
        }
        if (Float.floatToIntBits(this.f22225v) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(28, this.f22225v);
        }
        if (Float.floatToIntBits(this.f22226w) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(29, this.f22226w);
        }
        if (Float.floatToIntBits(this.f22227x) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(30, this.f22227x);
        }
        if (Float.floatToIntBits(this.f22228y) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(31, this.f22228y);
        }
        if (Float.floatToIntBits(this.f22229z) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(32, this.f22229z);
        }
        if (Float.floatToIntBits(this.f22192A) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(33, this.f22192A);
        }
        i2 = this.f22203L;
        if (i2 != 0) {
            kvd.m5431b(34, i2);
        }
        z = this.f22193B;
        if (z) {
            kvd.m5429a(35, z);
        }
        if (Float.floatToIntBits(this.f22194C) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(36, this.f22194C);
        }
        if (Float.floatToIntBits(this.f22195D) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(37, this.f22195D);
        }
        if (Float.floatToIntBits(this.f22196E) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(38, this.f22196E);
        }
        z = this.f22197F;
        if (z) {
            kvd.m5429a(39, z);
        }
        super.writeTo(kvd);
    }
}
