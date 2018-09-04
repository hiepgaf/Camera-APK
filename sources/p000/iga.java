package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: iga */
public final class iga extends ifv {
    /* renamed from: a */
    public final Object f18295a = new Object();
    /* renamed from: b */
    public final ifz f18296b = new ifz();
    /* renamed from: c */
    public boolean f18297c;
    /* renamed from: d */
    public Exception f18298d;

    iga() {
    }

    /* renamed from: a */
    public final ifv mo1855a(Executor executor, ifu ifu) {
        ifz ifz = this.f18296b;
        ify ify = new ify(executor, ifu);
        synchronized (ifz.f6996a) {
            if (ifz.f6997b == null) {
                ifz.f6997b = new ArrayDeque();
            }
            ifz.f6997b.add(ify);
        }
        synchronized (this.f18295a) {
            if (this.f18297c) {
                this.f18296b.m3737a(this);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final Exception mo1856a() {
        Exception exception;
        synchronized (this.f18295a) {
            exception = this.f18298d;
        }
        return exception;
    }

    /* renamed from: a */
    public final boolean m12210a(Exception exception) {
        htl.m3432b((Object) exception, (Object) "Exception must not be null");
        synchronized (this.f18295a) {
            if (this.f18297c) {
                return false;
            }
            this.f18297c = true;
            this.f18298d = exception;
            this.f18296b.m3737a(this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo1857b() {
        boolean z = false;
        synchronized (this.f18295a) {
            if (this.f18297c && this.f18298d == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void m12212c() {
        htl.m3422a(this.f18297c ^ 1, (Object) "Task is already complete");
    }
}
