package p000;

/* compiled from: PG */
/* renamed from: bfw */
final class bfw implements iqt {
    /* renamed from: a */
    private boolean f10761a = true;
    /* renamed from: b */
    private final /* synthetic */ bib f10762b;
    /* renamed from: c */
    private final /* synthetic */ bft f10763c;

    bfw(bft bft, bib bib) {
        this.f10763c = bft;
        this.f10762b = bib;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        if (this.f10761a) {
            this.f10761a = false;
            return;
        }
        synchronized (this.f10763c.f19972g) {
            if (!this.f10763c.f19975j.equals(bga.RECORDING)) {
                if (!this.f10763c.f19975j.equals(bga.PAUSED)) {
                    String str = bft.f19962a;
                    String valueOf = String.valueOf(this.f10763c.f19975j);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    stringBuilder.append("Ignore observableZoomedCropRegion callback: state=");
                    stringBuilder.append(valueOf);
                    bli.m873e(str, stringBuilder.toString());
                    return;
                }
            }
            this.f10762b.run();
        }
    }
}
