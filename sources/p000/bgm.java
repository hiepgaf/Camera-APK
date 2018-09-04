package p000;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgm */
final class bgm implements bdz, bfe {
    /* renamed from: a */
    public static final String f20018a = bli.m862a("CodecCdrDev");
    /* renamed from: b */
    public final inp f20019b;
    /* renamed from: c */
    public final Executor f20020c;
    /* renamed from: d */
    public final gtf f20021d;
    /* renamed from: e */
    public final ijx f20022e;
    /* renamed from: f */
    public final iou f20023f;
    /* renamed from: g */
    public final ilp f20024g;
    /* renamed from: h */
    public final ilp f20025h;
    /* renamed from: i */
    public kbg f20026i = kau.f19138a;
    /* renamed from: j */
    public bhy f20027j;
    /* renamed from: k */
    public final fcm f20028k;
    /* renamed from: l */
    public final ird f20029l;
    /* renamed from: m */
    public final Object f20030m = new Object();
    /* renamed from: n */
    public bdy f20031n;
    /* renamed from: o */
    public boolean f20032o = false;
    /* renamed from: p */
    private final inc f20033p;
    /* renamed from: q */
    private final iur f20034q;
    /* renamed from: r */
    private final Handler f20035r;
    /* renamed from: s */
    private final bjx f20036s;
    /* renamed from: t */
    private final bff f20037t;
    /* renamed from: u */
    private final bij f20038u;
    /* renamed from: v */
    private final kbg f20039v;
    /* renamed from: w */
    private ios f20040w;
    /* renamed from: x */
    private boolean f20041x = true;

    public bgm(inc inc, inp inp, iur iur, Executor executor, gtf gtf, Handler handler, ijx ijx, iou iou, ilp ilp, ilp ilp2, bjx bjx, bff bff, ios ios, bij bij, kbg kbg, ird ird) {
        this.f20033p = inc;
        this.f20019b = inp;
        this.f20034q = iur;
        this.f20020c = executor;
        this.f20021d = gtf;
        this.f20022e = ijx;
        this.f20023f = iou;
        this.f20024g = ilp;
        this.f20025h = ilp2;
        this.f20037t = bff;
        this.f20040w = ios;
        this.f20038u = bij;
        this.f20036s = bjx;
        this.f20035r = handler;
        this.f20039v = kbg;
        this.f20029l = ird;
        this.f20028k = new fcm();
    }

    public final void close() {
        synchronized (this.f20030m) {
            if (this.f20032o) {
                bli.m866b(f20018a, "close() is called twice");
                return;
            }
            bli.m869c(f20018a, "close()");
            this.f20032o = true;
            bdy bdy = this.f20031n;
            if (bdy != null) {
                bdy.close();
            }
            this.f20023f.close();
            ios ios = this.f20040w;
            if (ios != null) {
                ios.close();
            }
            if (this.f20026i.mo2084b()) {
                ((bjw) this.f20026i.mo2081a()).close();
            }
            bhy bhy = this.f20027j;
            if (bhy != null) {
                bhy.close();
            }
            this.f20037t.mo2669a(this.f20034q);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.kpk mo2679a(p000.iwl r33, p000.ilp r34, p000.ilp r35, p000.ilp r36, p000.ilp r37, p000.iqt r38, android.view.Surface r39, p000.ffc r40, p000.ilp r41, p000.ilp r42, p000.ilp r43, p000.ilp r44, p000.ilp r45, p000.kbg r46, p000.imw r47, p000.kwk r48) {
        /*
        r32 = this;
        r0 = r32;
        r3 = r0.f20030m;
        monitor-enter(r3);
        r2 = f20018a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice.createCaptureSession()";
        p000.bli.m869c(r2, r4);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f20032o;	 Catch:{ all -> 0x0036 }
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = f20018a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice has been closed.";
        p000.bli.m866b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f19138a;	 Catch:{ all -> 0x0036 }
        r11 = p000.kow.m13617a(r2);	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
    L_0x0020:
        return r11;
    L_0x0021:
        r0 = r32;
        r4 = r0.f20041x;	 Catch:{ all -> 0x0036 }
        if (r4 != 0) goto L_0x0039;
    L_0x0027:
        r2 = f20018a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice can only createCaptureSession() once.";
        p000.bli.m866b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f19138a;	 Catch:{ all -> 0x0036 }
        r11 = p000.kow.m13617a(r2);	 Catch:{ all -> 0x0036 }
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
        r2 = r0.f20041x;	 Catch:{ all -> 0x0036 }
        p000.jri.m13153b(r2);	 Catch:{ all -> 0x0036 }
        r2 = 0;
        r0 = r32;
        r0.f20041x = r2;	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r0 = r0.f20040w;	 Catch:{ all -> 0x0036 }
        r20 = r0;
        r2 = 0;
        r0 = r32;
        r0.f20040w = r2;	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f20033p;
        r2 = r2.m3875c();
        if (r2 == 0) goto L_0x0269;
    L_0x0060:
        r26 = new bho;
        r0 = r32;
        r2 = r0.f20022e;
        r0 = r26;
        r1 = r33;
        r0.<init>(r1, r2);
    L_0x006d:
        r2 = new ilb;
        r3 = new fzd;
        r4 = r40.mo1932n();
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r3.<init>(r4, r5);
        r2.<init>(r3);
        r18 = new ilb;
        r3 = p000.fdp.m10231a();
        r0 = r18;
        r0.<init>(r3);
        r19 = new ilb;
        r3 = p000.fdp.m10231a();
        r0 = r19;
        r0.<init>(r3);
        r4 = new fbu;
        r0 = r18;
        r4.<init>(r0, r2);
        r5 = new fch;
        r0 = r19;
        r5.<init>(r0, r2);
        r2 = r40.mo1923e();
        r3 = f20018a;
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
        r3 = r0.f20038u;
        r2 = r3.mo458a(r2);
        r0 = r32;
        r3 = r0.f20038u;
        r6 = r40.mo1921c();
        r6 = r3.mo459a(r6);
        r7 = new android.util.Range;
        r0 = r32;
        r3 = r0.f20033p;
        r3 = r3.f7142f;
        r3 = java.lang.Integer.valueOf(r3);
        r7.<init>(r3, r3);
        r0 = r32;
        r3 = r0.f20033p;
        r3 = r3.m3875c();
        if (r3 == 0) goto L_0x025e;
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
        r10 = r0.f20024g;
        r6 = r41;
        r7 = r42;
        r9 = r44;
        r12 = r47;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = r32;
        r3 = r0.f20033p;
        r3 = r3.m3875c();
        if (r3 == 0) goto L_0x0256;
    L_0x012f:
        r3 = new bhw;
        r3.<init>();
        r5 = r3;
    L_0x0135:
        r3 = new bhy;
        r0 = r32;
        r4 = r0.f20022e;
        r3.<init>(r2, r5, r4);
        r0 = r32;
        r0.f20027j = r3;
        if (r20 == 0) goto L_0x0253;
    L_0x0144:
        r3 = 1;
    L_0x0145:
        p000.jri.m13153b(r3);
        r3 = r20.m12335a();
        r3 = r3.mo2084b();
        p000.jri.m13143a(r3);
        r3 = r20.m12335a();
        r3 = r3.mo2081a();
        r3 = (android.view.Surface) r3;
        r4 = r46.mo2084b();
        if (r4 == 0) goto L_0x0192;
    L_0x0163:
        r0 = r32;
        r9 = r0.f20036s;
        r0 = r32;
        r11 = r0.f20039v;
        r0 = r32;
        r12 = r0.f20024g;
        r15 = r46.mo2081a();
        r15 = (p000.iqp) r15;
        r0 = r32;
        r0 = r0.f20035r;
        r16 = r0;
        r0 = r32;
        r0 = r0.f20022e;
        r17 = r0;
        r10 = r2;
        r13 = r45;
        r14 = r37;
        r4 = r9.m844a(r10, r11, r12, r13, r14, r15, r16, r17);
        r4 = p000.kbg.m4745c(r4);
        r0 = r32;
        r0.f20026i = r4;
    L_0x0192:
        r4 = p000.kau.f19138a;
        r0 = r32;
        r6 = r0.f20026i;
        r6 = r6.mo2084b();
        if (r6 == 0) goto L_0x0250;
    L_0x019e:
        r0 = r32;
        r4 = r0.f20026i;
        r4 = r4.mo2081a();
        r4 = (p000.bjw) r4;
        r4 = r4.mo2686a();
        r4 = p000.kbg.m4745c(r4);
        r6 = r4;
    L_0x01b1:
        r4 = new fdw;
        r7 = r40.mo1933o();
        r4.<init>(r7);
        r7 = new fdu;
        r7.<init>(r4);
        r4 = r47.mo1887d();
        if (r4 == 0) goto L_0x0244;
    L_0x01c5:
        r31 = new aue;
        r0 = r32;
        r4 = r0.f20028k;
        r0 = r31;
        r0.<init>(r4, r7);
    L_0x01d0:
        r13 = new bhs;
        r4 = r20.m12335a();
        r4 = r4.mo2081a();
        r4 = (android.view.Surface) r4;
        r0 = r38;
        r1 = r31;
        r13.<init>(r4, r0, r1);
        r0 = r32;
        r4 = r0.f20029l;
        r7 = f20018a;
        r7 = java.lang.String.valueOf(r7);
        r9 = "#createCameraCaptureSession";
        r7 = r7.concat(r9);
        r4.mo1903a(r7);
        r4 = p000.kau.f19138a;
        r0 = r26;
        r1 = r39;
        r3 = r0.mo448a(r1, r3, r6, r4);
        r0 = r32;
        r4 = r0.f20029l;
        r4.mo1904b();
        r4 = new bgn;
        r0 = r32;
        r1 = r39;
        r4.<init>(r0, r1, r13);
        r6 = p000.kpq.f8410a;
        r3 = p000.kny.m18046a(r3, r4, r6);
        r11 = p000.kpw.m18056d();
        r9 = new bgo;
        r10 = r32;
        r12 = r20;
        r14 = r2;
        r15 = r5;
        r16 = r39;
        r17 = r40;
        r20 = r42;
        r21 = r47;
        r22 = r41;
        r23 = r43;
        r24 = r8;
        r25 = r48;
        r27 = r34;
        r28 = r35;
        r29 = r36;
        r30 = r38;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
        r2 = p000.kpq.f8410a;
        p000.kow.m13622a(r3, r9, r2);
        goto L_0x0020;
    L_0x0244:
        r31 = new auv;
        r0 = r32;
        r4 = r0.f20028k;
        r0 = r31;
        r0.<init>(r4, r7);
        goto L_0x01d0;
    L_0x0250:
        r6 = r4;
        goto L_0x01b1;
    L_0x0253:
        r3 = 0;
        goto L_0x0145;
    L_0x0256:
        r3 = new bhv;
        r3.<init>();
        r5 = r3;
        goto L_0x0135;
    L_0x025e:
        r3 = new bgu;
        r0 = r32;
        r2 = r0.f20019b;
        r3.<init>(r2);
        goto L_0x0104;
    L_0x0269:
        r26 = new bhm;
        r0 = r32;
        r2 = r0.f20022e;
        r0 = r26;
        r1 = r33;
        r0.<init>(r1, r2);
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgm.a(iwl, ilp, ilp, ilp, ilp, iqt, android.view.Surface, ffc, ilp, ilp, ilp, ilp, ilp, kbg, imw, kwk):kpk");
    }

    /* renamed from: b */
    public final ilp mo2681b() {
        fcm fcm = this.f20028k;
        if (fcm == null) {
            return ilq.m3818a(new fco(fcl.m2252a(), fcl.m2252a()));
        }
        return fcm.f15862a;
    }

    /* renamed from: a */
    final /* synthetic */ kpk m14834a(Surface surface, bhs bhs, bhj bhj) {
        kpk a;
        synchronized (this.f20030m) {
            bli.m869c(f20018a, "CamcorderRequestProcessor-creation task is done successfully.");
            this.f20029l.mo1903a(String.valueOf(f20018a).concat("#startPreview"));
            a = this.f20027j.m7404a(bhj, surface, bhs);
            this.f20029l.mo1904b();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo2680a() {
        synchronized (this.f20030m) {
            jri.m13152b(this.f20031n);
            this.f20031n = null;
        }
    }
}
