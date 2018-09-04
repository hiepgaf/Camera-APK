package p000;

/* compiled from: PG */
/* renamed from: bih */
final class bih implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bie f1187a;

    bih(bie bie) {
        this.f1187a = bie;
    }

    public final void run() {
        if (((Integer) this.f1187a.f10922e.mo2860b()).intValue() == 0) {
            bie bie = this.f1187a;
            bie.f10925h.f10275b = null;
            bie.f10927j.mo3557a(null);
            return;
        }
        bli.m863a(bie.f10918a, "onSceneChanged while ev comp is set, ignoring");
    }
}
