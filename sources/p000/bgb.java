package p000;

import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bgb */
final class bgb implements bfr, iop {
    /* renamed from: a */
    public static final String f19992a = bli.m862a("CdrRecSesImpl2");
    /* renamed from: b */
    public final bgk f19993b;
    /* renamed from: c */
    public File f19994c;
    /* renamed from: d */
    public final Object f19995d = new Object();
    /* renamed from: e */
    public final ikb f19996e = new ikb();
    /* renamed from: f */
    public final ArrayList f19997f = new ArrayList();
    /* renamed from: g */
    public bgj f19998g = bgj.RECORDING;
    /* renamed from: h */
    private final bfs f19999h;
    /* renamed from: i */
    private final inp f20000i;
    /* renamed from: j */
    private final bhj f20001j;
    /* renamed from: k */
    private final ilp f20002k;
    /* renamed from: l */
    private final kbg f20003l;
    /* renamed from: m */
    private File f20004m = null;
    /* renamed from: n */
    private int f20005n = 1;
    /* renamed from: o */
    private final gtf f20006o;
    /* renamed from: p */
    private final Executor f20007p;
    /* renamed from: q */
    private final kbg f20008q;
    /* renamed from: r */
    private final kbg f20009r;
    /* renamed from: s */
    private final bhs f20010s;
    /* renamed from: t */
    private final bhc f20011t;
    /* renamed from: u */
    private final ios f20012u;
    /* renamed from: v */
    private final long f20013v;
    /* renamed from: w */
    private long f20014w;
    /* renamed from: x */
    private long f20015x = 0;
    /* renamed from: y */
    private long f20016y = 0;
    /* renamed from: z */
    private long f20017z;

    public bgb(bfs bfs, bgk bgk, inp inp, bhj bhj, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg, File file, Executor executor, gtf gtf, ios ios, hke hke, kbg kbg2, long j, bhc bhc, bib bib, kbg kbg3, bhs bhs) {
        this.f19999h = bfs;
        this.f19993b = bgk;
        this.f20000i = inp;
        this.f20001j = bhj;
        this.f20002k = ilp2;
        this.f20003l = kbg;
        this.f19994c = file;
        this.f20007p = executor;
        this.f20006o = gtf;
        this.f20008q = kbg2;
        this.f20013v = j;
        this.f20014w = j;
        this.f20015x = 0;
        this.f20009r = kbg3;
        this.f20010s = bhs;
        this.f20012u = ios;
        this.f20011t = bhc;
        this.f19996e.mo1879a(ilp.mo2859a(new bgd(this, bib), this.f20007p));
        this.f19996e.mo1879a(ilp3.mo2859a(new bge(this, bib), this.f20007p));
        this.f19996e.mo1879a(bhc);
        this.f19996e.mo1879a(bib);
        if (inp.mo1891a() == inc.FPS_AUTO) {
            bje bje = new bje();
            iqo bjd = new bjd(ios);
            iqo a = this.f20010s.m7399a(new bgf(bjd));
            this.f19996e.mo1879a(bjd);
            this.f19996e.mo1879a(a);
        }
    }

    /* renamed from: a */
    final void m14820a(File file, long j) {
        boolean renameTo;
        File a = m14815a(System.currentTimeMillis());
        long j2 = (j - this.f20014w) - this.f20016y;
        if (this.f19994c != null) {
            String str = f19992a;
            String valueOf = String.valueOf(this.f19994c);
            String valueOf2 = String.valueOf(a);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 42) + String.valueOf(valueOf2).length());
            stringBuilder.append("Rename recording file to output file: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" => ");
            stringBuilder.append(valueOf2);
            bli.m869c(str, stringBuilder.toString());
            renameTo = file.renameTo(a);
        } else {
            renameTo = false;
        }
        if (renameTo || this.f20009r.mo2084b()) {
            this.f19997f.add(0, new bgl(a, this.f20000i, this.f20008q, ((Boolean) this.f20002k.mo2860b()).booleanValue(), j, j2, this.f20010s.f10891b));
            return;
        }
        str = f19992a;
        valueOf = String.valueOf(this.f19994c);
        String valueOf3 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf3).length());
        stringBuilder2.append("Failed to rename recording file to output file: ");
        stringBuilder2.append(valueOf);
        stringBuilder2.append(" => ");
        stringBuilder2.append(valueOf3);
        bli.m866b(str, stringBuilder2.toString());
    }

    /* renamed from: a */
    private final File m14815a(long j) {
        ixx ixx = this.f20000i.mo1896f().f7150c;
        return this.f20006o.m2811a(this.f20006o.m2814b(j), ixx);
    }

    /* renamed from: a */
    public final long mo2671a() {
        return this.f20015x;
    }

    /* renamed from: b */
    public final long mo2672b() {
        return this.f20013v;
    }

    /* renamed from: m */
    final /* synthetic */ Boolean m14832m() {
        Throwable e;
        try {
            this.f20001j.m7381a();
            return Boolean.valueOf(true);
        } catch (iwf e2) {
            e = e2;
            bli.m867b(f19992a, "fail to close capture session.", e);
            return Boolean.valueOf(false);
        } catch (CameraAccessException e3) {
            e = e3;
            bli.m867b(f19992a, "fail to close capture session.", e);
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: g */
    public final int mo2673g() {
        return this.f20005n;
    }

    /* renamed from: c */
    public final void mo2661c() {
        this.f19999h.mo1154a();
    }

    /* renamed from: d */
    public final void mo2662d() {
        synchronized (this.f19995d) {
            if (this.f20009r.mo2084b()) {
                return;
            }
            this.f20004m = m14815a(System.currentTimeMillis());
            ios ios = this.f20012u;
            File file = this.f20004m;
            synchronized (ios.f18442a) {
                if (ios.f18443b != ipr.STARTED) {
                    String valueOf = String.valueOf(ipr.STARTED);
                    String valueOf2 = String.valueOf(ios.f18443b);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" is expected but we get ");
                    stringBuilder.append(valueOf2);
                    Log.w("VideoRecorderImpl", stringBuilder.toString());
                } else {
                    ios.f18446e.m12325a(file);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo2663e() {
        this.f19999h.mo1155b();
    }

    /* renamed from: f */
    public final void mo2664f() {
        synchronized (this.f19995d) {
            this.f20005n++;
            long currentTimeMillis = System.currentTimeMillis();
            m14820a(this.f19994c, currentTimeMillis);
            this.f19994c = this.f20004m;
            this.f20004m = null;
            this.f20014w = currentTimeMillis;
            this.f20016y = 0;
        }
    }

    /* renamed from: a */
    public final void mo2660a(long j, long j2) {
    }

    /* renamed from: h */
    public final void mo2674h() {
        synchronized (this.f19995d) {
            this.f19998g = bgj.PAUSED;
            this.f20012u.m12338c();
            this.f20017z = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public final void mo2675i() {
        synchronized (this.f19995d) {
            this.f19998g = bgj.RECORDING;
            this.f20012u.m12339d();
            m14816o();
        }
    }

    /* renamed from: j */
    public final kpk mo2676j() {
        return m14833n();
    }

    /* renamed from: n */
    final kpk m14833n() {
        kpk a;
        boolean z = true;
        synchronized (this.f19995d) {
            if (this.f19998g.equals(bgj.RECORDING) || this.f19998g.equals(bgj.PAUSED)) {
                if (!(this.f19998g.equals(bgj.RECORDING) || this.f19998g.equals(bgj.PAUSED))) {
                    z = false;
                }
                jri.m13143a(z);
                if (this.f19998g.equals(bgj.PAUSED)) {
                    m14816o();
                }
                this.f19998g = bgj.STOPPING_RECORD;
                a = kny.m18046a(kny.m18045a(this.f20012u.m12340e(), new bgc(this), kpq.f8410a), new bgi(this), this.f20007p);
            } else {
                String valueOf = String.valueOf(this.f19998g);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13618a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }

    /* renamed from: k */
    public final kpk mo2677k() {
        kpk n = m14833n();
        return iel.m3718a(kny.m18046a(n, new bgg(this), kpq.f8410a), n, new bgh());
    }

    /* renamed from: l */
    public final bjv mo2678l() {
        if (this.f20003l.mo2084b()) {
            return ((bjw) this.f20003l.mo2081a()).mo2687a(this.f20001j);
        }
        return new bjv(new bdx("snapshot taker doesn't exist."));
    }

    /* renamed from: a */
    public final aub mo363a(asw asw) {
        aub a;
        synchronized (this.f19995d) {
            if (this.f19998g == bgj.RECORDING || this.f19998g == bgj.PAUSED) {
                a = this.f20011t.m7372a(asw);
            } else {
                String str = f19992a;
                String valueOf = String.valueOf(this.f19998g);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("Ignore triggerFocusAndMeterAtPoint: state=");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                a = new atl();
            }
        }
        return a;
    }

    /* renamed from: o */
    private final void m14816o() {
        long currentTimeMillis = System.currentTimeMillis() - this.f20017z;
        this.f20015x += currentTimeMillis;
        this.f20016y = currentTimeMillis + this.f20016y;
    }
}
