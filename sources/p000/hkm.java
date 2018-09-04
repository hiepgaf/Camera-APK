package p000;

/* compiled from: PG */
/* renamed from: hkm */
final class hkm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ hkk f6306a;

    hkm(hkk hkk) {
        this.f6306a = hkk;
    }

    public final void run() {
        synchronized (this.f6306a.f6296g) {
            hkk hkk = this.f6306a;
            if (hkk.f6291b != null && hkk.f6299j == go.bz) {
                hke hke = this.f6306a.f6293d;
                this.f6306a.f6301l.m2906a((System.currentTimeMillis() - this.f6306a.f6291b.mo2672b()) - this.f6306a.f6291b.mo2671a());
            }
        }
    }
}
