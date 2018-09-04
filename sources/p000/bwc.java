package p000;

/* compiled from: PG */
/* renamed from: bwc */
final class bwc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bwb f1652a;

    bwc(bwb bwb) {
        this.f1652a = bwb;
    }

    public final void run() {
        synchronized (this.f1652a.f1650k) {
            bwb bwb = this.f1652a;
            if (!(bwb.f1642c == null || bwb.f1644e == null)) {
                bwb.f1649j.mo3407a(bwb.f1646g);
                bwb = this.f1652a;
                bwb.f1645f.eglSwapBuffers(bwb.f1642c, bwb.f1644e);
                this.f1652a.f1647h = false;
            }
            this.f1652a.f1650k.notifyAll();
        }
    }
}
