package p000;

/* compiled from: PG */
/* renamed from: hoj */
final class hoj implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ igo f6413a;
    /* renamed from: b */
    public final /* synthetic */ Runnable f6414b;
    /* renamed from: c */
    private final /* synthetic */ hod f6415c;

    hoj(hod hod, igo igo, Runnable runnable) {
        this.f6415c = hod;
        this.f6413a = igo;
        this.f6414b = runnable;
    }

    public final void run() {
        kpk kpk = this.f6415c.f21602c;
        if (kpk != null) {
            kow.m13622a(kpk, new hok(this), kpq.f8410a);
        } else {
            bli.m873e(hod.f21599a, "Could not set data item. API is null");
        }
    }
}
