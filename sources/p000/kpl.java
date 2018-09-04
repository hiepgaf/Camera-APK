package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* renamed from: kpl */
public final class kpl extends FutureTask implements kpk {
    /* renamed from: a */
    private final koo f19249a = new koo();

    private kpl(Callable callable) {
        super(callable);
    }

    /* renamed from: a */
    public final void mo1985a(Runnable runnable, Executor executor) {
        koo koo = this.f19249a;
        jri.m13139a((Object) runnable, (Object) "Runnable was null.");
        jri.m13139a((Object) executor, (Object) "Executor was null.");
        synchronized (koo) {
            if (koo.f8394b) {
                koo.m5024a(runnable, executor);
                return;
            }
            koo.f8393a = new kop(runnable, executor, koo.f8393a);
        }
    }

    /* renamed from: a */
    public static kpl m13628a(Callable callable) {
        return new kpl(callable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void done() {
        /*
        r4 = this;
        r0 = 0;
        r2 = r4.f19249a;
        monitor-enter(r2);
        r1 = r2.f8394b;	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
    L_0x0009:
        return;
    L_0x000a:
        r1 = 1;
        r2.f8394b = r1;	 Catch:{ all -> 0x0028 }
        r1 = r2.f8393a;	 Catch:{ all -> 0x0028 }
        r3 = 0;
        r2.f8393a = r3;	 Catch:{ all -> 0x0028 }
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
    L_0x0013:
        if (r1 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r1.f8397c;
        r1.f8397c = r0;
        r0 = r1;
        r1 = r2;
        goto L_0x0013;
    L_0x001c:
        if (r0 == 0) goto L_0x0009;
    L_0x001e:
        r1 = r0.f8395a;
        r2 = r0.f8396b;
        p000.koo.m5024a(r1, r2);
        r0 = r0.f8397c;
        goto L_0x001c;
    L_0x0028:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kpl.done():void");
    }
}
