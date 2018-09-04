package p000;

/* compiled from: PG */
/* renamed from: bba */
final class bba implements kov {
    /* renamed from: a */
    private final /* synthetic */ bax f10640a;

    bba(bax bax) {
        this.f10640a = bax;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        iks iks = this.f10640a.f1054d;
        if (iks != null) {
            iks.m3803b(th);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!(this.f10640a.f1053c == null || bool == null || !bool.booleanValue())) {
            this.f10640a.f1053c.mo518d("Initialization completed.");
        }
        if (this.f10640a.f1053c != null && bool != null && !bool.booleanValue()) {
            this.f10640a.f1053c.mo520f("Initialization failed! One of the tasks did not succeed.");
        }
    }
}
