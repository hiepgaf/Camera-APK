package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bcp */
public final class bcp implements bbi {
    /* renamed from: a */
    private final Object f19873a = new Object();
    /* renamed from: b */
    private final List f19874b = new ArrayList();
    /* renamed from: c */
    private boolean f19875c = false;
    /* renamed from: d */
    private iqo f19876d = null;
    /* renamed from: e */
    private Throwable f19877e;
    /* renamed from: f */
    private boolean f19878f = false;

    private bcp() {
    }

    /* renamed from: a */
    public final void mo2655a(Runnable runnable, Executor executor) {
        Object obj;
        jri.m13152b((Object) runnable);
        jri.m13152b((Object) executor);
        Runnable ijo = new ijo(runnable, executor);
        synchronized (this.f19873a) {
            if (this.f19875c) {
                obj = 1;
            } else {
                this.f19874b.add(ijo);
                obj = null;
            }
        }
        if (obj != null) {
            ijo.run();
        }
    }

    public final void close() {
        synchronized (this.f19873a) {
            boolean z = this.f19875c;
            this.f19875c = true;
            iqo iqo = this.f19876d;
            this.f19876d = null;
        }
        if (iqo != null) {
            iqo.close();
        }
        if (!z) {
            m14750e();
        }
    }

    /* renamed from: d */
    public static bcp m14749d() {
        return new bcp();
    }

    /* renamed from: a */
    public final Throwable mo2654a() {
        Throwable th;
        synchronized (this.f19873a) {
            th = this.f19877e;
        }
        return th;
    }

    /* renamed from: b */
    public final boolean mo2656b() {
        boolean z;
        synchronized (this.f19873a) {
            z = this.f19875c;
        }
        return z;
    }

    /* renamed from: e */
    private final void m14750e() {
        ArrayList arrayList;
        synchronized (this.f19873a) {
            arrayList = new ArrayList(this.f19874b);
            this.f19874b.clear();
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((Runnable) arrayList.get(i)).run();
            i = i2;
        }
    }

    /* renamed from: c */
    public final iqo mo2657c() {
        iqo iqo;
        synchronized (this.f19873a) {
            if (this.f19878f) {
                throw new IllegalStateException("remove() called multiple times. A CloseableFuture should only have a single owner.");
            }
            this.f19878f = true;
            iqo = this.f19876d;
            this.f19876d = null;
        }
        return iqo;
    }

    /* renamed from: a */
    public final boolean m14753a(iqo iqo) {
        boolean z;
        boolean z2 = true;
        jri.m13152b((Object) iqo);
        synchronized (this.f19873a) {
            z = this.f19875c;
            if (!z) {
                boolean z3;
                if (this.f19876d == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jri.m13153b(z3);
                if (this.f19877e != null) {
                    z2 = false;
                }
                jri.m13153b(z2);
                this.f19876d = iqo;
                this.f19875c = true;
            }
        }
        if (z) {
            iqo.close();
        } else {
            m14750e();
        }
        return z ^ 1;
    }

    /* renamed from: a */
    public final boolean m14754a(Throwable th) {
        boolean z;
        boolean z2 = true;
        jri.m13152b((Object) th);
        synchronized (this.f19873a) {
            z = this.f19875c;
            if (!z) {
                boolean z3;
                if (this.f19876d == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jri.m13153b(z3);
                if (this.f19877e != null) {
                    z2 = false;
                }
                jri.m13153b(z2);
                this.f19877e = th;
                this.f19875c = true;
            }
        }
        if (!z) {
            m14750e();
        }
        return z ^ 1;
    }
}
