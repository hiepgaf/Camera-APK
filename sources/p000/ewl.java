package p000;

/* renamed from: ewl */
public final /* synthetic */ class ewl implements Runnable {
    /* renamed from: a */
    private final ird f4296a;
    /* renamed from: b */
    private final kwk f4297b;
    /* renamed from: c */
    private final kwk f4298c;

    public ewl(ird ird, kwk kwk, kwk kwk2) {
        this.f4296a = ird;
        this.f4297b = kwk;
        this.f4298c = kwk2;
    }

    public final void run() {
        ird ird = this.f4296a;
        kwk kwk = this.f4297b;
        kwk kwk2 = this.f4298c;
        ird.mo1903a("MICRO_GyroModule#runGyroStartupTask");
        ((kpw) kwk.mo345a()).mo3557a(Boolean.valueOf(((exx) kwk2.mo345a()).m2189a()));
        ird.mo1904b();
    }
}
