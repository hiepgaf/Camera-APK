package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fyk */
public final class fyk implements fyt {
    /* renamed from: a */
    public final Object f16640a = new Object();
    /* renamed from: b */
    public final LinkedHashSet f16641b = new LinkedHashSet();
    /* renamed from: c */
    public final iml f16642c = new iml(Collections.emptyList());
    /* renamed from: d */
    public int f16643d;
    /* renamed from: e */
    private final fyt f16644e;
    /* renamed from: f */
    private final imn f16645f = new imn(ilq.m3843f(Arrays.asList(new ilp[]{ilq.m3817a(ilq.m3814a(ilq.m3817a(this.f16642c, new fyn())), fym.f16646a), this.f16644e.mo1430c()})));

    /* renamed from: a */
    private static /* synthetic */ void m10888a(Throwable th, iqo iqo) {
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

    public fyk(fyt fyt) {
        this.f16644e = fyt;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.bbi mo1428a(int r6) {
        /*
        r5 = this;
        r4 = 0;
        r1 = r5.mo1429a();
        r0 = r5.f16644e;	 Catch:{ all -> 0x0032 }
        r0 = r0.mo1428a(r6);	 Catch:{ all -> 0x0032 }
        r2 = r0.mo2656b();	 Catch:{ all -> 0x0032 }
        if (r2 != 0) goto L_0x002e;
    L_0x0011:
        r2 = r5.f16640a;	 Catch:{ all -> 0x0032 }
        monitor-enter(r2);	 Catch:{ all -> 0x0032 }
        r3 = r5.f16643d;	 Catch:{ all -> 0x0039 }
        r3 = r3 + 1;
        r5.f16643d = r3;	 Catch:{ all -> 0x0039 }
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        r2 = new fyo;	 Catch:{ all -> 0x0032 }
        r2.<init>(r5);	 Catch:{ all -> 0x0032 }
        r3 = p000.khx.m4940a();	 Catch:{ all -> 0x0032 }
        r0.mo2655a(r2, r3);	 Catch:{ all -> 0x0032 }
        r5.m10892b();	 Catch:{ all -> 0x0032 }
        p000.fyk.m10888a(r4, r1);
    L_0x002d:
        return r0;
    L_0x002e:
        p000.fyk.m10888a(r4, r1);
        goto L_0x002d;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        p000.fyk.m10888a(r0, r1);
        throw r2;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        throw r0;	 Catch:{ all -> 0x0032 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fyk.a(int):bbi");
    }

    /* renamed from: a */
    public final iqo m10891a(fyl fyl) {
        synchronized (this.f16640a) {
            jri.m13153b(this.f16641b.contains(fyl) ^ 1);
            this.f16641b.add(fyl);
            this.f16642c.f21744b = new ArrayList(this.f16641b);
        }
        this.f16642c.f21743a.m16083a();
        iqt fyp = new fyp(this);
        iqo a = ilq.m3823a(fyl.mo1404f(), fyp);
        fyl.mo1404f().mo2860b();
        fyp.m10897a();
        iqo bbo = new bbo();
        bbo.add(new fyq(this, fyl));
        bbo.add(a);
        return bbo;
    }

    /* renamed from: a */
    public final iqo mo1429a() {
        iqo a = this.f16644e.mo1429a();
        iqo a2 = this.f16645f.m16090a();
        iqo bbo = new bbo();
        bbo.add(a);
        bbo.add(a2);
        return bbo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    final void m10892b() {
        /*
        r6 = this;
        r1 = r6.f16640a;
        monitor-enter(r1);
        r0 = r6.f16643d;	 Catch:{ all -> 0x003a }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
    L_0x0008:
        return;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        r1 = r6.f16640a;
        monitor-enter(r1);
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x003d }
        r0 = r6.f16641b;	 Catch:{ all -> 0x003d }
        r2.<init>(r0);	 Catch:{ all -> 0x003d }
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        r3 = r2.size();
        r0 = 0;
    L_0x001a:
        if (r0 >= r3) goto L_0x0008;
    L_0x001c:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.fyl) r0;
    L_0x0024:
        r4 = r0.mo1403e();
        if (r4 == 0) goto L_0x0038;
    L_0x002a:
        r4 = r6.f16640a;
        monitor-enter(r4);
        r5 = r6.f16643d;	 Catch:{ all -> 0x0033 }
        if (r5 != 0) goto L_0x0036;
    L_0x0031:
        monitor-exit(r4);	 Catch:{ all -> 0x0033 }
        goto L_0x0008;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0033 }
        throw r0;
    L_0x0036:
        monitor-exit(r4);	 Catch:{ all -> 0x0033 }
        goto L_0x0024;
    L_0x0038:
        r0 = r1;
        goto L_0x001a;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fyk.b():void");
    }

    /* renamed from: c */
    public final ilp mo1430c() {
        return this.f16645f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public final p000.fyr mo1431d() {
        /*
        r6 = this;
        r1 = 0;
        r0 = r6.f16644e;
        r0 = r0.mo1431d();
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r6.mo1429a();
        r2 = r6.f16640a;	 Catch:{ all -> 0x003d }
        monitor-enter(r2);	 Catch:{ all -> 0x003d }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0044 }
        r0 = r6.f16641b;	 Catch:{ all -> 0x0044 }
        r4.<init>(r0);	 Catch:{ all -> 0x0044 }
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        r5 = r4.size();	 Catch:{ all -> 0x003d }
        r0 = 0;
        r2 = r0;
    L_0x001f:
        if (r2 >= r5) goto L_0x0038;
    L_0x0021:
        r0 = r4.get(r2);	 Catch:{ all -> 0x003d }
        r2 = r2 + 1;
        r0 = (p000.fyl) r0;	 Catch:{ all -> 0x003d }
        r0.mo1403e();	 Catch:{ all -> 0x003d }
        r0 = r6.f16644e;	 Catch:{ all -> 0x003d }
        r0 = r0.mo1431d();	 Catch:{ all -> 0x003d }
        if (r0 == 0) goto L_0x001f;
    L_0x0034:
        p000.fyk.m10888a(r1, r3);
        goto L_0x0009;
    L_0x0038:
        p000.fyk.m10888a(r1, r3);
        r0 = r1;
        goto L_0x0009;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r1 = move-exception;
        p000.fyk.m10888a(r0, r3);
        throw r1;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        throw r0;	 Catch:{ all -> 0x003d }
        */
        throw new UnsupportedOperationException("Method not decompiled: fyk.d():fyr");
    }
}
