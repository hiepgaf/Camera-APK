package p000;

import android.util.Log;

/* renamed from: bww */
final /* synthetic */ class bww implements Runnable {
    /* renamed from: a */
    private final bwv f1667a;
    /* renamed from: b */
    private final iwp f1668b;

    bww(bwv bwv, iwp iwp) {
        this.f1667a = bwv;
        this.f1668b = iwp;
    }

    public final void run() {
        int i = 0;
        bwv bwv = this.f1667a;
        iwp iwp = this.f1668b;
        long[] jArr = (long[]) iwp.mo3143a(hsz.f6615i);
        int i2 = bwv.f11369b;
        if (i2 == 0) {
            int[] iArr = (int[]) iwp.mo3143a(hsz.f6616j);
            int[] iArr2 = (int[]) iwp.mo3143a(hsz.f6617k);
            if (jArr == null || iArr == null || iArr2 == null) {
                Log.e("OisListener", "Null pointer for OIS data. API version: 0");
            } else {
                while (i < jArr.length) {
                    bwv.f11368a.mo644a(jArr[i], (float) iArr[i], (float) iArr2[i]);
                    i++;
                }
            }
        } else if (i2 == 1) {
            float[] fArr = (float[]) iwp.mo3143a(hsz.f6618l);
            float[] fArr2 = (float[]) iwp.mo3143a(hsz.f6619m);
            if (jArr == null || fArr == null || fArr2 == null) {
                Log.e("OisListener", "Null pointer for OIS data. API version: 1");
            } else {
                while (i < jArr.length) {
                    bwv.f11368a.mo644a(jArr[i], fArr[i], fArr2[i]);
                    i++;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Invalid OIS API version: ");
            stringBuilder.append(i2);
            Log.e("OisListener", stringBuilder.toString());
        }
        for (fiw a_ : bwv.f11370c) {
            a_.a_(iwp);
        }
    }
}
