package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtg */
public final class dtg implements fwl {
    /* renamed from: a */
    public final bym f14426a;
    /* renamed from: b */
    private final iqz f14427b;
    /* renamed from: c */
    private final ird f14428c;
    /* renamed from: d */
    private final ffc f14429d;
    /* renamed from: e */
    private final fmg f14430e;
    /* renamed from: f */
    private final kbg f14431f;
    /* renamed from: g */
    private final duf f14432g;
    /* renamed from: h */
    private final fhg f14433h;
    /* renamed from: i */
    private final fde f14434i;
    /* renamed from: j */
    private final kpk f14435j;
    /* renamed from: k */
    private final int f14436k;
    /* renamed from: l */
    private final int f14437l;
    /* renamed from: m */
    private final dtd f14438m;
    /* renamed from: n */
    private final bzd f14439n;
    /* renamed from: o */
    private final cdo f14440o;
    /* renamed from: p */
    private final ccy f14441p;
    /* renamed from: q */
    private final bzt f14442q;
    /* renamed from: r */
    private final ilp f14443r;
    /* renamed from: s */
    private final grk f14444s;

    /* renamed from: a */
    private static /* synthetic */ void m9356a(Throwable th, fdf fdf) {
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
    private static /* synthetic */ void m9357a(Throwable th, fhh fhh) {
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
    private static /* synthetic */ void m9358a(Throwable th, ikb ikb) {
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

    public dtg(ird ird, ira ira, ffc ffc, fmg fmg, kbg kbg, duf duf, fhg fhg, kpk kpk, fde fde, bym bym, dtd dtd, bzd bzd, cdo cdo, ccy ccy, bzt bzt, ilp ilp, grk grk) {
        boolean z;
        this.f14428c = ird;
        this.f14429d = ffc;
        this.f14430e = fmg;
        this.f14431f = kbg;
        this.f14432g = duf;
        this.f14433h = fhg;
        this.f14434i = fde;
        this.f14435j = kpk;
        this.f14426a = bym;
        this.f14438m = dtd;
        this.f14439n = bzd;
        this.f14440o = cdo;
        this.f14441p = ccy;
        this.f14442q = bzt;
        this.f14443r = ilp;
        this.f14444s = grk;
        this.f14427b = ira.mo511a("HdrPImgCapCmd");
        this.f14427b.mo519e("Creating HdrPlusImageCaptureCommand.");
        this.f14436k = bym.mo613a().getMax_full_metering_sweep_frames();
        this.f14437l = bym.mo613a().getMax_payload_frames();
        if (fmg.m2338b() >= this.f14436k) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        if (fmg.m2338b() >= this.f14437l) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return this.f14443r;
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
    public final void mo1171a(p000.fwm r18, p000.fwa r19) {
        /*
        r17 = this;
        r0 = r17;
        r2 = r0.f14443r;
        r2 = r2.mo2860b();
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x0019;
    L_0x0010:
        r0 = r17;
        r2 = r0.f14427b;
        r3 = "WARNING: HdrPlusImageCaptureCommand was executed, but the command is not available. This may result in deadlocks or other unintended behavior.";
        r2.mo516c(r3);
    L_0x0019:
        r2 = p000.fdh.LOCKED;
        r5 = new fdg;
        r3 = p000.fdh.ANY;
        r4 = p000.fdh.ANY;
        r5.<init>(r3, r2, r4);
        r0 = r17;
        r2 = r0.f14435j;
        r2 = p000.isr.m4143a(r2);
        r2 = (p000.ffw) r2;
        r2 = r2.mo2860b();
        r2 = (p000.fim) r2;
        r0 = r17;
        r3 = r0.f14429d;
        r3 = p000.bya.m1047b(r3);
        r0 = r17;
        r4 = r0.f14426a;
        r3 = r4.mo620c(r3);
        if (r3 < 0) goto L_0x02fe;
    L_0x0046:
        r4 = 1;
    L_0x0047:
        p000.jri.m13143a(r4);
        r0 = r17;
        r4 = r0.f14427b;
        r6 = "Executing HdrPlus capture command.";
        r4.mo518d(r6);
        r0 = r17;
        r4 = r0.f14428c;
        r6 = "HdrPlusCapture";
        r4.mo1903a(r6);
        r0 = r17;
        r4 = r0.f14428c;
        r6 = "SessionAnd3AConvergence";
        r4.mo1903a(r6);
        r0 = r17;
        r4 = r0.f14433h;	 Catch:{ all -> 0x00ef }
        r9 = r4.mo1382a();	 Catch:{ all -> 0x00ef }
        r0 = r17;
        r4 = r0.f14434i;	 Catch:{ all -> 0x00e6 }
        r13 = r4.mo1357a(r9, r5, r2);	 Catch:{ all -> 0x00e6 }
        r14 = new ikb;	 Catch:{ all -> 0x00dd }
        r14.<init>();	 Catch:{ all -> 0x00dd }
        r6 = r13.mo1358a();	 Catch:{ all -> 0x00d6 }
        r11 = new fio;	 Catch:{ all -> 0x00d6 }
        r2 = r13.mo1359a(r2);	 Catch:{ all -> 0x00d6 }
        r11.<init>(r2);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f14428c;	 Catch:{ all -> 0x00d6 }
        r4 = "Metering";
        r2.mo1905b(r4);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f14432g;	 Catch:{ all -> 0x0301 }
        r5 = r2.mo1176b();	 Catch:{ all -> 0x0301 }
        r2 = p000.go.aa;	 Catch:{ all -> 0x0301 }
        if (r5 == r2) goto L_0x02f3;
    L_0x009c:
        r0 = r17;
        r2 = r0.f14428c;	 Catch:{ all -> 0x0301 }
        r4 = "SmartMetering";
        r2.mo1903a(r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f14432g;	 Catch:{ isr -> 0x030a }
        r4 = r2.mo1175a(r9, r11, r6);	 Catch:{ isr -> 0x030a }
        r14.mo1879a(r4);	 Catch:{ isr -> 0x0328 }
        r2 = r4.f14552a;	 Catch:{ isr -> 0x0328 }
        r6 = r4.f14553b;	 Catch:{ isr -> 0x0355 }
        r15 = r5;
        r5 = r2;
        r2 = r15;
        r16 = r6;
        r6 = r4;
        r4 = r16;
    L_0x00bc:
        r0 = r17;
        r7 = r0.f14428c;	 Catch:{ all -> 0x0301 }
        r7.mo1904b();	 Catch:{ all -> 0x0301 }
        if (r4 != 0) goto L_0x0102;
    L_0x00c5:
        r0 = r17;
        r2 = r0.f14427b;	 Catch:{ all -> 0x0301 }
        r3 = "Metering metadata is not available, aborting shot.";
        r2.mo516c(r3);	 Catch:{ all -> 0x0301 }
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x00d6:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00d8 }
    L_0x00d8:
        r3 = move-exception;
        p000.dtg.m9358a(r2, r14);	 Catch:{ all -> 0x00dd }
        throw r3;	 Catch:{ all -> 0x00dd }
    L_0x00dd:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00df }
    L_0x00df:
        r3 = move-exception;
        if (r13 == 0) goto L_0x00e5;
    L_0x00e2:
        p000.dtg.m9356a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x00e5:
        throw r3;	 Catch:{ all -> 0x00e6 }
    L_0x00e6:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00e8 }
    L_0x00e8:
        r3 = move-exception;
        if (r9 == 0) goto L_0x00ee;
    L_0x00eb:
        p000.dtg.m9357a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x00ee:
        throw r3;	 Catch:{ all -> 0x00ef }
    L_0x00ef:
        r2 = move-exception;
        r18.close();
        r0 = r17;
        r3 = r0.f14428c;
        r3.mo1904b();
        r0 = r17;
        r3 = r0.f14428c;
        r3.mo1904b();
        throw r2;
    L_0x0102:
        r10 = r2;
        r8 = r4;
        r7 = r5;
        r12 = r6;
    L_0x0106:
        r0 = r17;
        r2 = r0.f14428c;	 Catch:{ all -> 0x0301 }
        r4 = "Shot";
        r2.mo1905b(r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f14428c;	 Catch:{ all -> 0x0301 }
        r4 = "StartShotCapture";
        r2.mo1903a(r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f14440o;	 Catch:{ all -> 0x0301 }
        r5 = r2.m8044b();	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f14442q;	 Catch:{ all -> 0x0301 }
        r2 = r2.m1083a(r8, r3);	 Catch:{ all -> 0x0301 }
        r0 = r19;
        r4 = r0.f4752a;	 Catch:{ all -> 0x0301 }
        r4 = r4.f4445a;	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r6 = r0.f14429d;	 Catch:{ all -> 0x0301 }
        r4 = p000.axm.m734a(r4, r6);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r6 = r0.f14441p;	 Catch:{ all -> 0x0301 }
        r0 = r19;
        r4 = r6.m8025a(r0, r2, r5, r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f14426a;	 Catch:{ all -> 0x0301 }
        r6 = r5.f1684e;	 Catch:{ all -> 0x0301 }
        r5 = r19;
        r3 = r2.mo608a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f14428c;	 Catch:{ all -> 0x02e3 }
        r2.mo1904b();	 Catch:{ all -> 0x02e3 }
        if (r3 != 0) goto L_0x0193;
    L_0x0155:
        r0 = r17;
        r2 = r0.f14427b;	 Catch:{ all -> 0x02e3 }
        r4 = "startShotCapture returned null. Payload failed.";
        r2.mo516c(r4);	 Catch:{ all -> 0x02e3 }
        if (r3 != 0) goto L_0x0168;
    L_0x0160:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x0168:
        r2 = r3.f1718a;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r3 = r0.f14426a;	 Catch:{ all -> 0x00d6 }
        r3.mo617a(r2);	 Catch:{ all -> 0x00d6 }
        r2 = 0;
        p000.dtg.m9358a(r2, r14);	 Catch:{ all -> 0x00dd }
        if (r13 == 0) goto L_0x017b;
    L_0x0177:
        r2 = 0;
        p000.dtg.m9356a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x017b:
        if (r9 == 0) goto L_0x0181;
    L_0x017d:
        r2 = 0;
        p000.dtg.m9357a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x0181:
        r18.close();
        r0 = r17;
        r2 = r0.f14428c;
        r2.mo1904b();
        r0 = r17;
        r2 = r0.f14428c;
        r2.mo1904b();
    L_0x0192:
        return;
    L_0x0193:
        r0 = r17;
        r2 = r0.f14432g;	 Catch:{ all -> 0x02e3 }
        r4 = r2.mo1177c();	 Catch:{ all -> 0x02e3 }
        r2 = p000.go.ab;	 Catch:{ all -> 0x02e3 }
        if (r10 != r2) goto L_0x02f0;
    L_0x019f:
        r2 = r4.mo2084b();	 Catch:{ all -> 0x02e3 }
        if (r2 == 0) goto L_0x02ec;
    L_0x01a5:
        r0 = r17;
        r5 = r0.f14426a;	 Catch:{ all -> 0x02e3 }
        r2 = r4.mo2081a();	 Catch:{ all -> 0x02e3 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x02e3 }
        r7 = r5.mo610a(r3, r8, r2);	 Catch:{ all -> 0x02e3 }
        r2 = r4.mo2081a();	 Catch:{ all -> 0x02e3 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x02e3 }
        r14.mo1879a(r2);	 Catch:{ all -> 0x02e3 }
        r2 = r10;
    L_0x01bd:
        r18.close();	 Catch:{ all -> 0x02e3 }
        r0 = r19;
        r5 = r0.f4754c;	 Catch:{ all -> 0x02e3 }
        r4 = 2;
        r11.f4573a = r4;	 Catch:{ all -> 0x02e3 }
        r11.m2309c();	 Catch:{ all -> 0x02e3 }
        r4 = p000.go.aa;	 Catch:{ all -> 0x02e3 }
        if (r2 == r4) goto L_0x02e9;
    L_0x01ce:
        r0 = r17;
        r4 = r0.f14426a;	 Catch:{ all -> 0x02e3 }
        r4 = r4.mo612a(r3, r7);	 Catch:{ all -> 0x02e3 }
    L_0x01d6:
        r6 = p000.go.aa;	 Catch:{ all -> 0x02e3 }
        if (r2 == r6) goto L_0x01e4;
    L_0x01da:
        r2 = r4.getFrame_requests();	 Catch:{ all -> 0x02e3 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x02e3 }
        if (r2 == 0) goto L_0x02d8;
    L_0x01e4:
        r0 = r17;
        r2 = r0.f14427b;	 Catch:{ all -> 0x02e3 }
        r4 = "Smart metering failed or inactive, falling back to metering burst.";
        r2.mo514b(r4);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r2 = r0.f14438m;	 Catch:{ all -> 0x02e3 }
        r4 = new fio;	 Catch:{ all -> 0x02e3 }
        r4.<init>(r11);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r6 = r0.f14430e;	 Catch:{ all -> 0x02e3 }
        r4 = r2.m1682a(r3, r4, r6, r9);	 Catch:{ all -> 0x02e3 }
    L_0x01fe:
        if (r4 != 0) goto L_0x0248;
    L_0x0200:
        r0 = r17;
        r2 = r0.f14427b;	 Catch:{ all -> 0x02e3 }
        r4 = "payloadBurstSpec is null. Payload failed.";
        r2.mo516c(r4);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r2 = r0.f14426a;	 Catch:{ all -> 0x02e3 }
        r4 = r3.f1718a;	 Catch:{ all -> 0x02e3 }
        r2.mo617a(r4);	 Catch:{ all -> 0x02e3 }
        if (r3 != 0) goto L_0x021c;
    L_0x0214:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x021c:
        r2 = r3.f1718a;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r3 = r0.f14426a;	 Catch:{ all -> 0x00d6 }
        r3.mo617a(r2);	 Catch:{ all -> 0x00d6 }
        r2 = 0;
        p000.dtg.m9358a(r2, r14);	 Catch:{ all -> 0x00dd }
        if (r13 == 0) goto L_0x022f;
    L_0x022b:
        r2 = 0;
        p000.dtg.m9356a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x022f:
        if (r9 == 0) goto L_0x0235;
    L_0x0231:
        r2 = 0;
        p000.dtg.m9357a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x0235:
        r18.close();
        r0 = r17;
        r2 = r0.f14428c;
        r2.mo1904b();
        r0 = r17;
        r2 = r0.f14428c;
        r2.mo1904b();
        goto L_0x0192;
    L_0x0248:
        r10 = new dth;	 Catch:{ all -> 0x02e3 }
        r10.<init>(r13, r9, r12);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r2 = r0.f14438m;	 Catch:{ all -> 0x02e3 }
        r6 = new fio;	 Catch:{ all -> 0x02e3 }
        r6.<init>(r11);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r7 = r0.f14430e;	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r8 = r0.f14431f;	 Catch:{ all -> 0x02e3 }
        r0 = r19;
        r11 = r0.f4753b;	 Catch:{ all -> 0x02e3 }
        r11 = r11.mo1482h();	 Catch:{ all -> 0x02e3 }
        r4 = r2.m1683a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x02e3 }
        if (r4 != 0) goto L_0x0282;
    L_0x026c:
        r2 = new isr;	 Catch:{ all -> 0x0274 }
        r5 = "HDR+ shot didn't succeed";
        r2.<init>(r5);	 Catch:{ all -> 0x0274 }
        throw r2;	 Catch:{ all -> 0x0274 }
    L_0x0274:
        r2 = move-exception;
        r15 = r4;
        r4 = r2;
        r2 = r15;
    L_0x0278:
        if (r3 != 0) goto L_0x032b;
    L_0x027a:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x0282:
        if (r3 != 0) goto L_0x028c;
    L_0x0284:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x028c:
        r2 = r3.f1718a;	 Catch:{ all -> 0x00d6 }
        if (r4 != 0) goto L_0x02ba;
    L_0x0290:
        r0 = r17;
        r3 = r0.f14426a;	 Catch:{ all -> 0x00d6 }
        r3.mo617a(r2);	 Catch:{ all -> 0x00d6 }
    L_0x0297:
        r2 = 0;
        p000.dtg.m9358a(r2, r14);	 Catch:{ all -> 0x00dd }
        if (r13 == 0) goto L_0x02a1;
    L_0x029d:
        r2 = 0;
        p000.dtg.m9356a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x02a1:
        if (r9 == 0) goto L_0x02a7;
    L_0x02a3:
        r2 = 0;
        p000.dtg.m9357a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x02a7:
        r18.close();
        r0 = r17;
        r2 = r0.f14428c;
        r2.mo1904b();
        r0 = r17;
        r2 = r0.f14428c;
        r2.mo1904b();
        goto L_0x0192;
    L_0x02ba:
        r0 = r19;
        r3 = r0.f4753b;	 Catch:{ all -> 0x00d6 }
        r4 = new dti;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r4.<init>(r0, r2);	 Catch:{ all -> 0x00d6 }
        r3.mo2870a(r4);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f14444s;	 Catch:{ all -> 0x00d6 }
        r0 = r19;
        r3 = r0.f4753b;	 Catch:{ all -> 0x00d6 }
        r3 = r3.mo1482h();	 Catch:{ all -> 0x00d6 }
        r2.m2762a(r3);	 Catch:{ all -> 0x00d6 }
        goto L_0x0297;
    L_0x02d8:
        r0 = r17;
        r2 = r0.f14427b;	 Catch:{ all -> 0x02e3 }
        r6 = "Smart metering succeeded, skipping metering burst.";
        r2.mo514b(r6);	 Catch:{ all -> 0x02e3 }
        goto L_0x01fe;
    L_0x02e3:
        r2 = move-exception;
        r4 = 0;
        r15 = r4;
        r4 = r2;
        r2 = r15;
        goto L_0x0278;
    L_0x02e9:
        r4 = 0;
        goto L_0x01d6;
    L_0x02ec:
        r2 = p000.go.aa;	 Catch:{ all -> 0x02e3 }
        goto L_0x01bd;
    L_0x02f0:
        r2 = r10;
        goto L_0x01bd;
    L_0x02f3:
        r0 = r17;
        r2 = r0.f14439n;	 Catch:{ all -> 0x0301 }
        r8 = r2.f11523a;	 Catch:{ all -> 0x0301 }
        r12 = 0;
        r7 = 0;
        r10 = r5;
        goto L_0x0106;
    L_0x02fe:
        r4 = 0;
        goto L_0x0047;
    L_0x0301:
        r2 = move-exception;
        r4 = 0;
        r3 = 0;
        r15 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r15;
        goto L_0x0278;
    L_0x030a:
        r2 = move-exception;
        r4 = 0;
        r2 = 0;
    L_0x030d:
        r0 = r17;
        r5 = r0.f14427b;	 Catch:{ all -> 0x0301 }
        r6 = "SmartMetering failed, switching it off.";
        r5.mo520f(r6);	 Catch:{ all -> 0x0301 }
        r5 = p000.go.aa;	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r6 = r0.f14439n;	 Catch:{ all -> 0x0301 }
        r6 = r6.f11523a;	 Catch:{ all -> 0x0301 }
        r15 = r5;
        r5 = r2;
        r2 = r15;
        r16 = r6;
        r6 = r4;
        r4 = r16;
        goto L_0x00bc;
    L_0x0328:
        r2 = move-exception;
        r2 = 0;
        goto L_0x030d;
    L_0x032b:
        r3 = r3.f1718a;	 Catch:{ all -> 0x00d6 }
        if (r2 != 0) goto L_0x0337;
    L_0x032f:
        r0 = r17;
        r2 = r0.f14426a;	 Catch:{ all -> 0x00d6 }
        r2.mo617a(r3);	 Catch:{ all -> 0x00d6 }
    L_0x0336:
        throw r4;	 Catch:{ all -> 0x00d6 }
    L_0x0337:
        r0 = r19;
        r2 = r0.f4753b;	 Catch:{ all -> 0x00d6 }
        r5 = new dti;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r5.<init>(r0, r3);	 Catch:{ all -> 0x00d6 }
        r2.mo2870a(r5);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f14444s;	 Catch:{ all -> 0x00d6 }
        r0 = r19;
        r3 = r0.f4753b;	 Catch:{ all -> 0x00d6 }
        r3 = r3.mo1482h();	 Catch:{ all -> 0x00d6 }
        r2.m2762a(r3);	 Catch:{ all -> 0x00d6 }
        goto L_0x0336;
    L_0x0355:
        r5 = move-exception;
        goto L_0x030d;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtg.a(fwm, fwa):void");
    }
}
