package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnr */
final class gnr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5527a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5528b;

    gnr(gnh gnh, Uri uri) {
        this.f5528b = gnh;
        this.f5527a = uri;
    }

    public final void run() {
        synchronized (this.f5528b.f5498a) {
            for (glq c : this.f5528b.f5498a) {
                c.mo588c(this.f5527a);
            }
        }
    }
}
