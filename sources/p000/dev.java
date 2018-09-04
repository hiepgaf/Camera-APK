package p000;

/* compiled from: PG */
/* renamed from: dev */
final class dev extends hci {
    /* renamed from: a */
    private final /* synthetic */ ehp f20970a;
    /* renamed from: b */
    private final /* synthetic */ des f20971b;

    dev(des des, ehp ehp) {
        this.f20971b = des;
        this.f20970a = ehp;
    }

    public final void onShutterButtonClick() {
        des des = this.f20971b;
        if (!des.f22826l || !des.f22825k) {
            return;
        }
        if (des.f22827m) {
            des.m17051r();
            return;
        }
        this.f20970a.mo3013I();
        ejy ejy = this.f20971b.f22836v;
        eki eki = ejy.f3726b;
        if (!(eki == null || ejy.f3729e || ejy.f3739o != 0 || ejy.f3748x)) {
            eki.f3761H.m1856a(0.0d);
            ekt ekt = eki.f3783d;
            if (ekt != null) {
                ekt.m1845a(eki.f3761H.m1858b());
            }
            if (eki.f3795p && eki.f3802w == go.ag) {
                eki.f3784e.m1324b(eki.f3754A);
            }
            eki.f3803x = true;
            ejy.f3748x = true;
        }
        boolean z = ejy.f3748x;
        this.f20971b.f22827m = true;
    }
}
