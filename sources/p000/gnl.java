package p000;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: gnl */
final class gnl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5510a;
    /* renamed from: b */
    private final /* synthetic */ List f5511b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5512c;

    gnl(gnh gnh, Uri uri, List list) {
        this.f5512c = gnh;
        this.f5510a = uri;
        this.f5511b = list;
    }

    public final void run() {
        synchronized (this.f5512c.f5498a) {
            for (glq a : this.f5512c.f5498a) {
                a.mo585a(this.f5510a, this.f5511b);
            }
        }
        this.f5512c.f5500c.mo1503a(this.f5510a);
    }
}
