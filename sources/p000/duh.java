package p000;

import android.annotation.TargetApi;
import com.google.googlex.gcam.AeResults;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: duh */
final class duh implements duf, ijk, iqo {
    /* renamed from: a */
    public final Object f14556a = new Object();
    /* renamed from: b */
    public int f14557b = 0;
    /* renamed from: c */
    private final dva f14558c;
    /* renamed from: d */
    private final dui f14559d;
    /* renamed from: e */
    private final Object f14560e = new Object();
    /* renamed from: f */
    private boolean f14561f = false;
    /* renamed from: g */
    private int f14562g;
    /* renamed from: h */
    private int f14563h;
    /* renamed from: i */
    private AeResults f14564i = null;
    /* renamed from: j */
    private iwp f14565j = null;
    /* renamed from: k */
    private dva f14566k = null;
    /* renamed from: l */
    private ikb f14567l = null;
    /* renamed from: m */
    private kpk f14568m = null;

    static {
        bli.m862a("SMManager");
    }

    duh(dva dva, dui dui, int i) {
        this.f14563h = i;
        this.f14559d = dui;
        this.f14558c = dva;
    }

    public final void close() {
        synchronized (this.f14556a) {
            this.f14561f = true;
            ikb ikb = this.f14567l;
            this.f14567l = null;
            this.f14568m = null;
            this.f14563h = go.aa;
        }
        if (ikb != null) {
            ikb.close();
        }
    }

    /* renamed from: b */
    public final int mo1176b() {
        int i;
        synchronized (this.f14556a) {
            i = this.f14563h;
        }
        return i;
    }

    /* renamed from: c */
    public final kbg mo1177c() {
        kbg a;
        synchronized (this.f14560e) {
            a = this.f14566k.mo2976a();
        }
        return a;
    }

    /* renamed from: a */
    public final kpk mo385a() {
        synchronized (this.f14556a) {
            synchronized (this.f14556a) {
                if (this.f14561f) {
                } else {
                    this.f14562g = go.ab;
                    if (this.f14557b > 0) {
                        boolean z;
                        if (this.f14567l == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jri.m13143a(z);
                    } else {
                        ikb ikb = this.f14567l;
                        if (ikb == null || this.f14563h != this.f14562g) {
                            if (ikb != null) {
                                m9410e();
                            }
                            this.f14563h = this.f14562g;
                            if (this.f14563h == go.aa) {
                            } else {
                                m9409d();
                            }
                        }
                    }
                }
            }
        }
        return kow.m13617a(Boolean.valueOf(true));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.dug mo1175a(p000.fip r14, p000.fio r15, long r16) {
        /*
        r13 = this;
        r1 = r13.f14556a;
        monitor-enter(r1);
        r13.m9404f();	 Catch:{ all -> 0x0154 }
        monitor-exit(r1);	 Catch:{ all -> 0x0154 }
        r1 = r13.f14556a;
        monitor-enter(r1);
        r0 = r13.f14567l;	 Catch:{ all -> 0x0157 }
        r2 = r13.f14568m;	 Catch:{ all -> 0x0157 }
        r3 = 0;
        r13.f14567l = r3;	 Catch:{ all -> 0x0157 }
        r3 = 0;
        r13.f14568m = r3;	 Catch:{ all -> 0x0157 }
        monitor-exit(r1);	 Catch:{ all -> 0x0157 }
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0.close();
        if (r2 == 0) goto L_0x001f;
    L_0x001c:
        r2.get();	 Catch:{ ExecutionException -> 0x015a }
    L_0x001f:
        r1 = r13.f14556a;
        monitor-enter(r1);
        r13.m9404f();	 Catch:{ all -> 0x004d }
        r0 = r13.f14563h;	 Catch:{ all -> 0x004d }
        r2 = p000.go.aa;	 Catch:{ all -> 0x004d }
        if (r0 != r2) goto L_0x003a;
    L_0x002b:
        r0 = r13.f14557b;	 Catch:{ all -> 0x004d }
        r0 = r0 + 1;
        r13.f14557b = r0;	 Catch:{ all -> 0x004d }
        r0 = new dug;	 Catch:{ all -> 0x004d }
        r2 = 0;
        r3 = 0;
        r0.<init>(r13, r2, r3);	 Catch:{ all -> 0x004d }
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
    L_0x0039:
        return r0;
    L_0x003a:
        r0 = r13.f14557b;	 Catch:{ all -> 0x004d }
        if (r0 <= 0) goto L_0x0050;
    L_0x003e:
        r0 = r0 + 1;
        r13.f14557b = r0;	 Catch:{ all -> 0x004d }
        r0 = new dug;	 Catch:{ all -> 0x004d }
        r2 = r13.f14564i;	 Catch:{ all -> 0x004d }
        r3 = r13.f14565j;	 Catch:{ all -> 0x004d }
        r0.<init>(r13, r2, r3);	 Catch:{ all -> 0x004d }
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        goto L_0x0039;
    L_0x004d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        throw r0;
    L_0x0050:
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        r3 = r13.f14560e;
        monitor-enter(r3);
        r0 = r13.f14566k;	 Catch:{ all -> 0x0106 }
        r1 = "Must start loop before invoking startCapture.";
        p000.jri.m13139a(r0, r1);	 Catch:{ all -> 0x0106 }
        r4 = r13.f14559d;	 Catch:{ all -> 0x0106 }
        r5 = r13.f14566k;	 Catch:{ all -> 0x0106 }
        r0 = r4.f3309a;	 Catch:{ all -> 0x0106 }
        r1 = 1;
        r6 = r0.m2336a(r1);	 Catch:{ all -> 0x0106 }
        r2 = 0;
        r0 = r2;
    L_0x0068:
        r1 = 10;
        if (r0 >= r1) goto L_0x00f3;
    L_0x006c:
        r2 = r0 + 1;
        r1 = new fwn;	 Catch:{ all -> 0x00ff }
        r1.<init>();	 Catch:{ all -> 0x00ff }
        r0 = new fio;	 Catch:{ all -> 0x00ff }
        r0.<init>(r15);	 Catch:{ all -> 0x00ff }
        r0.m2304a(r6);	 Catch:{ all -> 0x00ff }
        r0.m2307a(r1);	 Catch:{ all -> 0x00ff }
        r0 = r0.m2301a();	 Catch:{ all -> 0x00ff }
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ all -> 0x00ff }
        r7 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x00ff }
        r14.mo1381a(r0, r7);	 Catch:{ all -> 0x00ff }
        r0 = r6.mo2649a();	 Catch:{ all -> 0x00ff }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x00ff }
        r1 = r1.f16576a;	 Catch:{ ExecutionException -> 0x0161 }
        r1 = r1.get();	 Catch:{ ExecutionException -> 0x0161 }
        r1 = (p000.iwp) r1;	 Catch:{ ExecutionException -> 0x0161 }
        if (r0 == 0) goto L_0x00e1;
    L_0x009b:
        r8 = r0.mo2719f();	 Catch:{ ExecutionException -> 0x0161 }
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;	 Catch:{ ExecutionException -> 0x0161 }
        r8 = r1.mo3143a(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r7 = p000.kbf.m16436b(r7, r8);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = r0.mo2719f();	 Catch:{ ExecutionException -> 0x0161 }
        r10 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;	 Catch:{ ExecutionException -> 0x0161 }
        r10 = r1.mo3143a(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r11 = java.lang.String.valueOf(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r11 = r11.length();	 Catch:{ ExecutionException -> 0x0161 }
        r11 = r11 + 105;
        r12 = new java.lang.StringBuilder;	 Catch:{ ExecutionException -> 0x0161 }
        r12.<init>(r11);	 Catch:{ ExecutionException -> 0x0161 }
        r11 = "Raw smart metering image and metadata have differenttimestamps: image = ";
        r12.append(r11);	 Catch:{ ExecutionException -> 0x0161 }
        r12.append(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = ", metadata = ";
        r12.append(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r12.append(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = r12.toString();	 Catch:{ ExecutionException -> 0x0161 }
        p000.jri.m13154b(r7, r8);	 Catch:{ ExecutionException -> 0x0161 }
    L_0x00e1:
        r8 = r1.mo3144b();	 Catch:{ ExecutionException -> 0x0161 }
        r7 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r7 <= 0) goto L_0x0142;
    L_0x00e9:
        r7 = p000.fxq.m2413a(r1);	 Catch:{ ExecutionException -> 0x0161 }
        if (r7 == 0) goto L_0x0142;
    L_0x00ef:
        r5.mo2977a(r0, r1);	 Catch:{ ExecutionException -> 0x0161 }
        r0 = r2;
    L_0x00f3:
        r1 = 10;
        if (r0 < r1) goto L_0x0109;
    L_0x00f7:
        r0 = new isr;	 Catch:{ all -> 0x00ff }
        r1 = "Unable to acquire a valid frame after 10 attempts!!!";
        r0.<init>(r1);	 Catch:{ all -> 0x00ff }
        throw r0;	 Catch:{ all -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0101 }
    L_0x0101:
        r1 = move-exception;
        r6.close();	 Catch:{ all -> 0x017e }
    L_0x0105:
        throw r1;	 Catch:{ all -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0106 }
        throw r0;
    L_0x0109:
        r6.close();	 Catch:{ all -> 0x0106 }
        r0 = r13.f14566k;	 Catch:{ all -> 0x0106 }
        r0 = r0.mo2978c();	 Catch:{ all -> 0x0106 }
        r0 = r0.mo605b();	 Catch:{ all -> 0x0106 }
        r0 = (android.util.Pair) r0;	 Catch:{ all -> 0x0106 }
        monitor-exit(r3);	 Catch:{ all -> 0x0106 }
        r3 = r13.f14556a;
        monitor-enter(r3);
        r13.m9404f();	 Catch:{ all -> 0x0178 }
        r1 = r13.f14557b;	 Catch:{ all -> 0x0178 }
        r1 = r1 + 1;
        r13.f14557b = r1;	 Catch:{ all -> 0x0178 }
        r1 = r0.first;	 Catch:{ all -> 0x0178 }
        r1 = (com.google.googlex.gcam.AeResults) r1;	 Catch:{ all -> 0x0178 }
        r13.f14564i = r1;	 Catch:{ all -> 0x0178 }
        r1 = r0.second;	 Catch:{ all -> 0x0178 }
        r1 = (p000.iwp) r1;	 Catch:{ all -> 0x0178 }
        r13.f14565j = r1;	 Catch:{ all -> 0x0178 }
        r2 = new dug;	 Catch:{ all -> 0x0178 }
        r1 = r0.first;	 Catch:{ all -> 0x0178 }
        r1 = (com.google.googlex.gcam.AeResults) r1;	 Catch:{ all -> 0x0178 }
        r0 = r0.second;	 Catch:{ all -> 0x0178 }
        r0 = (p000.iwp) r0;	 Catch:{ all -> 0x0178 }
        r2.<init>(r13, r1, r0);	 Catch:{ all -> 0x0178 }
        monitor-exit(r3);	 Catch:{ all -> 0x0178 }
        r0 = r2;
        goto L_0x0039;
    L_0x0142:
        r1 = r4.f3313e;	 Catch:{ ExecutionException -> 0x0161 }
        r7 = "skipping smart metering frame due to touch to expose / focus";
        r1.mo519e(r7);	 Catch:{ ExecutionException -> 0x0161 }
        if (r0 == 0) goto L_0x0151;
    L_0x014b:
        r0.close();	 Catch:{ all -> 0x00ff }
        r0 = r2;
        goto L_0x0068;
    L_0x0151:
        r0 = r2;
        goto L_0x0068;
    L_0x0154:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0154 }
        throw r0;
    L_0x0157:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0157 }
        throw r0;
    L_0x015a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0161:
        r1 = move-exception;
        r1 = r4.f3313e;	 Catch:{ all -> 0x0171 }
        r7 = "Metadata never arrived for metering frame";
        r1.mo520f(r7);	 Catch:{ all -> 0x0171 }
        if (r0 == 0) goto L_0x017b;
    L_0x016b:
        r0.close();	 Catch:{ all -> 0x00ff }
        r0 = r2;
        goto L_0x0068;
    L_0x0171:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0177;
    L_0x0174:
        r0.close();	 Catch:{ all -> 0x00ff }
    L_0x0177:
        throw r1;	 Catch:{ all -> 0x00ff }
    L_0x0178:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0178 }
        throw r0;
    L_0x017b:
        r0 = r2;
        goto L_0x0068;
    L_0x017e:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);	 Catch:{ all -> 0x0106 }
        goto L_0x0105;
        */
        throw new UnsupportedOperationException("Method not decompiled: duh.a(fip, fio, long):dug");
    }

    /* renamed from: d */
    final void m9409d() {
        ikb ikb = new ikb();
        synchronized (this.f14560e) {
            this.f14566k = this.f14558c;
            dui dui = this.f14559d;
            Object duk = new duk(dui, this.f14566k);
            ikb.mo1879a(new duj(dui.f3314f.m2273a(duk)));
            kpk a = kow.m13620a(duk.f14570a);
        }
        synchronized (this.f14556a) {
            if (this.f14561f) {
                ikb.close();
                return;
            }
            this.f14567l = ikb;
            this.f14568m = a;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    final void m9410e() {
        /*
        r2 = this;
        r1 = r2.f14556a;
        monitor-enter(r1);
        r0 = r2.f14561f;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.f14567l;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0016;
    L_0x000d:
        r0.close();	 Catch:{ all -> 0x0018 }
        r0 = 0;
        r2.f14567l = r0;	 Catch:{ all -> 0x0018 }
        r0 = 0;
        r2.f14568m = r0;	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x0008;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: duh.e():void");
    }

    /* renamed from: f */
    private final void m9404f() {
        if (this.f14561f) {
            throw new isr("SmartMeteringController already closed");
        }
    }
}
