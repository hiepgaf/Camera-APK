package p000;

/* compiled from: PG */
/* renamed from: avl */
final class avl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ avg f971a;

    avl(avg avg) {
        this.f971a = avg;
    }

    public final void run() {
        if (((Boolean) this.f971a.f10367l.mo2860b()).booleanValue()) {
            bli.m871d(avg.f10356a, "Ignore reset request since ev is in scrolling state.");
        } else {
            this.f971a.f10362g.mo3557a(null);
        }
    }
}
