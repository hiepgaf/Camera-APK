package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: knk */
public class knk extends koq {
    /* renamed from: a */
    public static final boolean f23427a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    /* renamed from: b */
    public static final Logger f23428b = Logger.getLogger(knk.class.getName());
    /* renamed from: c */
    public static final knl f23429c;
    /* renamed from: d */
    public static final Object f23430d = new Object();
    public volatile knp listeners;
    public volatile Object value;
    public volatile knw waiters;

    static {
        knl knu;
        Throwable th;
        Throwable th2 = null;
        try {
            knu = new knu();
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            knu = new kns();
        }
        f23429c = knu;
        if (th2 != null) {
            f23428b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            f23428b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    /* renamed from: a */
    private final void m17770a(StringBuilder stringBuilder) {
        try {
            Object b = kow.m13623b(this);
            stringBuilder.append("SUCCESS, result=[");
            stringBuilder.append(m17775c(b));
            stringBuilder.append("]");
        } catch (ExecutionException e) {
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(e.getCause());
            stringBuilder.append("]");
        } catch (CancellationException e2) {
            stringBuilder.append("CANCELLED");
        } catch (RuntimeException e3) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(e3.getClass());
            stringBuilder.append(" thrown from get()]");
        }
    }

    /* renamed from: a */
    public final void mo1985a(Runnable runnable, Executor executor) {
        jri.m13139a((Object) runnable, (Object) "Runnable was null.");
        jri.m13139a((Object) executor, (Object) "Executor was null.");
        knp knp = this.listeners;
        if (knp != knp.f8379a) {
            knp knp2 = new knp(runnable, executor);
            do {
                knp2.next = knp;
                if (!f23429c.mo2195a(this, knp, knp2)) {
                    knp = this.listeners;
                } else {
                    return;
                }
            } while (knp != knp.f8379a);
        }
        knk.m17774b(runnable, executor);
    }

    /* renamed from: a */
    protected void mo3613a() {
    }

    public boolean cancel(boolean z) {
        int i;
        Object obj = this.value;
        if (obj == null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i | (obj instanceof knr)) == 0) {
            return false;
        }
        if (f23427a) {
            Object knm = new knm(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            r5 = knm.f8373a;
        } else {
            r5 = knm.f8374b;
        }
        Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (f23429c.mo2194a(this, obj2, knm)) {
                knk.m17771a(this);
                if (!(obj2 instanceof knr)) {
                    return true;
                }
                kpk kpk = ((knr) obj2).f8383b;
                if (kpk instanceof knt) {
                    int i2;
                    knk knk = (knk) kpk;
                    Object obj3 = knk.value;
                    if (obj3 == null) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if ((i2 | (obj3 instanceof knr)) == 0) {
                        return true;
                    }
                    this = knk;
                    z2 = true;
                    obj2 = obj3;
                } else {
                    kpk.cancel(z);
                    return true;
                }
            }
            obj2 = this.value;
            if (!(obj2 instanceof knr)) {
                return z2;
            }
        }
    }

    /* renamed from: a */
    static void m17771a(knk knk) {
        Thread thread = null;
        while (true) {
            knw knw = knk.waiters;
            if (f23429c.mo2196a(knk, knw, knw.f8384a)) {
                knp knp;
                knp knp2;
                while (knw != null) {
                    Thread thread2 = knw.thread;
                    if (thread2 != null) {
                        knw.thread = null;
                        LockSupport.unpark(thread2);
                    }
                    knw = knw.next;
                }
                knk.mo3613a();
                do {
                    knp = knk.listeners;
                } while (!f23429c.mo2195a(knk, knp, knp.f8379a));
                Thread thread3 = thread;
                knp knp3 = knp;
                knp = thread3;
                while (knp3 != null) {
                    knp2 = knp3.next;
                    knp3.next = knp;
                    knp = knp3;
                    knp3 = knp2;
                }
                knp2 = knp;
                while (knp2 != null) {
                    knp = knp2.next;
                    Runnable runnable = knp2.f8380b;
                    if (runnable instanceof knr) {
                        Object obj = (knr) runnable;
                        knk = obj.f8382a;
                        if (knk.value == obj) {
                            if (f23429c.mo2194a(knk, obj, knk.m17769a(obj.f8383b))) {
                                thread = knp;
                            } else {
                                knp2 = knp;
                            }
                        } else {
                            knp2 = knp;
                        }
                    } else {
                        knk.m17774b(runnable, knp2.f8381c);
                        knp2 = knp;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: b */
    private static void m17774b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = f23428b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length());
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with executor ");
            stringBuilder.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", stringBuilder.toString(), e);
        }
    }

    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i;
        Object obj = this.value;
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i & ((obj instanceof knr) ^ 1)) != 0) {
            return knk.mo3615b(obj);
        }
        knw knw = this.waiters;
        if (knw != knw.f8384a) {
            knw knw2 = new knw();
            do {
                knw2.m5018a(knw);
                if (f23429c.mo2196a(this, knw, knw2)) {
                    Object obj2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m17772a(knw2);
                            throw new InterruptedException();
                        }
                        obj2 = this.value;
                        if (obj2 != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } while ((i & ((obj2 instanceof knr) ^ 1)) == 0);
                    return knk.mo3615b(obj2);
                }
                knw = this.waiters;
            } while (knw != knw.f8384a);
        }
        return knk.mo3615b(this.value);
    }

    public Object get(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i;
        Object obj = this.value;
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i & ((obj instanceof knr) ^ 1)) != 0) {
            return knk.mo3615b(obj);
        }
        long nanoTime;
        long j2;
        if (toNanos > 0) {
            nanoTime = System.nanoTime() + toNanos;
        } else {
            nanoTime = 0;
        }
        if (toNanos >= 1000) {
            knw knw = this.waiters;
            if (knw != knw.f8384a) {
                knw knw2 = new knw();
                do {
                    knw2.m5018a(knw);
                    if (f23429c.mo2196a(this, knw, knw2)) {
                        j2 = toNanos;
                        do {
                            LockSupport.parkNanos(this, j2);
                            if (Thread.interrupted()) {
                                m17772a(knw2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                            if (obj != null) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if ((i & ((obj instanceof knr) ^ 1)) != 0) {
                                return knk.mo3615b(obj);
                            }
                            j2 = nanoTime - System.nanoTime();
                        } while (j2 >= 1000);
                        m17772a(knw2);
                    } else {
                        knw = this.waiters;
                    }
                } while (knw != knw.f8384a);
            }
            return knk.mo3615b(this.value);
        }
        j2 = toNanos;
        while (j2 > 0) {
            obj = this.value;
            if (obj != null) {
                i = 1;
            } else {
                i = 0;
            }
            if ((i & ((obj instanceof knr) ^ 1)) != 0) {
                return knk.mo3615b(obj);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j2 = nanoTime - System.nanoTime();
        }
        String knk = toString();
        if (isDone()) {
            String a = jqk.m13082a(timeUnit.toString());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 68);
            stringBuilder.append("Waited ");
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(a);
            stringBuilder.append(" but future completed as timeout expired");
            throw new TimeoutException(stringBuilder.toString());
        }
        String a2 = jqk.m13082a(timeUnit.toString());
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(a2).length() + 33) + String.valueOf(knk).length());
        stringBuilder2.append("Waited ");
        stringBuilder2.append(j);
        stringBuilder2.append(" ");
        stringBuilder2.append(a2);
        stringBuilder2.append(" for ");
        stringBuilder2.append(knk);
        throw new TimeoutException(stringBuilder2.toString());
    }

    /* renamed from: b */
    private static Object mo3615b(Object obj) {
        if (obj instanceof knm) {
            Throwable th = ((knm) obj).f8376d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof knn) {
            throw new ExecutionException(((knn) obj).f8378b);
        } else if (obj == f23430d) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: a */
    static Object m17769a(kpk kpk) {
        Throwable th;
        if (kpk instanceof knt) {
            Object obj = ((knk) kpk).value;
            if (!(obj instanceof knm)) {
                return obj;
            }
            knm knm = (knm) obj;
            if (!knm.f8375c) {
                return obj;
            }
            th = knm.f8376d;
            if (th != null) {
                return new knm(false, th);
            }
            return knm.f8374b;
        }
        Object b;
        try {
            b = kow.m13623b(kpk);
            if (b == null) {
                b = f23430d;
            }
        } catch (ExecutionException e) {
            b = new knn(e.getCause());
        } catch (Throwable th2) {
            b = new knm(false, th2);
        } catch (Throwable th22) {
            b = new knn(th22);
        }
        return b;
    }

    public boolean isCancelled() {
        return this.value instanceof knm;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (obj != null ? 1 : 0) & ((obj instanceof knr) ^ 1);
    }

    /* renamed from: a */
    final void m17778a(Future future) {
        int i;
        if (future != null) {
            i = 1;
        } else {
            i = 0;
        }
        if ((i & isCancelled()) != 0) {
            future.cancel(m17783c());
        }
    }

    /* renamed from: b */
    protected String mo3614b() {
        Object obj = this.value;
        StringBuilder stringBuilder;
        if (obj instanceof knr) {
            String c = m17775c(((knr) obj).f8383b);
            stringBuilder = new StringBuilder(String.valueOf(c).length() + 12);
            stringBuilder.append("setFuture=[");
            stringBuilder.append(c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            stringBuilder = new StringBuilder(41);
            stringBuilder.append("remaining delay=[");
            stringBuilder.append(delay);
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    private final void m17772a(knw knw) {
        knw.thread = null;
        while (true) {
            knw knw2 = this.waiters;
            if (knw2 != knw.f8384a) {
                knw knw3 = null;
                while (knw2 != null) {
                    knw knw4 = knw2.next;
                    if (knw2.thread != null) {
                        knw3 = knw2;
                    } else if (knw3 != null) {
                        knw3.next = knw4;
                        if (knw3.thread != null) {
                        }
                    } else if (f23429c.mo2196a(this, knw2, knw4)) {
                    }
                    knw2 = knw4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: a */
    public boolean mo3557a(Object obj) {
        if (obj == null) {
            obj = f23430d;
        }
        if (!f23429c.mo2194a(this, null, obj)) {
            return false;
        }
        knk.m17771a(this);
        return true;
    }

    /* renamed from: a */
    public final boolean m17780a(Throwable th) {
        if (!f23429c.mo2194a(this, null, new knn((Throwable) jri.m13152b((Object) th)))) {
            return false;
        }
        knk.m17771a(this);
        return true;
    }

    /* renamed from: b */
    protected boolean mo3616b(kpk kpk) {
        Object knr;
        jri.m13152b((Object) kpk);
        Object obj = this.value;
        if (obj == null) {
            if (kpk.isDone()) {
                if (!f23429c.mo2194a(this, null, knk.m17769a(kpk))) {
                    return false;
                }
                knk.m17771a(this);
                return true;
            }
            knr = new knr(this, kpk);
            if (f23429c.mo2194a(this, null, knr)) {
                try {
                    kpk.mo1985a(knr, kpq.f8410a);
                } catch (Throwable th) {
                    obj = knn.f8377a;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof knm) {
            kpk.cancel(((knm) obj).f8375c);
        }
        return false;
        f23429c.mo2194a(this, knr, obj);
        return true;
    }

    public String toString() {
        String b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        if (isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (isDone()) {
            m17770a(stringBuilder);
        } else {
            try {
                b = mo3614b();
            } catch (RuntimeException e) {
                b = String.valueOf(e.getClass());
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(b).length() + 38);
                stringBuilder2.append("Exception thrown from implementation: ");
                stringBuilder2.append(b);
                b = stringBuilder2.toString();
            }
            if (!kbi.m4752a(b)) {
                stringBuilder.append("PENDING, info=[");
                stringBuilder.append(b);
                stringBuilder.append("]");
            } else if (isDone()) {
                m17770a(stringBuilder);
            } else {
                stringBuilder.append("PENDING");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private final String m17775c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: c */
    protected final boolean m17783c() {
        Object obj = this.value;
        return (obj instanceof knm) && ((knm) obj).f8375c;
    }
}
