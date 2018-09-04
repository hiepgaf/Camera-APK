package p000;

/* compiled from: PG */
/* renamed from: did */
final class did extends hci {
    /* renamed from: a */
    private final /* synthetic */ dhz f21030a;

    did(dhz dhz) {
        this.f21030a = dhz;
    }

    public final void onShutterButtonClick() {
        synchronized (this.f21030a.f22901j) {
            dil dil = this.f21030a.f22905n;
            if (dil != null) {
                dil.mo2968c();
            }
        }
    }
}
