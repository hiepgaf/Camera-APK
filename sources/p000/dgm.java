package p000;

/* renamed from: dgm */
final /* synthetic */ class dgm implements iqt {
    /* renamed from: a */
    private final dgl f13177a;

    dgm(dgl dgl) {
        this.f13177a = dgl;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        boolean z = false;
        dgl dgl = this.f13177a;
        Object obj2 = ((fvj) obj).f4732a;
        if (obj2 != null) {
            boolean z2;
            ilb ilb = dgl.f21021w;
            int length = obj2.length;
            if (length > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ilb.mo348a(Boolean.valueOf(z2));
            gdj gdj = dgl.f21019u;
            jri.m13152b(obj2);
            gdj.f5087a.m3208a((float) length);
            if (dgl.f20979F != null && dgl.f21000b.m1697c()) {
                dgl.f20980G.m3208a(((fvr) dgl.f20979F.mo2860b()).mo1426a().floatValue());
                if (((int) (dgl.f21019u.f5087a.f6274a + 0.5f)) == 0 && dgl.f20980G.f6274a > 3.0f) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                gdl gdl = dgl.f20977D;
                if (valueOf.booleanValue()) {
                    synchronized (gdl.f16827e) {
                        if (gdl.f16829g) {
                            if (gdl.f16830h != go.aI) {
                                gdl.f16830h = go.aI;
                                gdl.f16823a.mo1338b(gdl.f16824b);
                                gdl.m10995c();
                                gdl.m10993a(800);
                            }
                        }
                    }
                }
                gdl.f16828f = valueOf;
            }
        }
    }
}
