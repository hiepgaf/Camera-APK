package p000;

import android.os.Looper;

/* renamed from: iea */
public final class iea extends icy {
    /* renamed from: b */
    private final hva f21717b;

    public iea(hva hva) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f21717b = hva;
    }

    /* renamed from: d */
    public final Looper mo1849d() {
        return this.f21717b.f6702c;
    }

    /* renamed from: a */
    public final ich mo1846a(ich ich) {
        return this.f21717b.m3498a(0, ich);
    }

    /* renamed from: b */
    public final ich mo1848b(ich ich) {
        return this.f21717b.m3498a(1, ich);
    }
}
