package p000;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ick */
public abstract class ick extends huu {
    /* renamed from: a */
    private static final ThreadLocal f18161a = new icl();
    /* renamed from: b */
    private final icm f18162b;
    /* renamed from: c */
    private final WeakReference f18163c;
    /* renamed from: d */
    private final CountDownLatch f18164d;
    /* renamed from: e */
    private huy f18165e;
    /* renamed from: f */
    private final AtomicReference f18166f;
    /* renamed from: g */
    public final Object f18167g;
    /* renamed from: h */
    public final ArrayList f18168h;
    /* renamed from: i */
    private hux f18169i;
    /* renamed from: j */
    private volatile boolean f18170j;
    /* renamed from: k */
    private boolean f18171k;
    /* renamed from: l */
    private boolean f18172l;
    /* renamed from: m */
    private volatile hyb f18173m;
    /* renamed from: n */
    private boolean f18174n;

    @Deprecated
    ick() {
        this.f18167g = new Object();
        this.f18164d = new CountDownLatch(1);
        this.f18168h = new ArrayList();
        this.f18166f = new AtomicReference();
        this.f18174n = false;
        this.f18162b = new icm(Looper.getMainLooper());
        this.f18163c = new WeakReference(null);
    }

    @Deprecated
    protected ick(Looper looper) {
        this.f18167g = new Object();
        this.f18164d = new CountDownLatch(1);
        this.f18168h = new ArrayList();
        this.f18166f = new AtomicReference();
        this.f18174n = false;
        this.f18162b = new icm(looper);
        this.f18163c = new WeakReference(null);
    }

    protected ick(huq huq) {
        this.f18167g = new Object();
        this.f18164d = new CountDownLatch(1);
        this.f18168h = new ArrayList();
        this.f18166f = new AtomicReference();
        this.f18174n = false;
        this.f18162b = new icm(huq == null ? Looper.getMainLooper() : huq.mo1849d());
        this.f18163c = new WeakReference(huq);
    }

    /* renamed from: b */
    public static void m12059b(hux hux) {
        if (hux instanceof huw) {
            try {
                ((huw) hux).m3493a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(hux);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("BasePendingResult", stringBuilder.toString(), e);
            }
        }
    }

    /* renamed from: e */
    private final hux m12061e() {
        hux hux;
        synchronized (this.f18167g) {
            htl.m3422a(this.f18170j ^ 1, (Object) "Result has already been consumed.");
            htl.m3422a(m12068b(), (Object) "Result is not ready.");
            hux = this.f18169i;
            this.f18169i = null;
            this.f18165e = null;
            this.f18170j = true;
        }
        hzy hzy = (hzy) this.f18166f.getAndSet(null);
        if (hzy != null) {
            hzy.f6857a.f6855c.remove(this);
        }
        return hux;
    }

    /* renamed from: f */
    private final boolean m12062f() {
        boolean z;
        synchronized (this.f18167g) {
            z = this.f18171k;
        }
        return z;
    }

    /* renamed from: a */
    public abstract hux mo3119a(Status status);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m12064a() {
        /*
        r2 = this;
        r1 = r2.f18167g;
        monitor-enter(r1);
        r0 = r2.f18171k;	 Catch:{ all -> 0x0020 }
        if (r0 != 0) goto L_0x001e;
    L_0x0007:
        r0 = r2.f18170j;	 Catch:{ all -> 0x0020 }
        if (r0 != 0) goto L_0x001e;
    L_0x000b:
        r0 = r2.f18169i;	 Catch:{ all -> 0x0020 }
        p000.ick.m12059b(r0);	 Catch:{ all -> 0x0020 }
        r0 = 1;
        r2.f18171k = r0;	 Catch:{ all -> 0x0020 }
        r0 = com.google.android.gms.common.api.Status.f20467d;	 Catch:{ all -> 0x0020 }
        r0 = r2.mo3119a(r0);	 Catch:{ all -> 0x0020 }
        r2.m12060c(r0);	 Catch:{ all -> 0x0020 }
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
    L_0x001d:
        return;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x001d;
    L_0x0020:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ick.a():void");
    }

    /* renamed from: a */
    public final void m12065a(hux hux) {
        synchronized (this.f18167g) {
            if (this.f18172l || this.f18171k) {
                ick.m12059b(hux);
                return;
            }
            m12068b();
            htl.m3422a(m12068b() ^ 1, (Object) "Results have already been set");
            htl.m3422a(this.f18170j ^ 1, (Object) "Result has already been consumed");
            m12060c(hux);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo1807a(p000.huy r4) {
        /*
        r3 = this;
        r1 = r3.f18167g;
        monitor-enter(r1);
        if (r4 == 0) goto L_0x0035;
    L_0x0005:
        r0 = r3.f18170j;	 Catch:{ all -> 0x0030 }
        r0 = r0 ^ 1;
        r2 = "Result has already been consumed.";
        p000.htl.m3422a(r0, r2);	 Catch:{ all -> 0x0030 }
        r0 = r3.f18173m;	 Catch:{ all -> 0x0030 }
        r0 = "Cannot set callbacks if then() has been called.";
        r2 = 1;
        p000.htl.m3422a(r2, r0);	 Catch:{ all -> 0x0030 }
        r0 = r3.m12062f();	 Catch:{ all -> 0x0030 }
        if (r0 != 0) goto L_0x0033;
    L_0x001c:
        r0 = r3.m12068b();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x002d;
    L_0x0022:
        r0 = r3.f18162b;	 Catch:{ all -> 0x0030 }
        r2 = r3.m12061e();	 Catch:{ all -> 0x0030 }
        r0.m3670a(r4, r2);	 Catch:{ all -> 0x0030 }
    L_0x002b:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
    L_0x002c:
        return;
    L_0x002d:
        r3.f18165e = r4;	 Catch:{ all -> 0x0030 }
        goto L_0x002b;
    L_0x0030:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        throw r0;
    L_0x0033:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        goto L_0x002c;
    L_0x0035:
        r0 = 0;
        r3.f18165e = r0;	 Catch:{ all -> 0x0030 }
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: ick.a(huy):void");
    }

    /* renamed from: a */
    public final void m12067a(hzy hzy) {
        this.f18166f.set(hzy);
    }

    /* renamed from: b */
    public final boolean m12068b() {
        return this.f18164d.getCount() == 0;
    }

    /* renamed from: c */
    public final void m12069c(Status status) {
        synchronized (this.f18167g) {
            if (!m12068b()) {
                m12065a(mo3119a(status));
                this.f18172l = true;
            }
        }
    }

    /* renamed from: c */
    public final boolean m12070c() {
        boolean f;
        synchronized (this.f18167g) {
            if (((huq) this.f18163c.get()) == null || !this.f18174n) {
                m12064a();
            }
            f = m12062f();
        }
        return f;
    }

    /* renamed from: d */
    public final void m12071d() {
        boolean z = !this.f18174n ? ((Boolean) f18161a.get()).booleanValue() : true;
        this.f18174n = z;
    }

    /* renamed from: c */
    private final void m12060c(hux hux) {
        this.f18169i = hux;
        this.f18164d.countDown();
        this.f18169i.mo1854a();
        if (this.f18171k) {
            this.f18165e = null;
        } else if (this.f18165e != null) {
            this.f18162b.removeMessages(2);
            this.f18162b.m3670a(this.f18165e, m12061e());
        } else if (this.f18169i instanceof huw) {
            icn icn = new icn(this);
        }
        ArrayList arrayList = this.f18168h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((huv) arrayList.get(i)).m3492a();
            i = i2;
        }
        this.f18168h.clear();
    }
}
