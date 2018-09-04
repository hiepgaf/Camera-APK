package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fjz */
public final class fjz implements fjv, iqo {
    /* renamed from: a */
    public final ixb f16079a;
    /* renamed from: b */
    public final iqz f16080b;
    /* renamed from: c */
    public final Object f16081c = new Object();
    /* renamed from: d */
    public final Queue f16082d = new LinkedList();
    /* renamed from: e */
    public final fki f16083e = new fki();
    /* renamed from: f */
    public boolean f16084f = true;
    /* renamed from: g */
    private final Set f16085g = new HashSet();
    /* renamed from: h */
    private iwz f16086h;
    /* renamed from: i */
    private fhq f16087i;
    /* renamed from: j */
    private boolean f16088j = false;

    public fjz(ixb ixb, ira ira) {
        this.f16079a = ixb;
        this.f16080b = ira.mo511a("ImageDistributor");
    }

    /* renamed from: a */
    public final fiw mo1393a(fjw fjw) {
        synchronized (this.f16081c) {
            if (this.f16088j) {
                fiw b = fds.m10248b();
                return b;
            }
            fki fki = new fki();
            fke fke = new fke(fki, fjw);
            synchronized (this.f16081c) {
                this.f16085g.add(fke);
            }
            return new fka(this, fki);
        }
    }

    public final void close() {
        synchronized (this.f16081c) {
            this.f16088j = true;
            iwz iwz = this.f16086h;
            if (iwz != null) {
                this.f16086h = null;
            } else {
                iwz = null;
            }
            this.f16085g.clear();
        }
        if (iwz != null) {
            iwz.close();
        }
    }

    /* renamed from: a */
    final kpk m10445a(iwz iwz, fhq fhq) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f16081c) {
            for (fke fke : this.f16085g) {
                if (fke.f4597a.m10460a(fhq)) {
                    arrayList.add(fke.f4598b);
                }
            }
        }
        if (arrayList.isEmpty()) {
            iwz.close();
            return kow.m13617a(Boolean.valueOf(false));
        }
        iwz iuz = new iuz(iwz, arrayList.size());
        Iterable arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((fjw) obj).mo1394a(fkp.m17314a(new iva(iuz))));
        }
        return kow.m13616a(arrayList2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m10446a() {
        /*
        r10 = this;
        r2 = 0;
        r1 = 1;
        r3 = r10.f16081c;
        monitor-enter(r3);
        r0 = r10.f16088j;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
    L_0x000a:
        return;
    L_0x000b:
        r0 = r10.f16084f;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x0014;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0014:
        r4 = r10.f16081c;	 Catch:{ all -> 0x0011 }
        monitor-enter(r4);	 Catch:{ all -> 0x0011 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x003a }
        r5.<init>();	 Catch:{ all -> 0x003a }
        r0 = r10.f16085g;	 Catch:{ all -> 0x003a }
        r6 = r0.iterator();	 Catch:{ all -> 0x003a }
    L_0x0022:
        r0 = r6.hasNext();	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x003d;
    L_0x0028:
        r0 = r6.next();	 Catch:{ all -> 0x003a }
        r0 = (p000.fke) r0;	 Catch:{ all -> 0x003a }
        r7 = r0.f4598b;	 Catch:{ all -> 0x003a }
        r7 = r7.mo1395a();	 Catch:{ all -> 0x003a }
        if (r7 == 0) goto L_0x0022;
    L_0x0036:
        r5.add(r0);	 Catch:{ all -> 0x003a }
        goto L_0x0022;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x003d:
        r0 = r10.f16085g;	 Catch:{ all -> 0x003a }
        r0.removeAll(r5);	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        r0 = r10.f16087i;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x010d;
    L_0x0047:
        r0 = r10.f16086h;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x010a;
    L_0x004b:
        r0 = r2;
    L_0x004c:
        p000.jri.m13153b(r0);	 Catch:{ all -> 0x0011 }
        r0 = r10.f16086h;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x005b;
    L_0x0053:
        r0 = r10.f16079a;	 Catch:{ all -> 0x0011 }
        r0 = r0.mo3149b();	 Catch:{ all -> 0x0011 }
        r10.f16086h = r0;	 Catch:{ all -> 0x0011 }
    L_0x005b:
        r4 = r10.f16086h;	 Catch:{ all -> 0x0011 }
        if (r4 != 0) goto L_0x0061;
    L_0x005f:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x0061:
        r0 = r10.f16087i;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x0075;
    L_0x0065:
        r6 = r4.mo2719f();	 Catch:{ all -> 0x0011 }
        r0 = r10.f16083e;	 Catch:{ all -> 0x0011 }
        r5 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0011 }
        r0 = r0.m10458a(r5);	 Catch:{ all -> 0x0011 }
        r10.f16087i = r0;	 Catch:{ all -> 0x0011 }
    L_0x0075:
        r5 = r10.f16087i;	 Catch:{ all -> 0x0011 }
        if (r5 != 0) goto L_0x007b;
    L_0x0079:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x007b:
        r0 = r10.f16082d;	 Catch:{ all -> 0x0011 }
        r0 = r0.peek();	 Catch:{ all -> 0x0011 }
        r0 = (p000.fhq) r0;	 Catch:{ all -> 0x0011 }
    L_0x0083:
        if (r0 != 0) goto L_0x00f8;
    L_0x0085:
        if (r0 != 0) goto L_0x0089;
    L_0x0087:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x0089:
        r6 = r10.f16083e;	 Catch:{ all -> 0x0011 }
        r6.m10460a(r5);	 Catch:{ all -> 0x0011 }
        r6 = r0.f4563b;	 Catch:{ all -> 0x0011 }
        r8 = r5.f4563b;	 Catch:{ all -> 0x0011 }
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x00f6;
    L_0x0096:
        r0 = r1;
    L_0x0097:
        p000.jri.m13153b(r0);	 Catch:{ all -> 0x0011 }
        r0 = 0;
        r10.f16084f = r0;	 Catch:{ all -> 0x0011 }
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        r2 = r10.f16081c;
        monitor-enter(r2);
        r0 = r10.f16083e;	 Catch:{ all -> 0x0110 }
        r3 = r0.m10461b(r5);	 Catch:{ all -> 0x0110 }
        r0 = 0;
        r10.f16086h = r0;	 Catch:{ all -> 0x0110 }
        r0 = 0;
        r10.f16087i = r0;	 Catch:{ all -> 0x0110 }
        monitor-exit(r2);	 Catch:{ all -> 0x0110 }
        r0 = r3.size();
        if (r0 != 0) goto L_0x00c4;
    L_0x00b4:
        r0 = r10.m10445a(r4, r5);
    L_0x00b8:
        r1 = new fkb;
        r1.<init>(r10);
        r2 = p000.kpq.f8410a;
        p000.kow.m13622a(r0, r1, r2);
        goto L_0x000a;
    L_0x00c4:
        r0 = java.lang.Boolean.valueOf(r1);
        r0 = p000.kow.m13617a(r0);
        r2 = r3.iterator();
        r1 = r0;
    L_0x00d1:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00ea;
    L_0x00d7:
        r0 = r2.next();
        r0 = (p000.fhq) r0;
        r3 = new fkc;
        r3.<init>(r10, r0);
        r0 = p000.kpq.f8410a;
        r0 = p000.kny.m18046a(r1, r3, r0);
        r1 = r0;
        goto L_0x00d1;
    L_0x00ea:
        r0 = new fkd;
        r0.<init>(r10, r4, r5);
        r2 = p000.kpq.f8410a;
        r0 = p000.kny.m18046a(r1, r0, r2);
        goto L_0x00b8;
    L_0x00f6:
        r0 = r2;
        goto L_0x0097;
    L_0x00f8:
        r6 = r0.f4563b;	 Catch:{ all -> 0x0011 }
        r8 = r5.f4563b;	 Catch:{ all -> 0x0011 }
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 >= 0) goto L_0x0085;
    L_0x0100:
        r0 = r10.f16082d;	 Catch:{ all -> 0x0011 }
        r0 = r0.poll();	 Catch:{ all -> 0x0011 }
        r0 = (p000.fhq) r0;	 Catch:{ all -> 0x0011 }
        goto L_0x0083;
    L_0x010a:
        r0 = r1;
        goto L_0x004c;
    L_0x010d:
        r0 = r1;
        goto L_0x004c;
    L_0x0110:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0110 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fjz.a():void");
    }
}
