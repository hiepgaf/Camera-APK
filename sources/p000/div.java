package p000;

/* compiled from: PG */
/* renamed from: div */
public final class div extends imt implements ilp {
    /* renamed from: a */
    private final bsn f22959a;

    public div(bsn bsn, gor gor) {
        super(gor.m2668b("pref_video_fps_key", gom.FPS_30.name()));
        this.f22959a = bsn;
    }

    /* renamed from: a */
    public final inc m17080a() {
        kbg a = this.f22959a.m952a(bin.f1191c);
        if (!a.mo2084b()) {
            return (inc) super.mo2860b();
        }
        if (((Integer) a.mo2081a()).intValue() == 30) {
            return inc.FPS_30;
        }
        if (((Integer) a.mo2081a()).intValue() == 60) {
            return inc.FPS_60;
        }
        if (((Integer) a.mo2081a()).intValue() == 0) {
            return inc.FPS_AUTO;
        }
        return (inc) super.mo2860b();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2860b() {
        return m17080a();
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3369b(Object obj) {
        return inc.m3872a((String) obj);
    }

    /* renamed from: c */
    protected final /* synthetic */ Object mo3370c(Object obj) {
        return ((inc) obj).name();
    }
}
