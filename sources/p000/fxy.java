package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fxy */
public final class fxy implements fyt {
    /* renamed from: a */
    public final ilp f16627a;
    /* renamed from: b */
    private final List f16628b;

    public fxy(List list) {
        boolean z;
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        this.f16628b = ken.m13458a((Collection) list);
        Collection arrayList = new ArrayList();
        for (fyt c : list) {
            arrayList.add(c.mo1430c());
        }
        this.f16627a = ilq.m3839d(arrayList);
    }

    /* renamed from: a */
    public final bbi mo1428a(int i) {
        List arrayList = new ArrayList();
        for (fyt a : this.f16628b) {
            arrayList.add(a.mo1428a(i));
        }
        bbi d = bcp.m14749d();
        Runnable bbj = new bbj(arrayList, d);
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((bbi) obj).mo2655a(bbj, khx.m4940a());
        }
        return aqe.m580a(new bbk(d, arrayList), new fxz(i));
    }

    /* renamed from: a */
    public final iqo mo1429a() {
        iqo ikb = new ikb();
        for (fyt a : this.f16628b) {
            ikb.mo1879a(a.mo1429a());
        }
        return ikb;
    }

    /* renamed from: c */
    public final ilp mo1430c() {
        return this.f16627a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public final p000.fyr mo1431d() {
        /*
        r5 = this;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r5.mo1429a();
        r0 = r5.f16628b;	 Catch:{ all -> 0x0035 }
        r1 = r0.iterator();	 Catch:{ all -> 0x0035 }
    L_0x000f:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0045;
    L_0x0015:
        r0 = r1.next();	 Catch:{ all -> 0x0035 }
        r0 = (p000.fyt) r0;	 Catch:{ all -> 0x0035 }
        r0 = r0.mo1431d();	 Catch:{ all -> 0x0035 }
        if (r0 != 0) goto L_0x0041;
    L_0x0021:
        r4 = r2.size();	 Catch:{ all -> 0x0035 }
        r0 = 0;
        r1 = r0;
    L_0x0027:
        if (r1 >= r4) goto L_0x003c;
    L_0x0029:
        r0 = r2.get(r1);	 Catch:{ all -> 0x0035 }
        r1 = r1 + 1;
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x0035 }
        r0.close();	 Catch:{ all -> 0x0035 }
        goto L_0x0027;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0037 }
    L_0x0037:
        r1 = move-exception;
        r3.close();	 Catch:{ all -> 0x004e }
    L_0x003b:
        throw r1;
    L_0x003c:
        r3.close();
        r0 = 0;
    L_0x0040:
        return r0;
    L_0x0041:
        r2.add(r0);	 Catch:{ all -> 0x0035 }
        goto L_0x000f;
    L_0x0045:
        r3.close();
        r0 = new fya;
        r0.<init>(r2);
        goto L_0x0040;
    L_0x004e:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fxy.d():fyr");
    }
}
