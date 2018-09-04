package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: gnj */
final class gnj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f5505a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5506b;

    gnj(gnh gnh, Bitmap bitmap) {
        this.f5506b = gnh;
        this.f5505a = bitmap;
    }

    public final void run() {
        synchronized (this.f5506b.f5498a) {
            for (glq a : this.f5506b.f5498a) {
                a.mo578a(this.f5505a);
            }
        }
    }
}
