package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cxz */
public final class cxz extends bcs {
    /* renamed from: d */
    public static final String f20816d = bli.m862a("CaptureUiStartup");
    /* renamed from: e */
    public final kwa f20817e;
    /* renamed from: f */
    public final ird f20818f;
    /* renamed from: g */
    private final kwa f20819g;
    /* renamed from: h */
    private final kpw f20820h;
    /* renamed from: i */
    private final kpk f20821i;
    /* renamed from: j */
    private final ikd f20822j;
    /* renamed from: k */
    private final hek f20823k;
    /* renamed from: l */
    private final Executor f20824l;
    /* renamed from: m */
    private final hjf f20825m;

    public cxz(aws aws, kwa kwa, kwa kwa2, kpw kpw, kpk kpk, hek hek, ikd ikd, Executor executor, ird ird, hjf hjf) {
        super(aws);
        this.f20819g = kwa;
        this.f20817e = kwa2;
        this.f20820h = kpw;
        this.f20821i = kpk;
        this.f20822j = ikd;
        this.f20823k = hek;
        this.f20824l = executor;
        this.f20818f = ird;
        this.f20825m = hjf;
    }

    /* renamed from: c */
    protected final void mo2725c() {
        this.f20818f.mo1903a("CaptureModuleInit#initialize");
        this.f20824l.execute(new cya(this));
        this.f20818f.mo1903a("CameraActivityUi#inflate");
        this.f20819g.mo345a();
        this.f20818f.mo1904b();
        kow.m13622a(this.f20821i, new cyb(this), this.f20822j);
        this.f20820h.mo3557a(this.f20823k);
        this.f20818f.mo1904b();
        if (this.f20825m.m3195c() || this.f20825m.m3196d()) {
            m7269b();
        }
    }
}
