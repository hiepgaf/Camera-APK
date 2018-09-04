package p000;

import java.util.concurrent.Callable;

/* renamed from: ipp */
public final /* synthetic */ class ipp implements Callable {
    /* renamed from: a */
    private final ios f7296a;
    /* renamed from: b */
    private final long f7297b;

    public ipp(ios ios, long j) {
        this.f7296a = ios;
        this.f7297b = j;
    }

    public final Object call() {
        ios ios = this.f7296a;
        long j = this.f7297b;
        iow iow = ios.f18448g;
        if (iow != null) {
            iow.m12345a(j);
            iov iov = ios.f18452k;
            if (iov != null) {
                iov.m12342a();
            }
            ios.f18448g.m12344a();
        }
        return null;
    }
}
