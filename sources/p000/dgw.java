package p000;

/* compiled from: PG */
/* renamed from: dgw */
final class dgw extends hci {
    /* renamed from: a */
    private final /* synthetic */ dgl f21026a;

    dgw(dgl dgl) {
        this.f21026a = dgl;
    }

    public final void onShutterButtonClick() {
        dgl dgl = this.f21026a;
        if (dgl.f21024z != null) {
            dgl.f21001c.mo2757l().f14926s.m11769a();
            if (!this.f21026a.f21005g.mo1454a(true)) {
                hfk hfk = this.f21026a;
                if (hfk.f20981H.f2852c.m11791b()) {
                    hfk.m15392a();
                    return;
                }
                int intValue = ((Integer) hfk.f20982I.mo2860b()).intValue();
                if (intValue <= 0) {
                    hfk.m15401h();
                    return;
                }
                hfk.f20981H.m1556a(hfk);
                hfk.f20981H.m1555a(intValue);
            }
        }
    }
}
