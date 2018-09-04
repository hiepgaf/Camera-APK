package p000;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: exh */
public abstract class exh implements exc {
    /* renamed from: a */
    private final ixm f15700a;
    /* renamed from: b */
    private volatile int f15701b;
    /* renamed from: c */
    private final Map f15702c = new HashMap();
    /* renamed from: d */
    private final Object f15703d = new Object();
    /* renamed from: e */
    private volatile boolean f15704e = true;

    public exh(int i) {
        this.f15700a = ion.m3964c(i);
        this.f15701b = i;
    }

    /* renamed from: a */
    protected abstract iqo mo3029a(iqo iqo);

    /* renamed from: d */
    protected abstract Pair mo3031d();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo1314a() {
        /*
        r8 = this;
        r3 = r8.f15700a;
        monitor-enter(r3);
        r4 = r8.mo3031d();	 Catch:{ all -> 0x0024 }
        if (r4 != 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
    L_0x000a:
        return;
    L_0x000b:
        r2 = r8.f15704e;	 Catch:{ all -> 0x0024 }
        if (r2 != 0) goto L_0x0027;
    L_0x000f:
        r2 = r8.f15700a;	 Catch:{ all -> 0x0024 }
        r2 = r2.mo1960g();	 Catch:{ all -> 0x0024 }
        r5 = r8.f15701b;	 Catch:{ all -> 0x0024 }
        if (r2 < r5) goto L_0x0027;
    L_0x0019:
        if (r4 == 0) goto L_0x0022;
    L_0x001b:
        r2 = r4.second;	 Catch:{ all -> 0x0024 }
        r2 = (p000.iqo) r2;	 Catch:{ all -> 0x0024 }
        r2.close();	 Catch:{ all -> 0x0024 }
    L_0x0022:
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
        goto L_0x000a;
    L_0x0024:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
        throw r2;
    L_0x0027:
        r5 = r8.f15700a;	 Catch:{ all -> 0x0024 }
        r2 = r4.first;	 Catch:{ all -> 0x0024 }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x0024 }
        r6 = r2.longValue();	 Catch:{ all -> 0x0024 }
        r2 = r4.second;	 Catch:{ all -> 0x0024 }
        r2 = (p000.iqo) r2;	 Catch:{ all -> 0x0024 }
        r5.mo1953a(r6, r2);	 Catch:{ all -> 0x0024 }
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
        r4 = r8.f15703d;
        monitor-enter(r4);
        r2 = r8.f15702c;	 Catch:{ all -> 0x0060 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0060 }
        r5 = r2.iterator();	 Catch:{ all -> 0x0060 }
    L_0x0046:
        r2 = r5.hasNext();	 Catch:{ all -> 0x0060 }
        if (r2 == 0) goto L_0x0063;
    L_0x004c:
        r2 = r5.next();	 Catch:{ all -> 0x0060 }
        r0 = r2;
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0060 }
        r3 = r0;
        r2 = r8.f15702c;	 Catch:{ all -> 0x0060 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0060 }
        r2 = (java.util.concurrent.Executor) r2;	 Catch:{ all -> 0x0060 }
        r2.execute(r3);	 Catch:{ all -> 0x0060 }
        goto L_0x0046;
    L_0x0060:
        r2 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0060 }
        throw r2;
    L_0x0063:
        monitor-exit(r4);	 Catch:{ all -> 0x0060 }
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: exh.a():void");
    }

    /* renamed from: b */
    private final iqo m10038b(long j) {
        iqo iqo;
        synchronized (this.f15700a) {
            iqo = (iqo) this.f15700a.mo1952a(j);
            iqo = iqo != null ? mo3029a(iqo) : null;
        }
        return iqo;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1313a(long j) {
        return m10038b(j);
    }

    /* renamed from: f */
    private final iqo m10039f() {
        iqo iqo;
        synchronized (this.f15700a) {
            iqo = (iqo) this.f15700a.mo1957d();
            iqo = iqo != null ? mo3029a(iqo) : null;
        }
        return iqo;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo1316b() {
        return m10039f();
    }

    /* renamed from: a */
    public final void mo1315a(Runnable runnable, Executor executor) {
        synchronized (this.f15703d) {
            this.f15702c.put(runnable, executor);
        }
    }

    /* renamed from: e */
    public final iqo m10048e() {
        return (iqo) this.f15700a.mo1959f();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo1317c() {
        return m10048e();
    }

    /* renamed from: a */
    public final boolean m10044a(int i) {
        boolean a;
        synchronized (this.f15700a) {
            this.f15701b = i;
            a = this.f15700a.mo1954a(i);
        }
        return a;
    }
}
