package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: axw */
final class axw implements ffe {
    /* renamed from: a */
    private static final String f10505a = bli.m862a("AdviceFrmRtrivlCmd");
    /* renamed from: b */
    private final ayb f10506b;
    /* renamed from: c */
    private final fmg f10507c;
    /* renamed from: d */
    private final fhg f10508d;
    /* renamed from: e */
    private final kpk f10509e;
    /* renamed from: f */
    private final axm f10510f;

    /* renamed from: a */
    private static /* synthetic */ void m7143a(Throwable th, fhh fhh) {
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
    private static /* synthetic */ void m7144a(Throwable th, fko fko) {
        if (th != null) {
            try {
                fko.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fko.close();
    }

    public axw(ayb ayb, fmg fmg, fhg fhg, kpk kpk, axm axm) {
        this.f10506b = ayb;
        this.f10507c = fmg;
        this.f10508d = fhg;
        this.f10509e = kpk;
        this.f10510f = axm;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo347a() {
        /*
        r7 = this;
        r0 = r7.f10507c;	 Catch:{ InterruptedException -> 0x007c, isr -> 0x006c }
        r1 = 1;
        r2 = r0.m2336a(r1);	 Catch:{ InterruptedException -> 0x007c, isr -> 0x006c }
        r0 = r7.f10508d;	 Catch:{ all -> 0x0075 }
        r3 = r0.mo1382a();	 Catch:{ all -> 0x0075 }
        r0 = r7.f10509e;	 Catch:{ all -> 0x007e }
        r0 = p000.isr.m4143a(r0);	 Catch:{ all -> 0x007e }
        r0 = (p000.ffw) r0;	 Catch:{ all -> 0x007e }
        r1 = new fio;	 Catch:{ all -> 0x007e }
        r0 = r0.mo2860b();	 Catch:{ all -> 0x007e }
        r0 = (p000.fim) r0;	 Catch:{ all -> 0x007e }
        r1.<init>(r0);	 Catch:{ all -> 0x007e }
        r1.m2304a(r2);	 Catch:{ all -> 0x007e }
        r0 = 1;
        r0 = new p000.fim[r0];	 Catch:{ all -> 0x007e }
        r1 = r1.m2301a();	 Catch:{ all -> 0x007e }
        r4 = 0;
        r0[r4] = r1;	 Catch:{ all -> 0x007e }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ all -> 0x007e }
        r1 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x007e }
        r3.mo1381a(r0, r1);	 Catch:{ all -> 0x007e }
        r3.close();	 Catch:{ all -> 0x007e }
        r0 = r2.mo2649a();	 Catch:{ all -> 0x007e }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x007e }
        r4 = r7.f10506b;	 Catch:{ all -> 0x007e }
        r5 = new gfw;	 Catch:{ all -> 0x007e }
        r1 = r7.f10510f;	 Catch:{ all -> 0x007e }
        r1 = r1.m736b();	 Catch:{ all -> 0x007e }
        r1 = r1.mo2860b();	 Catch:{ all -> 0x007e }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x007e }
        r1 = r1.intValue();	 Catch:{ all -> 0x007e }
        r1 = p000.iqm.m4037a(r1);	 Catch:{ all -> 0x007e }
        r6 = r0.m17318h();	 Catch:{ all -> 0x007e }
        r5.<init>(r0, r1, r6);	 Catch:{ all -> 0x007e }
        r4.mo398b(r5);	 Catch:{ all -> 0x007e }
        if (r3 == 0) goto L_0x0067;
    L_0x0063:
        r0 = 0;
        p000.axw.m7143a(r0, r3);	 Catch:{ all -> 0x0075 }
    L_0x0067:
        r0 = 0;
        p000.axw.m7144a(r0, r2);	 Catch:{ InterruptedException -> 0x007c, isr -> 0x006c }
    L_0x006b:
        return;
    L_0x006c:
        r0 = move-exception;
    L_0x006d:
        r1 = f10505a;
        r2 = "unable to retrieve frame";
        p000.bli.m867b(r1, r2, r0);
        goto L_0x006b;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0077 }
    L_0x0077:
        r1 = move-exception;
        p000.axw.m7144a(r0, r2);	 Catch:{ InterruptedException -> 0x007c, isr -> 0x006c }
        throw r1;	 Catch:{ InterruptedException -> 0x007c, isr -> 0x006c }
    L_0x007c:
        r0 = move-exception;
        goto L_0x006d;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0080 }
    L_0x0080:
        r1 = move-exception;
        if (r3 == 0) goto L_0x0086;
    L_0x0083:
        p000.axw.m7143a(r0, r3);	 Catch:{ all -> 0x0075 }
    L_0x0086:
        throw r1;	 Catch:{ all -> 0x0075 }
        */
        throw new UnsupportedOperationException("Method not decompiled: axw.a():void");
    }
}
