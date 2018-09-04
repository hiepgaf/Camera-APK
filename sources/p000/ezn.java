package p000;

/* compiled from: PG */
/* renamed from: ezn */
public final class ezn {
    /* renamed from: a */
    public final ixm f4384a = new ixh(new ezo());
    /* renamed from: b */
    public ezl f4385b = null;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.lang.Object m2201a() {
        /*
        r4 = this;
        r1 = 0;
        r2 = r4.f4384a;
        monitor-enter(r2);
        r0 = r4.f4384a;	 Catch:{ all -> 0x002c }
        r0 = r0.mo1956c();	 Catch:{ all -> 0x002c }
        r0 = (p000.ezl) r0;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0014;
    L_0x000e:
        r0 = r0.m10122b();	 Catch:{ all -> 0x002c }
        if (r0 != 0) goto L_0x0017;
    L_0x0014:
        monitor-exit(r2);	 Catch:{ all -> 0x002c }
        r0 = r1;
    L_0x0016:
        return r0;
    L_0x0017:
        r0 = r4.f4384a;	 Catch:{ all -> 0x002c }
        r0 = r0.mo1959f();	 Catch:{ all -> 0x002c }
        r0 = (p000.ezl) r0;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0031;
    L_0x0021:
        r3 = r0.m10122b();	 Catch:{ all -> 0x002c }
        if (r3 == 0) goto L_0x002f;
    L_0x0027:
        r1 = r0.f15810a;	 Catch:{ all -> 0x002c }
        r0 = r1;
    L_0x002a:
        monitor-exit(r2);	 Catch:{ all -> 0x002c }
        goto L_0x0016;
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x002c }
        throw r0;
    L_0x002f:
        r0 = r1;
        goto L_0x002a;
    L_0x0031:
        r0 = r1;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: ezn.a():java.lang.Object");
    }

    /* renamed from: b */
    public final int m2203b() {
        return this.f4384a.mo1960g();
    }

    /* renamed from: a */
    public final boolean m2202a(long j, ezm ezm) {
        synchronized (this.f4384a) {
            ezl ezl = (ezl) this.f4384a.mo1952a(j);
            if (ezl != null) {
                ezm.mo1311a(ezl.f15810a);
                this.f4385b = ezl;
                while (true) {
                    ezl ezl2 = (ezl) this.f4384a.mo1956c();
                    if (ezl2 == null || !ezl2.m10121a(ezl)) {
                        break;
                    }
                    ezl2 = (ezl) this.f4384a.mo1959f();
                    if (ezl2 != null) {
                        ezl2.m10120a();
                        ezl2.close();
                    }
                }
                return true;
            }
            return false;
        }
    }
}
