package p000;

/* compiled from: PG */
/* renamed from: dcp */
final class dcp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ fbj f2990a;
    /* renamed from: b */
    private final /* synthetic */ cwc f2991b;
    /* renamed from: c */
    private final /* synthetic */ dch f2992c;

    dcp(dch dch, fbj fbj, cwc cwc) {
        this.f2992c = dch;
        this.f2990a = fbj;
        this.f2991b = cwc;
    }

    public final void run() {
        this.f2992c.f1595a.mo573a(new daw(this.f2990a, this.f2991b));
    }
}
