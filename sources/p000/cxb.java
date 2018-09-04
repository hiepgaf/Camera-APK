package p000;

/* compiled from: PG */
/* renamed from: cxb */
final class cxb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cwz f2832a;

    cxb(cwz cwz) {
        this.f2832a = cwz;
    }

    public final void run() {
        kpk kpk = this.f2832a.f12760c;
        if (!(kpk == null || kpk.isDone())) {
            this.f2832a.f12760c.cancel(false);
            this.f2832a.f12760c = null;
        }
        this.f2832a.f12762e.m1561a();
        this.f2832a.f12759b.close();
    }
}
