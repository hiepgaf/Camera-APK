package p000;

/* compiled from: PG */
/* renamed from: bfn */
final class bfn implements koj {
    /* renamed from: a */
    private final /* synthetic */ inc f10731a;
    /* renamed from: b */
    private final /* synthetic */ inp f10732b;
    /* renamed from: c */
    private final /* synthetic */ iur f10733c;
    /* renamed from: d */
    private final /* synthetic */ iou f10734d;
    /* renamed from: e */
    private final /* synthetic */ ilp f10735e;
    /* renamed from: f */
    private final /* synthetic */ ilp f10736f;
    /* renamed from: g */
    private final /* synthetic */ kbg f10737g;
    /* renamed from: h */
    private final /* synthetic */ bfl f10738h;

    bfn(bfl bfl, inc inc, inp inp, iur iur, iou iou, ilp ilp, ilp ilp2, kbg kbg) {
        this.f10738h = bfl;
        this.f10731a = inc;
        this.f10732b = inp;
        this.f10733c = iur;
        this.f10734d = iou;
        this.f10735e = ilp;
        this.f10736f = ilp2;
        this.f10737g = kbg;
    }

    /* renamed from: a */
    private final kpk m7320a(ios ios) {
        kpk a;
        bli.m871d(bfl.f19939a, "CameraDeviceProxy and PreparedMediaRecorder are ready.");
        synchronized (this.f10738h.f19945g) {
            if (this.f10738h.m14795b()) {
                a = kow.m13618a(new IllegalStateException("CamcorderManager has been closed."));
            } else {
                jri.m13153b(this.f10738h.f19944f.isDone() ^ 1);
                this.f10738h.f19944f.mo3557a(Boolean.valueOf(true));
                bhw bhw = new bhw();
                inc inc = this.f10731a;
                inp inp = this.f10732b;
                iur iur = this.f10733c;
                bff bff = this.f10738h;
                Object bgm = new bgm(inc, inp, iur, bff.f19940b, bff.f19941c, bff.f19947i, bff.f19948j, this.f10734d, this.f10735e, this.f10736f, bff.f19949k, bff, ios, bff.f19942d, this.f10737g, bff.f19943e);
                jri.m13143a(this.f10738h.f19946h.containsKey(this.f10733c) ^ 1);
                this.f10738h.f19946h.put(this.f10733c, bgm);
                a = kow.m13617a(bgm);
            }
        }
        return a;
    }
}
