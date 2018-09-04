package p000;

import android.net.Uri;

/* renamed from: gky */
final /* synthetic */ class gky implements Runnable {
    /* renamed from: a */
    private final gkt f5343a;
    /* renamed from: b */
    private final Uri f5344b;
    /* renamed from: c */
    private final int f5345c;

    gky(gkt gkt, Uri uri, int i) {
        this.f5343a = gkt;
        this.f5344b = uri;
        this.f5345c = i;
    }

    public final void run() {
        gkt gkt = this.f5343a;
        gkt.f21505r.m2634a(this.f5344b, this.f5345c);
    }
}
