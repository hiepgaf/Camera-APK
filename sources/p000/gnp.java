package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnp */
final class gnp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5521a;
    /* renamed from: b */
    private final /* synthetic */ int f5522b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5523c;

    gnp(gnh gnh, Uri uri, int i) {
        this.f5523c = gnh;
        this.f5521a = uri;
        this.f5522b = i;
    }

    public final void run() {
        synchronized (this.f5523c.f5498a) {
            for (glq a : this.f5523c.f5498a) {
                a.mo581a(this.f5521a, this.f5522b);
            }
        }
    }
}
