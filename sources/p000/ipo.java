package p000;

import java.util.concurrent.Callable;

/* renamed from: ipo */
public final /* synthetic */ class ipo implements Callable {
    /* renamed from: a */
    private final ios f7294a;
    /* renamed from: b */
    private final long f7295b;

    public ipo(ios ios, long j) {
        this.f7294a = ios;
        this.f7295b = j;
    }

    public final Object call() {
        ios ios = this.f7294a;
        long j = this.f7295b;
        ior ior = ios.f18447f;
        if (ior != null) {
            ior.m12333a(j);
        }
        return null;
    }
}
