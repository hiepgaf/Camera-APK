package p000;

/* compiled from: PG */
/* renamed from: edc */
class edc extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edb f21231a;

    edc(edb edb) {
        this.f21231a = edb;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m869c(edb.f21222a, "Capture state enter");
        this.f21231a.f21224c.m11921a(go.bG);
        this.f21231a.f21228g.m3027b(true);
        this.f21231a.f21225d.setClickable(true);
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m869c(edb.f21222a, "Capture state exit");
        this.f21231a.f21224c.m11921a(go.bI);
        this.f21231a.f21228g.m3027b(false);
        this.f21231a.f21225d.setClickable(false);
    }
}
