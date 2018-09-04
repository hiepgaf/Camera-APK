package p000;

/* compiled from: PG */
/* renamed from: cax */
final class cax implements kov {
    /* renamed from: a */
    private final /* synthetic */ long f11583a;
    /* renamed from: b */
    private final /* synthetic */ cau f11584b;

    cax(cau cau, long j) {
        this.f11584b = cau;
        this.f11583a = j;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = car.f20175a;
        long j = this.f11583a;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("Gouda effect failed for shot ");
        stringBuilder.append(j);
        bli.m874e(str, stringBuilder.toString(), th);
        cau cau = this.f11584b;
        cau.f22635k = true;
        cau.m16918a(this.f11583a);
    }

    public final /* synthetic */ void b_(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            String str = car.f20175a;
            long j = this.f11583a;
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Gouda effect not applied for shot ");
            stringBuilder.append(j);
            bli.m863a(str, stringBuilder.toString());
            return;
        }
        str = car.f20175a;
        j = this.f11583a;
        stringBuilder = new StringBuilder(63);
        stringBuilder.append("Gouda effect applied successfully for shot ");
        stringBuilder.append(j);
        bli.m863a(str, stringBuilder.toString());
    }
}
