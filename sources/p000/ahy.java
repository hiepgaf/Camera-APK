package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: PG */
/* renamed from: ahy */
public final class ahy {
    /* renamed from: a */
    public final int f471a;
    /* renamed from: b */
    public final int f472b;
    /* renamed from: c */
    public final int f473c;
    /* renamed from: d */
    private final Context f474d;

    public ahy(ahz ahz) {
        int i;
        this.f474d = ahz.f476a;
        if (ahz.f477b.isLowRamDevice()) {
            i = ahz.f483h / 2;
        } else {
            i = ahz.f483h;
        }
        this.f473c = i;
        ActivityManager activityManager = ahz.f477b;
        float f = ahz.f481f;
        float f2 = ahz.f482g;
        float memoryClass = (float) ((activityManager.getMemoryClass() << 10) << 10);
        if (activityManager.isLowRamDevice()) {
            f = f2;
        }
        int round = Math.round(f * memoryClass);
        DisplayMetrics displayMetrics = ahz.f478c.f484a;
        f = (float) ((displayMetrics.heightPixels * displayMetrics.widthPixels) << 2);
        int round2 = Math.round(ahz.f480e * f);
        i = Math.round(f * ahz.f479d);
        int i2 = round - this.f473c;
        int i3 = i + round2;
        if (i3 <= i2) {
            this.f472b = i;
            this.f471a = round2;
        } else {
            f = ahz.f480e;
            float f3 = ahz.f479d;
            f = ((float) i2) / (f + f3);
            this.f472b = Math.round(f3 * f);
            this.f471a = Math.round(f * ahz.f480e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            boolean z;
            String a = m297a(this.f472b);
            String a2 = m297a(this.f471a);
            String a3 = m297a(this.f473c);
            if (i3 > round) {
                z = true;
            } else {
                z = false;
            }
            String a4 = m297a(round);
            i3 = ahz.f477b.getMemoryClass();
            boolean isLowRamDevice = ahz.f477b.isLowRamDevice();
            int length = String.valueOf(a).length();
            int length2 = String.valueOf(a2).length();
            StringBuilder stringBuilder = new StringBuilder((((length + 177) + length2) + String.valueOf(a3).length()) + String.valueOf(a4).length());
            stringBuilder.append("Calculation complete, Calculated memory cache size: ");
            stringBuilder.append(a);
            stringBuilder.append(", pool size: ");
            stringBuilder.append(a2);
            stringBuilder.append(", byte array size: ");
            stringBuilder.append(a3);
            stringBuilder.append(", memory class limited? ");
            stringBuilder.append(z);
            stringBuilder.append(", max size: ");
            stringBuilder.append(a4);
            stringBuilder.append(", memoryClass: ");
            stringBuilder.append(i3);
            stringBuilder.append(", isLowMemoryDevice: ");
            stringBuilder.append(isLowRamDevice);
            Log.d("MemorySizeCalculator", stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private final String m297a(int i) {
        return Formatter.formatFileSize(this.f474d, (long) i);
    }
}
