package p000;

/* renamed from: hgp */
final /* synthetic */ class hgp implements iqt {
    /* renamed from: a */
    private final hgo f17836a;

    hgp(hgo hgo) {
        this.f17836a = hgo;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        hgo hgo = this.f17836a;
        Integer num = (Integer) obj;
        if (!((eth) hgo.f17818c.mo2081a()).mo3022a().equals(hgo.m11810a(gon.m2661a(num.intValue())))) {
            hgo.f17819d.m2694b("micro_tutorial_dismiss");
        }
        ((eth) hgo.f17818c.mo2081a()).mo3023a(hgo.m11810a(gon.m2661a(num.intValue())));
        if (hgo.f17823h.get()) {
            hgo.m11815b(null);
        }
    }
}
