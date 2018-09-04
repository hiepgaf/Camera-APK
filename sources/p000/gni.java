package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gni */
final class gni implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5501a;
    /* renamed from: b */
    private final /* synthetic */ glw f5502b;
    /* renamed from: c */
    private final /* synthetic */ eqi f5503c;
    /* renamed from: d */
    private final /* synthetic */ gnh f5504d;

    gni(gnh gnh, Uri uri, glw glw, eqi eqi) {
        this.f5504d = gnh;
        this.f5501a = uri;
        this.f5502b = glw;
        this.f5503c = eqi;
    }

    public final void run() {
        synchronized (this.f5504d.f5498a) {
            for (glq a : this.f5504d.f5498a) {
                a.mo582a(this.f5501a, this.f5502b, this.f5503c);
            }
        }
    }
}
