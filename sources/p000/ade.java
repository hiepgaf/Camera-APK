package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ade */
public class ade implements ada {
    /* renamed from: a */
    private static final String f9615a = ade.class.getSimpleName();
    /* renamed from: b */
    private int[] f9616b;
    /* renamed from: c */
    private final int[] f9617c;
    /* renamed from: d */
    private final adk f9618d;
    /* renamed from: e */
    private ByteBuffer f9619e;
    /* renamed from: f */
    private byte[] f9620f;
    /* renamed from: g */
    private short[] f9621g;
    /* renamed from: h */
    private byte[] f9622h;
    /* renamed from: i */
    private byte[] f9623i;
    /* renamed from: j */
    private byte[] f9624j;
    /* renamed from: k */
    private int[] f9625k;
    /* renamed from: l */
    private int f9626l;
    /* renamed from: m */
    private adc f9627m;
    /* renamed from: n */
    private Bitmap f9628n;
    /* renamed from: o */
    private boolean f9629o;
    /* renamed from: p */
    private int f9630p;
    /* renamed from: q */
    private int f9631q;
    /* renamed from: r */
    private int f9632r;
    /* renamed from: s */
    private int f9633s;
    /* renamed from: t */
    private Boolean f9634t;
    /* renamed from: u */
    private Config f9635u;

    private ade(adk adk) {
        this.f9617c = new int[256];
        this.f9635u = Config.ARGB_8888;
        this.f9618d = adk;
        this.f9627m = new adc();
    }

    public ade(adk adk, adc adc, ByteBuffer byteBuffer, int i) {
        this(adk);
        m6289a(adc, byteBuffer, i);
    }

    /* renamed from: a */
    public final void mo11a() {
        this.f9626l = (this.f9626l + 1) % this.f9627m.f304c;
    }

    /* renamed from: b */
    public final void mo13b() {
        this.f9627m = null;
        byte[] bArr = this.f9624j;
        if (bArr != null) {
            this.f9618d.m165a(bArr);
        }
        Object obj = this.f9625k;
        if (obj != null) {
            agu agu = this.f9618d.f333b;
            if (agu != null) {
                agu.m262a(obj);
            }
        }
        Bitmap bitmap = this.f9628n;
        if (bitmap != null) {
            this.f9618d.m164a(bitmap);
        }
        this.f9628n = null;
        this.f9619e = null;
        this.f9634t = null;
        bArr = this.f9620f;
        if (bArr != null) {
            this.f9618d.m165a(bArr);
        }
    }

    /* renamed from: c */
    public final int mo14c() {
        return (this.f9619e.limit() + this.f9624j.length) + (this.f9625k.length << 2);
    }

    /* renamed from: d */
    public final int mo15d() {
        return this.f9626l;
    }

    /* renamed from: e */
    public final ByteBuffer mo16e() {
        return this.f9619e;
    }

    /* renamed from: f */
    public final int mo17f() {
        return this.f9627m.f304c;
    }

    /* renamed from: i */
    private final Bitmap m6290i() {
        Config config;
        Boolean bool = this.f9634t;
        if (bool == null || bool.booleanValue()) {
            config = Config.ARGB_8888;
        } else {
            config = this.f9635u;
        }
        adk adk = this.f9618d;
        Bitmap b = adk.f332a.mo64b(this.f9633s, this.f9632r, config);
        b.setHasAlpha(true);
        return b;
    }

    /* renamed from: g */
    public final int mo18g() {
        adc adc = this.f9627m;
        int i = adc.f304c;
        if (i > 0) {
            int i2 = this.f9626l;
            if (i2 >= 0) {
                if (i2 < 0 || i2 >= i) {
                    return -1;
                }
                return ((adb) adc.f306e.get(i2)).f299i;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public final synchronized Bitmap mo19h() {
        Bitmap bitmap;
        if (this.f9627m.f304c <= 0 || this.f9626l < 0) {
            if (Log.isLoggable(f9615a, 3)) {
                String str = f9615a;
                int i = this.f9627m.f304c;
                int i2 = this.f9626l;
                StringBuilder stringBuilder = new StringBuilder(72);
                stringBuilder.append("Unable to decode frame, frameCount=");
                stringBuilder.append(i);
                stringBuilder.append(", framePointer=");
                stringBuilder.append(i2);
                Log.d(str, stringBuilder.toString());
            }
            this.f9630p = 1;
        }
        int i3 = this.f9630p;
        StringBuilder stringBuilder2;
        if (i3 == 1 || i3 == 2) {
            if (Log.isLoggable(f9615a, 3)) {
                str = f9615a;
                i = this.f9630p;
                stringBuilder2 = new StringBuilder(42);
                stringBuilder2.append("Unable to decode frame, status=");
                stringBuilder2.append(i);
                Log.d(str, stringBuilder2.toString());
            }
            bitmap = null;
        } else {
            adb adb;
            this.f9630p = 0;
            if (this.f9620f == null) {
                this.f9620f = this.f9618d.m166a((int) Illuminant.kOther);
            }
            adb adb2 = (adb) this.f9627m.f306e.get(this.f9626l);
            i3 = this.f9626l - 1;
            if (i3 >= 0) {
                adb = (adb) this.f9627m.f306e.get(i3);
            } else {
                adb = null;
            }
            int[] iArr = adb2.f301k;
            if (iArr == null) {
                iArr = this.f9627m.f302a;
            }
            this.f9616b = iArr;
            Object obj = this.f9616b;
            if (obj == null) {
                if (Log.isLoggable(f9615a, 3)) {
                    str = f9615a;
                    i = this.f9626l;
                    stringBuilder2 = new StringBuilder(49);
                    stringBuilder2.append("No valid color table found for frame #");
                    stringBuilder2.append(i);
                    Log.d(str, stringBuilder2.toString());
                }
                this.f9630p = 1;
                bitmap = null;
            } else {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                if (adb2.f296f) {
                    System.arraycopy(obj, 0, this.f9617c, 0, obj.length);
                    this.f9616b = this.f9617c;
                    this.f9616b[adb2.f298h] = 0;
                }
                int[] iArr2 = this.f9625k;
                if (adb == null) {
                    bitmap = this.f9628n;
                    if (bitmap != null) {
                        this.f9618d.m164a(bitmap);
                    }
                    this.f9628n = null;
                    Arrays.fill(iArr2, 0);
                }
                if (adb != null && adb.f297g == 3 && this.f9628n == null) {
                    Arrays.fill(iArr2, 0);
                }
                if (adb != null) {
                    i3 = adb.f297g;
                    if (i3 > 0) {
                        if (i3 == 2) {
                            if (!adb2.f296f) {
                                adc adc = this.f9627m;
                                i3 = adc.f312k;
                                if (adb2.f301k != null && adc.f311j == adb2.f298h) {
                                    i3 = 0;
                                }
                            } else if (this.f9626l != 0) {
                                i3 = 0;
                            } else {
                                this.f9634t = Boolean.valueOf(true);
                                i3 = 0;
                            }
                            i4 = adb.f294d;
                            i5 = this.f9631q;
                            i6 = i4 / i5;
                            i4 = adb.f292b / i5;
                            i7 = adb.f293c / i5;
                            i2 = adb.f291a / i5;
                            i5 = this.f9633s;
                            i4 = (i4 * i5) + i2;
                            i5 = i4 + (i6 * i5);
                            while (i4 < i5) {
                                i6 = i4 + i7;
                                for (i2 = i4; i2 < i6; i2++) {
                                    iArr2[i2] = i3;
                                }
                                i4 += this.f9633s;
                            }
                        } else if (i3 == 3) {
                            bitmap = this.f9628n;
                            if (bitmap != null) {
                                i4 = this.f9633s;
                                bitmap.getPixels(iArr2, 0, i4, 0, 0, i4, this.f9632r);
                            }
                        }
                    }
                }
                if (adb2 != null) {
                    this.f9619e.position(adb2.f300j);
                }
                if (adb2 == null) {
                    adc adc2 = this.f9627m;
                    i8 = adc2.f308g * adc2.f307f;
                } else {
                    i8 = adb2.f293c * adb2.f294d;
                }
                byte[] bArr = this.f9624j;
                if (bArr == null || bArr.length < i8) {
                    this.f9624j = this.f9618d.m166a(i8);
                }
                byte[] bArr2 = this.f9624j;
                if (this.f9621g == null) {
                    this.f9621g = new short[4096];
                }
                short[] sArr = this.f9621g;
                if (this.f9622h == null) {
                    this.f9622h = new byte[4096];
                }
                byte[] bArr3 = this.f9622h;
                if (this.f9623i == null) {
                    this.f9623i = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
                }
                byte[] bArr4 = this.f9623i;
                int j = m6291j();
                int i12 = 1 << j;
                int i13 = i12 + 1;
                int i14 = i12 + 2;
                i4 = j + 1;
                int i15 = 1 << i4;
                int i16 = i15 - 1;
                for (i3 = 0; i3 < i12; i3++) {
                    sArr[i3] = (short) 0;
                    bArr3[i3] = (byte) i3;
                }
                byte[] bArr5 = this.f9620f;
                int i17 = -1;
                i2 = 0;
                i6 = 0;
                i3 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = i16;
                i16 = 0;
                i5 = 0;
                i7 = 0;
                while (i7 < i8) {
                    if (i2 == 0) {
                        i2 = m6291j();
                        if (i2 > 0) {
                            ByteBuffer byteBuffer = this.f9619e;
                            byteBuffer.get(this.f9620f, 0, Math.min(i2, byteBuffer.remaining()));
                        }
                        if (i2 <= 0) {
                            this.f9630p = 3;
                            break;
                        }
                        i9 = 0;
                        i10 = i2;
                    } else {
                        i9 = i3;
                        i10 = i2;
                    }
                    i3 = ((bArr5[i9] & Illuminant.kOther) << i19) + i18;
                    i2 = i19 + 8;
                    i18 = i9 + 1;
                    i19 = i10 - 1;
                    i9 = i7;
                    i10 = i2;
                    i7 = i5;
                    i2 = i14;
                    i5 = i16;
                    i11 = i4;
                    i4 = i20;
                    i20 = i3;
                    i3 = i11;
                    while (i10 >= i3) {
                        i16 = i20 & i4;
                        i14 = i20 >> i3;
                        i10 -= i3;
                        if (i16 != i12) {
                            if (i16 == i13) {
                                i16 = i5;
                                i20 = i4;
                                i5 = i7;
                                i4 = i3;
                                i7 = i9;
                                i3 = i18;
                                i18 = i14;
                                i14 = i2;
                                i2 = i19;
                                i19 = i10;
                                break;
                            } else if (i17 == -1) {
                                bArr2[i7] = bArr3[i16];
                                i20 = i14;
                                i9++;
                                i17 = i16;
                                i7++;
                                i5 = i16;
                            } else {
                                if (i16 >= i2) {
                                    bArr4[i6] = (byte) i5;
                                    i6++;
                                    i5 = i17;
                                } else {
                                    i5 = i16;
                                }
                                while (i5 >= i12) {
                                    bArr4[i6] = bArr3[i5];
                                    i6++;
                                    i5 = sArr[i5];
                                }
                                i20 = bArr3[i5] & Illuminant.kOther;
                                byte b = (byte) i20;
                                bArr2[i7] = b;
                                i5 = i7 + 1;
                                i7 = i9 + 1;
                                while (i6 > 0) {
                                    i6--;
                                    bArr2[i5] = bArr4[i6];
                                    i5++;
                                    i7++;
                                }
                                if (i2 < 4096) {
                                    sArr[i2] = (short) i17;
                                    bArr3[i2] = b;
                                    i2++;
                                    if ((i2 & i4) == 0 && i2 < 4096) {
                                        i3++;
                                        i4 += i2;
                                    }
                                }
                                i9 = i7;
                                i17 = i16;
                                i7 = i5;
                                i5 = i20;
                                i20 = i14;
                            }
                        } else {
                            i3 = j + 1;
                            i4 = i15 - 1;
                            i2 = i12 + 2;
                            i20 = i14;
                            i17 = -1;
                        }
                    }
                    i16 = i5;
                    i14 = i2;
                    i5 = i7;
                    i2 = i19;
                    i7 = i9;
                    i19 = i10;
                    i11 = i20;
                    i20 = i4;
                    i4 = i3;
                    i3 = i18;
                    i18 = i11;
                }
                Arrays.fill(bArr2, i5, i8, (byte) 0);
                int i21;
                boolean z;
                if (adb2.f295e || this.f9631q != 1) {
                    Object obj2;
                    int[] iArr3 = this.f9625k;
                    i3 = adb2.f294d;
                    int i22 = this.f9631q;
                    int i23 = i3 / i22;
                    j = adb2.f292b / i22;
                    i12 = adb2.f293c / i22;
                    i13 = adb2.f291a / i22;
                    if (this.f9626l != 0) {
                        obj2 = null;
                    } else {
                        i21 = 1;
                    }
                    i15 = this.f9633s;
                    int i24 = this.f9632r;
                    byte[] bArr6 = this.f9624j;
                    int[] iArr4 = this.f9616b;
                    Boolean bool = this.f9634t;
                    i2 = 1;
                    i4 = 8;
                    i3 = 0;
                    i17 = 0;
                    while (i17 < i23) {
                        if (adb2.f295e) {
                            if (i3 >= i23) {
                                i2++;
                                switch (i2) {
                                    case 2:
                                        i3 = 4;
                                        break;
                                    case 3:
                                        i4 = 2;
                                        i11 = i2;
                                        i2 = 4;
                                        i3 = i11;
                                        break;
                                    case 4:
                                        i4 = 1;
                                        i11 = i2;
                                        i2 = 2;
                                        i3 = i11;
                                        break;
                                }
                                i11 = i2;
                                i2 = i4;
                                i4 = i3;
                                i3 = i11;
                            } else {
                                i11 = i2;
                                i2 = i4;
                                i4 = i3;
                                i3 = i11;
                            }
                            i16 = i4 + i2;
                            i20 = i2;
                            i14 = i3;
                        } else {
                            i16 = i3;
                            i20 = i4;
                            i14 = i2;
                            i4 = i17;
                        }
                        i3 = i4 + j;
                        if (i3 < i24) {
                            i4 = i3 * i15;
                            i2 = i4 + i13;
                            i3 = i2 + i12;
                            i4 += i15;
                            if (i4 >= i3) {
                                i9 = i3;
                            } else {
                                i9 = i4;
                            }
                            i3 = (i17 * i22) * adb2.f293c;
                            Boolean bool2;
                            if (i22 != 1) {
                                int i25 = i3 + ((i9 - i2) * i22);
                                i10 = i3;
                                for (i18 = i2; i18 < i9; i18++) {
                                    byte[] bArr7;
                                    int i26;
                                    i8 = adb2.f293c;
                                    i6 = 0;
                                    i5 = 0;
                                    i4 = 0;
                                    i2 = 0;
                                    i3 = 0;
                                    i19 = i10;
                                    while (i19 < this.f9631q + i10) {
                                        bArr7 = this.f9624j;
                                        if (i19 < bArr7.length && i19 < i25) {
                                            i26 = this.f9616b[bArr7[i19] & Illuminant.kOther];
                                            if (i26 != 0) {
                                                i6 += i26 >>> 24;
                                                i5 += (i26 >> 16) & Illuminant.kOther;
                                                i4 += (i26 >> 8) & Illuminant.kOther;
                                                i2 += i26 & Illuminant.kOther;
                                                i3++;
                                            }
                                            i19++;
                                        }
                                        i8 += i10;
                                        i19 = i8;
                                        while (i19 < this.f9631q + i8) {
                                            bArr7 = this.f9624j;
                                            if (i19 < bArr7.length && i19 < i25) {
                                                i26 = this.f9616b[bArr7[i19] & Illuminant.kOther];
                                                if (i26 != 0) {
                                                    i6 += i26 >>> 24;
                                                    i5 += (i26 >> 16) & Illuminant.kOther;
                                                    i4 += (i26 >> 8) & Illuminant.kOther;
                                                    i2 += i26 & Illuminant.kOther;
                                                    i3++;
                                                }
                                                i19++;
                                            }
                                            if (i3 != 0) {
                                                i3 = (i2 / i3) | (((i4 / i3) << 8) | (((i5 / i3) << 16) | ((i6 / i3) << 24)));
                                            } else {
                                                i3 = 0;
                                            }
                                            if (i3 == 0) {
                                                iArr3[i18] = i3;
                                                bool2 = bool;
                                            } else {
                                                bool2 = obj2 != null ? bool == null ? Boolean.valueOf(true) : bool : bool;
                                            }
                                            i10 += i22;
                                            bool = bool2;
                                        }
                                        if (i3 != 0) {
                                            i3 = 0;
                                        } else {
                                            i3 = (i2 / i3) | (((i4 / i3) << 8) | (((i5 / i3) << 16) | ((i6 / i3) << 24)));
                                        }
                                        if (i3 == 0) {
                                            iArr3[i18] = i3;
                                            bool2 = bool;
                                        } else if (obj2 != null) {
                                        }
                                        i10 += i22;
                                        bool = bool2;
                                    }
                                    i8 += i10;
                                    i19 = i8;
                                    while (i19 < this.f9631q + i8) {
                                        bArr7 = this.f9624j;
                                        i26 = this.f9616b[bArr7[i19] & Illuminant.kOther];
                                        if (i26 != 0) {
                                            i6 += i26 >>> 24;
                                            i5 += (i26 >> 16) & Illuminant.kOther;
                                            i4 += (i26 >> 8) & Illuminant.kOther;
                                            i2 += i26 & Illuminant.kOther;
                                            i3++;
                                        }
                                        i19++;
                                    }
                                    if (i3 != 0) {
                                        i3 = (i2 / i3) | (((i4 / i3) << 8) | (((i5 / i3) << 16) | ((i6 / i3) << 24)));
                                    } else {
                                        i3 = 0;
                                    }
                                    if (i3 == 0) {
                                        iArr3[i18] = i3;
                                        bool2 = bool;
                                    } else if (obj2 != null) {
                                        if (bool == null) {
                                        }
                                    }
                                    i10 += i22;
                                    bool = bool2;
                                }
                            } else {
                                i2 = i3;
                                bool2 = bool;
                                for (i4 = i2; i4 < i9; i4++) {
                                    i5 = iArr4[bArr6[i2] & Illuminant.kOther];
                                    if (i5 != 0) {
                                        iArr3[i4] = i5;
                                    } else if (obj2 != null && bool2 == null) {
                                        bool2 = Boolean.valueOf(true);
                                    }
                                    i2 += i22;
                                }
                                bool = bool2;
                            }
                        }
                        i17++;
                        i3 = i16;
                        i4 = i20;
                        i2 = i14;
                    }
                    if (this.f9634t == null) {
                        if (bool == null) {
                            z = false;
                        } else {
                            z = bool.booleanValue();
                        }
                        this.f9634t = Boolean.valueOf(z);
                    }
                } else {
                    int[] iArr5 = this.f9625k;
                    i16 = adb2.f294d;
                    i20 = adb2.f292b;
                    i14 = adb2.f293c;
                    i9 = adb2.f291a;
                    i10 = this.f9626l;
                    i18 = this.f9633s;
                    byte[] bArr8 = this.f9624j;
                    int[] iArr6 = this.f9616b;
                    i4 = -1;
                    i7 = 0;
                    while (i7 < i16) {
                        i5 = (i7 + i20) * i18;
                        i2 = i5 + i9;
                        i3 = i2 + i14;
                        i5 += i18;
                        if (i5 >= i3) {
                            i6 = i3;
                        } else {
                            i6 = i5;
                        }
                        i5 = i2;
                        i3 = i4;
                        i4 = adb2.f293c * i7;
                        while (i5 < i6) {
                            byte b2 = bArr8[i4];
                            i21 = b2 & Illuminant.kOther;
                            if (i21 != i3) {
                                i21 = iArr6[i21];
                                if (i21 != 0) {
                                    iArr5[i5] = i21;
                                } else {
                                    byte b3 = b2;
                                }
                            }
                            i5++;
                            i4++;
                        }
                        i7++;
                        i4 = i3;
                    }
                    if (this.f9634t != null) {
                        z = false;
                    } else if (i10 != 0) {
                        z = false;
                    } else if (i4 != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f9634t = Boolean.valueOf(z);
                }
                if (this.f9629o) {
                    i3 = adb2.f297g;
                    if (i3 == 0 || i3 == 1) {
                        if (this.f9628n == null) {
                            this.f9628n = m6290i();
                        }
                        bitmap = this.f9628n;
                        i4 = this.f9633s;
                        bitmap.setPixels(iArr2, 0, i4, 0, 0, i4, this.f9632r);
                    }
                }
                bitmap = m6290i();
                i4 = this.f9633s;
                bitmap.setPixels(iArr2, 0, i4, 0, 0, i4, this.f9632r);
            }
        }
        return bitmap;
    }

    /* renamed from: j */
    private final int m6291j() {
        return this.f9619e.get() & Illuminant.kOther;
    }

    /* renamed from: a */
    private final synchronized void m6289a(adc adc, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Sample size must be >=0, not: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int[] iArr;
        int highestOneBit = Integer.highestOneBit(i);
        this.f9630p = 0;
        this.f9627m = adc;
        this.f9626l = -1;
        this.f9619e = byteBuffer.asReadOnlyBuffer();
        this.f9619e.position(0);
        this.f9619e.order(ByteOrder.LITTLE_ENDIAN);
        this.f9629o = false;
        for (adb adb : adc.f306e) {
            if (adb.f297g == 3) {
                this.f9629o = true;
                break;
            }
        }
        this.f9631q = highestOneBit;
        int i2 = adc.f307f;
        this.f9633s = i2 / highestOneBit;
        int i3 = adc.f308g;
        this.f9632r = i3 / highestOneBit;
        this.f9624j = this.f9618d.m166a(i2 * i3);
        highestOneBit = this.f9633s * this.f9632r;
        agu agu = this.f9618d.f333b;
        if (agu == null) {
            iArr = new int[highestOneBit];
        } else {
            iArr = (int[]) agu.m258a(highestOneBit, int[].class);
        }
        this.f9625k = iArr;
    }

    /* renamed from: a */
    public final void mo12a(Config config) {
        if (config == Config.ARGB_8888 || config == Config.RGB_565) {
            this.f9635u = config;
            return;
        }
        String valueOf = String.valueOf(config);
        String valueOf2 = String.valueOf(Config.ARGB_8888);
        String valueOf3 = String.valueOf(Config.RGB_565);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 41) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("Unsupported format: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", must be one of ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" or ");
        stringBuilder.append(valueOf3);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
