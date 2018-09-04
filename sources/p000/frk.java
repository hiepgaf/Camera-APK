package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: frk */
public final class frk implements fre, iqo {
    /* renamed from: a */
    public final Object f16442a;
    /* renamed from: b */
    public final int f16443b;
    /* renamed from: c */
    public final int f16444c;
    /* renamed from: d */
    public final fij f16445d;
    /* renamed from: e */
    public final fne f16446e;
    /* renamed from: f */
    public final fjl f16447f;
    /* renamed from: g */
    public final img f16448g;
    /* renamed from: h */
    public final iqz f16449h;
    /* renamed from: i */
    public final ird f16450i;
    /* renamed from: j */
    public final Deque f16451j;
    /* renamed from: k */
    public final Deque f16452k;
    /* renamed from: l */
    public final List f16453l;
    /* renamed from: m */
    public boolean f16454m = false;
    /* renamed from: n */
    public boolean f16455n = false;
    /* renamed from: o */
    public boolean f16456o;
    /* renamed from: p */
    private final int f16457p;
    /* renamed from: q */
    private final img f16458q;
    /* renamed from: r */
    private final fro f16459r;
    /* renamed from: s */
    private final frr f16460s;
    /* renamed from: t */
    private final Executor f16461t;
    /* renamed from: u */
    private final Executor f16462u;
    /* renamed from: v */
    private final ScheduledExecutorService f16463v;
    /* renamed from: w */
    private final ikb f16464w;

    public frk(fij fij, fne fne, fjl fjl, int i, int i2, int i3, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, iqz iqz, ird ird) {
        boolean z;
        this.f16445d = fij;
        this.f16446e = fne;
        this.f16447f = fjl;
        this.f16457p = i3;
        this.f16443b = i;
        this.f16444c = i2;
        this.f16461t = executor;
        this.f16462u = executor2;
        this.f16463v = scheduledExecutorService;
        this.f16450i = ird;
        this.f16449h = iqz.mo512a("ReprocImgSvr");
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "maxImages");
        if (i3 >= i2) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "maxQueueSize");
        this.f16456o = false;
        this.f16442a = new Object();
        this.f16451j = new ArrayDeque(i3);
        this.f16452k = new ArrayDeque(i);
        this.f16453l = new ArrayList(i2);
        this.f16459r = new fro(this);
        this.f16460s = new frr(this);
        this.f16464w = new ikb();
        this.f16458q = new img(new frl(this, i));
        this.f16448g = new img(new frm(this));
        this.f16464w.mo1879a(fne.mo1409a().mo2859a(new frn(this), kpq.f8410a));
        this.f16449h.mo518d(String.format("Created a ReprocessingImageSaver with %s / %s / %s.", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    public final void close() {
        synchronized (this.f16442a) {
            m10700a(this.f16451j);
        }
        m10709d();
    }

    /* renamed from: a */
    private final void m10700a(Collection collection) {
        if (!this.f16456o) {
            this.f16456o = true;
            this.f16458q.m16083a();
        }
        for (frp a : collection) {
            a.m2366a(new isr("ReprocessingImageSaver has been closed."));
        }
    }

    /* renamed from: a */
    final void m10705a() {
        synchronized (this.f16442a) {
            Collection arrayList = new ArrayList();
            arrayList.addAll(this.f16451j);
            arrayList.addAll(this.f16452k);
            m10700a(arrayList);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final p000.frp m10701a(long r8, long r10) {
        /*
        r7 = this;
        r1 = 0;
        r0 = r1;
    L_0x0002:
        if (r0 == 0) goto L_0x002b;
    L_0x0004:
        r2 = new isr;
        r4 = r0.m2365a();
        r3 = new java.lang.StringBuilder;
        r6 = 91;
        r3.<init>(r6);
        r6 = "Reprocessing failed for image ";
        r3.append(r6);
        r3.append(r4);
        r4 = " because we received ";
        r3.append(r4);
        r3.append(r8);
        r3 = r3.toString();
        r2.<init>(r3);
        r0.m2366a(r2);
    L_0x002b:
        r2 = r7.f16442a;
        monitor-enter(r2);
        r0 = r7.f16452k;	 Catch:{ all -> 0x005f }
        r0 = r0.size();	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x0039;
    L_0x0036:
        monitor-exit(r2);	 Catch:{ all -> 0x005f }
        r0 = r1;
    L_0x0038:
        return r0;
    L_0x0039:
        r0 = r7.f16452k;	 Catch:{ all -> 0x005f }
        r0 = r0.removeFirst();	 Catch:{ all -> 0x005f }
        r0 = (p000.frp) r0;	 Catch:{ all -> 0x005f }
        r3 = r7.f16453l;	 Catch:{ all -> 0x005f }
        r3.add(r0);	 Catch:{ all -> 0x005f }
        r3 = r7.f16448g;	 Catch:{ all -> 0x005f }
        r3.m16083a();	 Catch:{ all -> 0x005f }
        monitor-exit(r2);	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x0038;
    L_0x004e:
        r2 = r0.m2365a();
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 == 0) goto L_0x0038;
    L_0x0056:
        r2 = r0.m2365a();
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 == 0) goto L_0x0038;
    L_0x005e:
        goto L_0x0002;
    L_0x005f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x005f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: frk.a(long, long):frp");
    }

    /* renamed from: a */
    final /* synthetic */ Integer m10703a(int i) {
        Integer valueOf;
        synchronized (this.f16442a) {
            if (this.f16456o) {
                i = 0;
            }
            valueOf = Integer.valueOf(i);
        }
        return valueOf;
    }

    /* renamed from: c */
    final /* synthetic */ Integer m10708c() {
        Integer valueOf;
        synchronized (this.f16442a) {
            valueOf = Integer.valueOf(this.f16452k.size() + this.f16453l.size());
        }
        return valueOf;
    }

    /* renamed from: b */
    public final ilp mo1413b() {
        return this.f16458q;
    }

    /* renamed from: a */
    private final kpk m10699a(fri fri) {
        kpk a;
        synchronized (this.f16442a) {
            StringBuilder stringBuilder;
            if (this.f16456o || this.f16451j.size() >= this.f16457p) {
                int i = this.f16457p;
                stringBuilder = new StringBuilder(48);
                stringBuilder.append("Too many images have been enqueued (");
                stringBuilder.append(i);
                stringBuilder.append(")");
                a = kow.m13618a(new isr(stringBuilder.toString()));
            } else {
                frp frp = new frp(this, fri);
                this.f16451j.add(frp);
                iqz iqz = this.f16449h;
                long a2 = frp.m2365a();
                stringBuilder = new StringBuilder(53);
                stringBuilder.append("Enqueued image ");
                stringBuilder.append(a2);
                stringBuilder.append(" for reprocessing.");
                iqz.mo518d(stringBuilder.toString());
                m10709d();
                a = frp.f4673c;
            }
        }
        return a;
    }

    /* renamed from: a */
    final iwp m10702a(kpk kpk) {
        if (kpk.isDone()) {
            return (iwp) kow.m13623b(kpk);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.f16463v;
        kpk kpz = new kpz(kpk);
        Runnable kqa = new kqa(kpz);
        kpz.f23611f = scheduledExecutorService.schedule(kqa, 500, timeUnit);
        kpk.mo1985a(kqa, kpq.f8410a);
        return (iwp) kpz.get();
    }

    /* renamed from: b */
    final long m10706b(kpk kpk) {
        Long l = null;
        if (kpk != null) {
            try {
                iwp a = m10702a(kpk);
            } catch (ExecutionException e) {
                return -1;
            } catch (InterruptedException e2) {
                return -1;
            }
        }
        a = null;
        if (a != null) {
            l = (Long) a.mo3143a(CaptureResult.SENSOR_TIMESTAMP);
        }
        return l != null ? l.longValue() : -1;
    }

    /* renamed from: d */
    final void m10709d() {
        synchronized (this.f16442a) {
            if (!this.f16454m) {
                this.f16454m = true;
                this.f16462u.execute(this.f16460s);
            }
            if (!this.f16455n) {
                this.f16455n = true;
                this.f16461t.execute(this.f16459r);
            }
        }
    }
}
