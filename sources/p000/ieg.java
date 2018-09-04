package p000;

import android.os.Looper;

/* renamed from: ieg */
public final class ieg {
    /* renamed from: a */
    public volatile Object f6970a;
    /* renamed from: b */
    public final iei f6971b;
    /* renamed from: c */
    private final ieh f6972c;

    ieg(Looper looper, Object obj, String str) {
        this.f6972c = new ieh(this, looper);
        this.f6970a = htl.m3432b(obj, (Object) "Listener must not be null");
        this.f6971b = new iei(obj, htl.m3403a(str));
    }

    /* renamed from: a */
    public final void m3708a(iej iej) {
        htl.m3432b((Object) iej, (Object) "Notifier must not be null");
        this.f6972c.sendMessage(this.f6972c.obtainMessage(1, iej));
    }
}
