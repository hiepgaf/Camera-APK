package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bft */
final class bft implements bfr, iop {
    /* renamed from: a */
    public static final String f19962a = bli.m862a("CdrRecSesImpl");
    /* renamed from: A */
    private long f19963A = 0;
    /* renamed from: B */
    private long f19964B = 0;
    /* renamed from: C */
    private long f19965C;
    /* renamed from: D */
    private final iqh f19966D;
    /* renamed from: b */
    public final bgk f19967b;
    /* renamed from: c */
    public final bhj f19968c;
    /* renamed from: d */
    public File f19969d;
    /* renamed from: e */
    public final bjn f19970e;
    /* renamed from: f */
    public final hke f19971f;
    /* renamed from: g */
    public final Object f19972g = new Object();
    /* renamed from: h */
    public final ikb f19973h = new ikb();
    /* renamed from: i */
    public final ArrayList f19974i = new ArrayList();
    /* renamed from: j */
    public bga f19975j = bga.RECORDING;
    /* renamed from: k */
    private final bfs f19976k;
    /* renamed from: l */
    private final inp f19977l;
    /* renamed from: m */
    private final ilp f19978m;
    /* renamed from: n */
    private final kbg f19979n;
    /* renamed from: o */
    private File f19980o = null;
    /* renamed from: p */
    private int f19981p = 1;
    /* renamed from: q */
    private final gtf f19982q;
    /* renamed from: r */
    private final Executor f19983r;
    /* renamed from: s */
    private final bji f19984s;
    /* renamed from: t */
    private final bjg f19985t;
    /* renamed from: u */
    private final kbg f19986u;
    /* renamed from: v */
    private final kbg f19987v;
    /* renamed from: w */
    private final bhs f19988w;
    /* renamed from: x */
    private final bhc f19989x;
    /* renamed from: y */
    private final long f19990y;
    /* renamed from: z */
    private long f19991z;

    public bft(bfs bfs, bgk bgk, inp inp, bhj bhj, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg, File file, Executor executor, gtf gtf, bjn bjn, bji bji, bjg bjg, hke hke, kbg kbg2, long j, bhc bhc, bib bib, kbg kbg3, bhs bhs) {
        this.f19976k = bfs;
        this.f19967b = bgk;
        this.f19977l = inp;
        this.f19968c = bhj;
        this.f19978m = ilp2;
        this.f19979n = kbg;
        this.f19969d = file;
        this.f19983r = executor;
        this.f19982q = gtf;
        this.f19970e = bjn;
        this.f19984s = bji;
        this.f19985t = bjg;
        this.f19971f = hke;
        this.f19986u = kbg2;
        this.f19990y = j;
        this.f19991z = j;
        this.f19963A = 0;
        this.f19987v = kbg3;
        this.f19988w = bhs;
        this.f19989x = bhc;
        this.f19966D = new iqh();
        this.f19973h.mo1879a(ilp.mo2859a(new bfv(this, bib), this.f19983r));
        this.f19973h.mo1879a(ilp3.mo2859a(new bfw(this, bib), this.f19983r));
        this.f19973h.mo1879a(bhc);
        this.f19973h.mo1879a(bib);
    }

    /* renamed from: a */
    final void m14803a(File file, long j) {
        boolean renameTo;
        File a = m14796a(System.currentTimeMillis());
        long b = m14797b(j);
        if (this.f19969d != null) {
            String str = f19962a;
            String valueOf = String.valueOf(this.f19969d);
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
        if (renameTo || this.f19987v.mo2084b()) {
            this.f19974i.add(0, new bgl(a, this.f19977l, this.f19986u, ((Boolean) this.f19978m.mo2860b()).booleanValue(), j, b, this.f19988w.f10891b));
            return;
        }
        str = f19962a;
        valueOf = String.valueOf(this.f19969d);
        String valueOf3 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf3).length());
        stringBuilder2.append("Failed to rename recording file to output file: ");
        stringBuilder2.append(valueOf);
        stringBuilder2.append(" => ");
        stringBuilder2.append(valueOf3);
        bli.m866b(str, stringBuilder2.toString());
    }

    /* renamed from: a */
    private final File m14796a(long j) {
        ixx ixx = this.f19977l.mo1896f().f7150c;
        return this.f19982q.m2811a(this.f19982q.m2814b(j), ixx);
    }

    /* renamed from: b */
    private final long m14797b(long j) {
        return (j - this.f19991z) - this.f19964B;
    }

    /* renamed from: a */
    public final long mo2671a() {
        return this.f19963A;
    }

    /* renamed from: b */
    public final long mo2672b() {
        return this.f19990y;
    }

    /* renamed from: g */
    public final int mo2673g() {
        return this.f19981p;
    }

    /* renamed from: c */
    public final void mo2661c() {
        this.f19976k.mo1154a();
    }

    /* renamed from: d */
    public final void mo2662d() {
        synchronized (this.f19972g) {
            bli.m863a(f19962a, "Max file size approaching.");
            if (this.f19975j == bga.STOPPING_RECORD) {
                bli.m863a(f19962a, "Ignoring max file size approaching signal because recording is stopping");
            } else if (this.f19987v.mo2084b()) {
            } else {
                this.f19980o = m14796a(System.currentTimeMillis());
                this.f19985t.mo503a(this.f19980o);
            }
        }
    }

    /* renamed from: e */
    public final void mo2663e() {
        this.f19976k.mo1155b();
    }

    /* renamed from: f */
    public final void mo2664f() {
        synchronized (this.f19972g) {
            bli.m863a(f19962a, "Next output file started");
            this.f19981p++;
            long currentTimeMillis = System.currentTimeMillis();
            m14803a(this.f19969d, currentTimeMillis);
            this.f19969d = this.f19980o;
            this.f19980o = null;
            this.f19991z = currentTimeMillis;
            this.f19964B = 0;
        }
    }

    /* renamed from: a */
    public final void mo2660a(long j, long j2) {
        float a = this.f19966D.m4036a(new iqi(j, (float) j2));
        String str = f19962a;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("Bitrate at ");
        stringBuilder.append(j);
        stringBuilder.append(" = ");
        stringBuilder.append(a);
        bli.m863a(str, stringBuilder.toString());
    }

    /* renamed from: h */
    public final void mo2674h() {
        synchronized (this.f19972g) {
            this.f19975j = bga.PAUSED;
            this.f19984s.mo504a();
            this.f19965C = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public final void mo2675i() {
        synchronized (this.f19972g) {
            this.f19975j = bga.RECORDING;
            this.f19984s.mo505b();
            m14798m();
        }
    }

    /* renamed from: j */
    public final kpk mo2676j() {
        return m14801a(true);
    }

    /* renamed from: a */
    final kpk m14801a(boolean z) {
        kpk d;
        boolean z2 = true;
        synchronized (this.f19972g) {
            if (this.f19975j.equals(bga.RECORDING) || this.f19975j.equals(bga.PAUSED)) {
                if (!(this.f19975j.equals(bga.RECORDING) || this.f19975j.equals(bga.PAUSED))) {
                    z2 = false;
                }
                jri.m13143a(z2);
                if (this.f19975j.equals(bga.PAUSED)) {
                    m14798m();
                }
                this.f19975j = bga.STOPPING_RECORD;
                d = kpw.m18056d();
                long b = m14797b(System.currentTimeMillis());
                if (z || b > 1000) {
                    d.mo3616b(this.f19970e.mo506a(this.f19968c, z ^ 1));
                } else {
                    Object bbv = new bbv("CdrRecSession", 1000 - ((int) b));
                    this.f19973h.mo1879a(bbv);
                    bbv.execute(new bfu(this, d, z));
                }
                d = kny.m18046a(d, new bfz(this), this.f19983r);
            } else {
                String valueOf = String.valueOf(this.f19975j);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                d = kow.m13618a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return d;
    }

    /* renamed from: k */
    public final kpk mo2677k() {
        kpk a = m14801a(false);
        kpk d = kpw.m18056d();
        kow.m13622a(a, new bfx(this, d), kpq.f8410a);
        return iel.m3718a(d, a, new bfy());
    }

    /* renamed from: l */
    public final bjv mo2678l() {
        if (this.f19979n.mo2084b()) {
            return ((bjw) this.f19979n.mo2081a()).mo2687a(this.f19968c);
        }
        return new bjv(new bdx("snapshot taker doesn't exist."));
    }

    /* renamed from: a */
    public final aub mo363a(asw asw) {
        aub a;
        synchronized (this.f19972g) {
            if (this.f19975j == bga.RECORDING || this.f19975j == bga.PAUSED) {
                a = this.f19989x.m7372a(asw);
            } else {
                String str = f19962a;
                String valueOf = String.valueOf(this.f19975j);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("Ignore triggerFocusAndMeterAtPoint: state=");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                a = new atl();
            }
        }
        return a;
    }

    /* renamed from: m */
    private final void m14798m() {
        long currentTimeMillis = System.currentTimeMillis() - this.f19965C;
        this.f19963A += currentTimeMillis;
        this.f19964B = currentTimeMillis + this.f19964B;
    }
}
