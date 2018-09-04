package p000;

import android.net.Uri;

/* renamed from: glc */
final /* synthetic */ class glc implements Runnable {
    /* renamed from: a */
    private final gkt f5355a;
    /* renamed from: b */
    private final Uri f5356b;
    /* renamed from: c */
    private final hec f5357c;
    /* renamed from: d */
    private final boolean f5358d;

    glc(gkt gkt, Uri uri, hec hec, boolean z) {
        this.f5355a = gkt;
        this.f5356b = uri;
        this.f5357c = hec;
        this.f5358d = z;
    }

    public final void run() {
        gkt gkt = this.f5355a;
        gkt.f21505r.m2637a(this.f5356b, this.f5357c, this.f5358d);
        gkt.f21513z = null;
    }
}
