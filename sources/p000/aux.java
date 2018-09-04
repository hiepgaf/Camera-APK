package p000;

/* compiled from: PG */
/* renamed from: aux */
public final class aux implements iqo, iqt {
    /* renamed from: a */
    public static final String f10323a = bli.m862a("StdPassiveFocus");
    /* renamed from: b */
    public final atb f10324b;
    /* renamed from: c */
    public hiv f10325c = null;
    /* renamed from: d */
    public hiv f10326d = null;
    /* renamed from: e */
    public kpw f10327e;
    /* renamed from: f */
    private final ikd f10328f;
    /* renamed from: g */
    private final ikb f10329g = new ikb();
    /* renamed from: h */
    private final iju f10330h = new auz(this);

    public aux(ikd ikd, atb atb, ilp ilp) {
        this.f10328f = ikd;
        this.f10324b = atb;
        this.f10329g.mo1879a(ilp.mo2859a(this, ikd));
    }

    public final void close() {
        this.f10329g.close();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        boolean z;
        boolean z2 = false;
        fco fco = (fco) obj;
        if (this.f10325c == null && this.f10326d == null) {
            if (fco.f4475a.f4471b == gih.PASSIVE_SCAN) {
                z = false;
            } else if (fco.f4476b.f4471b == gih.PASSIVE_SCAN) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bli.m871d(f10323a, "PassiveFocusScanAnimation: start");
                this.f10325c = this.f10324b.mo2789a(kau.f19138a);
                this.f10325c.mo1734a(new auy(this));
                if (this.f10325c != null) {
                    this.f10327e = kpw.m18056d();
                    iel.m3717a(this.f10325c.mo1735b(), this.f10327e, this.f10330h, this.f10328f);
                }
            }
        }
        if (this.f10327e != null) {
            gih gih;
            if (fco.f4475a.f4471b == gih.PASSIVE_SCAN) {
                gih = fco.f4476b.f4471b;
                if (gih == gih.PASSIVE_FOCUSED) {
                    z = true;
                } else if (gih == gih.PASSIVE_UNFOCUSED) {
                    z = true;
                } else if (gih == gih.FOCUSED_LOCKED) {
                    z = true;
                } else if (gih == gih.NOT_FOCUSED_LOCKED) {
                    z = true;
                } else if (gih != gih.INACTIVE) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                gih = fco.f4476b.f4471b;
                if (gih == gih.PASSIVE_FOCUSED) {
                    z2 = true;
                } else if (gih == gih.FOCUSED_LOCKED) {
                    z2 = true;
                }
                this.f10327e.mo3557a(Boolean.valueOf(z2));
            }
        }
    }
}
