package p000;

/* renamed from: fan */
public final /* synthetic */ class fan implements iqt {
    /* renamed from: a */
    private final fbd f15830a;

    public fan(fbd fbd) {
        this.f15830a = fbd;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        fbd fbd = this.f15830a;
        if (((Boolean) obj).booleanValue()) {
            fbd.f4424c.postDelayed(fbd.f4426e, 200);
            return;
        }
        fbd.f4424c.removeCallbacks(fbd.f4426e);
        fbd.f4422a.mo1336a(fbd.f4423b);
    }
}
