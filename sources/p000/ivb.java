package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: ivb */
public final class ivb extends iwx implements ixb {
    /* renamed from: a */
    public final Object f23369a = new Object();
    /* renamed from: b */
    public boolean f23370b;
    /* renamed from: c */
    private boolean f23371c = false;
    /* renamed from: d */
    private int f23372d = 0;

    public ivb(ixb ixb) {
        super(ixb);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.iwz mo3147a() {
        /*
        r3 = this;
        r1 = r3.f23369a;
        monitor-enter(r1);
        r0 = r3.f23370b;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x0007:
        r0 = r3.f23371c;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x000b:
        r2 = super.mo3147a();	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r3.f23372d;	 Catch:{ all -> 0x0021 }
        r0 = r0 + 1;
        r3.f23372d = r0;	 Catch:{ all -> 0x0021 }
        r0 = new ivd;	 Catch:{ all -> 0x0021 }
        r0.<init>(r3, r2);	 Catch:{ all -> 0x0021 }
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
    L_0x001d:
        return r0;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        r0 = 0;
        goto L_0x001d;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.a():iwz");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final p000.iwz mo3149b() {
        /*
        r3 = this;
        r1 = r3.f23369a;
        monitor-enter(r1);
        r0 = r3.f23370b;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x0007:
        r0 = r3.f23371c;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x000b:
        r2 = super.mo3149b();	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r3.f23372d;	 Catch:{ all -> 0x0021 }
        r0 = r0 + 1;
        r3.f23372d = r0;	 Catch:{ all -> 0x0021 }
        r0 = new ivd;	 Catch:{ all -> 0x0021 }
        r0.<init>(r3, r2);	 Catch:{ all -> 0x0021 }
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
    L_0x001d:
        return r0;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        r0 = 0;
        goto L_0x001d;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.b():iwz");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f23369a;
        monitor-enter(r1);
        r0 = r2.f23371c;	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f23370b;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 1;
        r2.f23370b = r0;	 Catch:{ all -> 0x0015 }
        r2.m17600j();	 Catch:{ all -> 0x0015 }
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        goto L_0x000c;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.close():void");
    }

    /* renamed from: i */
    final void m17599i() {
        synchronized (this.f23369a) {
            this.f23372d--;
            if (this.f23370b) {
                m17600j();
            }
        }
    }

    /* renamed from: j */
    final void m17600j() {
        if (!this.f23371c) {
            if (this.f23372d == 0) {
                this.f23371c = true;
                super.close();
                return;
            }
            iwz a = super.mo3147a();
            if (a != null) {
                a.close();
            }
            mo3150c();
        }
    }

    /* renamed from: a */
    public final void mo3148a(ixd ixd, Handler handler) {
        super.mo3148a(new ivc(this, ixd), handler);
    }
}
