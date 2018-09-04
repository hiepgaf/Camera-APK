package p000;

/* compiled from: PG */
/* renamed from: dwf */
final class dwf extends hci {
    /* renamed from: a */
    private final /* synthetic */ dwd f21190a;

    dwf(dwd dwd) {
        this.f21190a = dwd;
    }

    public final void onShutterButtonClick() {
        dwd dwd = this.f21190a;
        if (dwd.f23066w != go.ae) {
            dwd.m17142w();
            gwv gwv = dwd.f23061r;
            if (gwv != null && gwv.f17493e != 2) {
                dxj dxj = dwd.f23056m;
                if (dxj != null && dxj.f14690d && dwd.m17135p()) {
                    gwv = dwd.f23061r;
                    abc abc = dwd.f23056m.f14692f.f151q;
                    if (!gwv.f17494f) {
                        return;
                    }
                    if (gwv.m11623b(abc)) {
                        int i = gwv.f17493e;
                        if (i == 3 || i == 4) {
                            gwv.m11631b();
                            return;
                        } else if (i == 1) {
                            gwv.f17493e = 2;
                            return;
                        } else if (i == 0) {
                            gwv.m11627a(2);
                            return;
                        } else {
                            return;
                        }
                    }
                    gwv.m11631b();
                    return;
                }
                return;
            }
            return;
        }
        dxn dxn = dwd.f23069z;
        if (dxn != null) {
            dxn.f3360s = true;
        }
        dwd.m17120a(false, true);
    }
}
