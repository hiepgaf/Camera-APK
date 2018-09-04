package p000;

/* compiled from: PG */
/* renamed from: cgb */
final class cgb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f1941a;
    /* renamed from: b */
    private final /* synthetic */ cga f1942b;

    cgb(cga cga, int i) {
        this.f1942b = cga;
        this.f1941a = i;
    }

    public final void run() {
        if (this.f1941a == 0) {
            cfk cfk = this.f1942b.f11828a;
            cfk.ab.m9634a(cfk.f20262M);
            return;
        }
        this.f1942b.f11828a.f20262M.mo768l();
    }
}
