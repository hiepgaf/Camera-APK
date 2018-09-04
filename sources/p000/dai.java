package p000;

/* compiled from: PG */
/* renamed from: dai */
final class dai extends hci {
    /* renamed from: a */
    private final /* synthetic */ daf f20830a;

    dai(daf daf) {
        this.f20830a = daf;
    }

    public final void onShutterButtonClick() {
        daf daf = this.f20830a;
        daf.f22777d.mo573a(new dbi(daf.f22779f, daf.f22776c));
        this.f20830a.f22776c = false;
    }

    public final void onShutterTouch(hin hin) {
        this.f20830a.f22779f = hin;
    }
}
