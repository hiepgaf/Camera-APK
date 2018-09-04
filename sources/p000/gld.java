package p000;

import android.net.Uri;
import java.util.List;

/* renamed from: gld */
final /* synthetic */ class gld implements Runnable {
    /* renamed from: a */
    private final gkt f5359a;
    /* renamed from: b */
    private final Uri f5360b;
    /* renamed from: c */
    private final List f5361c;

    gld(gkt gkt, Uri uri, List list) {
        this.f5359a = gkt;
        this.f5360b = uri;
        this.f5361c = list;
    }

    public final void run() {
        gkt gkt = this.f5359a;
        gkt.f21505r.m2638a(this.f5360b, this.f5361c);
        gkt.f21513z = null;
    }
}
