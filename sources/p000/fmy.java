package p000;

/* compiled from: PG */
/* renamed from: fmy */
final class fmy extends iww implements fnf {
    /* renamed from: a */
    private final Object f23207a = new Object();
    /* renamed from: b */
    private boolean f23208b = false;
    /* renamed from: c */
    private fyr f23209c;
    /* renamed from: d */
    private final /* synthetic */ fmw f23210d;

    fmy(fmw fmw, iwz iwz, fyr fyr) {
        this.f23210d = fmw;
        super(iwz);
        this.f23209c = fyr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f23207a;
        monitor-enter(r1);
        r0 = r2.f23208b;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r2.f23208b = r0;	 Catch:{ all -> 0x0018 }
        r0 = r2.f23209c;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r0.close();	 Catch:{ all -> 0x0018 }
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        super.close();
        goto L_0x0008;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fmy.close():void");
    }

    /* renamed from: h */
    public final void mo3444h() {
        synchronized (this.f23207a) {
            jri.m13154b(this.f23208b ^ 1, (Object) "Cannot submit image back to ImageWriter. It is already closed.");
            this.f23210d.f16210a.add((fyr) jri.m13152b(this.f23209c));
            this.f23209c = null;
            this.f23210d.f16211b.mo3158a((iwz) this);
            close();
        }
    }
}
