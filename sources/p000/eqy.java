package p000;

import android.app.ActivityManager;

/* compiled from: PG */
/* renamed from: eqy */
public final class eqy {
    /* renamed from: b */
    private static String f4102b = bli.m862a("MaxNativeMemory");
    /* renamed from: a */
    public final long f4103a;
    /* renamed from: c */
    private final hjf f4104c;
    /* renamed from: d */
    private final cbu f4105d;

    public eqy(bkw bkw, hjf hjf, cbu cbu) {
        long j;
        int i = -1;
        this.f4104c = hjf;
        this.f4105d = cbu;
        int a = ije.m3772a(bkw.f1255a, "camera:max_allowed_native_memory_mb", -1);
        String str;
        if (a > 0) {
            str = f4102b;
            StringBuilder stringBuilder = new StringBuilder(53);
            stringBuilder.append("Max native memory overridden (gservices): ");
            stringBuilder.append(a);
            bli.m869c(str, stringBuilder.toString());
            j = (long) a;
        } else {
            hjf hjf2 = this.f4104c;
            ivy ivy = hjf2.f6267b;
            if (ivy.f7508d) {
                i = 420;
            } else if (ivy.f7509e) {
                i = 420;
            } else if (hjf2.m3195c()) {
                i = 420;
            } else if (this.f4104c.m3196d()) {
                i = 420;
            }
            if (i > 0) {
                str = f4102b;
                StringBuilder stringBuilder2 = new StringBuilder(50);
                stringBuilder2.append("Max native memory overridden (device): ");
                stringBuilder2.append(420);
                bli.m869c(str, stringBuilder2.toString());
                j = 420;
            } else {
                ActivityManager a2 = this.f4105d.m1100a();
                j = (long) ((int) (((float) Math.max(a2.getMemoryClass(), a2.getLargeMemoryClass())) * 0.8f));
            }
        }
        this.f4103a = (j * 1000) * 1000;
    }
}
