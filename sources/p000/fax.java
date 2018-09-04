package p000;

/* compiled from: PG */
/* renamed from: fax */
final class fax implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ far f4417a;

    fax(far far) {
        this.f4417a = far;
    }

    public final void run() {
        synchronized (far.f15835a) {
            fbe fbe = this.f4417a.f15840e;
        }
        if (fbe != null) {
            this.f4417a.f15837b.execute(new fay(this));
        }
    }
}
