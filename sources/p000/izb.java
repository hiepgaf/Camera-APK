package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: izb */
public final class izb implements AutoCloseable {
    /* renamed from: a */
    public final kpw f7580a;
    /* renamed from: b */
    private final Object f7581b = new Object();
    /* renamed from: c */
    private final Callable f7582c;
    /* renamed from: d */
    private Object f7583d;

    private izb(Callable callable) {
        this.f7582c = callable;
        this.f7580a = kpw.m18056d();
        this.f7583d = null;
    }

    public final void close() {
        synchronized (this.f7581b) {
            if (this.f7580a.isDone()) {
                return;
            }
            this.f7580a.mo3557a(this.f7583d);
        }
    }

    /* renamed from: a */
    public static izb m4360a(Callable callable) {
        return new izb(callable);
    }

    /* renamed from: a */
    public final Object m4361a() {
        Object obj;
        synchronized (this.f7581b) {
            obj = this.f7583d;
            if (obj != null) {
            } else {
                this.f7583d = this.f7582c.call();
                obj = this.f7583d;
            }
        }
        return obj;
    }
}
