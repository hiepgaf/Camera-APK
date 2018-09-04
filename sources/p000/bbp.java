package p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bbp */
public final class bbp implements bbf, bbh, iqo {
    /* renamed from: a */
    private final Object f19859a;
    /* renamed from: b */
    private final BlockingQueue f19860b;
    /* renamed from: c */
    private final AtomicBoolean f19861c;
    /* renamed from: d */
    private final bbs f19862d;

    public bbp() {
        this(new bbq());
    }

    public bbp(bbs bbs) {
        this.f19862d = bbs;
        this.f19859a = new Object();
        this.f19860b = new LinkedBlockingQueue();
        this.f19861c = new AtomicBoolean();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r6 = this;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = r6.f19859a;
        monitor-enter(r1);
        r0 = r6.f19861c;	 Catch:{ all -> 0x002d }
        r3 = 1;
        r0 = r0.getAndSet(r3);	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
    L_0x0012:
        return;
    L_0x0013:
        r0 = r6.f19860b;	 Catch:{ all -> 0x002d }
        r0.drainTo(r2);	 Catch:{ all -> 0x002d }
    L_0x0018:
        r0 = r6.f19860b;	 Catch:{ all -> 0x002d }
        r0 = r0.peek();	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x0030;
    L_0x0020:
        r0 = r6.f19860b;	 Catch:{ all -> 0x002d }
        r3 = new bbr;	 Catch:{ all -> 0x002d }
        r4 = 0;
        r5 = 1;
        r3.<init>(r4, r5);	 Catch:{ all -> 0x002d }
        r0.add(r3);	 Catch:{ all -> 0x002d }
        goto L_0x0018;
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        throw r0;
    L_0x0030:
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        r3 = r2.size();
        r0 = 0;
    L_0x0036:
        if (r0 >= r3) goto L_0x0012;
    L_0x0038:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.bbr) r0;
        r4 = r0.f1068b;
        if (r4 != 0) goto L_0x004d;
    L_0x0044:
        r4 = r6.f19862d;
        r0 = r0.f1067a;
        r4.mo420a(r0);
        r0 = r1;
        goto L_0x0036;
    L_0x004d:
        r0 = r1;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbp.close():void");
    }

    /* renamed from: a */
    public final Object mo2649a() {
        bbr bbr = (bbr) this.f19860b.take();
        if (!bbr.f1068b) {
            return bbr.f1067a;
        }
        this.f19860b.add(bbr);
        throw new bbg();
    }

    /* renamed from: b */
    public final boolean mo2650b() {
        return this.f19861c.get();
    }

    /* renamed from: c */
    public final Object mo2651c() {
        bbr bbr = (bbr) this.f19860b.poll();
        if (bbr == null) {
            return null;
        }
        if (!bbr.f1068b) {
            return bbr.f1067a;
        }
        this.f19860b.add(bbr);
        return null;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        synchronized (this.f19859a) {
            boolean z = this.f19861c.get();
            if (!z) {
                this.f19860b.add(new bbr(obj, false));
            }
        }
        if (z) {
            this.f19862d.mo420a(obj);
        }
    }
}
