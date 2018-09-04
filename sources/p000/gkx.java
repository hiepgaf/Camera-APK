package p000;

import android.net.Uri;

/* renamed from: gkx */
final /* synthetic */ class gkx implements Runnable {
    /* renamed from: a */
    private final gkt f5341a;
    /* renamed from: b */
    private final Uri f5342b;

    gkx(gkt gkt, Uri uri) {
        this.f5341a = gkt;
        this.f5342b = uri;
    }

    public final void run() {
        gkt gkt = this.f5341a;
        gkt.f21505r.m2633a(this.f5342b);
    }
}
