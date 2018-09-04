package p000;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgp */
final class bgp implements bdz, bfe {
    /* renamed from: a */
    public static final String f20042a = bli.m862a("CdrDevFast");
    /* renamed from: b */
    public final inp f20043b;
    /* renamed from: c */
    public final Executor f20044c;
    /* renamed from: d */
    public final gtf f20045d;
    /* renamed from: e */
    public final ijx f20046e;
    /* renamed from: f */
    public final biq f20047f;
    /* renamed from: g */
    public final ilp f20048g;
    /* renamed from: h */
    public final ilp f20049h;
    /* renamed from: i */
    public kbg f20050i = kau.f19138a;
    /* renamed from: j */
    public bhy f20051j;
    /* renamed from: k */
    public final fcm f20052k;
    /* renamed from: l */
    public final ird f20053l;
    /* renamed from: m */
    public final Object f20054m = new Object();
    /* renamed from: n */
    public bdy f20055n;
    /* renamed from: o */
    public boolean f20056o = false;
    /* renamed from: p */
    private final inc f20057p;
    /* renamed from: q */
    private final iur f20058q;
    /* renamed from: r */
    private final Handler f20059r;
    /* renamed from: s */
    private final bjx f20060s;
    /* renamed from: t */
    private final bff f20061t;
    /* renamed from: u */
    private final bij f20062u;
    /* renamed from: v */
    private final kbg f20063v;
    /* renamed from: w */
    private biw f20064w;
    /* renamed from: x */
    private boolean f20065x = true;

    public bgp(inc inc, inp inp, iur iur, Executor executor, gtf gtf, Handler handler, ijx ijx, biq biq, ilp ilp, ilp ilp2, bjx bjx, bff bff, biw biw, bij bij, kbg kbg, ird ird) {
        this.f20057p = inc;
        this.f20043b = inp;
        this.f20058q = iur;
        this.f20044c = executor;
        this.f20045d = gtf;
        this.f20046e = ijx;
        this.f20047f = biq;
        this.f20048g = ilp;
        this.f20049h = ilp2;
        this.f20061t = bff;
        this.f20064w = biw;
        this.f20062u = bij;
        this.f20060s = bjx;
        this.f20059r = handler;
        this.f20063v = kbg;
        this.f20053l = ird;
        this.f20052k = new fcm();
    }

    public final void close() {
        synchronized (this.f20054m) {
            if (this.f20056o) {
                bli.m866b(f20042a, "close() is called twice");
                return;
            }
            bli.m869c(f20042a, "close()");
            this.f20056o = true;
            bdy bdy = this.f20055n;
            if (bdy != null) {
                bdy.close();
            }
            this.f20047f.close();
            if (this.f20050i.mo2084b()) {
                ((bjw) this.f20050i.mo2081a()).close();
            }
            bhy bhy = this.f20051j;
            if (bhy != null) {
                bhy.close();
            }
            this.f20061t.mo2669a(this.f20058q);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.kpk mo2679a(p000.iwl r33, p000.ilp r34, p000.ilp r35, p000.ilp r36, p000.ilp r37, p000.iqt r38, android.view.Surface r39, p000.ffc r40, p000.ilp r41, p000.ilp r42, p000.ilp r43, p000.ilp r44, p000.ilp r45, p000.kbg r46, p000.imw r47, p000.kwk r48) {
        /*
        r32 = this;
        r0 = r32;
        r3 = r0.f20054m;
        monitor-enter(r3);
        r2 = f20042a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice.createCaptureSession()";
        p000.bli.m869c(r2, r4);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f20056o;	 Catch:{ all -> 0x0036 }
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = f20042a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice has been closed.";
        p000.bli.m866b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f19138a;	 Catch:{ all -> 0x0036 }
        r31 = p000.kow.m13617a(r2);	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
    L_0x0020:
        return r31;
    L_0x0021:
        r0 = r32;
        r4 = r0.f20065x;	 Catch:{ all -> 0x0036 }
        if (r4 != 0) goto L_0x0039;
    L_0x0027:
        r2 = f20042a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice can only createCaptureSession() once.";
        p000.bli.m866b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f19138a;	 Catch:{ all -> 0x0036 }
        r31 = p000.kow.m13617a(r2);	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        goto L_0x0020;
    L_0x0036:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        throw r2;
    L_0x0039:
        r2 = r2 ^ 1;
        p000.jri.m13153b(r2);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f20065x;	 Catch:{ all -> 0x0036 }
        p000.jri.m13153b(r2);	 Catch:{ all -> 0x0036 }
        r2 = 0;
        r0 = r32;
        r0.f20065x = r2;	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r0 = r0.f20064w;	 Catch:{ all -> 0x0036 }
        r19 = r0;
        r2 = 0;
        r0 = r32;
        r0.f20064w = r2;	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f20057p;
        r2 = r2.m3875c();
        if (r2 == 0) goto L_0x0295;
    L_0x0060:
        r25 = new bho;
        r0 = r32;
        r2 = r0.f20046e;
        r0 = r25;
        r1 = r33;
        r0.<init>(r1, r2);
    L_0x006d:
        r2 = new ilb;
        r3 = new fzd;
        r4 = r40.mo1932n();
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r3.<init>(r4, r5);
        r2.<init>(r3);
        r20 = new ilb;
        r3 = p000.fdp.m10231a();
        r0 = r20;
        r0.<init>(r3);
        r18 = new ilb;
        r3 = p000.fdp.m10231a();
        r0 = r18;
        r0.<init>(r3);
        r4 = new fbu;
        r0 = r20;
        r4.<init>(r0, r2);
        r5 = new fch;
        r0 = r18;
        r5.<init>(r0, r2);
        r2 = r40.mo1923e();
        r3 = f20042a;
        r6 = java.lang.String.valueOf(r2);
        r7 = java.lang.String.valueOf(r6);
        r7 = r7.length();
        r8 = new java.lang.StringBuilder;
        r7 = r7 + 32;
        r8.<init>(r7);
        r7 = "available AE target FPS ranges: ";
        r8.append(r7);
        r8.append(r6);
        r6 = r8.toString();
        p000.bli.m871d(r3, r6);
        r3 = r2.isEmpty();
        r3 = r3 ^ 1;
        p000.jri.m13153b(r3);
        r0 = r32;
        r3 = r0.f20062u;
        r2 = r3.mo458a(r2);
        r0 = r32;
        r3 = r0.f20062u;
        r6 = r40.mo1921c();
        r6 = r3.mo459a(r6);
        r7 = new android.util.Range;
        r0 = r32;
        r3 = r0.f20057p;
        r3 = r3.f7142f;
        r3 = java.lang.Integer.valueOf(r3);
        r7.<init>(r3, r3);
        r0 = r32;
        r3 = r0.f20057p;
        r3 = r3.m3875c();
        if (r3 == 0) goto L_0x028a;
    L_0x00ff:
        r3 = new bgv;
        r3.<init>(r7, r2, r6);
    L_0x0104:
        r11 = new fze;
        r0 = r45;
        r1 = r40;
        r11.<init>(r0, r1);
        r8 = new ilb;
        r2 = java.lang.Boolean.TRUE;
        r8.<init>(r2);
        r2 = new bhr;
        r0 = r32;
        r10 = r0.f20048g;
        r6 = r41;
        r7 = r42;
        r9 = r44;
        r12 = r47;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = r32;
        r3 = r0.f20057p;
        r3 = r3.m3875c();
        if (r3 == 0) goto L_0x0282;
    L_0x012f:
        r3 = new bhw;
        r3.<init>();
        r4 = r3;
    L_0x0135:
        r3 = new bhy;
        r0 = r32;
        r5 = r0.f20046e;
        r3.<init>(r2, r4, r5);
        r0 = r32;
        r0.f20051j = r3;
        if (r19 == 0) goto L_0x027f;
    L_0x0144:
        r3 = 1;
    L_0x0145:
        p000.jri.m13153b(r3);
        r5 = r19.mo465d();
        r3 = r46.mo2084b();
        if (r3 == 0) goto L_0x0181;
    L_0x0152:
        r0 = r32;
        r9 = r0.f20060s;
        r0 = r32;
        r11 = r0.f20063v;
        r0 = r32;
        r12 = r0.f20048g;
        r15 = r46.mo2081a();
        r15 = (p000.iqp) r15;
        r0 = r32;
        r0 = r0.f20059r;
        r16 = r0;
        r0 = r32;
        r0 = r0.f20046e;
        r17 = r0;
        r10 = r2;
        r13 = r45;
        r14 = r37;
        r3 = r9.m844a(r10, r11, r12, r13, r14, r15, r16, r17);
        r3 = p000.kbg.m4745c(r3);
        r0 = r32;
        r0.f20050i = r3;
    L_0x0181:
        r3 = p000.kau.f19138a;
        r0 = r32;
        r6 = r0.f20050i;
        r6 = r6.mo2084b();
        if (r6 == 0) goto L_0x019f;
    L_0x018d:
        r0 = r32;
        r3 = r0.f20050i;
        r3 = r3.mo2081a();
        r3 = (p000.bjw) r3;
        r3 = r3.mo2686a();
        r3 = p000.kbg.m4745c(r3);
    L_0x019f:
        r6 = new fdw;
        r7 = r40.mo1933o();
        r6.<init>(r7);
        r7 = new fdu;
        r7.<init>(r6);
        r6 = r47.mo1887d();
        if (r6 == 0) goto L_0x0272;
    L_0x01b3:
        r30 = new aue;
        r0 = r32;
        r6 = r0.f20052k;
        r0 = r30;
        r0.<init>(r6, r7);
    L_0x01be:
        r12 = new bhs;
        r6 = r19.mo465d();
        r0 = r38;
        r1 = r30;
        r12.<init>(r6, r0, r1);
        r6 = 3;
        r0 = r33;
        r6 = r0.mo2986a(r6);	 Catch:{ isr -> 0x02a4 }
        r7 = r2.f1162d;	 Catch:{ isr -> 0x02a4 }
        r7 = r7.mo1884a();	 Catch:{ isr -> 0x02a4 }
        if (r7 == 0) goto L_0x0209;
    L_0x01da:
        r7 = r2.f1160b;	 Catch:{ isr -> 0x02a4 }
        r7 = r7.mo437b();	 Catch:{ isr -> 0x02a4 }
        r9 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;	 Catch:{ isr -> 0x02a4 }
        r6.m4292a(r9, r7);	 Catch:{ isr -> 0x02a4 }
        r9 = p000.bhr.f1159a;	 Catch:{ isr -> 0x02a4 }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ isr -> 0x02a4 }
        r10 = java.lang.String.valueOf(r7);	 Catch:{ isr -> 0x02a4 }
        r10 = r10.length();	 Catch:{ isr -> 0x02a4 }
        r11 = new java.lang.StringBuilder;	 Catch:{ isr -> 0x02a4 }
        r10 = r10 + 28;
        r11.<init>(r10);	 Catch:{ isr -> 0x02a4 }
        r10 = "CONTROL_AE_TARGET_FPS_RANGE=";
        r11.append(r10);	 Catch:{ isr -> 0x02a4 }
        r11.append(r7);	 Catch:{ isr -> 0x02a4 }
        r7 = r11.toString();	 Catch:{ isr -> 0x02a4 }
        p000.bli.m871d(r9, r7);	 Catch:{ isr -> 0x02a4 }
    L_0x0209:
        r0 = r32;
        r7 = r0.f20053l;
        r9 = f20042a;
        r9 = java.lang.String.valueOf(r9);
        r10 = "#createCameraCaptureSession";
        r9 = r9.concat(r10);
        r7.mo1903a(r9);
        r6 = r6.m4291a();
        r6 = p000.kbg.m4745c(r6);
        r0 = r25;
        r1 = r39;
        r3 = r0.mo448a(r1, r5, r3, r6);
        r0 = r32;
        r5 = r0.f20053l;
        r5.mo1904b();
        r5 = new bgq;
        r0 = r32;
        r1 = r39;
        r5.<init>(r0, r1, r12);
        r6 = p000.kpq.f8410a;
        r3 = p000.kny.m18046a(r3, r5, r6);
        r31 = p000.kpw.m18056d();
        r9 = new bgr;
        r10 = r32;
        r11 = r19;
        r13 = r2;
        r14 = r4;
        r15 = r39;
        r16 = r40;
        r17 = r20;
        r19 = r42;
        r20 = r47;
        r21 = r41;
        r22 = r43;
        r23 = r8;
        r24 = r48;
        r26 = r34;
        r27 = r35;
        r28 = r36;
        r29 = r38;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
        r2 = p000.kpq.f8410a;
        p000.kow.m13622a(r3, r9, r2);
        goto L_0x0020;
    L_0x0272:
        r30 = new auv;
        r0 = r32;
        r6 = r0.f20052k;
        r0 = r30;
        r0.<init>(r6, r7);
        goto L_0x01be;
    L_0x027f:
        r3 = 0;
        goto L_0x0145;
    L_0x0282:
        r3 = new bhv;
        r3.<init>();
        r4 = r3;
        goto L_0x0135;
    L_0x028a:
        r3 = new bgu;
        r0 = r32;
        r2 = r0.f20043b;
        r3.<init>(r2);
        goto L_0x0104;
    L_0x0295:
        r25 = new bhm;
        r0 = r32;
        r2 = r0.f20046e;
        r0 = r25;
        r1 = r33;
        r0.<init>(r1, r2);
        goto L_0x006d;
    L_0x02a4:
        r2 = move-exception;
        r3 = f20042a;
        r4 = "Unable to create session params";
        p000.bli.m867b(r3, r4, r2);
        r31 = p000.kow.m13618a(r2);
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgp.a(iwl, ilp, ilp, ilp, ilp, iqt, android.view.Surface, ffc, ilp, ilp, ilp, ilp, ilp, kbg, imw, kwk):kpk");
    }

    /* renamed from: b */
    public final ilp mo2681b() {
        fcm fcm = this.f20052k;
        if (fcm == null) {
            return ilq.m3818a(new fco(fcl.m2252a(), fcl.m2252a()));
        }
        return fcm.f15862a;
    }

    /* renamed from: a */
    final /* synthetic */ kpk m14838a(Surface surface, bhs bhs, bhj bhj) {
        kpk a;
        synchronized (this.f20054m) {
            bli.m869c(f20042a, "CamcorderRequestProcessor-creation task is done successfully.");
            this.f20053l.mo1903a(String.valueOf(f20042a).concat("#startPreview"));
            a = this.f20051j.m7404a(bhj, surface, bhs);
            this.f20053l.mo1904b();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo2680a() {
        synchronized (this.f20054m) {
            jri.m13152b(this.f20055n);
            this.f20055n = null;
        }
    }
}
