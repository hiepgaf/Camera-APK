package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnq */
final class gnq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5524a;
    /* renamed from: b */
    private final /* synthetic */ hec f5525b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5526c;

    gnq(gnh gnh, Uri uri, hec hec) {
        this.f5526c = gnh;
        this.f5524a = uri;
        this.f5525b = hec;
    }

    public final void run() {
        synchronized (this.f5526c.f5498a) {
            for (glq a : this.f5526c.f5498a) {
                a.mo583a(this.f5524a, this.f5525b);
            }
        }
    }
}
