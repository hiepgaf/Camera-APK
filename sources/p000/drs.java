package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: drs */
public final class drs implements fwl {
    /* renamed from: a */
    public final dqp f14319a;
    /* renamed from: b */
    private final iqz f14320b;
    /* renamed from: c */
    private final ird f14321c;
    /* renamed from: d */
    private final fjk f14322d;
    /* renamed from: e */
    private final fhg f14323e;
    /* renamed from: f */
    private final kpk f14324f;
    /* renamed from: g */
    private final kpk f14325g;
    /* renamed from: h */
    private final ilp f14326h;
    /* renamed from: i */
    private final fel f14327i;
    /* renamed from: j */
    private final fde f14328j;
    /* renamed from: k */
    private final fdg f14329k;
    /* renamed from: l */
    private final fuw f14330l;
    /* renamed from: m */
    private final int f14331m = 1;
    /* renamed from: n */
    private final int f14332n;

    /* renamed from: a */
    private static /* synthetic */ void m9297a(Throwable th, fdf fdf) {
        if (th != null) {
            try {
                fdf.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fdf.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9298a(Throwable th, fhh fhh) {
        if (th != null) {
            try {
                fhh.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fhh.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9299a(Throwable th, fjj fjj) {
        if (th != null) {
            try {
                fjj.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fjj.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9300a(Throwable th, fjl fjl) {
        if (th != null) {
            try {
                fjl.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fjl.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9301a(Throwable th, fux fux) {
        if (th != null) {
            try {
                fux.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fux.close();
    }

    public drs(ird ird, ira ira, dqp dqp, fjk fjk, fhg fhg, kpk kpk, kpk kpk2, fdg fdg, fde fde, fuw fuw, fel fel, int i) {
        this.f14321c = ird;
        this.f14319a = dqp;
        this.f14322d = fjk;
        this.f14323e = fhg;
        this.f14324f = kpk;
        this.f14328j = fde;
        this.f14329k = fdg;
        this.f14330l = fuw;
        this.f14332n = i;
        this.f14325g = kpk2;
        this.f14327i = fel;
        this.f14320b = ira.mo511a("CnvrgdCaptureCmd");
        this.f14326h = ilq.m3834b(fhg.mo1383b(), fuw.mo405a(), ilq.m3832b(fjk.mo1400b(), Integer.valueOf(1)));
    }

    /* renamed from: a */
    private final fim m9296a(fim fim) {
        return new fio(fim).m2307a(new drt(this)).m2301a();
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14326h;
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        if (hsy.f6600a != null) {
            return ilq.m3818a(fds.m10238a(new fin(hsy.f6600a, Integer.valueOf(0))));
        }
        return ilq.m3818a(fds.m10234a());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo1171a(p000.fwm r20, p000.fwa r21) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r0.f14320b;
        r2 = "Executing converged capture command.";
        r1.mo518d(r2);
        r0 = r19;
        r1 = r0.f14321c;
        r2 = "ConvergedImageCaptureCommand";
        r1.mo1903a(r2);
        r0 = r19;
        r1 = r0.f14321c;
        r2 = "AcquireFrameServerSession";
        r1.mo1903a(r2);
        r0 = r19;
        r1 = r0.f14323e;	 Catch:{ all -> 0x00e4 }
        r5 = r1.mo1382a();	 Catch:{ all -> 0x00e4 }
        r0 = r19;
        r1 = r0.f14325g;	 Catch:{ all -> 0x00db }
        r1 = p000.isr.m4143a(r1);	 Catch:{ all -> 0x00db }
        r1 = (p000.ilp) r1;	 Catch:{ all -> 0x00db }
        r1 = r1.mo2860b();	 Catch:{ all -> 0x00db }
        r1 = (p000.fim) r1;	 Catch:{ all -> 0x00db }
        r0 = r19;
        r2 = r0.f14324f;	 Catch:{ all -> 0x00db }
        r2 = p000.isr.m4143a(r2);	 Catch:{ all -> 0x00db }
        r2 = (p000.ffw) r2;	 Catch:{ all -> 0x00db }
        r2 = r2.mo2860b();	 Catch:{ all -> 0x00db }
        r2 = (p000.fim) r2;	 Catch:{ all -> 0x00db }
        r0 = r19;
        r3 = r0.f14327i;	 Catch:{ all -> 0x00db }
        r3 = r3.mo1361a(r5, r2);	 Catch:{ all -> 0x00db }
        r0 = r19;
        r4 = r0.f14327i;	 Catch:{ all -> 0x00db }
        r4 = r4 instanceof p000.gjk;	 Catch:{ all -> 0x00db }
        r0 = r21;
        r6 = r0.f4752a;	 Catch:{ all -> 0x00db }
        r6 = r6.f4452h;	 Catch:{ all -> 0x00db }
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ all -> 0x00db }
        r6.mo348a(r4);	 Catch:{ all -> 0x00db }
        r4 = r3.mo3033a(r1);	 Catch:{ all -> 0x00db }
        r1 = r3.mo3033a(r2);	 Catch:{ all -> 0x00db }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x00db }
        r6.<init>();	 Catch:{ all -> 0x00db }
        r0 = r19;
        r2 = r0.f14321c;	 Catch:{ all -> 0x00db }
        r7 = "3AConvergence";
        r2.mo1905b(r7);	 Catch:{ all -> 0x00db }
        r0 = r19;
        r2 = r0.f14330l;	 Catch:{ all -> 0x00db }
        r0 = r21;
        r7 = r2.mo404a(r0);	 Catch:{ all -> 0x00db }
        r0 = r19;
        r2 = r0.f14322d;	 Catch:{ all -> 0x00d2 }
        r0 = r19;
        r8 = r0.f14331m;	 Catch:{ all -> 0x00d2 }
        r8 = p000.fds.m10244a(r2, r8);	 Catch:{ all -> 0x00d2 }
        r0 = r19;
        r2 = r0.f14328j;	 Catch:{ all -> 0x00c9 }
        r0 = r19;
        r9 = r0.f14329k;	 Catch:{ all -> 0x00c9 }
        r9 = r2.mo1357a(r5, r9, r1);	 Catch:{ all -> 0x00c9 }
        r1 = 0;
    L_0x0097:
        r0 = r19;
        r2 = r0.f14332n;	 Catch:{ all -> 0x00c0 }
        if (r1 >= r2) goto L_0x00fb;
    L_0x009d:
        r0 = r19;
        r2 = r0.f14331m;	 Catch:{ all -> 0x00c0 }
        if (r1 >= r2) goto L_0x00af;
    L_0x00a3:
        r0 = r19;
        r2 = r0.m9296a(r4);	 Catch:{ all -> 0x00c0 }
        r6.add(r2);	 Catch:{ all -> 0x00c0 }
    L_0x00ac:
        r1 = r1 + 1;
        goto L_0x0097;
    L_0x00af:
        r2 = 1;
        r2 = r8.mo3438b(r2);	 Catch:{ all -> 0x00c0 }
        if (r2 == 0) goto L_0x00ac;
    L_0x00b6:
        r0 = r19;
        r2 = r0.m9296a(r4);	 Catch:{ all -> 0x00c0 }
        r6.add(r2);	 Catch:{ all -> 0x00c0 }
        goto L_0x00ac;
    L_0x00c0:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00c2 }
    L_0x00c2:
        r2 = move-exception;
        if (r9 == 0) goto L_0x00c8;
    L_0x00c5:
        p000.drs.m9297a(r1, r9);	 Catch:{ all -> 0x00c9 }
    L_0x00c8:
        throw r2;	 Catch:{ all -> 0x00c9 }
    L_0x00c9:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00cb }
    L_0x00cb:
        r2 = move-exception;
        if (r8 == 0) goto L_0x00d1;
    L_0x00ce:
        p000.drs.m9300a(r1, r8);	 Catch:{ all -> 0x00d2 }
    L_0x00d1:
        throw r2;	 Catch:{ all -> 0x00d2 }
    L_0x00d2:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00d4 }
    L_0x00d4:
        r2 = move-exception;
        if (r7 == 0) goto L_0x00da;
    L_0x00d7:
        p000.drs.m9301a(r1, r7);	 Catch:{ all -> 0x00db }
    L_0x00da:
        throw r2;	 Catch:{ all -> 0x00db }
    L_0x00db:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00dd }
    L_0x00dd:
        r2 = move-exception;
        if (r5 == 0) goto L_0x00e3;
    L_0x00e0:
        p000.drs.m9298a(r1, r5);	 Catch:{ all -> 0x00e4 }
    L_0x00e3:
        throw r2;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r1 = move-exception;
        r0 = r19;
        r2 = r0.f14327i;
        r2.mo1362c();
        r0 = r19;
        r2 = r0.f14321c;
        r2.mo1904b();
        r0 = r19;
        r2 = r0.f14321c;
        r2.mo1904b();
        throw r1;
    L_0x00fb:
        r10 = r6.size();	 Catch:{ all -> 0x00c0 }
        r0 = r19;
        r1 = r0.f14321c;	 Catch:{ all -> 0x00c0 }
        r2 = "ShowExposure";
        r1.mo1905b(r2);	 Catch:{ all -> 0x00c0 }
        r0 = r21;
        r1 = r0.f4754c;	 Catch:{ all -> 0x00c0 }
        r4 = r1.m2406b();	 Catch:{ all -> 0x00c0 }
        r0 = r19;
        r1 = r0.f14321c;	 Catch:{ all -> 0x00c0 }
        r2 = "SubmitBurst";
        r1.mo1905b(r2);	 Catch:{ all -> 0x00c0 }
        r0 = r19;
        r1 = r0.f14320b;	 Catch:{ all -> 0x00c0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c0 }
        r11 = 41;
        r2.<init>(r11);	 Catch:{ all -> 0x00c0 }
        r11 = "Submitting a payload burst of ";
        r2.append(r11);	 Catch:{ all -> 0x00c0 }
        r2.append(r10);	 Catch:{ all -> 0x00c0 }
        r2 = r2.toString();	 Catch:{ all -> 0x00c0 }
        r1.mo514b(r2);	 Catch:{ all -> 0x00c0 }
        r11 = new java.util.ArrayList;	 Catch:{ all -> 0x00c0 }
        r11.<init>();	 Catch:{ all -> 0x00c0 }
        r0 = r19;
        r1 = r0.f14330l;	 Catch:{ all -> 0x00c0 }
        r12 = r1.mo407b();	 Catch:{ all -> 0x00c0 }
        r13 = r6.size();	 Catch:{ all -> 0x00c0 }
        r1 = 0;
        r2 = r1;
    L_0x0146:
        if (r2 >= r13) goto L_0x01c1;
    L_0x0148:
        r1 = r6.get(r2);	 Catch:{ all -> 0x00c0 }
        r2 = r2 + 1;
        r1 = (p000.fim) r1;	 Catch:{ all -> 0x00c0 }
        r1 = r9.mo1359a(r1);	 Catch:{ all -> 0x00c0 }
        r14 = new fio;	 Catch:{ all -> 0x00c0 }
        r14.<init>(r1);	 Catch:{ all -> 0x00c0 }
        r1 = r12.f4730a;	 Catch:{ all -> 0x00c0 }
        r1 = r1 + -1;
        switch(r1) {
            case 0: goto L_0x01bb;
            case 1: goto L_0x0179;
            case 2: goto L_0x0166;
            default: goto L_0x0160;
        };	 Catch:{ all -> 0x00c0 }
    L_0x0160:
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x00c0 }
        r1.<init>();	 Catch:{ all -> 0x00c0 }
        throw r1;	 Catch:{ all -> 0x00c0 }
    L_0x0166:
        r1 = 2;
        r1 = p000.fds.m10235a(r1);	 Catch:{ all -> 0x00c0 }
    L_0x016b:
        r1.m2312a(r14);	 Catch:{ all -> 0x00c0 }
        r14.m2304a(r8);	 Catch:{ all -> 0x00c0 }
        r1 = r14.m2301a();	 Catch:{ all -> 0x00c0 }
        r11.add(r1);	 Catch:{ all -> 0x00c0 }
        goto L_0x0146;
    L_0x0179:
        r1 = 2;
        r1 = new p000.fis[r1];	 Catch:{ all -> 0x00c0 }
        r15 = 5;
        r15 = p000.fds.m10235a(r15);	 Catch:{ all -> 0x00c0 }
        r16 = 0;
        r1[r16] = r15;	 Catch:{ all -> 0x00c0 }
        r15 = 2;
        r15 = new p000.fin[r15];	 Catch:{ all -> 0x00c0 }
        r16 = new fin;	 Catch:{ all -> 0x00c0 }
        r17 = android.hardware.camera2.CaptureRequest.EDGE_MODE;	 Catch:{ all -> 0x00c0 }
        r18 = 3;
        r18 = java.lang.Integer.valueOf(r18);	 Catch:{ all -> 0x00c0 }
        r16.<init>(r17, r18);	 Catch:{ all -> 0x00c0 }
        r17 = 0;
        r15[r17] = r16;	 Catch:{ all -> 0x00c0 }
        r16 = new fin;	 Catch:{ all -> 0x00c0 }
        r17 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE;	 Catch:{ all -> 0x00c0 }
        r18 = 4;
        r18 = java.lang.Integer.valueOf(r18);	 Catch:{ all -> 0x00c0 }
        r16.<init>(r17, r18);	 Catch:{ all -> 0x00c0 }
        r17 = 1;
        r15[r17] = r16;	 Catch:{ all -> 0x00c0 }
        r15 = java.util.Arrays.asList(r15);	 Catch:{ all -> 0x00c0 }
        r15 = p000.fds.m10240a(r15);	 Catch:{ all -> 0x00c0 }
        r16 = 1;
        r1[r16] = r15;	 Catch:{ all -> 0x00c0 }
        r1 = p000.fds.m10241a(r1);	 Catch:{ all -> 0x00c0 }
        goto L_0x016b;
    L_0x01bb:
        r1 = 2;
        r1 = p000.fds.m10235a(r1);	 Catch:{ all -> 0x00c0 }
        goto L_0x016b;
    L_0x01c1:
        r2 = new fio;	 Catch:{ all -> 0x00c0 }
        r1 = 0;
        r1 = r11.get(r1);	 Catch:{ all -> 0x00c0 }
        r1 = (p000.fim) r1;	 Catch:{ all -> 0x00c0 }
        r2.<init>(r1);	 Catch:{ all -> 0x00c0 }
        r1 = p000.fds.m10249b(r4);	 Catch:{ all -> 0x00c0 }
        r2.m2307a(r1);	 Catch:{ all -> 0x00c0 }
        r1 = r2.m2301a();	 Catch:{ all -> 0x00c0 }
        r2 = 0;
        r11.set(r2, r1);	 Catch:{ all -> 0x00c0 }
        r1 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x00c0 }
        r5.mo1381a(r11, r1);	 Catch:{ all -> 0x00c0 }
        r0 = r19;
        r1 = r0.f14321c;	 Catch:{ all -> 0x00c0 }
        r2 = "ReleaseResources";
        r1.mo1905b(r2);	 Catch:{ all -> 0x00c0 }
        r20.close();	 Catch:{ all -> 0x00c0 }
        r9.close();	 Catch:{ all -> 0x00c0 }
        r3.close();	 Catch:{ all -> 0x00c0 }
        r5.close();	 Catch:{ all -> 0x00c0 }
        r2 = 0;
        r1 = 0;
        r4 = r1;
    L_0x01f9:
        if (r4 >= r10) goto L_0x02c0;
    L_0x01fb:
        r0 = r19;
        r1 = r0.f14321c;	 Catch:{ all -> 0x00c0 }
        r6 = r4 + 1;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c0 }
        r11 = 29;
        r3.<init>(r11);	 Catch:{ all -> 0x00c0 }
        r11 = "Frame";
        r3.append(r11);	 Catch:{ all -> 0x00c0 }
        r3.append(r6);	 Catch:{ all -> 0x00c0 }
        r11 = "of";
        r3.append(r11);	 Catch:{ all -> 0x00c0 }
        r3.append(r10);	 Catch:{ all -> 0x00c0 }
        r3 = r3.toString();	 Catch:{ all -> 0x00c0 }
        r1.mo1905b(r3);	 Catch:{ all -> 0x00c0 }
        r1 = r8.mo2649a();	 Catch:{ InterruptedException -> 0x0305, isr -> 0x02f9 }
        r1 = (p000.fjj) r1;	 Catch:{ InterruptedException -> 0x0305, isr -> 0x02f9 }
        r3 = r1.mo3041a();	 Catch:{ all -> 0x028d }
        if (r3 <= 0) goto L_0x0265;
    L_0x022b:
        r2 = r2 + 1;
        p000.fpo.m10621a(r7, r1);	 Catch:{ all -> 0x0303 }
        r0 = r19;
        r3 = r0.f14320b;	 Catch:{ all -> 0x0303 }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0303 }
        r12 = 70;
        r11.<init>(r12);	 Catch:{ all -> 0x0303 }
        r12 = "Acquired frame ";
        r11.append(r12);	 Catch:{ all -> 0x0303 }
        r11.append(r6);	 Catch:{ all -> 0x0303 }
        r12 = " of ";
        r11.append(r12);	 Catch:{ all -> 0x0303 }
        r11.append(r10);	 Catch:{ all -> 0x0303 }
        r12 = " for converged image capture.";
        r11.append(r12);	 Catch:{ all -> 0x0303 }
        r11 = r11.toString();	 Catch:{ all -> 0x0303 }
        r3.mo518d(r11);	 Catch:{ all -> 0x0303 }
    L_0x0257:
        if (r1 == 0) goto L_0x0263;
    L_0x0259:
        r3 = 0;
        p000.drs.m9299a(r3, r1);	 Catch:{ InterruptedException -> 0x02fc, isr -> 0x02ff }
        r1 = r2;
    L_0x025e:
        r2 = r4 + 1;
        r4 = r2;
        r2 = r1;
        goto L_0x01f9;
    L_0x0263:
        r1 = r2;
        goto L_0x025e;
    L_0x0265:
        r0 = r19;
        r3 = r0.f14320b;	 Catch:{ all -> 0x028d }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x028d }
        r12 = 80;
        r11.<init>(r12);	 Catch:{ all -> 0x028d }
        r12 = "Ignoring frame ";
        r11.append(r12);	 Catch:{ all -> 0x028d }
        r11.append(r6);	 Catch:{ all -> 0x028d }
        r12 = " of ";
        r11.append(r12);	 Catch:{ all -> 0x028d }
        r11.append(r10);	 Catch:{ all -> 0x028d }
        r12 = " because it did not contain any images.";
        r11.append(r12);	 Catch:{ all -> 0x028d }
        r11 = r11.toString();	 Catch:{ all -> 0x028d }
        r3.mo520f(r11);	 Catch:{ all -> 0x028d }
        goto L_0x0257;
    L_0x028d:
        r3 = move-exception;
    L_0x028e:
        throw r3;	 Catch:{ all -> 0x028f }
    L_0x028f:
        r11 = move-exception;
        if (r1 == 0) goto L_0x0295;
    L_0x0292:
        p000.drs.m9299a(r3, r1);	 Catch:{ InterruptedException -> 0x0296, isr -> 0x0301 }
    L_0x0295:
        throw r11;	 Catch:{ InterruptedException -> 0x0296, isr -> 0x0301 }
    L_0x0296:
        r1 = move-exception;
    L_0x0297:
        r1 = r2;
    L_0x0298:
        r0 = r19;
        r2 = r0.f14320b;	 Catch:{ all -> 0x00c0 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c0 }
        r11 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r3.<init>(r11);	 Catch:{ all -> 0x00c0 }
        r11 = "Could not acquire frame ";
        r3.append(r11);	 Catch:{ all -> 0x00c0 }
        r3.append(r6);	 Catch:{ all -> 0x00c0 }
        r6 = " of ";
        r3.append(r6);	 Catch:{ all -> 0x00c0 }
        r3.append(r10);	 Catch:{ all -> 0x00c0 }
        r6 = " because the command was interrupted or is no longer available.";
        r3.append(r6);	 Catch:{ all -> 0x00c0 }
        r3 = r3.toString();	 Catch:{ all -> 0x00c0 }
        r2.mo520f(r3);	 Catch:{ all -> 0x00c0 }
        goto L_0x025e;
    L_0x02c0:
        if (r2 <= 0) goto L_0x02cb;
    L_0x02c2:
        r0 = r19;
        r1 = r0.f14320b;	 Catch:{ all -> 0x00c0 }
        r2 = "Payload burst succeeded. Shot is not yet saved.";
        r1.mo518d(r2);	 Catch:{ all -> 0x00c0 }
    L_0x02cb:
        if (r9 == 0) goto L_0x02d1;
    L_0x02cd:
        r1 = 0;
        p000.drs.m9297a(r1, r9);	 Catch:{ all -> 0x00c9 }
    L_0x02d1:
        if (r8 == 0) goto L_0x02d7;
    L_0x02d3:
        r1 = 0;
        p000.drs.m9300a(r1, r8);	 Catch:{ all -> 0x00d2 }
    L_0x02d7:
        if (r7 == 0) goto L_0x02dd;
    L_0x02d9:
        r1 = 0;
        p000.drs.m9301a(r1, r7);	 Catch:{ all -> 0x00db }
    L_0x02dd:
        if (r5 == 0) goto L_0x02e3;
    L_0x02df:
        r1 = 0;
        p000.drs.m9298a(r1, r5);	 Catch:{ all -> 0x00e4 }
    L_0x02e3:
        r0 = r19;
        r1 = r0.f14327i;
        r1.mo1362c();
        r0 = r19;
        r1 = r0.f14321c;
        r1.mo1904b();
        r0 = r19;
        r1 = r0.f14321c;
        r1.mo1904b();
        return;
    L_0x02f9:
        r1 = move-exception;
    L_0x02fa:
        r1 = r2;
        goto L_0x0298;
    L_0x02fc:
        r1 = move-exception;
    L_0x02fd:
        r1 = r2;
        goto L_0x0298;
    L_0x02ff:
        r1 = move-exception;
        goto L_0x02fd;
    L_0x0301:
        r1 = move-exception;
        goto L_0x0297;
    L_0x0303:
        r3 = move-exception;
        goto L_0x028e;
    L_0x0305:
        r1 = move-exception;
        goto L_0x02fa;
        */
        throw new UnsupportedOperationException("Method not decompiled: drs.a(fwm, fwa):void");
    }
}
