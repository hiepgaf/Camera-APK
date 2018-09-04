package p000;

/* compiled from: PG */
/* renamed from: duk */
final class duk implements ffe {
    /* renamed from: a */
    public final kpw f14570a = kpw.m18056d();
    /* renamed from: b */
    private final dva f14571b;
    /* renamed from: c */
    private final /* synthetic */ dui f14572c;

    /* renamed from: a */
    private static /* synthetic */ void m9411a(Throwable th, fhh fhh) {
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

    duk(dui dui, dva dva) {
        this.f14572c = dui;
        this.f14571b = dva;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo347a() {
        /*
        r12 = this;
        r2 = 0;
        r0 = r12.f14572c;	 Catch:{ all -> 0x00e2 }
        r1 = r0.f3309a;	 Catch:{ all -> 0x00e2 }
        r0 = r0.f3316h;	 Catch:{ all -> 0x00e2 }
        r3 = r1.m2336a(r0);	 Catch:{ all -> 0x00e2 }
    L_0x000b:
        r1 = new fwn;	 Catch:{ all -> 0x00db }
        r1.<init>();	 Catch:{ all -> 0x00db }
        r0 = r12.f14572c;	 Catch:{ all -> 0x00db }
        r0 = r0.f3310b;	 Catch:{ all -> 0x00db }
        r4 = r0.mo1382a();	 Catch:{ all -> 0x00db }
        r5 = new fio;	 Catch:{ all -> 0x010a }
        r0 = r12.f14572c;	 Catch:{ all -> 0x010a }
        r0 = r0.f3311c;	 Catch:{ all -> 0x010a }
        r0 = p000.isr.m4143a(r0);	 Catch:{ all -> 0x010a }
        r0 = (p000.ffw) r0;	 Catch:{ all -> 0x010a }
        r0 = r0.mo2860b();	 Catch:{ all -> 0x010a }
        r0 = (p000.fim) r0;	 Catch:{ all -> 0x010a }
        r5.<init>(r0);	 Catch:{ all -> 0x010a }
        r5.m2304a(r3);	 Catch:{ all -> 0x010a }
        r5.m2307a(r1);	 Catch:{ all -> 0x010a }
        r0 = r12.f14572c;	 Catch:{ all -> 0x010a }
        r0 = r0.f3312d;	 Catch:{ all -> 0x010a }
        r6 = r0.m10337a();	 Catch:{ all -> 0x010a }
        r0 = 1;
        r0 = new p000.fim[r0];	 Catch:{ all -> 0x010a }
        r5 = r5.m2301a();	 Catch:{ all -> 0x010a }
        r8 = 0;
        r0[r8] = r5;	 Catch:{ all -> 0x010a }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ all -> 0x010a }
        r5 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x010a }
        r4.mo1381a(r0, r5);	 Catch:{ all -> 0x010a }
        if (r4 == 0) goto L_0x0054;
    L_0x0050:
        r0 = 0;
        p000.duk.m9411a(r0, r4);	 Catch:{ all -> 0x00db }
    L_0x0054:
        r0 = r3.mo2649a();	 Catch:{ all -> 0x00db }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x00db }
        r1 = r1.f16576a;	 Catch:{ ExecutionException -> 0x00fa }
        r1 = r1.get();	 Catch:{ ExecutionException -> 0x00fa }
        r1 = (p000.iwp) r1;	 Catch:{ ExecutionException -> 0x00fa }
        if (r0 == 0) goto L_0x00aa;
    L_0x0064:
        r4 = r0.mo2719f();	 Catch:{ ExecutionException -> 0x00fa }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ ExecutionException -> 0x00fa }
        r5 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;	 Catch:{ ExecutionException -> 0x00fa }
        r5 = r1.mo3143a(r5);	 Catch:{ ExecutionException -> 0x00fa }
        r4 = p000.kbf.m16436b(r4, r5);	 Catch:{ ExecutionException -> 0x00fa }
        r8 = r0.mo2719f();	 Catch:{ ExecutionException -> 0x00fa }
        r5 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;	 Catch:{ ExecutionException -> 0x00fa }
        r5 = r1.mo3143a(r5);	 Catch:{ ExecutionException -> 0x00fa }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ ExecutionException -> 0x00fa }
        r10 = java.lang.String.valueOf(r5);	 Catch:{ ExecutionException -> 0x00fa }
        r10 = r10.length();	 Catch:{ ExecutionException -> 0x00fa }
        r10 = r10 + 105;
        r11 = new java.lang.StringBuilder;	 Catch:{ ExecutionException -> 0x00fa }
        r11.<init>(r10);	 Catch:{ ExecutionException -> 0x00fa }
        r10 = "Raw smart metering image and metadata have differenttimestamps: image = ";
        r11.append(r10);	 Catch:{ ExecutionException -> 0x00fa }
        r11.append(r8);	 Catch:{ ExecutionException -> 0x00fa }
        r8 = ", metadata = ";
        r11.append(r8);	 Catch:{ ExecutionException -> 0x00fa }
        r11.append(r5);	 Catch:{ ExecutionException -> 0x00fa }
        r5 = r11.toString();	 Catch:{ ExecutionException -> 0x00fa }
        p000.jri.m13154b(r4, r5);	 Catch:{ ExecutionException -> 0x00fa }
    L_0x00aa:
        r4 = p000.fxq.m2413a(r1);	 Catch:{ ExecutionException -> 0x00fa }
        if (r4 == 0) goto L_0x00f0;
    L_0x00b0:
        r4 = r12.f14571b;	 Catch:{ ExecutionException -> 0x00fa }
        r4.mo2977a(r0, r1);	 Catch:{ ExecutionException -> 0x00fa }
        r0 = r2;
    L_0x00b6:
        if (r0 == 0) goto L_0x00bb;
    L_0x00b8:
        r0.close();	 Catch:{ all -> 0x00db }
    L_0x00bb:
        r0 = r12.f14572c;	 Catch:{ all -> 0x00db }
        r1 = r0.f3312d;	 Catch:{ all -> 0x00db }
        r0 = r0.f3315g;	 Catch:{ all -> 0x00db }
        r4 = (long) r0;	 Catch:{ all -> 0x00db }
        r4 = r4 + r6;
        r0 = r1.f15993a;	 Catch:{ all -> 0x00db }
        r0.lock();	 Catch:{ all -> 0x00db }
    L_0x00c8:
        r6 = r1.f15995c;	 Catch:{ all -> 0x00d4 }
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x00e9;
    L_0x00ce:
        r0 = r1.f15994b;	 Catch:{ all -> 0x00d4 }
        r0.await();	 Catch:{ all -> 0x00d4 }
        goto L_0x00c8;
    L_0x00d4:
        r0 = move-exception;
        r1 = r1.f15993a;	 Catch:{ all -> 0x00db }
        r1.unlock();	 Catch:{ all -> 0x00db }
        throw r0;	 Catch:{ all -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00dd }
    L_0x00dd:
        r1 = move-exception;
        r3.close();	 Catch:{ all -> 0x011a }
    L_0x00e1:
        throw r1;	 Catch:{ all -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        r1 = r12.f14570a;
        r1.mo3557a(r2);
        throw r0;
    L_0x00e9:
        r0 = r1.f15993a;	 Catch:{ all -> 0x00db }
        r0.unlock();	 Catch:{ all -> 0x00db }
        goto L_0x000b;
    L_0x00f0:
        r1 = r12.f14572c;	 Catch:{ ExecutionException -> 0x00fa }
        r1 = r1.f3313e;	 Catch:{ ExecutionException -> 0x00fa }
        r4 = "skipping smart metering frame due to touch to expose / focus";
        r1.mo514b(r4);	 Catch:{ ExecutionException -> 0x00fa }
        goto L_0x00b6;
    L_0x00fa:
        r1 = move-exception;
        r1 = r12.f14572c;	 Catch:{ all -> 0x0113 }
        r1 = r1.f3313e;	 Catch:{ all -> 0x0113 }
        r4 = "Metadata never arrived for metering frame";
        r1.mo520f(r4);	 Catch:{ all -> 0x0113 }
        if (r0 == 0) goto L_0x00bb;
    L_0x0106:
        r0.close();	 Catch:{ all -> 0x00db }
        goto L_0x00bb;
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x010c }
    L_0x010c:
        r1 = move-exception;
        if (r4 == 0) goto L_0x0112;
    L_0x010f:
        p000.duk.m9411a(r0, r4);	 Catch:{ all -> 0x00db }
    L_0x0112:
        throw r1;	 Catch:{ all -> 0x00db }
    L_0x0113:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0119;
    L_0x0116:
        r0.close();	 Catch:{ all -> 0x00db }
    L_0x0119:
        throw r1;	 Catch:{ all -> 0x00db }
    L_0x011a:
        r3 = move-exception;
        p000.kqg.m5044a(r0, r3);	 Catch:{ all -> 0x00e2 }
        goto L_0x00e1;
        */
        throw new UnsupportedOperationException("Method not decompiled: duk.a():void");
    }

    public final String toString() {
        return "BackgroundMeteringLoop";
    }
}
