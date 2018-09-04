package p000;

/* compiled from: PG */
/* renamed from: hof */
final class hof implements kov {
    /* renamed from: a */
    private final /* synthetic */ hod f17960a;

    hof(hod hod) {
        this.f17960a = hod;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m873e(hod.f21599a, "Fail to connect to GoogleApiClient");
    }

    public final /* synthetic */ void b_(Object obj) {
        hjk hjk = (hjk) obj;
        igl igl = this.f17960a;
        huq huq = hjk.f6271a.f17906a;
        huq.mo1846a(new ihz(huq, igl));
        hod hod = this.f17960a;
        Runnable hog = new hog(hjk);
        igo a = igo.m3744a("/camera_packet");
        a.f7001b.f6999a.put("camera_ready", Boolean.valueOf(false));
        hod.m15911a(a, hog);
    }
}
