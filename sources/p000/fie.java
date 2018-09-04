package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fie */
final class fie implements fip {
    /* renamed from: a */
    public final int f16047a = 120;
    /* renamed from: b */
    public final iqz f16048b;
    /* renamed from: c */
    public final Object f16049c = new Object();
    /* renamed from: d */
    public int f16050d;
    /* renamed from: e */
    public int f16051e = 0;
    /* renamed from: f */
    public int f16052f = 0;
    /* renamed from: g */
    private final int f16053g = 6;
    /* renamed from: h */
    private final ird f16054h;
    /* renamed from: i */
    private final fip f16055i;
    /* renamed from: j */
    private fim f16056j;

    fie(ira ira, ird ird, fip fip) {
        this.f16048b = ira.mo511a("RepeatingFRP");
        this.f16055i = fip;
        this.f16054h = ird;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m10408a() {
        /*
        r4 = this;
        r0 = r4.f16054h;
        r1 = "Rrp#sendNextRequest";
        r0.mo1903a(r1);
        r0 = r4.f16054h;
        r1 = "Rrp#lock";
        r0.mo1903a(r1);
        r1 = r4.f16049c;	 Catch:{ all -> 0x006c }
        monitor-enter(r1);	 Catch:{ all -> 0x006c }
        r0 = r4.f16051e;	 Catch:{ all -> 0x0078 }
        if (r0 <= 0) goto L_0x001f;
    L_0x0015:
        r2 = r4.f16056j;	 Catch:{ all -> 0x0078 }
        if (r2 == 0) goto L_0x001f;
    L_0x0019:
        r2 = r4.f16052f;	 Catch:{ all -> 0x0078 }
        r3 = r4.f16053g;	 Catch:{ all -> 0x0078 }
        if (r2 < r3) goto L_0x002b;
    L_0x001f:
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        r0 = r4.f16054h;
        r0.mo1904b();
        r0 = r4.f16054h;
        r0.mo1904b();
    L_0x002a:
        return;
    L_0x002b:
        r0 = r0 + -1;
        r4.f16051e = r0;	 Catch:{ all -> 0x0078 }
        r0 = r2 + 1;
        r4.f16052f = r0;	 Catch:{ all -> 0x0078 }
        r0 = r4.f16054h;	 Catch:{ all -> 0x0078 }
        r2 = "Rrp#build";
        r0.mo1905b(r2);	 Catch:{ all -> 0x0078 }
        r0 = new fio;	 Catch:{ all -> 0x0078 }
        r2 = r4.f16056j;	 Catch:{ all -> 0x0078 }
        r0.<init>(r2);	 Catch:{ all -> 0x0078 }
        r2 = new fig;	 Catch:{ all -> 0x0078 }
        r2.<init>(r4);	 Catch:{ all -> 0x0078 }
        r0 = r0.m2307a(r2);	 Catch:{ all -> 0x0078 }
        r0 = r0.m2301a();	 Catch:{ all -> 0x0078 }
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        r1 = r4.f16054h;	 Catch:{ all -> 0x006c }
        r2 = "Rrp#submit";
        r1.mo1905b(r2);	 Catch:{ all -> 0x006c }
        r1 = r4.f16055i;	 Catch:{ all -> 0x006c }
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ all -> 0x006c }
        r2 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x006c }
        r1.mo1381a(r0, r2);	 Catch:{ all -> 0x006c }
        r0 = r4.f16054h;
        r0.mo1904b();
        r0 = r4.f16054h;
        r0.mo1904b();
        goto L_0x002a;
    L_0x006c:
        r0 = move-exception;
        r1 = r4.f16054h;
        r1.mo1904b();
        r1 = r4.f16054h;
        r1.mo1904b();
        throw r0;
    L_0x0078:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        throw r0;	 Catch:{ all -> 0x006c }
        */
        throw new UnsupportedOperationException("Method not decompiled: fie.a():void");
    }

    /* renamed from: a */
    public final void mo1381a(List list, fiv fiv) {
        for (int i = 0; i < 8; i++) {
            m10408a();
        }
        if (!list.isEmpty()) {
            fim a;
            if (fiv.equals(fiv.NON_REPEATING)) {
                List arrayList = new ArrayList(list.size());
                synchronized (this.f16049c) {
                    for (fim a2 : list) {
                        if (a2.f4570e.mo2084b()) {
                            arrayList.add(a2);
                        } else {
                            this.f16051e--;
                            arrayList.add(new fio(a2).m2307a(new fih(this)).m2301a());
                        }
                    }
                }
                this.f16055i.mo1381a(arrayList, fiv.NON_REPEATING);
            } else if (list.size() > 1) {
                throw new UnsupportedOperationException("Repeating bursts are not supported");
            } else {
                synchronized (this.f16049c) {
                    this.f16056j = (fim) list.get(0);
                    a2 = new fio(this.f16056j).m2307a(new fif(this)).m2301a();
                }
                this.f16055i.mo1381a(Collections.singletonList(a2), fiv.REPEATING);
            }
        }
    }
}
