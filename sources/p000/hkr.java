package p000;

/* compiled from: PG */
/* renamed from: hkr */
final class hkr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ hkk f6308a;

    hkr(hkk hkk) {
        this.f6308a = hkk;
    }

    public final void run() {
        synchronized (this.f6308a.f6296g) {
            if (this.f6308a.f6299j == go.bA) {
                this.f6308a.f6291b.mo2675i();
                gxz b = this.f6308a.f6301l;
                b.f5786c.setText(hkd.m3220a(b.f5784a));
                b.m2905a();
                this.f6308a.f6299j = go.bz;
            }
        }
    }
}
