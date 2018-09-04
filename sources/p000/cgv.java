package p000;

/* renamed from: cgv */
final /* synthetic */ class cgv implements Runnable {
    /* renamed from: a */
    private final cgu f1959a;
    /* renamed from: b */
    private final int f1960b;

    cgv(cgu cgu, int i) {
        this.f1959a = cgu;
        this.f1960b = i;
    }

    public final void run() {
        cgu cgu = this.f1959a;
        int i = this.f1960b;
        try {
            cgu.f11922i = i;
            cgu.f11918e.mo523b(iur.m4253a(String.valueOf(i)));
            zs zsVar = cgu.f11917d;
            zs zsVar2 = cgu.f11916c;
            aah aah = cgu.f11921h;
            if (aah == null) {
                cgu.m8171a(zsVar2, i, cgu.f11915b, cgu);
            } else if (aah.mo2565c() == i) {
                r0 = cgu.f11923j;
                bli.m871d(cgu.f11914a, "reconnecting to use the existing camera");
                aah aah2 = cgu.f11921h;
                try {
                    aah2.mo2569g().m80a(new aai(aah2, cgu.f11915b, cgu));
                } catch (RuntimeException e) {
                    aah2.mo2554a().mo2544b().mo2579a(e);
                }
                cgu.f11921h = null;
            } else {
                bli.m871d(cgu.f11914a, "different camera already opened, closing then reopening");
                r0 = cgu.f11923j;
                cgu.f11916c.m6258a(false);
                cgu.m8178c();
                cgu.m8171a(zsVar2, i, cgu.f11915b, cgu);
            }
            cgu.f11923j = false;
            cgu.f11920g = zsVar2.mo2542a();
        } catch (InterruptedException e2) {
            cgu.f11915b.post(new cgw(cgu, i));
        }
    }
}
