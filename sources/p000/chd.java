package p000;

/* compiled from: PG */
/* renamed from: chd */
final class chd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ chc f1976a;

    chd(chc chc) {
        this.f1976a = chc;
    }

    public final void run() {
        chc chc = this.f1976a;
        chc.f1973c.removeCallbacks(chc.f1974d);
        che che = chc.f1975e;
        if (che != null) {
            che.f1977a.setEnabled(true);
            chc.f1975e = null;
        }
        if (chc.f1972b == go.f5541E) {
            chc.f1971a.mo1109a(chw.A11Y_BUTTON, true);
        }
        chc.f1972b = go.f5540D;
    }
}
