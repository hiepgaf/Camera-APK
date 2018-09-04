package p000;

/* compiled from: PG */
/* renamed from: ftf */
public final class ftf implements fsl {
    /* renamed from: a */
    private final /* synthetic */ fsw f16510a;

    public ftf(fsw fsw) {
        this.f16510a = fsw;
    }

    /* renamed from: a */
    public final ftn mo1422a(fsm fsm) {
        fsx a = this.f16510a.m2370a(fsm);
        String str = "limited or full";
        return new fto("regular").m2384a("single image", a.m2377d()).m2384a(str, a.m2374a(Integer.valueOf(0), Integer.valueOf(1))).m2384a("hw_jpeg, sw_jpeg, reprocessing", a.m2373a(fss.HW_JPEG, fss.SW_JPEG, fss.REPROCESSING)).m2384a("flash off", a.m2375b()).m2384a("edge", a.m2371a()).m2384a("noise reduction", a.m2378e()).m2384a("af converged", a.m2376c()).m2383a();
    }
}
