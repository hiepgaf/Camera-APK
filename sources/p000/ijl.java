package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijl */
public final class ijl implements iqo {
    /* renamed from: a */
    public final iqo f18305a;
    /* renamed from: b */
    public int f18306b;
    /* renamed from: c */
    public final ikq f18307c;
    /* renamed from: d */
    public final Object f18308d;
    /* renamed from: e */
    public final Runnable f18309e;
    /* renamed from: f */
    public boolean f18310f = false;

    public ijl(iqo iqo, Executor executor, ikq ikq) {
        this.f18305a = iqo;
        this.f18307c = ikq;
        this.f18308d = new Object();
        this.f18306b = 0;
        this.f18309e = new ijo(new ijm(this), executor);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.iqo m12242a() {
        /*
        r2 = this;
        r1 = r2.f18308d;
        monitor-enter(r1);
        r0 = r2.f18310f;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        r0 = 0;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = r2.f18306b;	 Catch:{ all -> 0x001e }
        r0 = r0 + 1;
        r2.f18306b = r0;	 Catch:{ all -> 0x001e }
        r0 = r2.f18307c;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r0.m12263a();	 Catch:{ all -> 0x001e }
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        r0 = new ijn;
        r0.<init>(r2);
        goto L_0x0009;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ijl.a():iqo");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f18308d;
        monitor-enter(r1);
        r0 = r2.f18310f;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r2.f18310f = r0;	 Catch:{ all -> 0x001a }
        r0 = r2.f18307c;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r0.m12263a();	 Catch:{ all -> 0x001a }
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        r0 = r2.f18305a;
        r0.close();
        goto L_0x0008;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ijl.close():void");
    }
}
