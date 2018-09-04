package p000;

import android.view.Surface;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bea */
final class bea implements bdy, bgk, iop {
    /* renamed from: a */
    public static final String f19881a = bli.m862a("CdrCptrSesMediaR");
    /* renamed from: A */
    private final ilp f19882A;
    /* renamed from: B */
    private final fiw f19883B;
    /* renamed from: C */
    private kpk f19884C = kow.m13617a(null);
    /* renamed from: D */
    private kpk f19885D;
    /* renamed from: E */
    private final ikb f19886E = new ikb();
    /* renamed from: b */
    public final bhe f19887b;
    /* renamed from: c */
    public final inp f19888c;
    /* renamed from: d */
    public final bhl f19889d;
    /* renamed from: e */
    public final Executor f19890e;
    /* renamed from: f */
    public final gtf f19891f;
    /* renamed from: g */
    public final bjk f19892g;
    /* renamed from: h */
    public final bjn f19893h;
    /* renamed from: i */
    public final bjg f19894i;
    /* renamed from: j */
    public final bji f19895j;
    /* renamed from: k */
    public final ilp f19896k;
    /* renamed from: l */
    public final ilp f19897l;
    /* renamed from: m */
    public final ilp f19898m;
    /* renamed from: n */
    public final kbg f19899n;
    /* renamed from: o */
    public final bhy f19900o;
    /* renamed from: p */
    public final bic f19901p;
    /* renamed from: q */
    public final Surface f19902q;
    /* renamed from: r */
    public final iqt f19903r;
    /* renamed from: s */
    public bhj f19904s;
    /* renamed from: t */
    public bhs f19905t;
    /* renamed from: u */
    public bft f19906u;
    /* renamed from: v */
    public bel f19907v = bel.READY;
    /* renamed from: w */
    public final Object f19908w = new Object();
    /* renamed from: x */
    public final Runnable f19909x = new beb(this);
    /* renamed from: y */
    private final bdz f19910y;
    /* renamed from: z */
    private final biq f19911z;

    public bea(bdz bdz, bhe bhe, inp inp, bhl bhl, Executor executor, gtf gtf, biq biq, bjk bjk, bjn bjn, bji bji, bjg bjg, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, kbg kbg, bhy bhy, bic bic, Surface surface, iqt iqt, bhj bhj, bhs bhs, biw biw, fiw fiw) {
        this.f19910y = bdz;
        this.f19887b = bhe;
        this.f19888c = inp;
        this.f19889d = bhl;
        this.f19890e = executor;
        this.f19891f = gtf;
        this.f19911z = biq;
        this.f19892g = bjk;
        this.f19893h = bjn;
        this.f19895j = bji;
        this.f19894i = bjg;
        this.f19896k = ilp;
        this.f19897l = ilp3;
        this.f19882A = ilp4;
        this.f19898m = ilp5;
        this.f19899n = kbg;
        this.f19900o = bhy;
        this.f19901p = bic;
        this.f19902q = surface;
        this.f19903r = iqt;
        this.f19904s = bhj;
        this.f19905t = bhs;
        this.f19883B = fiw;
        this.f19885D = kow.m13617a((Object) biw);
        this.f19886E.mo1879a(bhy);
        this.f19886E.mo1879a(ilp.mo2859a(new bec(this), executor));
        this.f19886E.mo1879a(ilp2.mo2859a(new bed(this), executor));
        this.f19886E.mo1879a(this.f19897l.mo2859a(new bee(this), this.f19890e));
        this.f19886E.mo1879a(ilp5.mo2859a(new bef(this), this.f19890e));
    }

    /* renamed from: a */
    public final iqo mo1879a(iqo iqo) {
        return this.f19886E.mo1879a(iqo);
    }

    public final void close() {
        synchronized (this.f19908w) {
            if (this.f19907v.equals(bel.CLOSED)) {
                bli.m866b(f19881a, "Session has been closed");
                return;
            }
            this.f19907v = bel.CLOSED;
            bli.m863a(f19881a, "close");
            if (this.f19906u != null) {
                bli.m866b(f19881a, "CamcorderRecordingSession was not shutdowned properly.");
                this.f19906u.m14801a(true);
            }
            this.f19885D.cancel(true);
            this.f19884C.cancel(true);
            if (this.f19904s != null) {
                bli.m863a(f19881a, "cameraCaptureSessionProxy is empty this happens when we try to create a session after the cameraDeviceProxy is closed.");
                this.f19904s.close();
            }
            this.f19910y.mo2680a();
            this.f19892g.close();
            this.f19886E.close();
        }
    }

    /* renamed from: b */
    public final ikb mo1880b() {
        return this.f19886E.mo1880b();
    }

    /* renamed from: h */
    private final biw m14758h() {
        biw biw;
        synchronized (this.f19908w) {
            try {
                biw = (biw) this.f19885D.get();
            } catch (InterruptedException e) {
                Object e2 = e;
                String str = f19881a;
                String valueOf = String.valueOf(e2);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
                stringBuilder.append("fail to get futurePreparedMediaRecorder: ");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
                biw = null;
                return biw;
            } catch (ExecutionException e3) {
                e2 = e3;
                String str2 = f19881a;
                String valueOf2 = String.valueOf(e2);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                stringBuilder2.append("fail to get futurePreparedMediaRecorder: ");
                stringBuilder2.append(valueOf2);
                bli.m866b(str2, stringBuilder2.toString());
                biw = null;
                return biw;
            }
        }
        return biw;
    }

    /* renamed from: a */
    public final inp mo2658a() {
        return this.f19888c;
    }

    /* renamed from: c */
    public final void mo2661c() {
        synchronized (this.f19908w) {
            bft bft = this.f19906u;
            if (bft != null) {
                bft.mo2661c();
            }
        }
    }

    /* renamed from: d */
    public final void mo2662d() {
        synchronized (this.f19908w) {
            bft bft = this.f19906u;
            if (bft != null) {
                bft.mo2662d();
            }
        }
    }

    /* renamed from: e */
    public final void mo2663e() {
        synchronized (this.f19908w) {
            bft bft = this.f19906u;
            if (bft != null) {
                bft.mo2663e();
            }
        }
    }

    /* renamed from: f */
    public final void mo2664f() {
        synchronized (this.f19908w) {
            bft bft = this.f19906u;
            if (bft != null) {
                bft.mo2664f();
            }
        }
    }

    /* renamed from: g */
    public final kpk mo2665g() {
        kpk a;
        synchronized (this.f19908w) {
            String str = f19881a;
            String valueOf = String.valueOf(this.f19907v);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
            stringBuilder.append("onRecordingSessionClosed with state ");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            if (this.f19907v.equals(bel.CLOSED)) {
                a = kow.m13617a(null);
            } else if (this.f19907v == bel.READY) {
                a = this.f19884C;
            } else {
                boolean z;
                jri.m13143a(this.f19907v.equals(bel.RECORDING));
                this.f19907v = bel.READY;
                if (this.f19906u != null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13143a(z);
                this.f19906u = null;
                this.f19884C = m14759i();
                a = this.f19884C;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo2660a(long j, long j2) {
        synchronized (this.f19908w) {
            bft bft = this.f19906u;
            if (bft != null) {
                bft.mo2660a(j, j2);
            }
        }
    }

    /* renamed from: i */
    private final kpk m14759i() {
        kpk a;
        kpk d = kpw.m18056d();
        synchronized (this.f19908w) {
            this.f19885D = this.f19911z.mo2682a();
        }
        if (this.f19911z.mo2683b()) {
            a = kow.m13617a(this.f19904s);
        } else {
            synchronized (this.f19908w) {
                a = kny.m18046a(this.f19885D, new bei(this), kpq.f8410a);
            }
        }
        kow.m13622a(kny.m18046a(a, new bej(this), kpq.f8410a), new bek(this, d), kpq.f8410a);
        return d;
    }

    /* renamed from: a */
    public final kpk mo2659a(bfs bfs) {
        kpk a;
        synchronized (this.f19908w) {
            String str;
            StringBuilder stringBuilder;
            if (this.f19907v.equals(bel.READY)) {
                jri.m13143a(this.f19907v.equals(bel.READY));
                this.f19907v = bel.STARTING_RECORD;
                Object h = m14758h();
                jri.m13152b(h);
                if (h.mo466e() != ((Integer) this.f19882A.mo2860b()).intValue()) {
                    File c = h.mo464c();
                    if (!(c == null || c.delete())) {
                        str = f19881a;
                        String valueOf = String.valueOf(c);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        stringBuilder.append("Failed to delete recording file: ");
                        stringBuilder.append(valueOf);
                        bli.m866b(str, stringBuilder.toString());
                    }
                    this.f19884C = m14759i();
                }
                a = iel.m3716a(iel.m3716a(this.f19884C, this.f19885D, new beg(this)), this.f19885D, new beh(this, bfs));
            } else {
                str = String.valueOf(this.f19907v);
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(str);
                a = kow.m13618a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }

    /* renamed from: a */
    public final aub mo363a(asw asw) {
        aub a;
        synchronized (this.f19908w) {
            if (this.f19907v == bel.RECORDING) {
                jri.m13152b(this.f19906u);
                a = this.f19906u.mo363a(asw);
            } else if (this.f19907v != bel.READY || this.f19904s == null) {
                String str = f19881a;
                String valueOf = String.valueOf(this.f19907v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("Ignore triggerFocusAndMeterAtPoint: state=");
                stringBuilder.append(valueOf);
                bli.m863a(str, stringBuilder.toString());
                a = new atl();
            } else {
                bli.m863a(f19881a, "triggerAfScan");
                asw asw2 = asw;
                a = this.f19887b.mo440a(this.f19904s, this.f19905t, false, asw2, Arrays.asList(new Surface[]{this.f19902q}), this.f19909x);
            }
        }
        return a;
    }
}
