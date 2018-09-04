package p000;

/* compiled from: PG */
/* renamed from: bfv */
final class bfv implements iqt {
    /* renamed from: a */
    private boolean f10758a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f10759b;
    /* renamed from: c */
    private final /* synthetic */ bft f10760c;

    bfv(bft bft, bib bib) {
        this.f10760c = bft;
        this.f10759b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        if (this.f10758a) {
            this.f10758a = false;
            return;
        }
        synchronized (this.f10760c.f19972g) {
            if (!this.f10760c.f19975j.equals(bga.RECORDING)) {
                if (!this.f10760c.f19975j.equals(bga.PAUSED)) {
                    String str = bft.f19962a;
                    String valueOf = String.valueOf(this.f10760c.f19975j);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
                    stringBuilder.append("Ignore observableAeExposureCompensation callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m873e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f10759b.run();
        }
    }
}
