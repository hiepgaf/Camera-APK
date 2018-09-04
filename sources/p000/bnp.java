package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: bnp */
public final class bnp implements bnn {
    /* renamed from: a */
    private final ScheduledExecutorService f11093a;
    /* renamed from: b */
    private final Object f11094b = new Object();
    /* renamed from: c */
    private final boa f11095c;
    /* renamed from: d */
    private final Set f11096d;
    /* renamed from: e */
    private final Queue f11097e = new ArrayDeque();
    /* renamed from: f */
    private final ikc f11098f;
    /* renamed from: g */
    private bno f11099g;

    public bnp(boa boa, Set set, ikc ikc) {
        AtomicLong atomicLong;
        this.f11095c = boa;
        this.f11097e.addAll(set);
        this.f11096d = keu.m13477a((Collection) set);
        this.f11098f = ikc;
        String str = new kpx().m5042a("image-broker-%d").f8412a;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        if (str != null) {
            atomicLong = new AtomicLong(0);
        } else {
            atomicLong = null;
        }
        this.f11093a = Executors.newSingleThreadScheduledExecutor(new kpy(defaultThreadFactory, str, atomicLong));
    }

    /* renamed from: a */
    final void m7614a(gil gil) {
        synchronized (this.f11094b) {
            this.f11097e.offer(gil);
            m7616c();
        }
    }

    /* renamed from: a */
    public final void mo545a() {
        m7616c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final void mo547b() {
        /*
        r2 = this;
        r1 = r2.f11094b;
        monitor-enter(r1);
        r0 = r2.f11099g;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 0;
        r2.f11099g = r0;	 Catch:{ all -> 0x002b }
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        r0 = r2.f11096d;
        r1 = r0.iterator();
    L_0x0013:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0025;
    L_0x0019:
        r0 = r1.next();
        r0 = (p000.gil) r0;
        r0 = r0.f5246a;
        r0.shutdown();
        goto L_0x0013;
    L_0x0025:
        r0 = r2.f11093a;
        r0.shutdown();
        goto L_0x0008;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bnp.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo546a(p000.bno r4) {
        /*
        r3 = this;
        r1 = r3.f11094b;
        monitor-enter(r1);
        r0 = r3.f11099g;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0008:
        return;
    L_0x0009:
        r3.f11099g = r4;	 Catch:{ all -> 0x001b }
        r0 = r3.f11097e;	 Catch:{ all -> 0x001b }
        r2 = r0.size();	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        r0 = 0;
    L_0x0013:
        if (r0 >= r2) goto L_0x0008;
    L_0x0015:
        r3.m7616c();
        r0 = r0 + 1;
        goto L_0x0013;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bnp.a(bno):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    final void m7616c() {
        /*
        r8 = this;
        r6 = r8.f11094b;
        monitor-enter(r6);
        r4 = r8.f11099g;	 Catch:{ all -> 0x005d }
        if (r4 == 0) goto L_0x0055;
    L_0x0007:
        r0 = r8.f11098f;	 Catch:{ all -> 0x005d }
        r0 = r0.m3790a();	 Catch:{ all -> 0x005d }
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x0060;
    L_0x0013:
        r0 = r8.f11097e;	 Catch:{ all -> 0x005d }
        r5 = r0.poll();	 Catch:{ all -> 0x005d }
        r5 = (p000.gil) r5;	 Catch:{ all -> 0x005d }
        if (r5 == 0) goto L_0x0055;
    L_0x001d:
        r0 = r8.f11095c;	 Catch:{ all -> 0x005d }
        r3 = r0.mo556a();	 Catch:{ all -> 0x005d }
        if (r3 == 0) goto L_0x0057;
    L_0x0025:
        r4.mo533a(r3);	 Catch:{ all -> 0x005d }
        r2 = new gik;	 Catch:{ all -> 0x005d }
        r2.<init>();	 Catch:{ all -> 0x005d }
        r0 = r5.f5246a;	 Catch:{ all -> 0x005d }
        r1 = new gio;	 Catch:{ all -> 0x005d }
        r1.<init>(r5, r3, r2);	 Catch:{ all -> 0x005d }
        r0.execute(r1);	 Catch:{ all -> 0x005d }
        r0 = r8.f11098f;	 Catch:{ all -> 0x005d }
        r0.m3791b();	 Catch:{ all -> 0x005d }
        r0 = r2.f5244a;	 Catch:{ all -> 0x005d }
        r1 = new bnr;	 Catch:{ all -> 0x005d }
        r1.<init>(r4, r3);	 Catch:{ all -> 0x005d }
        r7 = p000.kpq.f8410a;	 Catch:{ all -> 0x005d }
        p000.kow.m13622a(r0, r1, r7);	 Catch:{ all -> 0x005d }
        r7 = r2.f5245b;	 Catch:{ all -> 0x005d }
        r0 = new bns;	 Catch:{ all -> 0x005d }
        r1 = r8;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x005d }
        r1 = p000.kpq.f8410a;	 Catch:{ all -> 0x005d }
        p000.kow.m13622a(r7, r0, r1);	 Catch:{ all -> 0x005d }
    L_0x0055:
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
    L_0x0056:
        return;
    L_0x0057:
        r0 = r8.f11097e;	 Catch:{ all -> 0x005d }
        r0.offer(r5);	 Catch:{ all -> 0x005d }
        goto L_0x0055;
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        throw r0;
    L_0x0060:
        r2 = r8.f11093a;	 Catch:{ all -> 0x005d }
        r3 = new bnq;	 Catch:{ all -> 0x005d }
        r3.<init>(r8);	 Catch:{ all -> 0x005d }
        r4 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x005d }
        r2.schedule(r3, r0, r4);	 Catch:{ all -> 0x005d }
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: bnp.c():void");
    }
}
