package p000;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kny */
public abstract class kny extends knt implements Runnable {
    /* renamed from: e */
    private kpk f23605e;
    /* renamed from: f */
    private Object f23606f;

    kny(kpk kpk, Object obj) {
        this.f23605e = (kpk) jri.m13152b((Object) kpk);
        this.f23606f = jri.m13152b(obj);
    }

    /* renamed from: a */
    abstract Object mo3618a(Object obj, Object obj2);

    /* renamed from: b */
    abstract void mo3615b(Object obj);

    /* renamed from: a */
    protected final void mo3613a() {
        m17778a(this.f23605e);
        this.f23605e = null;
        this.f23606f = null;
    }

    /* renamed from: a */
    public static kpk m18045a(kpk kpk, kaw kaw, Executor executor) {
        jri.m13152b((Object) kaw);
        knk koa = new koa(kpk, kaw);
        kpk.mo1985a(koa, khx.m4939a(executor, koa));
        return koa;
    }

    /* renamed from: a */
    public static kpk m18046a(kpk kpk, koj koj, Executor executor) {
        jri.m13152b((Object) executor);
        knk knz = new knz(kpk, koj);
        kpk.mo1985a(knz, khx.m4939a(executor, knz));
        return knz;
    }

    /* renamed from: b */
    protected final String mo3614b() {
        kpk kpk = this.f23605e;
        Object obj = this.f23606f;
        String b = super.mo3614b();
        String str = "";
        if (kpk != null) {
            str = String.valueOf(kpk);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 16);
            stringBuilder.append("inputFuture=[");
            stringBuilder.append(str);
            stringBuilder.append("], ");
            str = stringBuilder.toString();
        }
        String valueOf;
        if (obj != null) {
            valueOf = String.valueOf(obj);
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(valueOf).length());
            stringBuilder.append(str);
            stringBuilder.append("function=[");
            stringBuilder.append(valueOf);
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (b == null) {
            return null;
        } else {
            valueOf = String.valueOf(str);
            str = String.valueOf(b);
            return str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
        }
    }

    public final void run() {
        int i;
        int i2 = 1;
        Future future = this.f23605e;
        Object obj = this.f23606f;
        boolean isCancelled = isCancelled();
        if (future == null) {
            i = 1;
        } else {
            i = 0;
        }
        i |= isCancelled;
        if (obj != null) {
            i2 = 0;
        }
        if ((i2 | i) == 0) {
            this.f23605e = null;
            try {
                Object a;
                try {
                    a = mo3618a(obj, kow.m13623b(future));
                    mo3615b(a);
                } catch (UndeclaredThrowableException e) {
                    a = e.getCause();
                    m17780a((Throwable) a);
                } catch (Throwable th) {
                    a = th;
                    m17780a((Throwable) a);
                } finally {
                    this.f23606f = null;
                }
            } catch (CancellationException e2) {
                cancel(false);
            } catch (ExecutionException e3) {
                m17780a(e3.getCause());
            } catch (Throwable e4) {
                m17780a(e4);
            } catch (Throwable e42) {
                m17780a(e42);
            }
        }
    }
}
