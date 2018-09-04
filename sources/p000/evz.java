package p000;

import java.util.concurrent.Executor;

/* renamed from: evz */
public final /* synthetic */ class evz implements Runnable {
    /* renamed from: a */
    private final ird f4285a;
    /* renamed from: b */
    private final kwk f4286b;
    /* renamed from: c */
    private final kwk f4287c;
    /* renamed from: d */
    private final kwk f4288d;
    /* renamed from: e */
    private final kwk f4289e;
    /* renamed from: f */
    private final kwk f4290f;
    /* renamed from: g */
    private final kwk f4291g;

    public evz(ird ird, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f4285a = ird;
        this.f4286b = kwk;
        this.f4287c = kwk2;
        this.f4288d = kwk3;
        this.f4289e = kwk4;
        this.f4290f = kwk5;
        this.f4291g = kwk6;
    }

    public final void run() {
        ird ird = this.f4285a;
        kwk kwk = this.f4286b;
        kwk kwk2 = this.f4287c;
        kwk kwk3 = this.f4288d;
        kwk kwk4 = this.f4289e;
        kwk kwk5 = this.f4290f;
        kwk kwk6 = this.f4291g;
        ird.mo1903a("MICRO_EncoderModule#runEncoderStartupTask");
        ((etl) kwk.mo345a()).mo3028a();
        ((etc) kwk2.mo345a()).mo1282a((esu) kwk3.mo345a());
        exi exi = (exi) kwk4.mo345a();
        ixd ixd = (ixd) kwk5.mo345a();
        ixd.getClass();
        exi.mo1315a(new ewd(ixd), (Executor) kwk6.mo345a());
        ird.mo1904b();
    }
}
