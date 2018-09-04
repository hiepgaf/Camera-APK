package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: hkg */
public final class hkg {
    /* renamed from: a */
    private final hki f6289a;

    private hkg(hki hki) {
        jri.m13152b((Object) hki);
        this.f6289a = hki;
    }

    /* renamed from: a */
    public static hkg m3221a(View view) {
        return hkg.m3222a(new hkj(view));
    }

    /* renamed from: a */
    public static hkg m3222a(hki hki) {
        return new hkg(hki);
    }

    /* renamed from: a */
    public final Object m3223a(int i) {
        jri.m13152b(this.f6289a);
        Object a = this.f6289a.mo1737a(i);
        jri.m13152b(a);
        return a;
    }
}
