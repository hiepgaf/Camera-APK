package p000;

/* compiled from: PG */
/* renamed from: bge */
final class bge implements iqt {
    /* renamed from: a */
    private boolean f10774a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f10775b;
    /* renamed from: c */
    private final /* synthetic */ bgb f10776c;

    bge(bgb bgb, bib bib) {
        this.f10776c = bgb;
        this.f10775b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        if (this.f10774a) {
            this.f10774a = false;
            return;
        }
        synchronized (this.f10776c.f19995d) {
            if (!this.f10776c.f19998g.equals(bgj.RECORDING)) {
                if (!this.f10776c.f19998g.equals(bgj.PAUSED)) {
                    String str = bgb.f19992a;
                    String valueOf = String.valueOf(this.f10776c.f19998g);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    stringBuilder.append("Ignore observableZoomedCropRegion callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m873e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f10775b.run();
        }
    }
}
