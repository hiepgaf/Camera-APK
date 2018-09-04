package p000;

/* compiled from: PG */
/* renamed from: mj */
final class mj implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ mg f8827a;

    mj(mg mgVar) {
        this.f8827a = mgVar;
    }

    public final void run() {
        mg mgVar = this.f8827a;
        mgVar.f19368h.showAtLocation(mgVar.f19367g, 55, 0, 0);
        this.f8827a.m14092l();
        if (this.f8827a.m14094n()) {
            this.f8827a.f19367g.setAlpha(0.0f);
            mgVar = this.f8827a;
            mgVar.f19370j = jm.m4547a(mgVar.f19367g).m4768a(1.0f);
            this.f8827a.f19370j.m4770a(new mk(this));
            return;
        }
        this.f8827a.f19367g.setAlpha(1.0f);
        this.f8827a.f19367g.setVisibility(0);
    }
}
