package p000;

/* compiled from: PG */
/* renamed from: djh */
final class djh implements kov {
    /* renamed from: a */
    private final /* synthetic */ djg f13489a;

    djh(djg djg) {
        this.f13489a = djg;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        synchronized (this.f13489a.f3097a.f13471l) {
            if (this.f13489a.f3097a.f13479t == djn.NO_RECORDING) {
                return;
            }
            bli.m867b(dix.f13456a, "Failed to startRecording: ", th);
            this.f13489a.f3097a.f13467h.m3239c(true);
            dix dix = this.f13489a.f3097a;
            dix.m9128f();
            dix.m9129g();
            this.f13489a.f3097a.f13479t = djn.NO_RECORDING;
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        bfr bfr = (bfr) obj;
        synchronized (this.f13489a.f3097a.f13471l) {
            if (this.f13489a.f3097a.f13479t != djn.CLOSED) {
                dix dix = this.f13489a.f3097a;
                hks hks = dix.f13477r;
                dix.f13476q = new hkk((ikd) hks.m3231a((ikd) hks.f6309a.mo345a(), 1), (hke) hks.m3231a((hke) hks.f6310b.mo345a(), 2), (gpn) hks.m3231a((gpn) hks.f6311c.mo345a(), 3), (gtx) hks.m3231a((gtx) hks.f6312d.mo345a(), 4), (bfr) hks.m3231a(bfr, 5), (hkv) hks.m3231a(dix.f13467h, 6), (gxz) hks.m3231a(dix.f13458B, 7), (hkw) hks.m3231a(this.f13489a.f3097a.f13473n, 8));
                this.f13489a.f3097a.f13479t = djn.RECORDING;
                this.f13489a.f3097a.f13467h.f6321g.m9611c(true);
                return;
            }
            bli.m869c(dix.f13456a, "this object has been closed during STARTING_RECORDING");
            dix dix2 = this.f13489a.f3097a;
            dix2.m9128f();
            dix2.m9129g();
        }
    }
}
