package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: hth */
public final class hth {
    @Deprecated
    /* renamed from: a */
    public static final huh f6640a = new huh("ClearcutLogger.API", f6642c, f6641b);
    /* renamed from: b */
    private static final hum f6641b = new hum((byte) 0);
    /* renamed from: c */
    private static final huk f6642c = new hti();
    /* renamed from: d */
    private final String f6643d;
    /* renamed from: e */
    private final int f6644e;
    /* renamed from: f */
    private String f6645f;
    /* renamed from: g */
    private int f6646g;
    /* renamed from: h */
    private String f6647h;
    /* renamed from: i */
    private final htm f6648i;
    /* renamed from: j */
    private final hwu f6649j;
    /* renamed from: k */
    private htl f6650k;
    /* renamed from: l */
    private final htj f6651l;

    public hth(Context context, String str) {
        this(context, str, new htn(context), hww.f18132a, new htu(context));
    }

    private hth(Context context, String str, htm htm, hwu hwu, htj htj) {
        this.f6646g = -1;
        this.f6643d = context.getPackageName();
        this.f6644e = hth.m3374a(context);
        this.f6646g = -1;
        this.f6645f = str;
        this.f6647h = null;
        this.f6648i = htm;
        this.f6649j = hwu;
        this.f6650k = new htl();
        this.f6651l = htj;
    }

    /* renamed from: a */
    private static int m3374a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }
}
