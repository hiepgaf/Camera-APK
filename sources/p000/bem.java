package p000;

import android.view.Surface;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bem */
final class bem implements bdy, bgk, iop {
    /* renamed from: a */
    public static final String f19912a = bli.m862a("CdrCptrSesCodec");
    /* renamed from: A */
    private final ikb f19913A = new ikb();
    /* renamed from: b */
    public final bhe f19914b;
    /* renamed from: c */
    public final inp f19915c;
    /* renamed from: d */
    public final bhl f19916d;
    /* renamed from: e */
    public final Executor f19917e;
    /* renamed from: f */
    public final gtf f19918f;
    /* renamed from: g */
    public final ilp f19919g;
    /* renamed from: h */
    public final ilp f19920h;
    /* renamed from: i */
    public final ilp f19921i;
    /* renamed from: j */
    public final kbg f19922j;
    /* renamed from: k */
    public final bhy f19923k;
    /* renamed from: l */
    public final bic f19924l;
    /* renamed from: m */
    public final Surface f19925m;
    /* renamed from: n */
    public final iqt f19926n;
    /* renamed from: o */
    public bhj f19927o;
    /* renamed from: p */
    public bhs f19928p;
    /* renamed from: q */
    public bgb f19929q;
    /* renamed from: r */
    public bey f19930r = bey.READY;
    /* renamed from: s */
    public final Object f19931s = new Object();
    /* renamed from: t */
    public final Runnable f19932t = new ben(this);
    /* renamed from: u */
    private final bdz f19933u;
    /* renamed from: v */
    private final iou f19934v;
    /* renamed from: w */
    private final ilp f19935w;
    /* renamed from: x */
    private final fiw f19936x;
    /* renamed from: y */
    private kpk f19937y = kow.m13617a(null);
    /* renamed from: z */
    private kpk f19938z;

    public bem(bdz bdz, bhe bhe, inp inp, bhl bhl, Executor executor, gtf gtf, iou iou, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, kbg kbg, bhy bhy, bic bic, Surface surface, iqt iqt, bhj bhj, bhs bhs, ios ios, fiw fiw) {
        this.f19933u = bdz;
        this.f19914b = bhe;
        this.f19915c = inp;
        this.f19916d = bhl;
        this.f19917e = executor;
        this.f19918f = gtf;
        this.f19934v = iou;
        this.f19919g = ilp;
        this.f19920h = ilp3;
        this.f19935w = ilp4;
        this.f19921i = ilp5;
        this.f19922j = kbg;
        this.f19923k = bhy;
        this.f19924l = bic;
        this.f19925m = surface;
        this.f19926n = iqt;
        this.f19927o = bhj;
        this.f19928p = bhs;
        this.f19936x = fiw;
        this.f19938z = kow.m13617a((Object) ios);
        this.f19913A.mo1879a(bhy);
        this.f19913A.mo1879a(ilp.mo2859a(new beo(this), executor));
        this.f19913A.mo1879a(ilp2.mo2859a(new beq(this), executor));
        this.f19913A.mo1879a(this.f19920h.mo2859a(new ber(this), this.f19917e));
        this.f19913A.mo1879a(ilp5.mo2859a(new bes(this), this.f19917e));
    }

    /* renamed from: a */
    public final iqo mo1879a(iqo iqo) {
        return this.f19913A.mo1879a(iqo);
    }

    public final void close() {
        synchronized (this.f19931s) {
            if (this.f19930r.equals(bey.CLOSED)) {
                bli.m866b(f19912a, "Session has been closed");
                return;
            }
            this.f19930r = bey.CLOSED;
            bli.m871d(f19912a, "close");
            bgb bgb = this.f19929q;
            if (bgb != null) {
                bgb.m14833n();
            }
            this.f19938z.cancel(true);
            this.f19937y.cancel(true);
            if (this.f19927o != null) {
                bli.m863a(f19912a, "requestProcessor is empty this happens when we try to create a session after the cameraDeviceProxy is closed.");
                this.f19927o.close();
            }
            ios h = m14772h();
            if (h != null) {
                h.close();
            }
            this.f19933u.mo2680a();
            this.f19924l.close();
            this.f19913A.close();
        }
    }

    /* renamed from: b */
    public final ikb mo1880b() {
        return this.f19913A.mo1880b();
    }

    /* renamed from: a */
    public final inp mo2658a() {
        return this.f19915c;
    }

    /* renamed from: h */
    private final ios m14772h() {
        ios ios;
        synchronized (this.f19931s) {
            try {
                ios = (ios) this.f19938z.get();
            } catch (InterruptedException e) {
                Object e2 = e;
                String str = f19912a;
                String valueOf = String.valueOf(e2);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                stringBuilder.append("fail to get futureVideoRecorder: ");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
                ios = null;
            } catch (ExecutionException e3) {
                e2 = e3;
                String str2 = f19912a;
                String valueOf2 = String.valueOf(e2);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                stringBuilder2.append("fail to get futureVideoRecorder: ");
                stringBuilder2.append(valueOf2);
                bli.m866b(str2, stringBuilder2.toString());
                ios = null;
            } catch (Throwable e4) {
                bli.m867b(f19912a, "get VideoRecorder canceled because session is closed", e4);
                ios = null;
            }
        }
        return ios;
    }

    /* renamed from: c */
    public final void mo2661c() {
        synchronized (this.f19931s) {
            bgb bgb = this.f19929q;
            if (bgb != null) {
                bgb.mo2661c();
            }
        }
    }

    /* renamed from: d */
    public final void mo2662d() {
        synchronized (this.f19931s) {
            bgb bgb = this.f19929q;
            if (bgb != null) {
                bgb.mo2662d();
            }
        }
    }

    /* renamed from: e */
    public final void mo2663e() {
        synchronized (this.f19931s) {
            bgb bgb = this.f19929q;
            if (bgb != null) {
                bgb.mo2663e();
            }
        }
    }

    /* renamed from: f */
    public final void mo2664f() {
        synchronized (this.f19931s) {
            bgb bgb = this.f19929q;
            if (bgb != null) {
                bgb.mo2664f();
            }
        }
    }

    /* renamed from: g */
    public final kpk mo2665g() {
        kpk a;
        synchronized (this.f19931s) {
            if (this.f19930r.equals(bey.CLOSED)) {
                a = kow.m13617a(null);
            } else {
                boolean z;
                jri.m13143a(this.f19930r.equals(bey.RECORDING));
                this.f19930r = bey.READY;
                if (this.f19929q != null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13143a(z);
                this.f19929q = null;
                a = m14773i();
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo2660a(long j, long j2) {
        synchronized (this.f19931s) {
        }
    }

    /* renamed from: i */
    private final kpk m14773i() {
        kpk a;
        kpk d = kpw.m18056d();
        synchronized (this.f19931s) {
            this.f19937y = d;
            this.f19938z = this.f19934v.m12341a();
        }
        if (this.f19934v.f18470o.mo2084b()) {
            bli.m863a(f19912a, "resetSession");
            a = kow.m13617a(this.f19927o);
        } else {
            synchronized (this.f19931s) {
                a = kny.m18046a(this.f19938z, new bew(this), kpq.f8410a);
            }
        }
        kow.m13622a(kny.m18046a(a, new bex(this), kpq.f8410a), new bep(this, d), kpq.f8410a);
        return d;
    }

    /* renamed from: a */
    public final kpk mo2659a(bfs bfs) {
        kpk a;
        synchronized (this.f19931s) {
            String str;
            StringBuilder stringBuilder;
            if (this.f19930r.equals(bey.READY)) {
                jri.m13143a(this.f19930r.equals(bey.READY));
                this.f19930r = bey.STARTING_RECORD;
                Object h = m14772h();
                jri.m13152b(h);
                if (h.f18449h != ((Integer) this.f19935w.mo2860b()).intValue()) {
                    if (kbg.m4744b(h.f18444c).mo2084b()) {
                        File file = (File) kbg.m4744b(h.f18444c).mo2081a();
                        if (!file.delete()) {
                            str = f19912a;
                            String valueOf = String.valueOf(file);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                            stringBuilder.append("Failed to delete recording file: ");
                            stringBuilder.append(valueOf);
                            bli.m866b(str, stringBuilder.toString());
                        }
                    }
                    m14773i();
                }
                a = iel.m3716a(iel.m3716a(iel.m3716a(this.f19937y, this.f19938z, new bet(this)), this.f19938z, new beu(this)), this.f19938z, new bev(this, bfs));
            } else {
                str = String.valueOf(this.f19930r);
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
        synchronized (this.f19931s) {
            if (this.f19930r == bey.RECORDING) {
                jri.m13152b(this.f19929q);
                a = this.f19929q.mo363a(asw);
            } else if (this.f19930r != bey.READY) {
                String str = f19912a;
                String valueOf = String.valueOf(this.f19930r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                stringBuilder.append("Ignore observableActiveFocusPoint callback: state=");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
                a = new atl();
            } else {
                bli.m863a(f19912a, "triggerAfScan");
                asw asw2 = asw;
                a = this.f19914b.mo440a(this.f19927o, this.f19928p, false, asw2, Arrays.asList(new Surface[]{this.f19925m}), this.f19932t);
            }
        }
        return a;
    }
}
