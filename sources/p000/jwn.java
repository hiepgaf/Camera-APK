package p000;

import com.google.android.libraries.smartburst.utils.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jwn */
public final class jwn implements jwo {
    /* renamed from: a */
    private final jyz f19087a;

    public jwn(jza jza) {
        boolean z;
        int i;
        int i2;
        boolean z2 = true;
        jri.m13152b((Object) jza);
        if (jza.f8129C.length <= 2) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        int[] iArr = jza.f8129C;
        if (iArr.length == 2) {
            i = iArr[0];
            i2 = iArr[1];
        } else {
            i2 = iArr[0];
            i = 1;
            z2 = false;
        }
        this.f19087a = new jyz(i, i2, z2);
    }

    /* renamed from: a */
    public final float mo2058a(Feature feature, Feature feature2) {
        boolean z;
        int i;
        int i2;
        int i3;
        jyz jyz = this.f19087a;
        Object values = feature.getValues();
        float[] values2 = feature2.getValues();
        jri.m13139a(values, (Object) "hist1");
        jri.m13139a(values, (Object) "hist2");
        if (values.length == jyz.f8083b * jyz.f8084c) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "histogram dimensions are mismatched.");
        if (values2.length == jyz.f8083b * jyz.f8084c) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "histogram dimensions are mismatched.");
        int i4 = i - 1;
        for (float[] fill : jyz.f8086e) {
            Arrays.fill(fill, 0.0f);
        }
        for (i2 = 0; i2 < jyz.f8083b * jyz.f8084c; i2++) {
            float f = values[i2] - values2[i2];
            i = i2 + 1;
            if (f > 0.0f) {
                jyz.f8086e[0][i] = f;
            } else if (f < 0.0f) {
                jyz.f8086e[i][i4] = -f;
            }
        }
        for (int i5 = 1; i5 < i4; i5++) {
            int i6;
            if (jyz.f8086e[0][i5] != 0.0f) {
                ArrayList a;
                i = jyz.f8083b;
                if (i == 1) {
                    a = jyz.m4704a(i5, jyz.f8084c, jyz.f8085d);
                } else {
                    int i7 = jyz.f8084c;
                    if (i7 == 1) {
                        a = jyz.m4704a(i5, i, false);
                    } else {
                        boolean z2 = jyz.f8085d;
                        ArrayList arrayList = new ArrayList();
                        i3 = i5 - 1;
                        int i8 = i3 % i7;
                        int i9 = i3 / i7;
                        for (i6 = i8 - 1; i6 <= i8 + 1; i6++) {
                            int b = jyz.m4705b(i6, i7, z2);
                            if (b != -1) {
                                for (i3 = i9 - 1; i3 <= i9 + 1; i3++) {
                                    int b2 = jyz.m4705b(i3, i, false);
                                    if (b2 != -1) {
                                        arrayList.add(Integer.valueOf(((b2 * i7) + b) + 1));
                                    }
                                }
                            }
                        }
                        a = arrayList;
                    }
                }
                i = a.size();
                i2 = 0;
                while (i2 < i) {
                    i6 = i2 + 1;
                    Integer num = (Integer) a.get(i2);
                    if (jyz.f8086e[num.intValue()][i4] > 0.0f) {
                        jyz.f8086e[i5][num.intValue()] = Float.MAX_VALUE;
                        i2 = i6;
                    } else {
                        i2 = i6;
                    }
                }
            }
        }
        jzd jzd = jyz.f8082a;
        float[][] fArr = jyz.f8086e;
        if (fArr.length == jzd.f8134a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (fArr[0].length == jzd.f8134a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jzd.f8137d = fArr;
        for (int[] fill2 : jzd.f8136c) {
            Arrays.fill(fill2, 0);
        }
        i3 = 0;
        while (true) {
            i2 = jzd.f8134a;
            if (i3 >= i2) {
                break;
            }
            int i10 = i2 - 1;
            i2 = 0;
            i6 = i10;
            while (i6 > 0) {
                float[][] fArr2 = jzd.f8137d;
                if (fArr2[i3][i6] > 0.0f || fArr2[i6][i3] > 0.0f) {
                    jzd.f8136c[i3][i2] = i6;
                    i2++;
                }
                i6--;
            }
            i3++;
        }
        for (float[] fill3 : jzd.f8135b) {
            Arrays.fill(fill3, 0.0f);
        }
        float f2 = 0.0f;
        while (jzd.m4709a(true)) {
            f2 += jzd.m4708a();
        }
        while (jzd.m4709a(false)) {
            f2 += jzd.m4708a();
        }
        float f3 = 0.0f;
        i3 = 0;
        while (true) {
            float[][] fArr3 = jyz.f8086e;
            if (i3 >= fArr3.length) {
                return f3 - (f2 * 0.5f);
            }
            f3 += fArr3[0][i3];
            i3++;
        }
    }
}
