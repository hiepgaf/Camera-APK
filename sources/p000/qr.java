package p000;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: qr */
public final class qr {
    /* renamed from: a */
    public final String f9077a;
    /* renamed from: b */
    public int f9078b;
    /* renamed from: c */
    public boolean f9079c;
    /* renamed from: d */
    public String f9080d;
    /* renamed from: e */
    public int f9081e;
    /* renamed from: f */
    public int f9082f;

    qr() {
    }

    public qr(String str, int i, boolean z, String str2, int i2, int i3) {
        this.f9077a = str;
        this.f9078b = i;
        this.f9079c = z;
        this.f9080d = str2;
        this.f9081e = i2;
        this.f9082f = i3;
    }

    /* renamed from: a */
    private static void m5733a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new qt(c, fArr));
    }

    /* renamed from: a */
    public static boolean m5734a(qt[] qtVarArr, qt[] qtVarArr2) {
        if (qtVarArr == null || qtVarArr2 == null || qtVarArr.length != qtVarArr2.length) {
            return false;
        }
        for (int i = 0; i < qtVarArr.length; i++) {
            qt qtVar = qtVarArr[i];
            char c = qtVar.f9083a;
            qt qtVar2 = qtVarArr2[i];
            if (c != qtVar2.f9083a || qtVar.f9084b.length != qtVar2.f9084b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static float[] m5735a(float[] fArr, int i) {
        if (i >= 0) {
            Object obj = new float[i];
            System.arraycopy(fArr, 0, obj, 0, Math.min(i, fArr.length));
            return obj;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static qt[] m5736a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i;
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                    break;
                }
                i3++;
            }
            String trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
                qr.m5733a(arrayList, trim.charAt(0), qr.m5739c(trim));
            }
            i = i3 + 1;
            i2 = i3;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            qr.m5733a(arrayList, str.charAt(i2), new float[0]);
        }
        return (qt[]) arrayList.toArray(new qt[arrayList.size()]);
    }

    /* renamed from: b */
    public static Path m5738b(String str) {
        Path path = new Path();
        qt[] a = qr.m5736a(str);
        if (a == null) {
            return null;
        }
        try {
            qt.m5741a(a, path);
            return path;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error in parsing ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: a */
    public static qt[] m5737a(qt[] qtVarArr) {
        if (qtVarArr == null) {
            return null;
        }
        qt[] qtVarArr2 = new qt[qtVarArr.length];
        for (int i = 0; i < qtVarArr.length; i++) {
            qtVarArr2[i] = new qt(qtVarArr[i]);
        }
        return qtVarArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private static float[] m5739c(java.lang.String r13) {
        /*
        r1 = 1;
        r4 = 0;
        r0 = r13.charAt(r4);
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r0 == r2) goto L_0x0012;
    L_0x000a:
        r0 = r13.charAt(r4);
        r2 = 90;
        if (r0 != r2) goto L_0x0015;
    L_0x0012:
        r0 = new float[r4];
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = r13.length();	 Catch:{ NumberFormatException -> 0x008e }
        r8 = new float[r0];	 Catch:{ NumberFormatException -> 0x008e }
        r9 = new gv;	 Catch:{ NumberFormatException -> 0x008e }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x008e }
        r10 = r13.length();	 Catch:{ NumberFormatException -> 0x008e }
        r7 = r1;
        r2 = r4;
    L_0x0026:
        if (r7 < r10) goto L_0x002d;
    L_0x0028:
        r0 = p000.qr.m5735a(r8, r2);	 Catch:{ NumberFormatException -> 0x008e }
        goto L_0x0014;
    L_0x002d:
        r0 = 0;
        r9.f5711b = r0;	 Catch:{ NumberFormatException -> 0x008e }
        r5 = r4;
        r3 = r4;
        r0 = r4;
        r6 = r7;
    L_0x0034:
        r11 = r13.length();	 Catch:{ NumberFormatException -> 0x008e }
        if (r6 >= r11) goto L_0x0046;
    L_0x003a:
        r11 = r13.charAt(r6);	 Catch:{ NumberFormatException -> 0x008e }
        switch(r11) {
            case 32: goto L_0x0070;
            case 44: goto L_0x0070;
            case 45: goto L_0x007d;
            case 46: goto L_0x0072;
            case 69: goto L_0x006c;
            case 101: goto L_0x006c;
            default: goto L_0x0041;
        };	 Catch:{ NumberFormatException -> 0x008e }
    L_0x0041:
        r5 = r0;
        r0 = r3;
        r3 = r4;
    L_0x0044:
        if (r5 == 0) goto L_0x0065;
    L_0x0046:
        r9.f5710a = r6;	 Catch:{ NumberFormatException -> 0x008e }
        r3 = r9.f5710a;	 Catch:{ NumberFormatException -> 0x008e }
        if (r7 >= r3) goto L_0x0063;
    L_0x004c:
        r0 = r2 + 1;
        r5 = r13.substring(r7, r3);	 Catch:{ NumberFormatException -> 0x008e }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x008e }
        r8[r2] = r5;	 Catch:{ NumberFormatException -> 0x008e }
    L_0x0058:
        r2 = r9.f5711b;	 Catch:{ NumberFormatException -> 0x008e }
        if (r2 != 0) goto L_0x0060;
    L_0x005c:
        r7 = r3 + 1;
        r2 = r0;
        goto L_0x0026;
    L_0x0060:
        r7 = r3;
        r2 = r0;
        goto L_0x0026;
    L_0x0063:
        r0 = r2;
        goto L_0x0058;
    L_0x0065:
        r6 = r6 + 1;
        r12 = r3;
        r3 = r0;
        r0 = r5;
        r5 = r12;
        goto L_0x0034;
    L_0x006c:
        r5 = r0;
        r0 = r3;
        r3 = r1;
        goto L_0x0044;
    L_0x0070:
        r0 = r1;
        goto L_0x0041;
    L_0x0072:
        if (r3 == 0) goto L_0x0079;
    L_0x0074:
        r0 = 1;
        r9.f5711b = r0;	 Catch:{ NumberFormatException -> 0x008e }
        r0 = r1;
        goto L_0x0041;
    L_0x0079:
        r3 = r4;
        r5 = r0;
        r0 = r1;
        goto L_0x0044;
    L_0x007d:
        if (r6 == r7) goto L_0x008a;
    L_0x007f:
        if (r5 != 0) goto L_0x0086;
    L_0x0081:
        r0 = 1;
        r9.f5711b = r0;	 Catch:{ NumberFormatException -> 0x008e }
        r0 = r1;
        goto L_0x0041;
    L_0x0086:
        r5 = r0;
        r0 = r3;
        r3 = r4;
        goto L_0x0044;
    L_0x008a:
        r5 = r0;
        r0 = r3;
        r3 = r4;
        goto L_0x0044;
    L_0x008e:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "error in parsing \"";
        r2.append(r3);
        r2.append(r13);
        r3 = "\"";
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.c(java.lang.String):float[]");
    }
}
