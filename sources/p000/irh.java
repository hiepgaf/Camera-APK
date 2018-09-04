package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: irh */
public final class irh {
    /* renamed from: a */
    public final ire f7348a;
    /* renamed from: b */
    public final irq f7349b;
    /* renamed from: c */
    public final ise f7350c;
    /* renamed from: d */
    public final Object f7351d = new Object();
    /* renamed from: e */
    public final iqz f7352e;
    /* renamed from: f */
    public iur f7353f;
    /* renamed from: g */
    public isn f7354g;
    /* renamed from: h */
    public iur f7355h;
    /* renamed from: i */
    public irx f7356i;
    /* renamed from: j */
    public irl f7357j;
    /* renamed from: k */
    public boolean f7358k = false;
    /* renamed from: l */
    private final Handler f7359l;
    /* renamed from: m */
    private final isq f7360m;
    /* renamed from: n */
    private final ird f7361n;
    /* renamed from: o */
    private boolean f7362o = false;

    irh(irq irq, Handler handler, isq isq, ire ire, ise ise, ird ird, iqz iqz) {
        this.f7349b = irq;
        this.f7359l = handler;
        this.f7360m = isq;
        this.f7348a = ire;
        this.f7350c = ise;
        this.f7361n = ird;
        this.f7352e = iqz.mo512a("CameraDeviceMgr");
    }

    /* renamed from: c */
    private final void m4078c() {
        synchronized (this.f7351d) {
            if (!this.f7362o) {
                this.f7362o = true;
                this.f7359l.post(new isj(this));
            }
        }
    }

    /* renamed from: a */
    final void m4079a() {
        synchronized (this.f7351d) {
            iqo iqo = this.f7356i;
            iqo iqo2 = this.f7357j;
            this.f7357j = null;
            this.f7356i = null;
            this.f7355h = null;
            this.f7362o = false;
        }
        if (iqo != null) {
            iqo.close();
        }
        if (iqo2 != null) {
            iqo2.close();
        }
    }

    /* renamed from: a */
    public final void m4082a(boolean z) {
        synchronized (this.f7351d) {
            iur iur = this.f7355h;
            this.f7353f = null;
            this.f7355h = null;
            iri iri = this.f7354g;
            if (iri != null) {
                irx irx = this.f7356i;
                if (irx != null) {
                    irx.m12434b(iri);
                }
                m4077a(iri);
            }
        }
        if (z) {
            if (iur != null) {
                iqz iqz = this.f7352e;
                String str = iur.f7482b;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
                stringBuilder.append("Disconnecting camera ");
                stringBuilder.append(str);
                stringBuilder.append(" synchronously.");
                iqz.mo518d(stringBuilder.toString());
            }
            synchronized (this.f7351d) {
                if (!this.f7362o) {
                    this.f7362o = true;
                    m4079a();
                    m4083b();
                }
            }
            return;
        }
        if (iur != null) {
            iqz = this.f7352e;
            str = iur.f7482b;
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 37);
            stringBuilder.append("Disconnecting camera ");
            stringBuilder.append(str);
            stringBuilder.append(" asynchronously.");
            iqz.mo518d(stringBuilder.toString());
        }
        m4078c();
    }

    /* renamed from: a */
    private final void m4077a(iri iri) {
        Handler handler = this.f7359l;
        iri.getClass();
        handler.post(new ish(iri));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m4081a(p000.iur r6, boolean r7, int r8) {
        /*
        r5 = this;
        r1 = r5.f7351d;
        monitor-enter(r1);
        r0 = r5.f7355h;	 Catch:{ all -> 0x00c9 }
        r2 = r5.f7353f;	 Catch:{ all -> 0x00c9 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c9 }
        r5.m4079a();
        r1 = r5.f7351d;
        monitor-enter(r1);
        r3 = r5.f7348a;	 Catch:{ all -> 0x008b }
        r3.mo522a(r6);	 Catch:{ all -> 0x008b }
        r3 = r5.f7350c;	 Catch:{ all -> 0x008b }
        r3 = r3.m4141c();	 Catch:{ all -> 0x008b }
        if (r3 != 0) goto L_0x00c4;
    L_0x001b:
        if (r0 == 0) goto L_0x00c4;
    L_0x001d:
        r0 = r0.equals(r6);	 Catch:{ all -> 0x008b }
        if (r0 == 0) goto L_0x00c4;
    L_0x0023:
        if (r2 == 0) goto L_0x00c4;
    L_0x0025:
        r0 = r2.equals(r6);	 Catch:{ all -> 0x008b }
        if (r0 == 0) goto L_0x00c4;
    L_0x002b:
        r0 = 0;
        r5.f7353f = r0;	 Catch:{ all -> 0x008b }
        r0 = 0;
        r5.f7354g = r0;	 Catch:{ all -> 0x008b }
        if (r7 == 0) goto L_0x008e;
    L_0x0033:
        r0 = -2;
        if (r8 != r0) goto L_0x005f;
    L_0x0036:
        r0 = r5.f7352e;	 Catch:{ all -> 0x008b }
        r2 = r6.f7482b;	 Catch:{ all -> 0x008b }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x008b }
        r3 = r3.length();	 Catch:{ all -> 0x008b }
        r3 = r3 + 39;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r4.<init>(r3);	 Catch:{ all -> 0x008b }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x008b }
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = " disconnected while open.";
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = r4.toString();	 Catch:{ all -> 0x008b }
        r0.mo520f(r2);	 Catch:{ all -> 0x008b }
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
    L_0x005e:
        return;
    L_0x005f:
        r0 = -1;
        if (r8 != r0) goto L_0x008e;
    L_0x0062:
        r0 = r5.f7352e;	 Catch:{ all -> 0x008b }
        r2 = r6.f7482b;	 Catch:{ all -> 0x008b }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x008b }
        r3 = r3.length();	 Catch:{ all -> 0x008b }
        r3 = r3 + 33;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r4.<init>(r3);	 Catch:{ all -> 0x008b }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x008b }
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = " closed while open.";
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = r4.toString();	 Catch:{ all -> 0x008b }
        r0.mo520f(r2);	 Catch:{ all -> 0x008b }
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        goto L_0x005e;
    L_0x008b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        throw r0;
    L_0x008e:
        r0 = r5.f7352e;	 Catch:{ all -> 0x008b }
        r2 = r6.f7482b;	 Catch:{ all -> 0x008b }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x008b }
        r3 = r3.length();	 Catch:{ all -> 0x008b }
        r3 = r3 + 54;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r4.<init>(r3);	 Catch:{ all -> 0x008b }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x008b }
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = " failed to open! Error code: ";
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r4.append(r8);	 Catch:{ all -> 0x008b }
        r2 = r4.toString();	 Catch:{ all -> 0x008b }
        r0.mo516c(r2);	 Catch:{ all -> 0x008b }
        r0 = r5.f7360m;	 Catch:{ all -> 0x008b }
        r2 = new isg;	 Catch:{ all -> 0x008b }
        r2.<init>(r8);	 Catch:{ all -> 0x008b }
        r0.mo2693a(r2);	 Catch:{ all -> 0x008b }
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        goto L_0x005e;
    L_0x00c4:
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        r5.m4083b();
        goto L_0x005e;
    L_0x00c9:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00c9 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: irh.a(iur, boolean, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m4080a(p000.iur r7, p000.iri r8) {
        /*
        r6 = this;
        r0 = r6.f7361n;
        r1 = "CameraDeviceManager#open";
        r0.mo1903a(r1);
        r2 = r6.f7351d;	 Catch:{ all -> 0x00ac }
        monitor-enter(r2);	 Catch:{ all -> 0x00ac }
        r0 = r6.f7350c;	 Catch:{ all -> 0x00a9 }
        r0 = r0.m4141c();	 Catch:{ all -> 0x00a9 }
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = -2;
        r8.mo1151a(r0);	 Catch:{ all -> 0x00a9 }
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        r0 = r6.f7361n;
        r0.mo1904b();
    L_0x001c:
        return;
    L_0x001d:
        r0 = r6.f7355h;	 Catch:{ all -> 0x00a9 }
        r1 = r6.f7354g;	 Catch:{ all -> 0x00a9 }
        r3 = new isn;	 Catch:{ all -> 0x00a9 }
        r3.<init>();	 Catch:{ all -> 0x00a9 }
        r6.f7354g = r3;	 Catch:{ all -> 0x00a9 }
        r3 = r6.f7354g;	 Catch:{ all -> 0x00a9 }
        r3.m12431a(r8);	 Catch:{ all -> 0x00a9 }
        r6.f7353f = r7;	 Catch:{ all -> 0x00a9 }
        if (r1 == 0) goto L_0x003b;
    L_0x0031:
        r3 = r6.f7356i;	 Catch:{ all -> 0x00a9 }
        if (r3 == 0) goto L_0x0038;
    L_0x0035:
        r3.m12434b(r1);	 Catch:{ all -> 0x00a9 }
    L_0x0038:
        r6.m4077a(r1);	 Catch:{ all -> 0x00a9 }
    L_0x003b:
        if (r0 == 0) goto L_0x0041;
    L_0x003d:
        r1 = r6.f7356i;	 Catch:{ all -> 0x00a9 }
        if (r1 != 0) goto L_0x0068;
    L_0x0041:
        r1 = r6.f7352e;	 Catch:{ all -> 0x00a9 }
        r3 = "Opening camera ";
        r0 = r7.f7482b;	 Catch:{ all -> 0x00a9 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00a9 }
        r4 = r0.length();	 Catch:{ all -> 0x00a9 }
        if (r4 != 0) goto L_0x0063;
    L_0x0051:
        r0 = new java.lang.String;	 Catch:{ all -> 0x00a9 }
        r0.<init>(r3);	 Catch:{ all -> 0x00a9 }
    L_0x0056:
        r1.mo518d(r0);	 Catch:{ all -> 0x00a9 }
        r6.m4083b();	 Catch:{ all -> 0x00a9 }
    L_0x005c:
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        r0 = r6.f7361n;
        r0.mo1904b();
        goto L_0x001c;
    L_0x0063:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x00a9 }
        goto L_0x0056;
    L_0x0068:
        r1 = r0.equals(r7);	 Catch:{ all -> 0x00a9 }
        if (r1 == 0) goto L_0x00b3;
    L_0x006e:
        r0 = r6.f7352e;	 Catch:{ all -> 0x00a9 }
        r1 = r7.f7482b;	 Catch:{ all -> 0x00a9 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00a9 }
        r3 = r3.length();	 Catch:{ all -> 0x00a9 }
        r3 = r3 + 52;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a9 }
        r4.<init>(r3);	 Catch:{ all -> 0x00a9 }
        r3 = "Opening camera ";
        r4.append(r3);	 Catch:{ all -> 0x00a9 }
        r4.append(r1);	 Catch:{ all -> 0x00a9 }
        r1 = " and disconnectiong previous listener";
        r4.append(r1);	 Catch:{ all -> 0x00a9 }
        r1 = r4.toString();	 Catch:{ all -> 0x00a9 }
        r0.mo518d(r1);	 Catch:{ all -> 0x00a9 }
        r0 = r6.f7356i;	 Catch:{ all -> 0x00a9 }
        r0 = p000.jri.m13152b(r0);	 Catch:{ all -> 0x00a9 }
        r0 = (p000.irx) r0;	 Catch:{ all -> 0x00a9 }
        r1 = r6.f7354g;	 Catch:{ all -> 0x00a9 }
        r1 = p000.jri.m13152b(r1);	 Catch:{ all -> 0x00a9 }
        r1 = (p000.iri) r1;	 Catch:{ all -> 0x00a9 }
        r0.m12431a(r1);	 Catch:{ all -> 0x00a9 }
        goto L_0x005c;
    L_0x00a9:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        throw r0;	 Catch:{ all -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        r1 = r6.f7361n;
        r1.mo1904b();
        throw r0;
    L_0x00b3:
        r1 = r6.f7352e;	 Catch:{ all -> 0x00a9 }
        r3 = r7.f7482b;	 Catch:{ all -> 0x00a9 }
        r0 = r0.f7482b;	 Catch:{ all -> 0x00a9 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00a9 }
        r4 = r4.length();	 Catch:{ all -> 0x00a9 }
        r4 = r4 + 35;
        r5 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00a9 }
        r5 = r5.length();	 Catch:{ all -> 0x00a9 }
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a9 }
        r5.<init>(r4);	 Catch:{ all -> 0x00a9 }
        r4 = "Opening camera ";
        r5.append(r4);	 Catch:{ all -> 0x00a9 }
        r5.append(r3);	 Catch:{ all -> 0x00a9 }
        r3 = " and closing camera ";
        r5.append(r3);	 Catch:{ all -> 0x00a9 }
        r5.append(r0);	 Catch:{ all -> 0x00a9 }
        r0 = r5.toString();	 Catch:{ all -> 0x00a9 }
        r1.mo518d(r0);	 Catch:{ all -> 0x00a9 }
        r6.m4078c();	 Catch:{ all -> 0x00a9 }
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: irh.a(iur, iri):void");
    }

    /* renamed from: b */
    final void m4083b() {
        synchronized (this.f7351d) {
            if (!this.f7358k) {
                this.f7358k = true;
                this.f7359l.post(new isi(this));
            }
        }
    }
}
