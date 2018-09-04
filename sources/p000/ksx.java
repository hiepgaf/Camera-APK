package p000;

import com.google.lens.sdk.LensApi.LensAvailabilityCallback;

/* compiled from: PG */
/* renamed from: ksx */
public final class ksx implements hqu {
    /* renamed from: a */
    private final LensAvailabilityCallback f19283a;

    public ksx(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f19283a = lensAvailabilityCallback;
    }

    /* renamed from: a */
    static int m13901a(Object obj, Object obj2) {
        return krr.m5116a(null, 1, obj) + krr.m5116a(null, 2, obj2);
    }

    /* renamed from: a */
    public final void mo1773a(boolean z) {
        this.f19283a.mo1697a(z ^ 1);
    }

    /* renamed from: a */
    static void m13902a(krh krh, Object obj, Object obj2) {
        krr.m5118a(krh, null, 1, obj);
        krr.m5118a(krh, null, 2, obj2);
    }
}
