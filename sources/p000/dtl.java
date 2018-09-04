package p000;

/* compiled from: PG */
/* renamed from: dtl */
final class dtl implements iqo {
    /* renamed from: a */
    private final /* synthetic */ fdf f14486a;
    /* renamed from: b */
    private final /* synthetic */ fem f14487b;
    /* renamed from: c */
    private final /* synthetic */ fhh f14488c;
    /* renamed from: d */
    private final /* synthetic */ iqo f14489d;

    dtl(fdf fdf, fem fem, fhh fhh, iqo iqo) {
        this.f14486a = fdf;
        this.f14487b = fem;
        this.f14488c = fhh;
        this.f14489d = iqo;
    }

    public final void close() {
        this.f14486a.close();
        this.f14487b.close();
        this.f14488c.close();
        iqo iqo = this.f14489d;
        if (iqo != null) {
            iqo.close();
        }
    }
}
