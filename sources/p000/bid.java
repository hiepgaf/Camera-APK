package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bid */
final class bid implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Surface f1182a;
    /* renamed from: b */
    private final /* synthetic */ bhj f1183b;
    /* renamed from: c */
    private final /* synthetic */ bhs f1184c;
    /* renamed from: d */
    private final /* synthetic */ kpw f1185d;
    /* renamed from: e */
    private final /* synthetic */ bic f1186e;

    bid(bic bic, Surface surface, bhj bhj, bhs bhs, kpw kpw) {
        this.f1186e = bic;
        this.f1182a = surface;
        this.f1183b = bhj;
        this.f1184c = bhs;
        this.f1185d = kpw;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r5 = this;
        r0 = r5.f1186e;
        r1 = r0.f10915e;
        monitor-enter(r1);
        r0 = r5.f1186e;	 Catch:{ all -> 0x0068 }
        r0 = r0.f10916f;	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
    L_0x000c:
        return;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        r0 = r5.f1186e;
        r0 = r0.f10914d;
        r0 = r0.isValid();
        if (r0 == 0) goto L_0x0060;
    L_0x0018:
        r0 = r5.f1182a;
        r0 = r0.isValid();
        if (r0 == 0) goto L_0x0058;
    L_0x0020:
        r0 = p000.bic.f10911a;
        r1 = "Send recording command";
        p000.bli.m863a(r0, r1);
        r0 = r5.f1186e;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0 = r0.f10912b;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1183b;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0 = r0.m822b(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1186e;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r1.f10914d;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0.m4293a(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1182a;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0.m4293a(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1183b;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r2 = p000.fiv.REPEATING;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r3 = r5.f1186e;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r3 = r3.f10913c;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r4 = r5.f1184c;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1.m7382a(r2, r0, r3, r4);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0 = r5.f1185d;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = 0;
        r0.mo3557a(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        goto L_0x000c;
    L_0x0051:
        r0 = move-exception;
    L_0x0052:
        r1 = r5.f1185d;
        r1.m17780a(r0);
        goto L_0x000c;
    L_0x0058:
        r0 = p000.bic.f10911a;
        r1 = "recording surface is already closed";
        p000.bli.m871d(r0, r1);
        goto L_0x000c;
    L_0x0060:
        r0 = p000.bic.f10911a;
        r1 = "preview surface is already closed";
        p000.bli.m871d(r0, r1);
        goto L_0x000c;
    L_0x0068:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        throw r0;
    L_0x006b:
        r0 = move-exception;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: bid.run():void");
    }
}
