package p000;

/* compiled from: PG */
/* renamed from: ivj */
public final class ivj extends iwy {
    /* renamed from: a */
    private final Object f23379a = new Object();
    /* renamed from: b */
    private boolean f23380b = false;
    /* renamed from: c */
    private boolean f23381c = false;
    /* renamed from: d */
    private int f23382d = 0;

    public ivj(ixe ixe) {
        super(ixe);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f23379a;
        monitor-enter(r1);
        r0 = r2.f23381c;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f23380b;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 1;
        r2.f23380b = r0;	 Catch:{ all -> 0x001c }
        r0 = r2.f23382d;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x001a;
    L_0x0014:
        r0 = 1;
        r2.f23381c = r0;	 Catch:{ all -> 0x001c }
        super.close();	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        goto L_0x000c;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivj.close():void");
    }

    /* renamed from: b */
    final void m17605b() {
        synchronized (this.f23379a) {
            this.f23382d--;
            if (this.f23380b && !this.f23381c && this.f23382d == 0) {
                this.f23381c = true;
                super.close();
            }
        }
    }

    /* renamed from: a */
    public final iwz mo3157a(long j) {
        synchronized (this.f23379a) {
            if (this.f23380b || this.f23381c) {
                throw new isr("Cannot dequeueInputImage from a closed ImageWriter");
            }
            try {
                iwz a = super.mo3157a(j);
                this.f23382d++;
                iwz ivk = new ivk(this, a);
                return ivk;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}
