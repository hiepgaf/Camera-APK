package p000;

/* renamed from: dcl */
final /* synthetic */ class dcl implements iqt {
    /* renamed from: a */
    private final dck f13091a;

    dcl(dck dck) {
        this.f13091a = dck;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        dck dck = this.f13091a;
        Boolean bool = (Boolean) obj;
        String str = (String) ((dbu) dck.f20925a.m991d()).mo2950z().mo2860b();
        ilp b = dck.f20925a.f20923m;
        boolean z = !"on".equals(str) ? "auto".equals(str) ? bool.booleanValue() : false : true;
        b.mo348a(Boolean.valueOf(z));
    }
}
