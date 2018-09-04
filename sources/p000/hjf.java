package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: hjf */
public final class hjf {
    /* renamed from: a */
    public static final boolean f6264a = true;
    /* renamed from: d */
    private static hjf f6265d = null;
    /* renamed from: e */
    private static final Object f6266e = new Object();
    /* renamed from: b */
    public final ivy f6267b;
    /* renamed from: c */
    public final ivx f6268c;

    private hjf(ivy ivy, ivx ivx) {
        this.f6267b = ivy;
        this.f6268c = ivx;
    }

    @Deprecated
    /* renamed from: a */
    public static hjf m3193a() {
        synchronized (f6266e) {
            if (f6265d == null) {
                f6265d = new hjf(ivy.m4269a(), ivx.m4268a());
            }
        }
        return f6265d;
    }

    /* renamed from: b */
    public final boolean m3194b() {
        ivy ivy = this.f6267b;
        return ivy.f7509e || ivy.f7508d;
    }

    /* renamed from: c */
    public final boolean m3195c() {
        ivy ivy = this.f6267b;
        if (ivy.f7510f || ivy.f7511g || ivy.f7512h) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m3196d() {
        ivy ivy = this.f6267b;
        if (ivy.f7514j || ivy.f7513i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m3197e() {
        boolean z = false;
        if (this.f6268c.f7503d) {
            if (m3195c()) {
                z = true;
            } else if (m3196d()) {
                return true;
            }
        }
        return z;
    }
}
