package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gno */
final class gno implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5519a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5520b;

    gno(gnh gnh, Uri uri) {
        this.f5520b = gnh;
        this.f5519a = uri;
    }

    public final void run() {
        synchronized (this.f5520b.f5498a) {
            for (glq b : this.f5520b.f5498a) {
                b.mo587b(this.f5519a);
            }
        }
    }
}
