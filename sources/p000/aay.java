package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: aay */
public final class aay {
    /* renamed from: a */
    private static final aby f41a = new aby("CamAgntFact");
    /* renamed from: b */
    private static final String f42b = abz.m92a("camera2.portability.force_api", "0");
    /* renamed from: c */
    private static zs f43c;
    /* renamed from: d */
    private static zs f44d;
    /* renamed from: e */
    private static int f45e;
    /* renamed from: f */
    private static int f46f;

    /* renamed from: a */
    public static synchronized zs m28a(Context context, int i) {
        zs zsVar;
        synchronized (aay.class) {
            if (aay.m30b(i) == go.f5567e) {
                if (f43c == null) {
                    f43c = new yo();
                    f45e = 1;
                } else {
                    f45e++;
                }
                zsVar = f43c;
            } else if (go.f5568f == go.f5567e) {
                throw new UnsupportedOperationException("Camera API_2 unavailable on this device");
            } else {
                if (f44d == null) {
                    f44d = new xq(context);
                    f46f = 1;
                } else {
                    f46f++;
                }
                zsVar = f44d;
            }
        }
        return zsVar;
    }

    /* renamed from: a */
    public static synchronized void m29a(int i) {
        synchronized (aay.class) {
            int i2;
            if (aay.m30b(i) == go.f5567e) {
                i2 = f45e - 1;
                f45e = i2;
                if (i2 == 0 && f43c != null) {
                    f43c.mo2548f();
                    f43c = null;
                }
            } else if (go.f5568f == go.f5567e) {
                throw new UnsupportedOperationException("Camera API_2 unavailable on this device");
            } else {
                i2 = f46f - 1;
                f46f = i2;
                if (i2 == 0 && f44d != null) {
                    f44d.mo2548f();
                    f44d = null;
                }
            }
        }
    }

    /* renamed from: b */
    private static int m30b(int i) {
        if (f42b.equals("1")) {
            abx.m84a(f41a, "API level overridden by system property: forced to 1");
            return go.f5567e;
        } else if (f42b.equals("2")) {
            abx.m84a(f41a, "API level overridden by system property: forced to 2");
            return go.f5568f;
        } else {
            if (i == 0) {
                abx.m91e(f41a, "null API level request, so assuming AUTO");
                i = go.f5566d;
            }
            if (i == go.f5566d) {
                return go.f5568f;
            }
            return i;
        }
    }
}
