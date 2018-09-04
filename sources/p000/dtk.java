package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtk */
public final class dtk implements fwl {
    /* renamed from: a */
    public final bym f14465a;
    /* renamed from: b */
    private final iqz f14466b;
    /* renamed from: c */
    private final ird f14467c;
    /* renamed from: d */
    private final ffc f14468d;
    /* renamed from: e */
    private final fmg f14469e;
    /* renamed from: f */
    private final kbg f14470f;
    /* renamed from: g */
    private final duf f14471g;
    /* renamed from: h */
    private final fhg f14472h;
    /* renamed from: i */
    private final fde f14473i;
    /* renamed from: j */
    private final kpk f14474j;
    /* renamed from: k */
    private final int f14475k;
    /* renamed from: l */
    private final int f14476l;
    /* renamed from: m */
    private final dtd f14477m;
    /* renamed from: n */
    private final bzd f14478n;
    /* renamed from: o */
    private final fel f14479o;
    /* renamed from: p */
    private final cdo f14480p;
    /* renamed from: q */
    private final ccy f14481q;
    /* renamed from: r */
    private final bzt f14482r;
    /* renamed from: s */
    private final ilp f14483s;
    /* renamed from: t */
    private final grk f14484t;
    /* renamed from: u */
    private final boolean f14485u;

    /* renamed from: a */
    private static /* synthetic */ void m9364a(Throwable th, fdf fdf) {
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
    private static /* synthetic */ void m9365a(Throwable th, fem fem) {
        if (th != null) {
            try {
                fem.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fem.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9366a(Throwable th, fhh fhh) {
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
    private static /* synthetic */ void m9367a(Throwable th, ikb ikb) {
        if (th != null) {
            try {
                ikb.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        ikb.close();
    }

    public dtk(ird ird, ira ira, ffc ffc, fmg fmg, kbg kbg, duf duf, fhg fhg, kpk kpk, fde fde, bym bym, dtd dtd, bzd bzd, fel fel, gjk gjk, cdo cdo, ccy ccy, bzt bzt, ilp ilp, grk grk) {
        boolean z;
        this.f14467c = ird;
        this.f14468d = ffc;
        this.f14469e = fmg;
        this.f14470f = kbg;
        this.f14471g = duf;
        this.f14472h = fhg;
        this.f14473i = fde;
        this.f14474j = kpk;
        this.f14465a = bym;
        this.f14477m = dtd;
        this.f14478n = bzd;
        this.f14480p = cdo;
        this.f14481q = ccy;
        this.f14482r = bzt;
        this.f14483s = ilp;
        this.f14484t = grk;
        if (ffc.mo1921c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this.f14485u = z;
        if (this.f14485u) {
            Object obj = gjk;
        }
        this.f14479o = fel;
        this.f14466b = ira.mo511a("HdrPTImgCapCmd");
        this.f14466b.mo519e("Creating HdrPlusTorchImageCaptureCommand.");
        this.f14475k = bym.mo613a().getMax_full_metering_sweep_frames();
        this.f14476l = bym.mo613a().getMax_payload_frames();
        if (fmg.m2338b() >= this.f14475k) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (fmg.m2338b() >= this.f14476l) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14483s;
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
    public final void mo1171a(p000.fwm r19, p000.fwa r20) {
        /*
        r18 = this;
        r2 = p000.fdh.ANY;
        r3 = new fdg;
        r3.<init>(r2, r2, r2);
        r2 = p000.fdh.CONVERGED;
        r2 = r3.m2257b(r2);
        r3 = p000.fdh.LOCKED;
        r2 = r2.m2256a(r3);
        r3 = p000.fdh.CONVERGED;
        r5 = r2.m2258c(r3);
        r0 = r18;
        r2 = r0.f14474j;
        r2 = p000.isr.m4143a(r2);
        r2 = (p000.ffw) r2;
        r2 = r2.mo2860b();
        r2 = (p000.fim) r2;
        r0 = r18;
        r3 = r0.f14468d;
        r3 = p000.bya.m1047b(r3);
        r0 = r18;
        r4 = r0.f14465a;
        r3 = r4.mo620c(r3);
        if (r3 < 0) goto L_0x0387;
    L_0x003b:
        r4 = 1;
    L_0x003c:
        p000.jri.m13143a(r4);
        r0 = r18;
        r4 = r0.f14466b;
        r6 = "Executing HdrPlus torch capture command.";
        r4.mo518d(r6);
        r0 = r18;
        r4 = r0.f14467c;
        r6 = "HdrPlusTorchCapture";
        r4.mo1903a(r6);
        r0 = r18;
        r4 = r0.f14467c;
        r6 = "SessionAndTorchLock";
        r4.mo1903a(r6);
        r0 = r18;
        r4 = r0.f14472h;	 Catch:{ all -> 0x0104 }
        r9 = r4.mo1382a();	 Catch:{ all -> 0x0104 }
        r0 = r18;
        r4 = r0.f14479o;	 Catch:{ all -> 0x00fb }
        r13 = r4.mo1361a(r9, r2);	 Catch:{ all -> 0x00fb }
        r14 = new ikb;	 Catch:{ all -> 0x00f2 }
        r14.<init>();	 Catch:{ all -> 0x00f2 }
        r2 = r13.mo3033a(r2);	 Catch:{ all -> 0x00eb }
        r0 = r18;
        r4 = r0.f14467c;	 Catch:{ all -> 0x00eb }
        r6 = "3AConvergence";
        r4.mo1905b(r6);	 Catch:{ all -> 0x00eb }
        r0 = r18;
        r4 = r0.f14473i;	 Catch:{ all -> 0x00eb }
        r15 = r4.mo1357a(r9, r5, r2);	 Catch:{ all -> 0x00eb }
        r6 = r15.mo1358a();	 Catch:{ all -> 0x00e2 }
        r11 = new fio;	 Catch:{ all -> 0x00e2 }
        r2 = r15.mo1359a(r2);	 Catch:{ all -> 0x00e2 }
        r11.<init>(r2);	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r2 = r0.f14467c;	 Catch:{ all -> 0x038a }
        r4 = "Metering";
        r2.mo1905b(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f14471g;	 Catch:{ all -> 0x038a }
        r5 = r2.mo1176b();	 Catch:{ all -> 0x038a }
        r2 = p000.go.aa;	 Catch:{ all -> 0x038a }
        if (r5 == r2) goto L_0x037c;
    L_0x00a6:
        r0 = r18;
        r2 = r0.f14467c;	 Catch:{ all -> 0x038a }
        r4 = "SmartMetering";
        r2.mo1903a(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f14471g;	 Catch:{ isr -> 0x0395 }
        r4 = r2.mo1175a(r9, r11, r6);	 Catch:{ isr -> 0x0395 }
        r14.mo1879a(r4);	 Catch:{ isr -> 0x03b5 }
        r2 = r4.f14552a;	 Catch:{ isr -> 0x03b5 }
        r6 = r4.f14553b;	 Catch:{ isr -> 0x03ff }
        r16 = r5;
        r5 = r2;
        r2 = r16;
        r17 = r6;
        r6 = r4;
        r4 = r17;
    L_0x00c8:
        r0 = r18;
        r7 = r0.f14467c;	 Catch:{ all -> 0x038a }
        r7.mo1904b();	 Catch:{ all -> 0x038a }
        if (r4 != 0) goto L_0x0127;
    L_0x00d1:
        r0 = r18;
        r2 = r0.f14466b;	 Catch:{ all -> 0x038a }
        r3 = "Metering metadata is not available, aborting shot.";
        r2.mo516c(r3);	 Catch:{ all -> 0x038a }
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x00e2:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r3 = move-exception;
        if (r15 == 0) goto L_0x00ea;
    L_0x00e7:
        p000.dtk.m9364a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x00ea:
        throw r3;	 Catch:{ all -> 0x00eb }
    L_0x00eb:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00ed }
    L_0x00ed:
        r3 = move-exception;
        p000.dtk.m9367a(r2, r14);	 Catch:{ all -> 0x00f2 }
        throw r3;	 Catch:{ all -> 0x00f2 }
    L_0x00f2:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00f4 }
    L_0x00f4:
        r3 = move-exception;
        if (r13 == 0) goto L_0x00fa;
    L_0x00f7:
        p000.dtk.m9365a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x00fa:
        throw r3;	 Catch:{ all -> 0x00fb }
    L_0x00fb:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00fd }
    L_0x00fd:
        r3 = move-exception;
        if (r9 == 0) goto L_0x0103;
    L_0x0100:
        p000.dtk.m9366a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x0103:
        throw r3;	 Catch:{ all -> 0x0104 }
    L_0x0104:
        r2 = move-exception;
        r0 = r18;
        r3 = r0.f14466b;
        r4 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r3.mo518d(r4);
        r19.close();
        r0 = r18;
        r3 = r0.f14479o;
        r3.mo1362c();
        r0 = r18;
        r3 = r0.f14467c;
        r3.mo1904b();
        r0 = r18;
        r3 = r0.f14467c;
        r3.mo1904b();
        throw r2;
    L_0x0127:
        r10 = r2;
        r8 = r4;
        r7 = r5;
        r12 = r6;
    L_0x012b:
        r0 = r18;
        r2 = r0.f14467c;	 Catch:{ all -> 0x038a }
        r4 = "Shot";
        r2.mo1905b(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f14467c;	 Catch:{ all -> 0x038a }
        r4 = "StartShotCapture";
        r2.mo1903a(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f14480p;	 Catch:{ all -> 0x038a }
        r5 = r2.m8044b();	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f14482r;	 Catch:{ all -> 0x038a }
        r2 = r2.m1083a(r8, r3);	 Catch:{ all -> 0x038a }
        r0 = r20;
        r4 = r0.f4752a;	 Catch:{ all -> 0x038a }
        r4 = r4.f4445a;	 Catch:{ all -> 0x038a }
        r0 = r18;
        r6 = r0.f14468d;	 Catch:{ all -> 0x038a }
        r4 = p000.axm.m734a(r4, r6);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r6 = r0.f14481q;	 Catch:{ all -> 0x038a }
        r0 = r20;
        r4 = r6.m8025a(r0, r2, r5, r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f14465a;	 Catch:{ all -> 0x038a }
        r6 = r5.f1684e;	 Catch:{ all -> 0x038a }
        r5 = r20;
        r3 = r2.mo608a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f14467c;	 Catch:{ all -> 0x0369 }
        r2.mo1904b();	 Catch:{ all -> 0x0369 }
        if (r3 != 0) goto L_0x01ce;
    L_0x017a:
        r0 = r18;
        r2 = r0.f14466b;	 Catch:{ all -> 0x0369 }
        r4 = "startShotCapture returned null. Payload failed.";
        r2.mo516c(r4);	 Catch:{ all -> 0x0369 }
        if (r3 != 0) goto L_0x018d;
    L_0x0185:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x018d:
        r2 = r3.f1718a;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r3 = r0.f14465a;	 Catch:{ all -> 0x00e2 }
        r3.mo617a(r2);	 Catch:{ all -> 0x00e2 }
        if (r15 == 0) goto L_0x019c;
    L_0x0198:
        r2 = 0;
        p000.dtk.m9364a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x019c:
        r2 = 0;
        p000.dtk.m9367a(r2, r14);	 Catch:{ all -> 0x00f2 }
        if (r13 == 0) goto L_0x01a6;
    L_0x01a2:
        r2 = 0;
        p000.dtk.m9365a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x01a6:
        if (r9 == 0) goto L_0x01ac;
    L_0x01a8:
        r2 = 0;
        p000.dtk.m9366a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x01ac:
        r0 = r18;
        r2 = r0.f14466b;
        r3 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r2.mo518d(r3);
        r19.close();
        r0 = r18;
        r2 = r0.f14479o;
        r2.mo1362c();
        r0 = r18;
        r2 = r0.f14467c;
        r2.mo1904b();
        r0 = r18;
        r2 = r0.f14467c;
        r2.mo1904b();
    L_0x01cd:
        return;
    L_0x01ce:
        r0 = r18;
        r2 = r0.f14471g;	 Catch:{ all -> 0x0369 }
        r4 = r2.mo1177c();	 Catch:{ all -> 0x0369 }
        r2 = p000.go.ab;	 Catch:{ all -> 0x0369 }
        if (r10 != r2) goto L_0x0379;
    L_0x01da:
        r2 = r4.mo2084b();	 Catch:{ all -> 0x0369 }
        if (r2 == 0) goto L_0x0375;
    L_0x01e0:
        r0 = r18;
        r5 = r0.f14465a;	 Catch:{ all -> 0x0369 }
        r2 = r4.mo2081a();	 Catch:{ all -> 0x0369 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x0369 }
        r7 = r5.mo610a(r3, r8, r2);	 Catch:{ all -> 0x0369 }
        r2 = r4.mo2081a();	 Catch:{ all -> 0x0369 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x0369 }
        r14.mo1879a(r2);	 Catch:{ all -> 0x0369 }
        r2 = r10;
    L_0x01f8:
        r19.close();	 Catch:{ all -> 0x0369 }
        r0 = r20;
        r5 = r0.f4754c;	 Catch:{ all -> 0x0369 }
        r4 = 2;
        r11.f4573a = r4;	 Catch:{ all -> 0x0369 }
        r11.m2309c();	 Catch:{ all -> 0x0369 }
        r4 = p000.go.aa;	 Catch:{ all -> 0x0369 }
        if (r2 == r4) goto L_0x0372;
    L_0x0209:
        r0 = r18;
        r4 = r0.f14465a;	 Catch:{ all -> 0x0369 }
        r4 = r4.mo612a(r3, r7);	 Catch:{ all -> 0x0369 }
    L_0x0211:
        r6 = p000.go.aa;	 Catch:{ all -> 0x0369 }
        if (r2 == r6) goto L_0x021f;
    L_0x0215:
        r2 = r4.getFrame_requests();	 Catch:{ all -> 0x0369 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0369 }
        if (r2 == 0) goto L_0x035e;
    L_0x021f:
        r0 = r18;
        r2 = r0.f14466b;	 Catch:{ all -> 0x0369 }
        r4 = "Smart metering failed or inactive, falling back to metering burst.";
        r2.mo514b(r4);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r2 = r0.f14477m;	 Catch:{ all -> 0x0369 }
        r4 = new fio;	 Catch:{ all -> 0x0369 }
        r4.<init>(r11);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r6 = r0.f14469e;	 Catch:{ all -> 0x0369 }
        r4 = r2.m1682a(r3, r4, r6, r9);	 Catch:{ all -> 0x0369 }
    L_0x0239:
        if (r4 != 0) goto L_0x0299;
    L_0x023b:
        r0 = r18;
        r2 = r0.f14466b;	 Catch:{ all -> 0x0369 }
        r4 = "payloadBurstSpec is null. Payload failed.";
        r2.mo516c(r4);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r2 = r0.f14465a;	 Catch:{ all -> 0x0369 }
        r4 = r3.f1718a;	 Catch:{ all -> 0x0369 }
        r2.mo617a(r4);	 Catch:{ all -> 0x0369 }
        if (r3 != 0) goto L_0x0257;
    L_0x024f:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x0257:
        r2 = r3.f1718a;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r3 = r0.f14465a;	 Catch:{ all -> 0x00e2 }
        r3.mo617a(r2);	 Catch:{ all -> 0x00e2 }
        if (r15 == 0) goto L_0x0266;
    L_0x0262:
        r2 = 0;
        p000.dtk.m9364a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x0266:
        r2 = 0;
        p000.dtk.m9367a(r2, r14);	 Catch:{ all -> 0x00f2 }
        if (r13 == 0) goto L_0x0270;
    L_0x026c:
        r2 = 0;
        p000.dtk.m9365a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x0270:
        if (r9 == 0) goto L_0x0276;
    L_0x0272:
        r2 = 0;
        p000.dtk.m9366a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x0276:
        r0 = r18;
        r2 = r0.f14466b;
        r3 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r2.mo518d(r3);
        r19.close();
        r0 = r18;
        r2 = r0.f14479o;
        r2.mo1362c();
        r0 = r18;
        r2 = r0.f14467c;
        r2.mo1904b();
        r0 = r18;
        r2 = r0.f14467c;
        r2.mo1904b();
        goto L_0x01cd;
    L_0x0299:
        r10 = new dtl;	 Catch:{ all -> 0x0369 }
        r10.<init>(r15, r13, r9, r12);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r2 = r0.f14477m;	 Catch:{ all -> 0x0369 }
        r6 = new fio;	 Catch:{ all -> 0x0369 }
        r6.<init>(r11);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r7 = r0.f14469e;	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r8 = r0.f14470f;	 Catch:{ all -> 0x0369 }
        r0 = r20;
        r11 = r0.f4753b;	 Catch:{ all -> 0x0369 }
        r11 = r11.mo1482h();	 Catch:{ all -> 0x0369 }
        r4 = r2.m1683a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0369 }
        if (r4 != 0) goto L_0x02d5;
    L_0x02bd:
        r2 = new isr;	 Catch:{ all -> 0x02c5 }
        r5 = "HDR+ torch shot didn't succeed";
        r2.<init>(r5);	 Catch:{ all -> 0x02c5 }
        throw r2;	 Catch:{ all -> 0x02c5 }
    L_0x02c5:
        r2 = move-exception;
        r16 = r4;
        r4 = r2;
        r2 = r16;
    L_0x02cb:
        if (r3 != 0) goto L_0x03b8;
    L_0x02cd:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x02d5:
        if (r3 != 0) goto L_0x02df;
    L_0x02d7:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x02df:
        r2 = r3.f1718a;	 Catch:{ all -> 0x00e2 }
        if (r4 != 0) goto L_0x0323;
    L_0x02e3:
        r0 = r18;
        r3 = r0.f14465a;	 Catch:{ all -> 0x00e2 }
        r3.mo617a(r2);	 Catch:{ all -> 0x00e2 }
    L_0x02ea:
        if (r15 == 0) goto L_0x02f0;
    L_0x02ec:
        r2 = 0;
        p000.dtk.m9364a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x02f0:
        r2 = 0;
        p000.dtk.m9367a(r2, r14);	 Catch:{ all -> 0x00f2 }
        if (r13 == 0) goto L_0x02fa;
    L_0x02f6:
        r2 = 0;
        p000.dtk.m9365a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x02fa:
        if (r9 == 0) goto L_0x0300;
    L_0x02fc:
        r2 = 0;
        p000.dtk.m9366a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x0300:
        r0 = r18;
        r2 = r0.f14466b;
        r3 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r2.mo518d(r3);
        r19.close();
        r0 = r18;
        r2 = r0.f14479o;
        r2.mo1362c();
        r0 = r18;
        r2 = r0.f14467c;
        r2.mo1904b();
        r0 = r18;
        r2 = r0.f14467c;
        r2.mo1904b();
        goto L_0x01cd;
    L_0x0323:
        r0 = r20;
        r3 = r0.f4753b;	 Catch:{ all -> 0x00e2 }
        r3 = r3.mo1482h();	 Catch:{ all -> 0x00e2 }
        r4 = 1;
        r3.mo1521a(r4);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4752a;	 Catch:{ all -> 0x00e2 }
        r3 = r3.f4452h;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r4 = r0.f14485u;	 Catch:{ all -> 0x00e2 }
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ all -> 0x00e2 }
        r3.mo348a(r4);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4753b;	 Catch:{ all -> 0x00e2 }
        r4 = new dtm;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r4.<init>(r0, r2);	 Catch:{ all -> 0x00e2 }
        r3.mo2870a(r4);	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r2 = r0.f14484t;	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4753b;	 Catch:{ all -> 0x00e2 }
        r3 = r3.mo1482h();	 Catch:{ all -> 0x00e2 }
        r2.m2762a(r3);	 Catch:{ all -> 0x00e2 }
        goto L_0x02ea;
    L_0x035e:
        r0 = r18;
        r2 = r0.f14466b;	 Catch:{ all -> 0x0369 }
        r6 = "Smart metering succeeded, skipping metering burst.";
        r2.mo514b(r6);	 Catch:{ all -> 0x0369 }
        goto L_0x0239;
    L_0x0369:
        r2 = move-exception;
        r4 = 0;
        r16 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x02cb;
    L_0x0372:
        r4 = 0;
        goto L_0x0211;
    L_0x0375:
        r2 = p000.go.aa;	 Catch:{ all -> 0x0369 }
        goto L_0x01f8;
    L_0x0379:
        r2 = r10;
        goto L_0x01f8;
    L_0x037c:
        r0 = r18;
        r2 = r0.f14478n;	 Catch:{ all -> 0x038a }
        r8 = r2.f11523a;	 Catch:{ all -> 0x038a }
        r12 = 0;
        r7 = 0;
        r10 = r5;
        goto L_0x012b;
    L_0x0387:
        r4 = 0;
        goto L_0x003c;
    L_0x038a:
        r2 = move-exception;
        r4 = 0;
        r3 = 0;
        r16 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x02cb;
    L_0x0395:
        r2 = move-exception;
        r4 = 0;
        r2 = 0;
    L_0x0398:
        r0 = r18;
        r5 = r0.f14466b;	 Catch:{ all -> 0x038a }
        r6 = "SmartMetering failed, switching it off.";
        r5.mo520f(r6);	 Catch:{ all -> 0x038a }
        r5 = p000.go.aa;	 Catch:{ all -> 0x038a }
        r0 = r18;
        r6 = r0.f14478n;	 Catch:{ all -> 0x038a }
        r6 = r6.f11523a;	 Catch:{ all -> 0x038a }
        r16 = r5;
        r5 = r2;
        r2 = r16;
        r17 = r6;
        r6 = r4;
        r4 = r17;
        goto L_0x00c8;
    L_0x03b5:
        r2 = move-exception;
        r2 = 0;
        goto L_0x0398;
    L_0x03b8:
        r3 = r3.f1718a;	 Catch:{ all -> 0x00e2 }
        if (r2 != 0) goto L_0x03c4;
    L_0x03bc:
        r0 = r18;
        r2 = r0.f14465a;	 Catch:{ all -> 0x00e2 }
        r2.mo617a(r3);	 Catch:{ all -> 0x00e2 }
    L_0x03c3:
        throw r4;	 Catch:{ all -> 0x00e2 }
    L_0x03c4:
        r0 = r20;
        r2 = r0.f4753b;	 Catch:{ all -> 0x00e2 }
        r2 = r2.mo1482h();	 Catch:{ all -> 0x00e2 }
        r5 = 1;
        r2.mo1521a(r5);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r2 = r0.f4752a;	 Catch:{ all -> 0x00e2 }
        r2 = r2.f4452h;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r5 = r0.f14485u;	 Catch:{ all -> 0x00e2 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ all -> 0x00e2 }
        r2.mo348a(r5);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r2 = r0.f4753b;	 Catch:{ all -> 0x00e2 }
        r5 = new dtm;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r5.<init>(r0, r3);	 Catch:{ all -> 0x00e2 }
        r2.mo2870a(r5);	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r2 = r0.f14484t;	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4753b;	 Catch:{ all -> 0x00e2 }
        r3 = r3.mo1482h();	 Catch:{ all -> 0x00e2 }
        r2.m2762a(r3);	 Catch:{ all -> 0x00e2 }
        goto L_0x03c3;
    L_0x03ff:
        r5 = move-exception;
        goto L_0x0398;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtk.a(fwm, fwa):void");
    }
}
