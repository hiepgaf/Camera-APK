package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jai */
final class jai implements Runnable {
    /* renamed from: a */
    public final jbj f7604a = jbj.m12751d();
    /* renamed from: b */
    public final jah f7605b;
    /* renamed from: c */
    public final jah f7606c;
    /* renamed from: d */
    public final Executor f7607d;
    /* renamed from: e */
    public final jcc f7608e;
    /* renamed from: f */
    private final kpk f7609f;

    public jai(kpk kpk, jah jah, jah jah2, Executor executor, jcc jcc) {
        this.f7609f = kpk;
        this.f7605b = jah;
        this.f7606c = jah2;
        this.f7607d = executor;
        this.f7608e = jcc;
    }

    /* renamed from: a */
    protected final void m4378a(Throwable th) {
        this.f7604a.m12762a(jar.m4390a(th));
    }

    /* renamed from: b */
    private final void m4377b(Throwable th) {
        jar a = jar.m4390a(th);
        if (this.f7606c != null) {
            try {
                this.f7607d.execute(new jak(this, a));
                return;
            } catch (Throwable th2) {
                m4378a(th2);
                return;
            }
        }
        this.f7604a.m12762a(a);
    }

    public final void run() {
        try {
            Object a = khx.m4936a(this.f7609f);
            if (a == null) {
                m4378a(new IllegalStateException("Result value is null"));
                return;
            }
            try {
                this.f7607d.execute(new jaj(this, a));
            } catch (Throwable th) {
                m4378a(th);
            }
        } catch (ExecutionException e) {
            m4377b(e.getCause());
        } catch (Throwable th2) {
            m4377b(th2);
        }
    }

    public final String toString() {
        return this.f7605b.toString();
    }
}
