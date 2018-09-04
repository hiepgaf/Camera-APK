package p000;

/* renamed from: awa */
final /* synthetic */ class awa implements iqt {
    /* renamed from: a */
    private final avy f10408a;
    /* renamed from: b */
    private final kpw f10409b;

    awa(avy avy, kpw kpw) {
        this.f10408a = avy;
        this.f10409b = kpw;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        avy avy = this.f10408a;
        knk knk = this.f10409b;
        gvd gvd = (gvd) obj;
        if (gvd.m2838b() && !gvd.m2837a()) {
            bli.m863a(avy.f10396a, "Tracker is not tracking, stopping tracking touch to focus.");
            knk.mo3557a(aua.m694a());
            avy.m7078a();
        }
    }
}
