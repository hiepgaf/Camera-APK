package p000;

/* compiled from: PG */
/* renamed from: bgd */
final class bgd implements iqt {
    /* renamed from: a */
    private boolean f10771a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f10772b;
    /* renamed from: c */
    private final /* synthetic */ bgb f10773c;

    bgd(bgb bgb, bib bib) {
        this.f10773c = bgb;
        this.f10772b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        if (this.f10771a) {
            this.f10771a = false;
            return;
        }
        synchronized (this.f10773c.f19995d) {
            if (!this.f10773c.f19998g.equals(bgj.RECORDING)) {
                if (!this.f10773c.f19998g.equals(bgj.PAUSED)) {
                    String str = bgb.f19992a;
                    String valueOf = String.valueOf(this.f10773c.f19998g);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
                    stringBuilder.append("Ignore observableAeExposureCompensation callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m873e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f10772b.run();
        }
    }
}
