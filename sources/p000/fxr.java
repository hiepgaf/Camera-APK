package p000;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: fxr */
public final class fxr implements fyt, iqo {
    /* renamed from: a */
    public final imn f16619a;
    /* renamed from: b */
    public final Object f16620b = new ReentrantLock(true);
    /* renamed from: c */
    public final LinkedList f16621c;
    /* renamed from: d */
    public final iml f16622d;
    /* renamed from: e */
    public int f16623e;
    /* renamed from: f */
    private final int f16624f;
    /* renamed from: g */
    private boolean f16625g;

    public fxr(int i) {
        this.f16624f = i;
        this.f16623e = i;
        this.f16621c = new LinkedList();
        this.f16625g = false;
        this.f16622d = new iml(Integer.valueOf(i));
        this.f16619a = new imn(this.f16622d);
    }

    /* renamed from: a */
    public final bbi mo1428a(int i) {
        int i2 = this.f16624f;
        if (i > i2 || i < 0) {
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("tickets out of range [0, ");
            stringBuilder.append(i2);
            stringBuilder.append("]: ");
            stringBuilder.append(i);
            return aqe.m581a(new fys(new IndexOutOfBoundsException(stringBuilder.toString())));
        }
        fxt fxt;
        synchronized (this.f16620b) {
            fxt = new fxt(this, i);
            this.f16621c.add(fxt);
        }
        m10865e();
        return new fxu(fxt, fxt.f4807b);
    }

    /* renamed from: a */
    public final iqo mo1429a() {
        return this.f16619a.m16090a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r6 = this;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = r6.f16620b;
        monitor-enter(r1);
        r0 = r6.f16625g;	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
    L_0x000d:
        return;
    L_0x000e:
        r0 = 1;
        r6.f16625g = r0;	 Catch:{ all -> 0x0030 }
        r0 = r6.f16621c;	 Catch:{ all -> 0x0030 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0030 }
    L_0x0017:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x0033;
    L_0x001d:
        r0 = r3.next();	 Catch:{ all -> 0x0030 }
        r0 = (p000.fxt) r0;	 Catch:{ all -> 0x0030 }
        r4 = new fys;	 Catch:{ all -> 0x0030 }
        r5 = "FiniteTicketPool closing.";
        r4.<init>(r5);	 Catch:{ all -> 0x0030 }
        r0.f4808c = r4;	 Catch:{ all -> 0x0030 }
        r2.add(r0);	 Catch:{ all -> 0x0030 }
        goto L_0x0017;
    L_0x0030:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        throw r0;
    L_0x0033:
        r0 = r6.f16622d;	 Catch:{ all -> 0x0030 }
        r3 = r6.m10862b();	 Catch:{ all -> 0x0030 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0030 }
        r0.f21744b = r3;	 Catch:{ all -> 0x0030 }
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        r3 = r2.size();
        r0 = 0;
    L_0x0045:
        if (r0 >= r3) goto L_0x0054;
    L_0x0047:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.fxt) r0;
        r0.m2414a();
        r0 = r1;
        goto L_0x0045;
    L_0x0054:
        r0 = r6.f16622d;
        r0 = r0.f21743a;
        r0.m16083a();
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fxr.close():void");
    }

    /* renamed from: b */
    final int m10862b() {
        if (this.f16625g || !this.f16621c.isEmpty()) {
            return 0;
        }
        return this.f16623e;
    }

    /* renamed from: c */
    public final ilp mo1430c() {
        return this.f16619a;
    }

    /* renamed from: d */
    public final fyr mo1431d() {
        Object obj = null;
        synchronized (this.f16620b) {
            if (!this.f16625g && this.f16621c.isEmpty()) {
                int i = this.f16623e;
                if (i > 0) {
                    this.f16623e = i - 1;
                    this.f16622d.f21744b = Integer.valueOf(m10862b());
                    obj = 1;
                }
            }
        }
        this.f16622d.f21743a.m16083a();
        return obj != null ? new fxs(this) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    final boolean m10865e() {
        /*
        r6 = this;
        r1 = 0;
        r3 = r6.f16620b;
        monitor-enter(r3);
        r0 = r6.f16621c;	 Catch:{ all -> 0x0066 }
        r0 = r0.peekFirst();	 Catch:{ all -> 0x0066 }
        r0 = (p000.fxt) r0;	 Catch:{ all -> 0x0066 }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x0066 }
        r0 = r1;
    L_0x0010:
        return r0;
    L_0x0011:
        r2 = r6.f16625g;	 Catch:{ all -> 0x0066 }
        if (r2 == 0) goto L_0x0040;
    L_0x0015:
        r2 = new fys;	 Catch:{ all -> 0x0066 }
        r4 = "FiniteTicketPool is closed.";
        r2.<init>(r4);	 Catch:{ all -> 0x0066 }
        r0.f4808c = r2;	 Catch:{ all -> 0x0066 }
        r2 = r6.f16621c;	 Catch:{ all -> 0x0066 }
        r2.removeFirst();	 Catch:{ all -> 0x0066 }
    L_0x0023:
        r2 = r6.f16622d;	 Catch:{ all -> 0x0066 }
        r4 = r6.m10862b();	 Catch:{ all -> 0x0066 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0066 }
        r2.f21744b = r4;	 Catch:{ all -> 0x0066 }
        monitor-exit(r3);	 Catch:{ all -> 0x0066 }
        r2 = r6.f16622d;
        r2 = r2.f21743a;
        r2.m16083a();
        if (r0 == 0) goto L_0x003e;
    L_0x0039:
        r0.m2414a();
        r0 = 1;
        goto L_0x0010;
    L_0x003e:
        r0 = r1;
        goto L_0x0010;
    L_0x0040:
        r2 = r6.f16623e;	 Catch:{ all -> 0x0066 }
        r4 = r0.f4806a;	 Catch:{ all -> 0x0066 }
        if (r2 < r4) goto L_0x0069;
    L_0x0046:
        r2 = r2 - r4;
        r6.f16623e = r2;	 Catch:{ all -> 0x0066 }
        r4 = new bbo;	 Catch:{ all -> 0x0066 }
        r4.<init>();	 Catch:{ all -> 0x0066 }
        r2 = r1;
    L_0x004f:
        r5 = r0.f4806a;	 Catch:{ all -> 0x0066 }
        if (r2 >= r5) goto L_0x005e;
    L_0x0053:
        r5 = new fxs;	 Catch:{ all -> 0x0066 }
        r5.<init>(r6);	 Catch:{ all -> 0x0066 }
        r4.add(r5);	 Catch:{ all -> 0x0066 }
        r2 = r2 + 1;
        goto L_0x004f;
    L_0x005e:
        r0.f4809d = r4;	 Catch:{ all -> 0x0066 }
        r2 = r6.f16621c;	 Catch:{ all -> 0x0066 }
        r2.removeFirst();	 Catch:{ all -> 0x0066 }
        goto L_0x0023;
    L_0x0066:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0066 }
        throw r0;
    L_0x0069:
        r0 = 0;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: fxr.e():boolean");
    }
}
