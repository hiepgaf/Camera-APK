package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fli */
final class fli implements fyl, iqo {
    /* renamed from: a */
    public final fyt f16129a;
    /* renamed from: b */
    public final bbh f16130b;
    /* renamed from: c */
    public final int f16131c;
    /* renamed from: d */
    public final iml f16132d;
    /* renamed from: e */
    public final imn f16133e;
    /* renamed from: f */
    public final Object f16134f;
    /* renamed from: g */
    public final List f16135g;
    /* renamed from: h */
    public final LinkedHashMap f16136h;
    /* renamed from: i */
    public boolean f16137i = false;

    fli(fyt fyt, bbh bbh, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f16129a = fyt;
        this.f16130b = bbh;
        this.f16131c = i;
        this.f16134f = new Object();
        this.f16135g = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f16135g.add(new fll());
        }
        this.f16136h = new LinkedHashMap();
        this.f16132d = new iml(Integer.valueOf(0));
        this.f16133e = new imn(ilq.m3831b(this.f16132d));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r5 = this;
        r0 = 0;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = r5.f16134f;
        monitor-enter(r1);
        r3 = r5.f16137i;	 Catch:{ all -> 0x0044 }
        if (r3 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
    L_0x000e:
        return;
    L_0x000f:
        r3 = 1;
        r5.f16137i = r3;	 Catch:{ all -> 0x0044 }
        r3 = r5.f16136h;	 Catch:{ all -> 0x0044 }
        r3 = r3.values();	 Catch:{ all -> 0x0044 }
        r2.addAll(r3);	 Catch:{ all -> 0x0044 }
        r3 = r5.f16136h;	 Catch:{ all -> 0x0044 }
        r3.clear();	 Catch:{ all -> 0x0044 }
        r3 = r5.f16132d;	 Catch:{ all -> 0x0044 }
        r4 = 0;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0044 }
        r3.f21744b = r4;	 Catch:{ all -> 0x0044 }
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        r1 = r5.f16132d;
        r1 = r1.f21743a;
        r1.m16083a();
        r3 = r2.size();
    L_0x0035:
        if (r0 >= r3) goto L_0x000e;
    L_0x0037:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.flj) r0;
        r0.m2333a();
        r0 = r1;
        goto L_0x0035;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fli.close():void");
    }

    /* renamed from: e */
    public final boolean mo1403e() {
        synchronized (this.f16134f) {
            if (this.f16136h.isEmpty()) {
                return false;
            }
            Collection hashSet = new HashSet();
            for (flj flj : this.f16136h.values()) {
                hashSet.add(flj.f4611b);
            }
            flj flj2 = (flj) jri.m13152b((flj) this.f16136h.remove((fhq) Collections.min(hashSet)));
            this.f16132d.f21744b = Integer.valueOf(this.f16136h.size());
            flj2.m2333a();
            this.f16132d.f21743a.m16083a();
            return true;
        }
    }

    /* renamed from: f */
    public final ilp mo1404f() {
        return this.f16133e;
    }

    /* renamed from: a */
    public final fjw m10483a(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i >= this.f16131c) {
            z2 = false;
        }
        jri.m13143a(z2);
        return new flk(this, i);
    }

    /* renamed from: a */
    final boolean m10484a(fhq fhq) {
        synchronized (this.f16134f) {
            for (fll fll : this.f16135g) {
                if (fll.f4615a.contains(fhq)) {
                    return true;
                }
            }
            return false;
        }
    }
}
