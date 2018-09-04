package p000;

import android.net.Uri;

/* renamed from: gkz */
final /* synthetic */ class gkz implements Runnable {
    /* renamed from: a */
    private final gkt f5346a;
    /* renamed from: b */
    private final Uri f5347b;
    /* renamed from: c */
    private final hec f5348c;

    gkz(gkt gkt, Uri uri, hec hec) {
        this.f5346a = gkt;
        this.f5347b = uri;
        this.f5348c = hec;
    }

    public final void run() {
        gkt gkt = this.f5346a;
        gkt.f21505r.m2636a(this.f5347b, this.f5348c);
    }
}
