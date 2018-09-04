package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: gns */
final class gns implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f5529a;
    /* renamed from: b */
    private final /* synthetic */ int f5530b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5531c;

    gns(gnh gnh, Bitmap bitmap, int i) {
        this.f5531c = gnh;
        this.f5529a = bitmap;
        this.f5530b = i;
    }

    public final void run() {
        synchronized (this.f5531c.f5498a) {
            for (glq a : this.f5531c.f5498a) {
                a.mo579a(this.f5529a, this.f5530b);
            }
        }
    }
}
