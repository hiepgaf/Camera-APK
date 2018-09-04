package p000;

/* compiled from: PG */
/* renamed from: dth */
final class dth implements iqo {
    /* renamed from: a */
    private final /* synthetic */ fdf f14445a;
    /* renamed from: b */
    private final /* synthetic */ fhh f14446b;
    /* renamed from: c */
    private final /* synthetic */ iqo f14447c;

    dth(fdf fdf, fhh fhh, iqo iqo) {
        this.f14445a = fdf;
        this.f14446b = fhh;
        this.f14447c = iqo;
    }

    public final void close() {
        this.f14445a.close();
        this.f14446b.close();
        iqo iqo = this.f14447c;
        if (iqo != null) {
            iqo.close();
        }
    }
}
