package p000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imk */
public final class imk implements Executor {
    /* renamed from: a */
    private final Object f7095a = new Object();
    /* renamed from: b */
    private boolean f7096b = false;
    /* renamed from: c */
    private final Queue f7097c = new LinkedList();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r4) {
        /*
        r3 = this;
        r1 = r3.f7095a;
        monitor-enter(r1);
        r0 = r3.f7096b;	 Catch:{ all -> 0x002a }
        if (r0 == 0) goto L_0x000e;
    L_0x0007:
        r0 = r3.f7097c;	 Catch:{ all -> 0x002a }
        r0.add(r4);	 Catch:{ all -> 0x002a }
        monitor-exit(r1);	 Catch:{ all -> 0x002a }
    L_0x000d:
        return;
    L_0x000e:
        r0 = 1;
        r3.f7096b = r0;	 Catch:{ all -> 0x002a }
        monitor-exit(r1);	 Catch:{ all -> 0x002a }
    L_0x0012:
        if (r4 == 0) goto L_0x000d;
    L_0x0014:
        r4.run();
        r1 = r3.f7095a;
        monitor-enter(r1);
        r0 = r3.f7097c;	 Catch:{ all -> 0x002d }
        r0 = r0.poll();	 Catch:{ all -> 0x002d }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x0027;
    L_0x0024:
        r2 = 0;
        r3.f7096b = r2;	 Catch:{ all -> 0x002d }
    L_0x0027:
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        r4 = r0;
        goto L_0x0012;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002a }
        throw r0;
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: imk.execute(java.lang.Runnable):void");
    }
}
