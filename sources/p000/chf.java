package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import android.view.Surface;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: chf */
public final class chf implements ffe {
    /* renamed from: e */
    private static final String f11941e = bli.m862a("BurstCapCommand");
    /* renamed from: a */
    public final int f11942a;
    /* renamed from: b */
    public final kpw f11943b = kpw.m18056d();
    /* renamed from: c */
    public final AtomicBoolean f11944c = new AtomicBoolean(false);
    /* renamed from: d */
    public final kpw f11945d = kpw.m18056d();
    /* renamed from: f */
    private final fhg f11946f;
    /* renamed from: g */
    private final kpk f11947g;
    /* renamed from: h */
    private final fxi f11948h;
    /* renamed from: i */
    private final fjk f11949i;
    /* renamed from: j */
    private final Surface f11950j;
    /* renamed from: k */
    private final kpk f11951k;
    /* renamed from: l */
    private final Runnable f11952l;
    /* renamed from: m */
    private final int f11953m;
    /* renamed from: n */
    private final ckj f11954n;
    /* renamed from: o */
    private final ird f11955o;
    /* renamed from: p */
    private final jmr f11956p;
    /* renamed from: q */
    private final BurstSessionStatistics f11957q;
    /* renamed from: r */
    private final ikb f11958r = new ikb();
    /* renamed from: s */
    private final UUID f11959s;
    /* renamed from: t */
    private final iqp f11960t;

    /* renamed from: a */
    private static /* synthetic */ void m8188a(Throwable th, cko cko) {
        if (th != null) {
            try {
                cko.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        cko.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m8189a(Throwable th, fhh fhh) {
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
    private static /* synthetic */ void m8190a(Throwable th, fjl fjl) {
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

    public chf(fhg fhg, kpk kpk, fxi fxi, fjk fjk, Surface surface, kpk kpk2, ckj ckj, Runnable runnable, int i, int i2, ird ird, jmr jmr, UUID uuid, iqp iqp) {
        this.f11946f = fhg;
        this.f11947g = kpk;
        this.f11948h = fxi;
        this.f11949i = fjk;
        this.f11950j = surface;
        this.f11951k = kpk2;
        this.f11954n = ckj;
        this.f11952l = runnable;
        this.f11953m = i;
        this.f11942a = i2;
        this.f11955o = ird;
        this.f11956p = jmr;
        this.f11959s = uuid;
        this.f11957q = (BurstSessionStatistics) Instrumentation.instance().burstStats().getCurrentSession();
        this.f11960t = iqp;
    }

    /* renamed from: a */
    public static boolean m8191a(fjk fjk, int i) {
        int i2 = i + 5;
        int intValue = ((Integer) fjk.mo1400b().mo2860b()).intValue();
        String str = f11941e;
        StringBuilder stringBuilder = new StringBuilder(76);
        stringBuilder.append("canStartBurst : availableCapacity=");
        stringBuilder.append(intValue);
        stringBuilder.append(", minCapacityNeeded=");
        stringBuilder.append(i2);
        bli.m863a(str, stringBuilder.toString());
        return intValue >= i2;
    }

    /* renamed from: b */
    private final fio m8192b() {
        int i;
        if (this.f11948h == fxi.ON) {
            i = 2;
        } else {
            i = 0;
        }
        ffw ffw = (ffw) isr.m4143a(this.f11947g);
        fis[] fisArr = new fis[1];
        fin[] finArr = new fin[6];
        Key key = CaptureRequest.CONTROL_AE_MODE;
        Integer valueOf = Integer.valueOf(1);
        finArr[0] = new fin(key, valueOf);
        finArr[1] = new fin(CaptureRequest.CONTROL_MODE, valueOf);
        finArr[2] = new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(i));
        Key key2 = CaptureRequest.CONTROL_AF_MODE;
        Integer valueOf2 = Integer.valueOf(4);
        finArr[3] = new fin(key2, valueOf2);
        finArr[4] = new fin(CaptureRequest.EDGE_MODE, Integer.valueOf(3));
        finArr[5] = new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf2);
        fisArr[0] = fds.m10240a(Arrays.asList(finArr));
        return new fio((fim) ffw.m17308a(fisArr).mo2860b()).m2302a(5);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo347a() {
        /*
        r11 = this;
        r7 = 0;
        r1 = 1;
        r6 = 0;
        r0 = r11.f11953m;
        if (r0 <= 0) goto L_0x01c5;
    L_0x0007:
        r0 = r1;
    L_0x0008:
        r2 = "Need to request at least one frame!";
        p000.jri.m13154b(r0, r2);
        r0 = r11.f11953m;
        r2 = r11.f11942a;
        if (r0 > r2) goto L_0x01c2;
    L_0x0013:
        r0 = "ImageReader is too small for burst!";
        p000.jri.m13154b(r1, r0);
        r0 = r11.f11955o;
        r1 = "BurstCaptureCommand#run";
        r0.mo1903a(r1);
        r0 = r11.f11946f;	 Catch:{ all -> 0x0145 }
        r8 = r0.mo1382a();	 Catch:{ all -> 0x0145 }
        r0 = r11.f11949i;	 Catch:{ all -> 0x013c }
        r9 = r0.mo1398a();	 Catch:{ all -> 0x013c }
        r0 = r11.f11958r;	 Catch:{ all -> 0x0133 }
        r0.mo1879a(r9);	 Catch:{ all -> 0x0133 }
        r0 = r11.f11953m;	 Catch:{ all -> 0x0133 }
        r0 = r0 + 5;
        r0 = r9.mo3437a(r0);	 Catch:{ all -> 0x0133 }
        p000.kow.m13625c(r0);	 Catch:{ all -> 0x0133 }
        r0 = new cko;	 Catch:{ all -> 0x0133 }
        r1 = r11.f11953m;	 Catch:{ all -> 0x0133 }
        r2 = r11.f11951k;	 Catch:{ all -> 0x0133 }
        r3 = r11.f11954n;	 Catch:{ all -> 0x0133 }
        r4 = r11.f11956p;	 Catch:{ all -> 0x0133 }
        r5 = r11.f11959s;	 Catch:{ all -> 0x0133 }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0133 }
        r1 = r9.x_();	 Catch:{ all -> 0x012c }
        r2 = new ckp;	 Catch:{ all -> 0x012c }
        r2.<init>(r0, r1);	 Catch:{ all -> 0x012c }
        r1 = r11.m8192b();	 Catch:{ all -> 0x012c }
        r1.m2305a(r2);	 Catch:{ all -> 0x012c }
        r2 = r11.f11950j;	 Catch:{ all -> 0x012c }
        r2 = p000.fib.m2298a(r2);	 Catch:{ all -> 0x012c }
        r1.m2305a(r2);	 Catch:{ all -> 0x012c }
        r2 = 1;
        r2 = new p000.fim[r2];	 Catch:{ all -> 0x012c }
        r1 = r1.m2301a();	 Catch:{ all -> 0x012c }
        r3 = 0;
        r2[r3] = r1;	 Catch:{ all -> 0x012c }
        r1 = java.util.Arrays.asList(r2);	 Catch:{ all -> 0x012c }
        r2 = p000.fiv.REPEATING;	 Catch:{ all -> 0x012c }
        r8.mo1381a(r1, r2);	 Catch:{ all -> 0x012c }
    L_0x0076:
        r1 = r9.mo2650b();	 Catch:{ all -> 0x012c }
        if (r1 != 0) goto L_0x0156;
    L_0x007c:
        r1 = r9.mo3439d();	 Catch:{ InterruptedException -> 0x0103 }
        r2 = r11.f11942a;	 Catch:{ InterruptedException -> 0x0103 }
        if (r1 >= r2) goto L_0x008e;
    L_0x0084:
        r2 = 1;
        r2 = r9.mo3438b(r2);	 Catch:{ InterruptedException -> 0x0103 }
        if (r2 == 0) goto L_0x00e4;
    L_0x008b:
        r0.m8296b();	 Catch:{ InterruptedException -> 0x0103 }
    L_0x008e:
        r1 = r9.mo2649a();	 Catch:{ InterruptedException -> 0x0103 }
        r1 = (p000.fjj) r1;	 Catch:{ InterruptedException -> 0x0103 }
        r2 = r11.f11957q;	 Catch:{ InterruptedException -> 0x0103 }
        r2.m8412d();	 Catch:{ InterruptedException -> 0x0103 }
        r2 = r11.f11960t;	 Catch:{ InterruptedException -> 0x0103 }
        r3 = r1.mo3043d();	 Catch:{ InterruptedException -> 0x0103 }
        r4 = 1;
        r4 = new int[r4];	 Catch:{ InterruptedException -> 0x0103 }
        r5 = 0;
        r10 = 35;
        r4[r5] = r10;	 Catch:{ InterruptedException -> 0x0103 }
        r4 = p000.fds.m10247a(r1, r4);	 Catch:{ InterruptedException -> 0x0103 }
        if (r4 == 0) goto L_0x00e2;
    L_0x00ad:
        r1 = r4.mo2720g();	 Catch:{ InterruptedException -> 0x0103 }
        r5 = r4.mo2717d();	 Catch:{ InterruptedException -> 0x0103 }
        r1 = p000.iqp.m4043a(r1, r5);	 Catch:{ InterruptedException -> 0x0103 }
        r1 = p000.ion.m3936a(r1, r2);	 Catch:{ InterruptedException -> 0x0103 }
        r4.mo2714a(r1);	 Catch:{ InterruptedException -> 0x0103 }
        r1 = new fkp;	 Catch:{ InterruptedException -> 0x0103 }
        r1.<init>(r4, r3);	 Catch:{ InterruptedException -> 0x0103 }
    L_0x00c5:
        if (r1 == 0) goto L_0x00cc;
    L_0x00c7:
        r0.m8295a(r1);	 Catch:{ InterruptedException -> 0x0103 }
        r6 = r6 + 1;
    L_0x00cc:
        r1 = r11.f11944c;	 Catch:{ bbg -> 0x00e0 }
        r1 = r1.get();	 Catch:{ bbg -> 0x00e0 }
        if (r1 == 0) goto L_0x0076;
    L_0x00d4:
        r1 = 3;
        if (r6 < r1) goto L_0x0076;
    L_0x00d7:
        r0.m8297c();	 Catch:{ bbg -> 0x00e0 }
        r1 = r11.f11958r;	 Catch:{ bbg -> 0x00e0 }
        r1.close();	 Catch:{ bbg -> 0x00e0 }
        goto L_0x0076;
    L_0x00e0:
        r1 = move-exception;
        goto L_0x0076;
    L_0x00e2:
        r1 = r7;
        goto L_0x00c5;
    L_0x00e4:
        r2 = r0.m8298d();	 Catch:{ InterruptedException -> 0x0103 }
        if (r2 < r1) goto L_0x008e;
    L_0x00ea:
        r1 = r11.f11944c;	 Catch:{ InterruptedException -> 0x0103 }
        r1 = r1.get();	 Catch:{ InterruptedException -> 0x0103 }
        if (r1 == 0) goto L_0x010d;
    L_0x00f2:
        r1 = f11941e;	 Catch:{ InterruptedException -> 0x0103 }
        r2 = "Exiting burst early as stop requested and no capacity present.";
        p000.bli.m873e(r1, r2);	 Catch:{ InterruptedException -> 0x0103 }
        r0.m8297c();	 Catch:{ InterruptedException -> 0x0103 }
        r1 = r11.f11958r;	 Catch:{ InterruptedException -> 0x0103 }
        r1.close();	 Catch:{ InterruptedException -> 0x0103 }
        goto L_0x0076;
    L_0x0103:
        r1 = move-exception;
        r1 = r11.f11958r;	 Catch:{ bbg -> 0x010a }
        r1.close();	 Catch:{ bbg -> 0x010a }
        goto L_0x00cc;
    L_0x010a:
        r1 = move-exception;
        goto L_0x0076;
    L_0x010d:
        r1 = f11941e;	 Catch:{ InterruptedException -> 0x0103 }
        r2 = "Could not increase capacity for burst. Will retry next frame...";
        p000.bli.m873e(r1, r2);	 Catch:{ InterruptedException -> 0x0103 }
        r2 = 33;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x011b }
        goto L_0x0076;
    L_0x011b:
        r1 = move-exception;
        r1 = f11941e;	 Catch:{ InterruptedException -> 0x0103 }
        r2 = "Delaying frame was interrupted.";
        p000.bli.m873e(r1, r2);	 Catch:{ InterruptedException -> 0x0103 }
        r1 = java.lang.Thread.currentThread();	 Catch:{ InterruptedException -> 0x0103 }
        r1.interrupt();	 Catch:{ InterruptedException -> 0x0103 }
        goto L_0x0076;
    L_0x012c:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x012e }
    L_0x012e:
        r2 = move-exception;
        p000.chf.m8188a(r1, r0);	 Catch:{ all -> 0x0133 }
        throw r2;	 Catch:{ all -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0135 }
    L_0x0135:
        r1 = move-exception;
        if (r9 == 0) goto L_0x013b;
    L_0x0138:
        p000.chf.m8190a(r0, r9);	 Catch:{ all -> 0x013c }
    L_0x013b:
        throw r1;	 Catch:{ all -> 0x013c }
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x013e }
    L_0x013e:
        r1 = move-exception;
        if (r8 == 0) goto L_0x0144;
    L_0x0141:
        p000.chf.m8189a(r0, r8);	 Catch:{ all -> 0x0145 }
    L_0x0144:
        throw r1;	 Catch:{ all -> 0x0145 }
    L_0x0145:
        r0 = move-exception;
        r1 = r11.f11943b;	 Catch:{ all -> 0x01d1 }
        r1.m17780a(r0);	 Catch:{ all -> 0x01d1 }
        r0 = r11.f11952l;
        r0.run();
        r0 = r11.f11955o;
        r0.mo1904b();
    L_0x0155:
        return;
    L_0x0156:
        r1 = r11.f11945d;	 Catch:{ all -> 0x012c }
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x012c }
        r1.mo3557a(r2);	 Catch:{ all -> 0x012c }
        r1 = r11.m8192b();	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER;	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r3 = 2;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r1.m2303a(r2, r3);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE;	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r3 = 0;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r1.m2303a(r2, r3);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r2 = 1;
        r2 = new p000.fim[r2];	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r3 = r1.m2301a();	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r4 = 0;
        r2[r4] = r3;	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r2 = java.util.Arrays.asList(r2);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r3 = p000.fiv.REPEATING;	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r8.mo1381a(r2, r3);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r2 = 1;
        r2 = new p000.fim[r2];	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r1 = r1.m2301a();	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r3 = 0;
        r2[r3] = r1;	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r1 = java.util.Arrays.asList(r2);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r2 = p000.fiv.NON_REPEATING;	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
        r8.mo1381a(r1, r2);	 Catch:{ isr -> 0x01c8, InterruptedException -> 0x01dd }
    L_0x019e:
        r1 = r0.m8294a();	 Catch:{ all -> 0x012c }
        r2 = r11.f11943b;	 Catch:{ all -> 0x012c }
        r2.mo3557a(r1);	 Catch:{ all -> 0x012c }
        r1 = 0;
        p000.chf.m8188a(r1, r0);	 Catch:{ all -> 0x0133 }
        if (r9 == 0) goto L_0x01b1;
    L_0x01ad:
        r0 = 0;
        p000.chf.m8190a(r0, r9);	 Catch:{ all -> 0x013c }
    L_0x01b1:
        if (r8 == 0) goto L_0x01b7;
    L_0x01b3:
        r0 = 0;
        p000.chf.m8189a(r0, r8);	 Catch:{ all -> 0x0145 }
    L_0x01b7:
        r0 = r11.f11952l;
        r0.run();
        r0 = r11.f11955o;
        r0.mo1904b();
        goto L_0x0155;
    L_0x01c2:
        r1 = r6;
        goto L_0x0013;
    L_0x01c5:
        r0 = r6;
        goto L_0x0008;
    L_0x01c8:
        r1 = move-exception;
    L_0x01c9:
        r1 = f11941e;	 Catch:{ all -> 0x012c }
        r2 = "Could not submit unlock AF request! Perhaps camera is shutting down.";
        p000.bli.m866b(r1, r2);	 Catch:{ all -> 0x012c }
        goto L_0x019e;
    L_0x01d1:
        r0 = move-exception;
        r1 = r11.f11952l;
        r1.run();
        r1 = r11.f11955o;
        r1.mo1904b();
        throw r0;
    L_0x01dd:
        r1 = move-exception;
        goto L_0x01c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: chf.a():void");
    }

    public final String toString() {
        return "BurstCapture";
    }
}
