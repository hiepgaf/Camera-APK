package p000;

/* renamed from: ifx */
final class ifx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ifv f6991a;
    /* renamed from: b */
    private final /* synthetic */ ify f6992b;

    ifx(ify ify, ifv ifv) {
        this.f6992b = ify;
        this.f6991a = ifv;
    }

    public final void run() {
        synchronized (this.f6992b.f6994b) {
            ifu ifu = this.f6992b.f6995c;
            if (ifu != null) {
                ifu.mo1825a(this.f6991a);
            }
        }
    }
}
