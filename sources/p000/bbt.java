package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bbt */
public final class bbt implements bbf, bbh {
    /* renamed from: a */
    public final imn f19863a = new imn(this.f19866d);
    /* renamed from: b */
    private final bbp f19864b;
    /* renamed from: c */
    private final Object f19865c = new Object();
    /* renamed from: d */
    private final iml f19866d = new iml(Integer.valueOf(0));

    public bbt(bbs bbs) {
        this.f19864b = new bbp(new bbu(this, bbs));
    }

    public final void close() {
        this.f19864b.close();
    }

    /* renamed from: d */
    final void m14735d() {
        synchronized (this.f19865c) {
            iml iml = this.f19866d;
            iml.f21744b = Integer.valueOf(((Integer) iml.f21743a.f21739a.f21734c).intValue() - 1);
        }
        this.f19866d.f21743a.m16083a();
    }

    /* renamed from: a */
    public final Object mo2649a() {
        Object a = this.f19864b.mo2649a();
        m14735d();
        return a;
    }

    /* renamed from: b */
    public final boolean mo2650b() {
        return this.f19864b.mo2650b();
    }

    /* renamed from: c */
    public final Object mo2651c() {
        Object c = this.f19864b.mo2651c();
        if (c != null) {
            m14735d();
        }
        return c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo348a(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = r4.f19863a;
        r1 = r0.m16090a();
        r2 = r4.f19865c;	 Catch:{ all -> 0x0030 }
        monitor-enter(r2);	 Catch:{ all -> 0x0030 }
        r3 = r4.f19866d;	 Catch:{ all -> 0x0037 }
        r0 = r3.f21743a;	 Catch:{ all -> 0x0037 }
        r0 = r0.f21739a;	 Catch:{ all -> 0x0037 }
        r0 = r0.f21734c;	 Catch:{ all -> 0x0037 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x0037 }
        r0 = r0.intValue();	 Catch:{ all -> 0x0037 }
        r0 = r0 + 1;
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0037 }
        r3.f21744b = r0;	 Catch:{ all -> 0x0037 }
        monitor-exit(r2);	 Catch:{ all -> 0x0037 }
        r0 = r4.f19866d;	 Catch:{ all -> 0x0030 }
        r0 = r0.f21743a;	 Catch:{ all -> 0x0030 }
        r0.m16083a();	 Catch:{ all -> 0x0030 }
        r0 = r4.f19864b;	 Catch:{ all -> 0x0030 }
        r0.mo348a(r5);	 Catch:{ all -> 0x0030 }
        r1.close();
        return;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r2 = move-exception;
        r1.close();	 Catch:{ all -> 0x003a }
    L_0x0036:
        throw r2;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0037 }
        throw r0;	 Catch:{ all -> 0x0030 }
    L_0x003a:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbt.a(java.lang.Object):void");
    }
}
