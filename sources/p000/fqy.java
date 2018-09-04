package p000;

/* compiled from: PG */
/* renamed from: fqy */
final class fqy implements fow {
    /* renamed from: a */
    private final /* synthetic */ gfw f16413a;
    /* renamed from: b */
    private final /* synthetic */ fqx f16414b;

    fqy(fqx fqx, gfw gfw) {
        this.f16414b = fqx;
        this.f16413a = gfw;
    }

    /* renamed from: a */
    public final kpk mo568a() {
        kpk d = kpw.m18056d();
        fqx fqx = this.f16414b;
        fqx.f16406a.execute(new fqz(fqx, this.f16413a, d));
        return d;
    }

    /* renamed from: b */
    public final kpk mo569b() {
        this.f16413a.f5149b.close();
        return kow.m13618a(new isr("Software jpeg saver was closed"));
    }
}
