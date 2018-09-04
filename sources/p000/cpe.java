package p000;

/* compiled from: PG */
/* renamed from: cpe */
final class cpe implements kov {
    /* renamed from: a */
    public final /* synthetic */ iqb f12467a;
    /* renamed from: b */
    public final /* synthetic */ coy f12468b;
    /* renamed from: c */
    private final /* synthetic */ crb f12469c;

    cpe(coy coy, crb crb, iqb iqb) {
        this.f12468b = coy;
        this.f12469c = crb;
        this.f12467a = iqb;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m873e(coy.f12446a, "Filmstrip OnDemandLoader failed to load.");
    }

    public final /* synthetic */ void b_(Object obj) {
        if (this.f12468b.f12449d.mo376d()) {
            bli.m869c(coy.f12446a, "Activity is destroyed. Canceling load.");
            return;
        }
        coy coy;
        String str = coy.f12446a;
        int i = this.f12469c.f2583d.f2576c;
        StringBuilder stringBuilder = new StringBuilder(67);
        stringBuilder.append("resetPartialLoading onSuccess newFilmstripItemList size=");
        stringBuilder.append(i);
        bli.m871d(str, stringBuilder.toString());
        crb crb = this.f12469c;
        if (crb.f2583d.f2576c == 0) {
            this.f12468b.f12456k = -1;
        } else {
            err e = crb.m1424a(0).mo1066e();
            this.f12468b.f12456k = cpy.m8600a(e);
            str = coy.f12446a;
            long j = this.f12468b.f12456k;
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("resetPartialLoading lastPhotoUtcTimeMs=");
            stringBuilder2.append(j);
            bli.m871d(str, stringBuilder2.toString());
        }
        this.f12468b.m8538a(this.f12469c);
        this.f12468b.f12459n.set(false);
        for (int i2 = 0; i2 < 5; i2++) {
            crb crb2 = this.f12469c;
            if (i2 >= crb2.f2583d.f2576c) {
                break;
            }
            err e2 = crb2.m1424a(i2).mo1066e();
            coy = this.f12468b;
            cqf cqf = coy.f12453h;
            cqf.m1406a(coy.f12448c, e2);
        }
        Object d = kpw.m18056d();
        kow.m13622a(d, new cpf(this), kpq.f8410a);
        coy = this.f12468b;
        new cph(coy, coy.f12456k, d).execute(new Void[0]);
    }
}
