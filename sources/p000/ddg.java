package p000;

/* compiled from: PG */
/* renamed from: ddg */
final class ddg implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ dbn f3004a;
    /* renamed from: b */
    public final /* synthetic */ dcr f3005b;
    /* renamed from: c */
    private final /* synthetic */ int f3006c;

    ddg(dcr dcr, dbn dbn, int i) {
        this.f3005b = dcr;
        this.f3004a = dbn;
        this.f3006c = i;
    }

    public final void run() {
        dak H = ((dbu) this.f3005b.m991d()).mo2909H();
        H.m1571a(new ddh(this));
        int i = this.f3006c;
        ikd.m12259a();
        H.f2906b.m11789a(i);
        ((dbu) this.f3005b.m991d()).mo2939o().mo3004u();
    }
}
