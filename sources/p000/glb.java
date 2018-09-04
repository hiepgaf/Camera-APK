package p000;

import android.net.Uri;

/* renamed from: glb */
final /* synthetic */ class glb implements Runnable {
    /* renamed from: a */
    private final gkt f5353a;
    /* renamed from: b */
    private final Uri f5354b;

    glb(gkt gkt, Uri uri) {
        this.f5353a = gkt;
        this.f5354b = uri;
    }

    public final void run() {
        gkt gkt = this.f5353a;
        gkt.f21505r.m2640b(this.f5354b);
        gkt.f21513z = null;
    }
}
