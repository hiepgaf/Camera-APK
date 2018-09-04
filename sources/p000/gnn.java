package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnn */
final class gnn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5517a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5518b;

    gnn(gnh gnh, Uri uri) {
        this.f5518b = gnh;
        this.f5517a = uri;
    }

    public final void run() {
        synchronized (this.f5518b.f5498a) {
            for (glq a : this.f5518b.f5498a) {
                a.mo580a(this.f5517a);
            }
        }
        this.f5518b.f5500c.mo1503a(this.f5517a);
    }
}
