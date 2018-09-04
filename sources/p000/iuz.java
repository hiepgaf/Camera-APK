package p000;

/* compiled from: PG */
/* renamed from: iuz */
public final class iuz extends iww {
    /* renamed from: a */
    private int f23367a;

    public iuz(iwz iwz) {
        this(iwz, 1);
    }

    public iuz(iwz iwz, int i) {
        boolean z;
        super(iwz);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Initial reference count must be greater than zero!");
        this.f23367a = i;
    }

    public final void close() {
        m17595j();
    }

    /* renamed from: h */
    public final iwz m17593h() {
        synchronized (this) {
            int i = this.f23367a;
            if (i > 0) {
                this.f23367a = i + 1;
                iwz iva = new iva(this);
                return iva;
            }
            return null;
        }
    }

    /* renamed from: i */
    public final int m17594i() {
        int i;
        synchronized (this) {
            i = this.f23367a;
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: j */
    public final boolean m17595j() {
        /*
        r2 = this;
        r0 = 1;
        monitor-enter(r2);
        r1 = r2.f23367a;	 Catch:{ all -> 0x0017 }
        if (r1 > 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = r1 + -1;
        r2.f23367a = r1;	 Catch:{ all -> 0x0017 }
        r1 = r2.f23367a;	 Catch:{ all -> 0x0017 }
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        if (r1 != 0) goto L_0x0015;
    L_0x0011:
        super.close();
        goto L_0x0007;
    L_0x0015:
        r0 = 0;
        goto L_0x0007;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: iuz.j():boolean");
    }

    public final String toString() {
        String kbd;
        synchronized (this) {
            kbd a = jqk.m13098b((Object) this).m4740a("refCount", this.f23367a);
            a.m4743a().f8185b = super.toString();
            kbd = a.toString();
        }
        return kbd;
    }
}
