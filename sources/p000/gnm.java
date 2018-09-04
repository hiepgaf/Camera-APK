package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnm */
final class gnm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5513a;
    /* renamed from: b */
    private final /* synthetic */ hec f5514b;
    /* renamed from: c */
    private final /* synthetic */ boolean f5515c;
    /* renamed from: d */
    private final /* synthetic */ gnh f5516d;

    gnm(gnh gnh, Uri uri, hec hec, boolean z) {
        this.f5516d = gnh;
        this.f5513a = uri;
        this.f5514b = hec;
        this.f5515c = z;
    }

    public final void run() {
        synchronized (this.f5516d.f5498a) {
            for (glq a : this.f5516d.f5498a) {
                a.mo584a(this.f5513a, this.f5514b, this.f5515c);
            }
        }
        this.f5516d.f5500c.mo1503a(this.f5513a);
    }
}
