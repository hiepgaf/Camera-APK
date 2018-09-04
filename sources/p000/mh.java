package p000;

/* compiled from: PG */
/* renamed from: mh */
final class mh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ mg f8826a;

    mh(mg mgVar) {
        this.f8826a = mgVar;
    }

    public final void run() {
        mg mgVar = this.f8826a;
        if ((mgVar.f19376p & 1) != 0) {
            mgVar.m14082d(0);
        }
        mgVar = this.f8826a;
        if ((mgVar.f19376p & 4096) != 0) {
            mgVar.m14082d(108);
        }
        mgVar = this.f8826a;
        mgVar.f19375o = false;
        mgVar.f19376p = 0;
    }
}
