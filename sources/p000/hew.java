package p000;

/* renamed from: hew */
final /* synthetic */ class hew implements Runnable {
    /* renamed from: a */
    private final hev f6137a;
    /* renamed from: b */
    private final ird f6138b;
    /* renamed from: c */
    private final kpw f6139c;

    hew(hev hev, ird ird, kpw kpw) {
        this.f6137a = hev;
        this.f6138b = ird;
        this.f6139c = kpw;
    }

    public final void run() {
        hev hev = this.f6137a;
        ird ird = this.f6138b;
        knk knk = this.f6139c;
        ird.mo1903a("CameraActivityUi#mainInflate");
        hev.f6135b.f6121a.inflate();
        hev.f6135b.f6122b.inflate();
        knk.mo3557a(new hes(hev.f6135b.f6128h));
        ird.mo1904b();
    }
}
