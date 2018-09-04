package p000;

/* compiled from: PG */
/* renamed from: cfv */
final class cfv implements abn {
    /* renamed from: a */
    private final /* synthetic */ cfk f11823a;

    cfv(cfk cfk) {
        this.f11823a = cfk;
    }

    /* renamed from: a */
    public final void mo5a(int i) {
        String str = cfk.f20249a;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Camera error callback. error=");
        stringBuilder.append(i);
        bli.m866b(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo7a(RuntimeException runtimeException, String str, int i, int i2) {
        bli.m867b(cfk.f20249a, "Camera Exception", runtimeException);
        this.f11823a.f20266Q.mo1574a(4, str, i, i2);
        m8147a();
    }

    /* renamed from: a */
    public final void mo6a(RuntimeException runtimeException) {
        bli.m867b(cfk.f20249a, "DispatchThread Exception", runtimeException);
        this.f11823a.f20266Q.mo1574a(5, null, -1, -1);
        m8147a();
    }

    /* renamed from: a */
    private final void m8147a() {
        cfk cfk = this.f11823a;
        if (!cfk.f20268S) {
            cfk.f20268S = true;
            if (cfk.f20274Y) {
                cfk.mo2745a("CameraActivityController: Fatal error during onPause!");
            } else {
                cfk.aq.mo2695c();
            }
        }
    }
}
