package p000;

/* compiled from: PG */
/* renamed from: bct */
final class bct implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bcs f1075a;

    bct(bcs bcs) {
        this.f1075a = bcs;
    }

    public final void run() {
        aws aws = this.f1075a.f10670b;
        if (aws == null || !aws.mo377e()) {
            try {
                this.f1075a.mo2725c();
                return;
            } catch (Throwable e) {
                this.f1075a.f10671c.m17780a(e);
                return;
            }
        }
        bli.m873e(bcs.f10669a, "Pre-initialization failed, the activity is not in the foreground.");
        this.f1075a.f10671c.mo3557a(Boolean.valueOf(false));
    }
}
