package p000;

/* compiled from: PG */
/* renamed from: fqo */
final class fqo implements kov {
    /* renamed from: a */
    private final /* synthetic */ fqh f16393a;

    fqo(fqh fqh) {
        this.f16393a = fqh;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f16393a.f21398e.f16375b.mo515b("Failed to save image!", th);
        this.f16393a.f21395b.close();
    }

    public final /* synthetic */ void b_(Object obj) {
        fwc fwc = (fwc) obj;
        jri.m13152b((Object) fwc);
        this.f16393a.f21398e.f16375b.mo519e("Setting final result");
        this.f16393a.f21394a.mo3053a(fwc);
        this.f16393a.f21398e.f16375b.mo519e("Done saving image");
        this.f16393a.f21395b.close();
    }
}
