package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: gi */
final class gi extends Handler {
    /* renamed from: a */
    private final /* synthetic */ gh f5201a;

    gi(gh ghVar, Looper looper) {
        this.f5201a = ghVar;
        super(looper);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r10) {
        /*
        r9 = this;
        r2 = 0;
        r8 = 0;
        r0 = r10.what;
        switch(r0) {
            case 1: goto L_0x000b;
            default: goto L_0x0007;
        };
    L_0x0007:
        super.handleMessage(r10);
    L_0x000a:
        return;
    L_0x000b:
        r4 = r9.f5201a;
    L_0x000d:
        r1 = r4.f5187b;
        monitor-enter(r1);
        r0 = r4.f5189d;	 Catch:{ all -> 0x001a }
        r0 = r0.size();	 Catch:{ all -> 0x001a }
        if (r0 > 0) goto L_0x001d;
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x000a;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        r5 = new p000.ll[r0];	 Catch:{ all -> 0x001a }
        r0 = r4.f5189d;	 Catch:{ all -> 0x001a }
        r0.toArray(r5);	 Catch:{ all -> 0x001a }
        r0 = r4.f5189d;	 Catch:{ all -> 0x001a }
        r0.clear();	 Catch:{ all -> 0x001a }
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        r1 = r2;
    L_0x002b:
        r0 = r5.length;
        if (r1 >= r0) goto L_0x000d;
    L_0x002e:
        r6 = r8.size();
        r3 = r2;
    L_0x0033:
        if (r3 >= r6) goto L_0x004a;
    L_0x0035:
        r0 = r8.get(r3);
        r0 = (p000.gj) r0;
        r7 = r0.f5263c;
        if (r7 != 0) goto L_0x0046;
    L_0x003f:
        r0 = r0.f5262b;
        r7 = r4.f5186a;
        r0.onReceive(r7, r8);
    L_0x0046:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0033;
    L_0x004a:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.handleMessage(android.os.Message):void");
    }
}
