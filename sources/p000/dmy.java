package p000;

import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: dmy */
public final class dmy extends doc {
    /* renamed from: c */
    public bfr f21120c;
    /* renamed from: d */
    public ixz f21121d;
    /* renamed from: e */
    public bfe f21122e;
    /* renamed from: f */
    public final Runnable f21123f = new dna(this);
    /* renamed from: g */
    private final dkd f21124g;
    /* renamed from: h */
    private ScheduledExecutorService f21125h;
    /* renamed from: i */
    private djz f21126i;

    static {
        bli.m862a("VidIntStRecVideo");
    }

    public dmy(doc doc, bfr bfr, dkd dkd, bfe bfe, djz djz) {
        super((bug) doc);
        this.f21120c = bfr;
        this.f21124g = dkd;
        this.f21121d = new hke();
        this.f21125h = iel.m3723e("VideoIntEx", 1);
        this.f21122e = bfe;
        this.f21126i = djz;
        m988a(daz.class, new dnb(this));
        m988a(dlu.class, new dnc(this));
        m988a(dlt.class, new dne(this));
        m988a(dbi.class, new dng(this));
        m988a(dlm.class, new dnh(this));
    }

    /* renamed from: f */
    final doc m15457f() {
        Handler handler = new Handler(((doa) m991d()).f13611d.getMainLooper());
        handler.post(new dmz(this));
        kow.m13622a(this.f21120c.mo2676j(), new dni(this, handler), kpq.f8410a);
        this.f21126i.m9150b();
        this.f21124g.mo1163c();
        this.f21124g.mo1164d();
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2971e();
    }

    /* renamed from: e */
    public final doc mo2971e() {
        this.f21125h.scheduleAtFixedRate(new dnk(this), 0, 1, TimeUnit.SECONDS);
        return null;
    }

    /* renamed from: c */
    public final void mo2953c() {
        this.f21120c = null;
        ScheduledExecutorService scheduledExecutorService = this.f21125h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.f21125h = null;
    }
}
