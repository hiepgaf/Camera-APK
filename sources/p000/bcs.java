package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bcs */
public abstract class bcs implements ijk {
    /* renamed from: a */
    public static final String f10669a = bli.m862a("PreInitializer");
    /* renamed from: b */
    public final aws f10670b;
    /* renamed from: c */
    public volatile kpw f10671c;
    /* renamed from: d */
    private final Object f10672d;
    /* renamed from: e */
    private final Executor f10673e;
    /* renamed from: f */
    private volatile boolean f10674f;

    /* renamed from: c */
    public abstract void mo2725c();

    public bcs(aws aws) {
        this(aws, null);
    }

    public bcs(aws aws, Executor executor) {
        this.f10674f = false;
        this.f10670b = aws;
        this.f10673e = executor;
        this.f10672d = new Object();
        this.f10671c = kpw.m18056d();
    }

    /* renamed from: b */
    public final void m7269b() {
        this.f10671c.mo3557a(Boolean.valueOf(true));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.kpk mo385a() {
        /*
        r2 = this;
        r1 = r2.f10672d;
        monitor-enter(r1);
        r0 = r2.f10674f;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f10671c;	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = 1;
        r2.f10674f = r0;	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        r0 = r2.f10673e;
        if (r0 == 0) goto L_0x001e;
    L_0x0013:
        r1 = new bct;
        r1.<init>(r2);
        r0.execute(r1);
    L_0x001b:
        r0 = r2.f10671c;
        goto L_0x000a;
    L_0x001e:
        r2.mo2725c();
        goto L_0x001b;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bcs.a():kpk");
    }
}
