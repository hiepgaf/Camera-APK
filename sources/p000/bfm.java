package p000;

/* compiled from: PG */
/* renamed from: bfm */
final class bfm implements koj {
    /* renamed from: a */
    private final /* synthetic */ inc f10723a;
    /* renamed from: b */
    private final /* synthetic */ inp f10724b;
    /* renamed from: c */
    private final /* synthetic */ iur f10725c;
    /* renamed from: d */
    private final /* synthetic */ biq f10726d;
    /* renamed from: e */
    private final /* synthetic */ ilp f10727e;
    /* renamed from: f */
    private final /* synthetic */ ilp f10728f;
    /* renamed from: g */
    private final /* synthetic */ kbg f10729g;
    /* renamed from: h */
    private final /* synthetic */ bfl f10730h;

    bfm(bfl bfl, inc inc, inp inp, iur iur, biq biq, ilp ilp, ilp ilp2, kbg kbg) {
        this.f10730h = bfl;
        this.f10723a = inc;
        this.f10724b = inp;
        this.f10725c = iur;
        this.f10726d = biq;
        this.f10727e = ilp;
        this.f10728f = ilp2;
        this.f10729g = kbg;
    }

    /* renamed from: a */
    private final kpk m7318a(biw biw) {
        kpk a;
        bli.m871d(bfl.f19939a, "CameraDeviceProxy and PreparedMediaRecorder are ready.");
        synchronized (this.f10730h.f19945g) {
            if (this.f10730h.m14795b()) {
                a = kow.m13618a(new IllegalStateException("CamcorderManager has been closed."));
            } else {
                jri.m13153b(this.f10730h.f19944f.isDone() ^ 1);
                this.f10730h.f19944f.mo3557a(Boolean.valueOf(true));
                bhw bhw = new bhw();
                inc inc = this.f10723a;
                inp inp = this.f10724b;
                iur iur = this.f10725c;
                bff bff = this.f10730h;
                Object bgp = new bgp(inc, inp, iur, bff.f19940b, bff.f19941c, bff.f19947i, bff.f19948j, this.f10726d, this.f10727e, this.f10728f, bff.f19949k, bff, biw, bff.f19942d, this.f10729g, bff.f19943e);
                jri.m13143a(this.f10730h.f19946h.containsKey(this.f10725c) ^ 1);
                this.f10730h.f19946h.put(this.f10725c, bgp);
                a = kow.m13617a(bgp);
            }
        }
        return a;
    }
}
