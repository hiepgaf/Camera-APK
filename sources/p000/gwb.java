package p000;

/* renamed from: gwb */
final /* synthetic */ class gwb implements iqo {
    /* renamed from: a */
    private final gwa f17458a;
    /* renamed from: b */
    private final gvu f17459b;

    gwb(gwa gwa, gvu gvu) {
        this.f17458a = gwa;
        this.f17459b = gvu;
    }

    public final void close() {
        gwa gwa = this.f17458a;
        gwa.f17453b.remove(this.f17459b);
    }
}
