package p000;

/* compiled from: PG */
/* renamed from: edr */
class edr extends edn {
    /* renamed from: a */
    private final /* synthetic */ edo f23088a;

    edr(edo edo) {
        this.f23088a = edo;
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(edo.f23070a, "enter Gouda state");
        boolean a = this.f23088a.f23082m.m954a(gdp.f5094d);
        hcd hcd = this.f23088a.f23078i;
        hcd.m3025a(hbf.PORTRAIT_IDLE);
        hcd.f5955a.setVisibility(0);
        edo edo = this.f23088a;
        edo.f23074e.f2450e = true;
        edo.f23080k.mo1757c();
        this.f23088a.f23080k.mo1764i();
        this.f23088a.f23077h.switchToPortrait(a);
        this.f23088a.f23084o.mo348a(hhx.PORTRAIT);
        this.f23088a.f23076g.m2231a();
        this.f23088a.f23083n.m11618a(a);
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(edo.f23070a, "exit Gouda state");
        edo edo = this.f23088a;
        edo.f23074e.f2450e = false;
        edo.f23080k.mo1750a();
        this.f23088a.f23080k.mo1758c(1.0f);
        this.f23088a.f23080k.mo1764i();
        this.f23088a.f23083n.m11618a(true);
    }

    /* renamed from: s */
    public void mo3002s() {
    }
}
