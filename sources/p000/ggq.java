package p000;

import android.graphics.Rect;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggq */
public class ggq extends ggr {
    /* renamed from: b */
    private static final String f16900b = bli.m862a("TaskRGBPreview");
    /* renamed from: a */
    public final iqp f16901a;
    /* renamed from: i */
    private final int f16902i;
    /* renamed from: j */
    private final ird f16903j;

    ggq(gfw gfw, Executor executor, gfv gfv, int i, get get, iqp iqp, int i2, ird ird) {
        super(gfw, executor, gfv, i, get);
        this.f16901a = iqp;
        this.f16902i = i2;
        this.f16903j = ird;
    }

    /* renamed from: a */
    protected static ggt m11066a(gfw gfw) {
        return new ggt(gfw.f5150c, gfw.f5149b.mo2720g(), gfw.f5149b.mo2717d());
    }

    /* renamed from: a */
    private static int m11065a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return ((((i5 / i3) * i8) + ((i6 / i3) * i7)) + ((i2 / i4) * i5)) + ((i / i4) * i6);
    }

    /* renamed from: a */
    protected final ggt m11068a(gfw gfw, int i) {
        int width;
        int height;
        Rect a = ggr.m2545a(gfw.f5149b, gfw.f5153f);
        if (this.f16902i == go.aR) {
            width = a.width() / i;
            height = a.height() / i;
        } else {
            height = ggq.m11064a(a.width() / i, a.height() / i);
            height += height;
            width = height;
        }
        return new ggt(gfw.f5150c, width, height);
    }

    /* renamed from: a */
    private final int[] m11067a(iwz iwz, Rect rect, int i, boolean z) {
        Rect a = ggr.m2545a(iwz, rect);
        List e = iwz.mo2718e();
        if (e.size() != 3) {
            int size = e.size();
            StringBuilder stringBuilder = new StringBuilder(57);
            stringBuilder.append("Incorrect number planes (");
            stringBuilder.append(size);
            stringBuilder.append(") in YUV Image Object");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int width = a.width() / i;
        size = a.height() / i;
        ByteBuffer a2 = ((ixa) e.get(0)).mo637a();
        ByteBuffer a3 = ((ixa) e.get(1)).mo637a();
        ByteBuffer a4 = ((ixa) e.get(2)).mo637a();
        int c = ((ixa) e.get(0)).mo639c() * i;
        int c2 = ((ixa) e.get(1)).mo639c() * i;
        int c3 = ((ixa) e.get(2)).mo639c() * i;
        int b = ((ixa) e.get(0)).mo638b() * i;
        int b2 = ((ixa) e.get(1)).mo638b() * i;
        int b3 = ((ixa) e.get(2)).mo638b() * i;
        int i9 = a.top / 2;
        int i10 = i9 + i9;
        i9 = a.left / 2;
        int i11 = i9 + i9;
        if (z) {
            i9 = ggq.m11064a(width, size);
            int i12 = (i9 * i9) << 2;
            int i13 = i9 + i9;
            if (width > size) {
                i2 = width / 2;
                i3 = (i2 - i9) / 2;
                i9 = (i9 + i2) / 2;
                i4 = i3 + i3;
                i3 = i9 + i9;
                i2 = 0;
                i9 = size;
            } else {
                i3 = size / 2;
                i2 = (i3 - i9) / 2;
                i2 += i2;
                i9 = (i9 + i3) / 2;
                i9 += i9;
                i4 = 0;
                i3 = width;
            }
            i5 = i9;
            i6 = i2;
            i7 = i3;
            i8 = i13;
            i2 = i12;
            i9 = i4;
        } else {
            i9 = width / 2;
            i3 = i9 + i9;
            i9 = size / 2;
            i5 = i9 + i9;
            i6 = 0;
            i7 = i3;
            i8 = width;
            i2 = width * size;
            i9 = 0;
        }
        int[] iArr = new int[i2];
        mo3059a("TIMER_BEGIN Starting Native Java YUV420-to-RGB Rectangular Conversion");
        stringBuilder = new StringBuilder(38);
        stringBuilder.append("\t Y-Plane Size=");
        stringBuilder.append(width);
        stringBuilder.append("x");
        stringBuilder.append(size);
        mo3059a(stringBuilder.toString());
        i2 = ((ixa) e.get(1)).mo639c();
        size = ((ixa) e.get(1)).mo638b();
        StringBuilder stringBuilder2 = new StringBuilder(51);
        stringBuilder2.append("\t U-Plane Size=");
        stringBuilder2.append(i2);
        stringBuilder2.append(" Pixel Stride=");
        stringBuilder2.append(size);
        mo3059a(stringBuilder2.toString());
        i2 = ((ixa) e.get(2)).mo639c();
        size = ((ixa) e.get(2)).mo638b();
        stringBuilder2 = new StringBuilder(51);
        stringBuilder2.append("\t V-Plane Size=");
        stringBuilder2.append(i2);
        stringBuilder2.append(" Pixel Stride=");
        stringBuilder2.append(size);
        mo3059a(stringBuilder2.toString());
        for (size = i6; size < i5; size += 2) {
            int i14 = (size - i6) * i8;
            int a5 = ggq.m11065a(i9, size, i, 1, c, b, i11, i10);
            int i15 = i11 / 2;
            int i16 = i10 / 2;
            i3 = ggq.m11065a(i9, size, i, 2, c2, b2, i15, i16);
            i4 = i9;
            i12 = ggq.m11065a(i9, size, i, 2, c3, b3, i15, i16);
            i13 = i3;
            i15 = a5;
            i16 = i14;
            while (i4 < i7) {
                i2 = (a3.get(i13) & Illuminant.kOther) - 128;
                i3 = (a4.get(i12) & Illuminant.kOther) - 128;
                int i17 = (i3 * 358) >> 8;
                int i18 = ((i3 * -182) + (i2 * -88)) >> 8;
                int i19 = (i2 * 453) >> 8;
                i3 = a2.get(i15) & Illuminant.kOther;
                width = i3 + i18;
                i2 = i3 + i19;
                i3 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i3 > 255) {
                    i3 = Illuminant.kOther;
                }
                if (i2 > 255) {
                    i2 = Illuminant.kOther;
                }
                iArr[i16] = ((i2 & Illuminant.kOther) | (((i3 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                i3 = a2.get(i15 + b) & Illuminant.kOther;
                width = i3 + i18;
                i2 = i3 + i19;
                i3 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i3 > 255) {
                    i3 = Illuminant.kOther;
                }
                if (i2 > 255) {
                    i2 = Illuminant.kOther;
                }
                iArr[i16 + 1] = ((i2 & Illuminant.kOther) | (((i3 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                int i20 = i15 + c;
                i3 = a2.get(i20) & Illuminant.kOther;
                width = i3 + i18;
                i2 = i3 + i19;
                i3 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i3 > 255) {
                    i3 = Illuminant.kOther;
                }
                if (i2 > 255) {
                    i2 = Illuminant.kOther;
                }
                int i21 = i16 + i8;
                iArr[i21] = ((i2 & Illuminant.kOther) | (((i3 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                i3 = a2.get(i20 + b) & Illuminant.kOther;
                width = i3 + i18;
                i2 = i3 + i19;
                i3 += i17;
                if (width < 0) {
                    width = 0;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (width > 255) {
                    width = Illuminant.kOther;
                }
                if (i3 > 255) {
                    i3 = Illuminant.kOther;
                }
                if (i2 > 255) {
                    i2 = Illuminant.kOther;
                }
                iArr[i21 + 1] = ((i2 & Illuminant.kOther) | (((i3 & Illuminant.kOther) << 16) | ((width & Illuminant.kOther) << 8))) | -16777216;
                i2 = i4 + 2;
                i12 += b3;
                i13 += b2;
                i16 += 2;
                i15 += b + b;
                i4 = i2;
            }
        }
        mo3059a("TIMER_END Starting Native Java YUV420-to-RGB Rectangular Conversion");
        return iArr;
    }

    /* renamed from: a */
    private static int m11064a(int i, int i2) {
        return (Math.min(i2, i) / 2) + 1;
    }

    /* renamed from: a */
    public void mo3059a(String str) {
        bli.m871d(f16900b, str);
    }

    /* renamed from: a */
    public final void m11069a(ggt ggt, int[] iArr, int i) {
        this.c.mo1477b().mo1418a(new ggu(this.e, ggt, i), new ggv(iArr));
    }

    public void run() {
        int min;
        int min2;
        this.f16903j.mo1903a(f16900b);
        gfw gfw = (gfw) jri.m13152b(this.g);
        Rect a = ggr.m2545a(gfw.f5149b, gfw.f5153f);
        ggq.m11066a(gfw);
        iqp iqp = new iqp(a.width(), a.height());
        if (this.f16902i == go.aP || this.f16902i == go.aQ) {
            iqp iqp2 = this.f16901a;
            min = Math.min(iqp.f7329a / iqp2.f7329a, iqp.f7330b / iqp2.f7330b);
            if (min > 0) {
                min2 = Math.min(iqp.f7329a, iqp.f7330b);
                while (min >= 2) {
                    if (fzb.m10903a(min2, min)) {
                        break;
                    }
                    min--;
                }
                min = 2;
            } else {
                min = 1;
            }
        } else {
            min = fzb.m10902a(iqp, this.f16901a);
        }
        ggt a2 = m11068a(gfw, min);
        try {
            m2546a(this.e, a2, go.aV);
            min2 = gfw.f5149b.mo2720g() / min;
            int d = gfw.f5149b.mo2717d() / min;
            StringBuilder stringBuilder = new StringBuilder(102);
            stringBuilder.append("TIMER_END Rendering preview YUV buffer available, w=");
            stringBuilder.append(min2);
            stringBuilder.append(" h=");
            stringBuilder.append(d);
            stringBuilder.append(" of subsample ");
            stringBuilder.append(min);
            mo3059a(stringBuilder.toString());
            int[] a3 = m11071a(gfw.f5149b, a, min);
            m11069a(a2, a3, go.aV);
            this.f16903j.mo1904b();
        } finally {
            a2 = this.c;
            a2.mo1472a(gfw.f5149b, this.d);
        }
    }

    /* renamed from: a */
    protected final int[] m11071a(iwz iwz, Rect rect, int i) {
        int a;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        Rect a2;
        StringBuilder stringBuilder;
        int a3;
        switch (this.f16902i - 1) {
            case 0:
                mo3059a("RUNNING DUMMY dummyColorInscribedDataCircleFromYuvImage");
                a = ggq.m11064a(iwz.mo2720g() / i, iwz.mo2717d() / i);
                i2 = (a * a) << 2;
                iArr = new int[i2];
                for (i3 = 0; i3 < i2; i3++) {
                    i4 = a + a;
                    iArr[i3] = (((i3 / i4) & Illuminant.kOther) << 8) | ((((i3 % i4) & Illuminant.kOther) << 16) | -16777216);
                }
                return iArr;
            case 1:
                a2 = ggr.m2545a(iwz, rect);
                List e = iwz.mo2718e();
                if (e.size() != 3) {
                    i3 = e.size();
                    stringBuilder = new StringBuilder(57);
                    stringBuilder.append("Incorrect number planes (");
                    stringBuilder.append(i3);
                    stringBuilder.append(") in YUV Image Object");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                mo3059a("TIMER_BEGIN Starting Native JNI YUV420-to-RGB Circular Conversion");
                a3 = ggq.m11064a(a2.width() / i, a2.height() / i);
                iArr = new int[((a3 * a3) << 2)];
                mo3059a("TIMER_END Starting Native JNI YUV420-to-RGB Circular Conversion");
                return iArr;
            case 2:
                a2 = ggr.m2545a(iwz, rect);
                List e2 = iwz.mo2718e();
                if (e2.size() != 3) {
                    i3 = e2.size();
                    stringBuilder = new StringBuilder(57);
                    stringBuilder.append("Incorrect number planes (");
                    stringBuilder.append(i3);
                    stringBuilder.append(") in YUV Image Object");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                int i5;
                int i6;
                int i7;
                i2 = a2.width() / i;
                a = a2.height() / i;
                int a4 = ggq.m11064a(i2, a);
                i3 = a2.top / 2;
                int i8 = i3 + i3;
                a3 = a2.left / 2;
                int i9 = a3 + a3;
                if (i2 > a) {
                    a3 = i2 / 2;
                    i3 = (a3 - a4) / 2;
                    a3 = (a3 + a4) / 2;
                    i5 = a;
                    i6 = 0;
                    i7 = a3 + a3;
                    a3 = i3 + i3;
                } else {
                    a3 = a / 2;
                    i3 = (a3 - a4) / 2;
                    a3 = (a3 + a4) / 2;
                    i5 = a3 + a3;
                    i6 = i3 + i3;
                    i7 = i2;
                    a3 = 0;
                }
                ByteBuffer a5 = ((ixa) e2.get(0)).mo637a();
                ByteBuffer a6 = ((ixa) e2.get(1)).mo637a();
                ByteBuffer a7 = ((ixa) e2.get(2)).mo637a();
                int c = ((ixa) e2.get(0)).mo639c() * i;
                i4 = ((ixa) e2.get(1)).mo639c() * i;
                int c2 = ((ixa) e2.get(2)).mo639c() * i;
                int b = ((ixa) e2.get(0)).mo638b() * i;
                int b2 = ((ixa) e2.get(1)).mo638b() * i;
                int b3 = ((ixa) e2.get(2)).mo638b() * i;
                int i10 = a4 + a4;
                int i11 = a / 2;
                int i12 = i2 / 2;
                int i13 = a4 * a4;
                int[] iArr2 = new int[(i13 << 2)];
                mo3059a("TIMER_BEGIN Starting Native Java YUV420-to-RGB Circular Conversion");
                StringBuilder stringBuilder2 = new StringBuilder(38);
                stringBuilder2.append("\t Y-Plane Size=");
                stringBuilder2.append(i2);
                stringBuilder2.append("x");
                stringBuilder2.append(a);
                mo3059a(stringBuilder2.toString());
                a = ((ixa) e2.get(1)).mo639c();
                i3 = ((ixa) e2.get(1)).mo638b();
                StringBuilder stringBuilder3 = new StringBuilder(51);
                stringBuilder3.append("\t U-Plane Size=");
                stringBuilder3.append(a);
                stringBuilder3.append(" Pixel Stride=");
                stringBuilder3.append(i3);
                mo3059a(stringBuilder3.toString());
                a = ((ixa) e2.get(2)).mo639c();
                i3 = ((ixa) e2.get(2)).mo638b();
                stringBuilder3 = new StringBuilder(51);
                stringBuilder3.append("\t V-Plane Size=");
                stringBuilder3.append(a);
                stringBuilder3.append(" Pixel Stride=");
                stringBuilder3.append(i3);
                mo3059a(stringBuilder3.toString());
                for (i3 = i6; i3 < i5; i3 += 2) {
                    int i14 = (i3 - i6) * i10;
                    int a8 = ggq.m11065a(a3, i3, i, 1, c, b, i9, i8);
                    int i15 = i9 / 2;
                    a4 = i8 / 2;
                    i2 = ggq.m11065a(a3, i3, i, 2, i4, b2, i15, a4);
                    a = ggq.m11065a(a3, i3, i, 2, c2, b3, i15, a4);
                    i15 = i3 - i11;
                    i15 = (int) (Math.sqrt((double) ((float) (i13 - (i15 * i15)))) + 0.5d);
                    int i16 = i12 - i15;
                    int i17 = i12 + i15;
                    i15 = (i3 + 1) - i11;
                    i15 = (int) (Math.sqrt((double) ((float) (i13 - (i15 * i15)))) + 0.5d);
                    int i18 = i12 - i15;
                    int i19 = i12 + i15;
                    int i20 = a3;
                    int i21 = a;
                    int i22 = i2;
                    int i23 = a8;
                    int i24 = i14;
                    while (i20 < i7) {
                        if (i20 > i17) {
                            if (i20 <= i19) {
                            }
                            iArr2[i24] = 0;
                            iArr2[i24 + 1] = 0;
                            a = i24 + i10;
                            iArr2[a] = 0;
                            iArr2[a + 1] = 0;
                            i21 += b3;
                            i22 += b2;
                            i23 += b + b;
                            i24 += 2;
                            i20 += 2;
                        }
                        a8 = i20 + 1;
                        if (a8 >= i16 || i20 >= i18) {
                            a = (a6.get(i22) & Illuminant.kOther) - 128;
                            i2 = (a7.get(i21) & Illuminant.kOther) - 128;
                            i14 = (i2 * 358) >> 8;
                            int i25 = ((i2 * -182) + (a * -88)) >> 8;
                            int i26 = (a * 453) >> 8;
                            if (i20 > i17 || i20 < i16) {
                                iArr2[i24] = 0;
                            } else {
                                a = i20 == i17 ? kvl.UNSET_ENUM_VALUE : i20 != i16 ? -16777216 : kvl.UNSET_ENUM_VALUE;
                                i15 = a5.get(i23) & Illuminant.kOther;
                                a4 = i15 + i25;
                                i2 = i15 + i26;
                                i15 += i14;
                                if (a4 < 0) {
                                    a4 = 0;
                                }
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                if (i2 < 0) {
                                    i2 = 0;
                                }
                                if (a4 > 255) {
                                    a4 = Illuminant.kOther;
                                }
                                if (i15 > 255) {
                                    i15 = Illuminant.kOther;
                                }
                                if (i2 > 255) {
                                    i2 = Illuminant.kOther;
                                }
                                iArr2[i24] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                            }
                            if (a8 > i17 || a8 < i16) {
                                iArr2[i24 + 1] = 0;
                            } else {
                                if (a8 == i17) {
                                    a = kvl.UNSET_ENUM_VALUE;
                                } else if (a8 != i16) {
                                    a = -16777216;
                                } else {
                                    a = kvl.UNSET_ENUM_VALUE;
                                }
                                i15 = a5.get(i23 + b) & Illuminant.kOther;
                                a4 = i15 + i25;
                                i2 = i15 + i26;
                                i15 += i14;
                                if (a4 < 0) {
                                    a4 = 0;
                                }
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                if (i2 < 0) {
                                    i2 = 0;
                                }
                                if (a4 > 255) {
                                    a4 = Illuminant.kOther;
                                }
                                if (i15 > 255) {
                                    i15 = Illuminant.kOther;
                                }
                                if (i2 > 255) {
                                    i2 = Illuminant.kOther;
                                }
                                iArr2[i24 + 1] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                            }
                            if (i20 > i19 || i20 < i18) {
                                iArr2[i24 + i10] = 0;
                            } else {
                                if (i20 == i19) {
                                    a = kvl.UNSET_ENUM_VALUE;
                                } else if (i20 != i18) {
                                    a = -16777216;
                                } else {
                                    a = kvl.UNSET_ENUM_VALUE;
                                }
                                i15 = a5.get(i23 + c) & Illuminant.kOther;
                                a4 = i15 + i25;
                                i2 = i15 + i26;
                                i15 += i14;
                                if (a4 < 0) {
                                    a4 = 0;
                                }
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                if (i2 < 0) {
                                    i2 = 0;
                                }
                                if (a4 > 255) {
                                    a4 = Illuminant.kOther;
                                }
                                if (i15 > 255) {
                                    i15 = Illuminant.kOther;
                                }
                                if (i2 > 255) {
                                    i2 = Illuminant.kOther;
                                }
                                iArr2[i24 + i10] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                            }
                            if (a8 > i19 || a8 < i18) {
                                iArr2[(i24 + i10) + 1] = 0;
                                i21 += b3;
                                i22 += b2;
                                i23 += b + b;
                                i24 += 2;
                                i20 += 2;
                            } else {
                                if (a8 == i19) {
                                    a = kvl.UNSET_ENUM_VALUE;
                                } else if (a8 != i18) {
                                    a = -16777216;
                                } else {
                                    a = kvl.UNSET_ENUM_VALUE;
                                }
                                i15 = a5.get((i23 + c) + b) & Illuminant.kOther;
                                a4 = i15 + i25;
                                i2 = i15 + i26;
                                i15 += i14;
                                if (a4 < 0) {
                                    a4 = 0;
                                }
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                if (i2 < 0) {
                                    i2 = 0;
                                }
                                if (a4 > 255) {
                                    a4 = Illuminant.kOther;
                                }
                                if (i15 > 255) {
                                    i15 = Illuminant.kOther;
                                }
                                if (i2 > 255) {
                                    i2 = Illuminant.kOther;
                                }
                                iArr2[(i24 + i10) + 1] = a | ((i2 & Illuminant.kOther) | (((i15 & Illuminant.kOther) << 16) | ((a4 & Illuminant.kOther) << 8)));
                                i21 += b3;
                                i22 += b2;
                                i23 += b + b;
                                i24 += 2;
                                i20 += 2;
                            }
                        }
                        iArr2[i24] = 0;
                        iArr2[i24 + 1] = 0;
                        a = i24 + i10;
                        iArr2[a] = 0;
                        iArr2[a + 1] = 0;
                        i21 += b3;
                        i22 += b2;
                        i23 += b + b;
                        i24 += 2;
                        i20 += 2;
                    }
                }
                mo3059a("TIMER_END Starting Native Java YUV420-to-RGB Circular Conversion");
                return iArr2;
            case 3:
                return m11067a(iwz, rect, i, true);
            case 4:
                return m11067a(iwz, rect, i, false);
            default:
                throw new IllegalStateException("Unreachable.  All ThumbnailShapes have been enumerated");
        }
    }
}
