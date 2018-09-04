package p000;

/* renamed from: dqg */
final /* synthetic */ class dqg implements Runnable {
    /* renamed from: a */
    private final dqf f3199a;

    dqg(dqf dqf) {
        this.f3199a = dqf;
    }

    public final void run() {
        dqf dqf = this.f3199a;
        dqf.f21155d.mo518d("Closing one camera.");
        ikw.m3807a(dqf.f21153b, dqf.f21152a, "OneCameraLifetime");
        synchronized (dqf) {
            kpk kpk = dqf.f21156e;
            if (kpk != null) {
                kpk.cancel(true);
            }
        }
        kow.m13622a(dqf.f21154c, new dqh(dqf), kpq.f8410a);
        dqf.f21155d.mo518d("OneCamera closed.");
    }
}
