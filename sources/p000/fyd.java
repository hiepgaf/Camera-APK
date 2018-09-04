package p000;

import android.annotation.TargetApi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fyd */
public final class fyd implements fyt, iqo {
    /* renamed from: a */
    public final Object f16630a = new Object();
    /* renamed from: b */
    public final Set f16631b = new HashSet();
    /* renamed from: c */
    public final ArrayDeque f16632c = new ArrayDeque();
    /* renamed from: d */
    public final ArrayDeque f16633d = new ArrayDeque();
    /* renamed from: e */
    public final iml f16634e = new iml(Integer.valueOf(0));
    /* renamed from: f */
    public int f16635f = 0;
    /* renamed from: g */
    public boolean f16636g = false;
    /* renamed from: h */
    private final fyt f16637h;
    /* renamed from: i */
    private final imn f16638i = new imn(this.f16634e);

    /* renamed from: a */
    private static /* synthetic */ void m10875a(Throwable th, iqo iqo) {
        if (th != null) {
            try {
                iqo.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        iqo.close();
    }

    public fyd(fyt fyt) {
        this.f16637h = fyt;
    }

    /* renamed from: b */
    public final void m10880b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f16630a) {
            Iterator it = this.f16632c.iterator();
            while (it.hasNext()) {
                fyi fyi = (fyi) it.next();
                if (fyi.f4824a > this.f16635f) {
                    arrayList.add(fyi);
                }
            }
            this.f16632c.removeAll(arrayList);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fyi) obj).f4825b.m14754a(new fys("ReservableTicketPool abortWaitersOnCapacityDecrease()."));
        }
    }

    /* renamed from: a */
    public final bbi mo1428a(int i) {
        synchronized (this.f16630a) {
            if (this.f16636g) {
                bbi a = aqe.m581a(new fys("ReservableTicketPool is closed."));
                return a;
            }
            int i2 = this.f16635f;
            if (i > i2) {
                StringBuilder stringBuilder = new StringBuilder(51);
                stringBuilder.append("tickets out of upper range ");
                stringBuilder.append(i2);
                stringBuilder.append(": ");
                stringBuilder.append(i);
                a = aqe.m581a(new fys(new IndexOutOfBoundsException(stringBuilder.toString())));
                return a;
            }
            fyi fyi = new fyi(this, i);
            this.f16632c.add(fyi);
            bbi a2 = aqe.m580a(new fyj(fyi, fyi.f4825b), new fye(this));
            m10886g();
            return new fyg(this, a2, fyi);
        }
    }

    /* renamed from: a */
    public final iqo mo1429a() {
        return this.f16638i.m16090a();
    }

    public final void close() {
        synchronized (this.f16630a) {
            if (this.f16636g) {
                return;
            }
            this.f16636g = true;
            this.f16635f = 0;
            bbo bbo = new bbo();
            synchronized (this.f16630a) {
                bbo.addAll(this.f16631b);
                this.f16631b.clear();
            }
            bbo.close();
            bbo = new bbo();
            synchronized (this.f16630a) {
                bbo.addAll(this.f16633d);
                this.f16633d.clear();
            }
            bbo.close();
            m10880b();
            synchronized (this.f16630a) {
                this.f16634e.f21744b = Integer.valueOf(m10885f());
            }
            this.f16634e.f21743a.m16083a();
        }
    }

    /* renamed from: c */
    public final ilp mo1430c() {
        return this.f16638i;
    }

    /* renamed from: e */
    public final int m10884e() {
        int i;
        synchronized (this.f16630a) {
            i = this.f16635f;
        }
        return i;
    }

    /* renamed from: f */
    public final int m10885f() {
        if (this.f16632c.size() != 0) {
            return 0;
        }
        return this.f16633d.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    final void m10886g() {
        /*
        r9 = this;
        r3 = 1;
        r2 = 0;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = r9.f16630a;
        monitor-enter(r7);
        r0 = r9.f16636g;	 Catch:{ all -> 0x007c }
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r7);	 Catch:{ all -> 0x007c }
    L_0x000f:
        return;
    L_0x0010:
        r0 = r9.f16632c;	 Catch:{ all -> 0x007c }
        r0 = r0.peek();	 Catch:{ all -> 0x007c }
        r0 = (p000.fyi) r0;	 Catch:{ all -> 0x007c }
        r5 = r0;
    L_0x0019:
        if (r5 != 0) goto L_0x004c;
    L_0x001b:
        r0 = r9.f16634e;	 Catch:{ all -> 0x007c }
        r1 = r9.m10885f();	 Catch:{ all -> 0x007c }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x007c }
        r0.f21744b = r1;	 Catch:{ all -> 0x007c }
        monitor-exit(r7);	 Catch:{ all -> 0x007c }
        r3 = r6.size();
    L_0x002c:
        if (r2 >= r3) goto L_0x0044;
    L_0x002e:
        r1 = r2 + 1;
        r0 = r6.get(r2);
        r0 = (p000.fyi) r0;
        r2 = r0.f4826c;
        p000.jri.m13152b(r2);
        r2 = r0.f4825b;
        r0 = r0.f4826c;
        r2.m14753a(r0);
        r2 = r1;
        goto L_0x002c;
    L_0x0044:
        r0 = r9.f16634e;
        r0 = r0.f21743a;
        r0.m16083a();
        goto L_0x000f;
    L_0x004c:
        r0 = r5.f4824a;	 Catch:{ all -> 0x007c }
        r1 = r9.f16633d;	 Catch:{ all -> 0x007c }
        r1 = r1.size();	 Catch:{ all -> 0x007c }
        if (r0 > r1) goto L_0x001b;
    L_0x0056:
        r8 = new bbo;	 Catch:{ all -> 0x007c }
        r8.<init>();	 Catch:{ all -> 0x007c }
        r4 = r2;
        r1 = r3;
    L_0x005d:
        r0 = r5.f4824a;	 Catch:{ all -> 0x007c }
        if (r4 >= r0) goto L_0x0076;
    L_0x0061:
        r0 = r9.f16633d;	 Catch:{ all -> 0x007c }
        r0 = r0.poll();	 Catch:{ all -> 0x007c }
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x007c }
        if (r0 == 0) goto L_0x0074;
    L_0x006b:
        r8.add(r0);	 Catch:{ all -> 0x007c }
        r0 = r1;
    L_0x006f:
        r1 = r4 + 1;
        r4 = r1;
        r1 = r0;
        goto L_0x005d;
    L_0x0074:
        r0 = r2;
        goto L_0x006f;
    L_0x0076:
        if (r1 != 0) goto L_0x007f;
    L_0x0078:
        r8.close();	 Catch:{ all -> 0x007c }
        goto L_0x001b;
    L_0x007c:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x007c }
        throw r0;
    L_0x007f:
        r0 = r5.f4826c;	 Catch:{ all -> 0x007c }
        if (r0 != 0) goto L_0x009e;
    L_0x0083:
        r0 = r3;
    L_0x0084:
        r1 = "Result already set";
        p000.jri.m13154b(r0, r1);	 Catch:{ all -> 0x007c }
        r5.f4826c = r8;	 Catch:{ all -> 0x007c }
        r0 = r9.f16632c;	 Catch:{ all -> 0x007c }
        r0.remove(r5);	 Catch:{ all -> 0x007c }
        r6.add(r5);	 Catch:{ all -> 0x007c }
        r0 = r9.f16632c;	 Catch:{ all -> 0x007c }
        r0 = r0.peek();	 Catch:{ all -> 0x007c }
        r0 = (p000.fyi) r0;	 Catch:{ all -> 0x007c }
        r5 = r0;
        goto L_0x0019;
    L_0x009e:
        r0 = r2;
        goto L_0x0084;
        */
        throw new UnsupportedOperationException("Method not decompiled: fyd.g():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final p000.kpk m10879b(int r6) {
        /*
        r5 = this;
        r0 = r5.f16637h;
        r1 = r0.mo1429a();
        r0 = r5.f16637h;	 Catch:{ all -> 0x0037 }
        r0 = r0.mo1428a(r6);	 Catch:{ all -> 0x0037 }
        r2 = r5.f16630a;	 Catch:{ all -> 0x0037 }
        monitor-enter(r2);	 Catch:{ all -> 0x0037 }
        r3 = r5.f16636g;	 Catch:{ all -> 0x0034 }
        if (r3 == 0) goto L_0x002e;
    L_0x0013:
        r0.close();	 Catch:{ all -> 0x0034 }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x0034 }
        r2 = p000.kpw.m18056d();	 Catch:{ all -> 0x0037 }
        r3 = new fyf;	 Catch:{ all -> 0x0037 }
        r3.<init>(r5, r0, r2);	 Catch:{ all -> 0x0037 }
        r4 = p000.khx.m4940a();	 Catch:{ all -> 0x0037 }
        r0.mo2655a(r3, r4);	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x002d;
    L_0x0029:
        r0 = 0;
        p000.fyd.m10875a(r0, r1);
    L_0x002d:
        return r2;
    L_0x002e:
        r3 = r5.f16631b;	 Catch:{ all -> 0x0034 }
        r3.add(r0);	 Catch:{ all -> 0x0034 }
        goto L_0x0016;
    L_0x0034:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0034 }
        throw r0;	 Catch:{ all -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r2 = move-exception;
        if (r1 == 0) goto L_0x003f;
    L_0x003c:
        p000.fyd.m10875a(r0, r1);
    L_0x003f:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: fyd.b(int):kpk");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public final p000.fyr mo1431d() {
        /*
        r4 = this;
        r1 = r4.f16630a;
        monitor-enter(r1);
        r0 = r4.f16636g;	 Catch:{ all -> 0x003d }
        if (r0 != 0) goto L_0x0017;
    L_0x0007:
        r0 = r4.f16633d;	 Catch:{ all -> 0x003d }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x003d }
        if (r0 != 0) goto L_0x0017;
    L_0x000f:
        r0 = r4.f16632c;	 Catch:{ all -> 0x003d }
        r0 = r0.size();	 Catch:{ all -> 0x003d }
        if (r0 <= 0) goto L_0x001a;
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        r0 = 0;
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = r4.f16633d;	 Catch:{ all -> 0x003d }
        r0 = r0.remove();	 Catch:{ all -> 0x003d }
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x003d }
        r2 = r4.f16634e;	 Catch:{ all -> 0x003d }
        r3 = r4.m10885f();	 Catch:{ all -> 0x003d }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x003d }
        r2.f21744b = r3;	 Catch:{ all -> 0x003d }
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        r1 = r4.f16634e;
        r1 = r1.f21743a;
        r1.m16083a();
        r1 = new fyh;
        r1.<init>(r4, r0);
        r0 = r1;
        goto L_0x0019;
    L_0x003d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fyd.d():fyr");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public final boolean m10882c(int r8) {
        /*
        r7 = this;
        r6 = 0;
        r1 = 0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = r7.f16637h;
        r4 = r0.mo1429a();
        r0 = r1;
    L_0x000e:
        if (r0 >= r8) goto L_0x0041;
    L_0x0010:
        r2 = r7.f16637h;	 Catch:{ all -> 0x002b }
        r2 = r2.mo1431d();	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x003b;
    L_0x0018:
        r5 = r3.size();	 Catch:{ all -> 0x002b }
        r2 = r1;
    L_0x001d:
        if (r2 >= r5) goto L_0x0034;
    L_0x001f:
        r0 = r3.get(r2);	 Catch:{ all -> 0x002b }
        r2 = r2 + 1;
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x002b }
        r0.close();	 Catch:{ all -> 0x002b }
        goto L_0x001d;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002d }
    L_0x002d:
        r1 = move-exception;
        if (r4 == 0) goto L_0x0033;
    L_0x0030:
        p000.fyd.m10875a(r0, r4);
    L_0x0033:
        throw r1;
    L_0x0034:
        if (r4 == 0) goto L_0x0039;
    L_0x0036:
        p000.fyd.m10875a(r6, r4);
    L_0x0039:
        r0 = r1;
    L_0x003a:
        return r0;
    L_0x003b:
        r3.add(r2);	 Catch:{ all -> 0x002b }
        r0 = r0 + 1;
        goto L_0x000e;
    L_0x0041:
        r2 = r7.f16630a;	 Catch:{ all -> 0x002b }
        monitor-enter(r2);	 Catch:{ all -> 0x002b }
        r0 = r7.f16636g;	 Catch:{ all -> 0x006d }
        monitor-exit(r2);	 Catch:{ all -> 0x006d }
        if (r0 != 0) goto L_0x0053;
    L_0x0049:
        r7.m10878a(r3);	 Catch:{ all -> 0x002b }
        if (r4 == 0) goto L_0x0051;
    L_0x004e:
        p000.fyd.m10875a(r6, r4);
    L_0x0051:
        r0 = 1;
        goto L_0x003a;
    L_0x0053:
        r5 = r3.size();	 Catch:{ all -> 0x002b }
        r2 = r1;
    L_0x0058:
        if (r2 >= r5) goto L_0x0066;
    L_0x005a:
        r0 = r3.get(r2);	 Catch:{ all -> 0x002b }
        r2 = r2 + 1;
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x002b }
        r0.close();	 Catch:{ all -> 0x002b }
        goto L_0x0058;
    L_0x0066:
        if (r4 == 0) goto L_0x006b;
    L_0x0068:
        p000.fyd.m10875a(r6, r4);
    L_0x006b:
        r0 = r1;
        goto L_0x003a;
    L_0x006d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x006d }
        throw r0;	 Catch:{ all -> 0x002b }
        */
        throw new UnsupportedOperationException("Method not decompiled: fyd.c(int):boolean");
    }

    /* renamed from: a */
    final void m10878a(Collection collection) {
        synchronized (this.f16630a) {
            if (this.f16636g) {
                for (fyr close : collection) {
                    close.close();
                }
                return;
            }
            this.f16635f += collection.size();
            this.f16633d.addAll(collection);
            m10886g();
        }
    }
}
