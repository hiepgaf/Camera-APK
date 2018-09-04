package p000;

import android.annotation.TargetApi;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: irx */
public class irx implements iqo, iri {
    /* renamed from: a */
    private final Object f18545a = new Object();
    /* renamed from: b */
    private final Set f18546b = new HashSet();
    /* renamed from: c */
    private int f18547c = go.bJ;
    /* renamed from: d */
    private isd f18548d;
    /* renamed from: e */
    private iwl f18549e;
    /* renamed from: f */
    private boolean f18550f = false;
    /* renamed from: g */
    private final Queue f18551g = new LinkedList();
    /* renamed from: h */
    private boolean f18552h;

    /* renamed from: a */
    public final void m12431a(iri iri) {
        synchronized (this.f18545a) {
            if (!(this.f18547c == go.bL || this.f18547c == go.bM || this.f18547c == go.bN)) {
                this.f18546b.add(iri);
            }
            isd isd = this.f18548d;
        }
        if (isd != null) {
            isd.mo1907a(iri);
        }
    }

    public void close() {
        mo1150a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m12428a(boolean r8) {
        /*
        r7 = this;
        r3 = 0;
        r2 = r7.f18545a;
        monitor-enter(r2);
        r1 = r7.f18552h;	 Catch:{ all -> 0x0061 }
        r1 = r1 | r8;
        r7.f18552h = r1;	 Catch:{ all -> 0x0061 }
        r1 = r7.f18550f;	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x0015;
    L_0x000d:
        r1 = r7.f18551g;	 Catch:{ all -> 0x0061 }
        r1 = r1.size();	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r2);	 Catch:{ all -> 0x0061 }
    L_0x0016:
        return;
    L_0x0017:
        r1 = 1;
        r7.f18550f = r1;	 Catch:{ all -> 0x0061 }
        monitor-exit(r2);	 Catch:{ all -> 0x0061 }
    L_0x001b:
        r4 = r7.f18545a;
        monitor-enter(r4);
        r1 = r7.f18551g;	 Catch:{ all -> 0x005e }
        r1 = r1.size();	 Catch:{ all -> 0x005e }
        if (r1 <= 0) goto L_0x0050;
    L_0x0026:
        r1 = r7.f18551g;	 Catch:{ all -> 0x005e }
        r1 = r1.remove();	 Catch:{ all -> 0x005e }
        r0 = r1;
        r0 = (p000.isd) r0;	 Catch:{ all -> 0x005e }
        r2 = r0;
        r7.f18548d = r2;	 Catch:{ all -> 0x005e }
        r1 = r7.f18546b;	 Catch:{ all -> 0x005e }
        r5 = p000.ken.m13458a(r1);	 Catch:{ all -> 0x005e }
        monitor-exit(r4);	 Catch:{ all -> 0x005e }
        r6 = r5.size();
        r1 = r3;
    L_0x003e:
        if (r1 >= r6) goto L_0x004d;
    L_0x0040:
        r4 = r1 + 1;
        r1 = r5.get(r1);
        r1 = (p000.iri) r1;
        r2.mo1907a(r1);
        r1 = r4;
        goto L_0x003e;
    L_0x004d:
        if (r2 != 0) goto L_0x001b;
    L_0x004f:
        goto L_0x0016;
    L_0x0050:
        r1 = r7.f18552h;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0059;
    L_0x0054:
        r1 = r7.f18546b;	 Catch:{ all -> 0x005e }
        r1.clear();	 Catch:{ all -> 0x005e }
    L_0x0059:
        r1 = 0;
        r7.f18550f = r1;	 Catch:{ all -> 0x005e }
        monitor-exit(r4);	 Catch:{ all -> 0x005e }
        goto L_0x0016;
    L_0x005e:
        r1 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x005e }
        throw r1;
    L_0x0061:
        r1 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0061 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: irx.a(boolean):void");
    }

    /* renamed from: a */
    public final void mo1150a() {
        boolean z;
        synchronized (this.f18545a) {
            if (this.f18547c == go.bJ || this.f18547c == go.bK) {
                this.f18547c = go.bN;
                this.f18551g.add(new irz());
                z = true;
            } else {
                z = false;
            }
            iqo iqo = this.f18549e;
            if (iqo != null) {
                this.f18549e = null;
            } else {
                iqo = null;
            }
        }
        if (z) {
            m12428a(true);
        }
        if (iqo != null) {
            iqo.close();
        }
    }

    /* renamed from: b */
    public final void mo1153b() {
        boolean z;
        synchronized (this.f18545a) {
            if (this.f18547c == go.bJ || this.f18547c == go.bK) {
                this.f18547c = go.bL;
                this.f18551g.add(new isa());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            m12428a(true);
        }
        close();
    }

    /* renamed from: a */
    public final void mo1151a(int i) {
        boolean z;
        synchronized (this.f18545a) {
            if (this.f18547c == go.bJ || this.f18547c == go.bK) {
                this.f18547c = go.bM;
                this.f18551g.add(new isb(i));
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            m12428a(true);
        }
        close();
    }

    /* renamed from: a */
    public void mo1152a(iwl iwl) {
        boolean z;
        boolean z2 = true;
        synchronized (this.f18545a) {
            if (this.f18547c == go.bJ) {
                this.f18547c = go.bK;
                this.f18549e = new iry(iwl, this);
                this.f18551g.add(new isc(this.f18549e));
                z = false;
            } else {
                z = true;
                z2 = false;
            }
        }
        if (z2) {
            m12428a(false);
        }
        if (z) {
            if (iwl != null) {
                iwl.close();
            }
            close();
        }
    }

    /* renamed from: b */
    public final void m12434b(iri iri) {
        synchronized (this.f18545a) {
            this.f18546b.remove(iri);
        }
    }
}
