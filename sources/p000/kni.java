package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: kni */
public abstract class kni extends knt implements Runnable {
    /* renamed from: e */
    private kpk f23602e;
    /* renamed from: f */
    private Class f23603f;
    /* renamed from: g */
    private Object f23604g;

    kni(kpk kpk, Class cls, Object obj) {
        this.f23602e = (kpk) jri.m13152b((Object) kpk);
        this.f23603f = (Class) jri.m13152b((Object) cls);
        this.f23604g = jri.m13152b(obj);
    }

    /* renamed from: a */
    abstract Object mo3617a(Object obj, Throwable th);

    /* renamed from: b */
    abstract void mo3615b(Object obj);

    /* renamed from: a */
    protected final void mo3613a() {
        m17778a(this.f23602e);
        this.f23602e = null;
        this.f23603f = null;
        this.f23604g = null;
    }

    /* renamed from: a */
    public static kpk m18040a(kpk kpk, Class cls, kaw kaw, Executor executor) {
        knk knj = new knj(kpk, cls, kaw);
        kpk.mo1985a(knj, khx.m4939a(executor, knj));
        return knj;
    }

    /* renamed from: b */
    protected final String mo3614b() {
        kpk kpk = this.f23602e;
        Class cls = this.f23603f;
        Object obj = this.f23604g;
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
        if (cls != null && obj != null) {
            valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(obj);
            StringBuilder stringBuilder2 = new StringBuilder(((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
            stringBuilder2.append(str);
            stringBuilder2.append("exceptionType=[");
            stringBuilder2.append(valueOf);
            stringBuilder2.append("], fallback=[");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append("]");
            return stringBuilder2.toString();
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
        int i2;
        int i3 = 1;
        Future future = this.f23602e;
        Class cls = this.f23603f;
        Object obj = this.f23604g;
        if (future == null) {
            i = 1;
        } else {
            i = 0;
        }
        if (cls == null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        i2 |= i;
        if (obj != null) {
            i3 = 0;
        }
        if (((i3 | i2) | isCancelled()) == 0) {
            Object b;
            Throwable th;
            this.f23602e = null;
            try {
                b = kow.m13623b(future);
                th = null;
            } catch (ExecutionException e) {
                th = (Throwable) jri.m13152b(e.getCause());
                b = null;
            } catch (Throwable th2) {
                th = th2;
                b = null;
            }
            if (th == null) {
                mo3557a(b);
            } else if (cls.isInstance(th)) {
                Object a;
                try {
                    a = mo3617a(obj, th);
                    mo3615b(a);
                } catch (Throwable th3) {
                    a = th3;
                    m17780a((Throwable) a);
                } finally {
                    this.f23603f = null;
                    this.f23604g = null;
                }
            } else {
                m17780a(th);
            }
        }
    }
}
