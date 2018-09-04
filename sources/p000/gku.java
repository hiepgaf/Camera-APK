package p000;

import android.net.Uri;

/* renamed from: gku */
final /* synthetic */ class gku implements Runnable {
    /* renamed from: a */
    private final gkt f5337a;
    /* renamed from: b */
    private final Uri f5338b;
    /* renamed from: c */
    private final glw f5339c;
    /* renamed from: d */
    private final eqi f5340d;

    gku(gkt gkt, Uri uri, glw glw, eqi eqi) {
        this.f5337a = gkt;
        this.f5338b = uri;
        this.f5339c = glw;
        this.f5340d = eqi;
    }

    public final void run() {
        gkt gkt = this.f5337a;
        gkt.f21505r.m2635a(this.f5338b, this.f5339c, this.f5340d);
    }
}
