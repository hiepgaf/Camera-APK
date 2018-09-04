package p000;

/* compiled from: PG */
/* renamed from: edq */
class edq extends edn {
    /* renamed from: a */
    private eti f23086a;
    /* renamed from: b */
    private final /* synthetic */ edo f23087b;

    edq(edo edo) {
        this.f23087b = edo;
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(edo.f23070a, "enter PhotoVideo state");
        edo edo = this.f23087b;
        edo.f23073d.setVisibility(8);
        edo.f23072c.setVisibility(0);
        this.f23087b.f23071b.m11770a(true);
        edo = this.f23087b;
        edo.f23074e.f2450e = true;
        edo.f23076g.m2231a();
        this.f23087b.f23075f.setVisibility(0);
        this.f23087b.f23080k.mo1757c();
        this.f23087b.f23077h.enablePhotoVideoSwitch();
        if (this.f23087b.f23081l.mo2084b() && this.f23086a != null) {
            ((eth) this.f23087b.f23081l.mo2081a()).mo3023a(this.f23086a);
        }
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(edo.f23070a, "exit PhotoVideo state");
        this.f23087b.f23079j.s_();
        edo edo = this.f23087b;
        edo.f23074e.f2450e = false;
        edo.f23080k.mo1750a();
        this.f23087b.f23077h.disablePhotoVideoSwitch();
        if (this.f23087b.f23081l.mo2084b()) {
            this.f23086a = ((eth) this.f23087b.f23081l.mo2081a()).mo3022a();
            ((eth) this.f23087b.f23081l.mo2081a()).mo3023a(eti.MICROVIDEO_MODE_OFF);
        }
    }

    public void o_() {
    }

    public void p_() {
    }
}
