package p000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jlm */
public final class jlm implements jll {
    /* renamed from: a */
    private final Queue f18928a = new LinkedList();
    /* renamed from: b */
    private final Executor f18929b;
    /* renamed from: c */
    private volatile boolean f18930c = false;

    public jlm(Executor executor) {
        jri.m13152b((Object) executor);
        this.f18929b = executor;
    }

    public final synchronized void execute(Runnable runnable) {
        this.f18928a.add(runnable);
        if (!this.f18930c) {
            m12956b(runnable);
        }
    }

    /* renamed from: a */
    public final synchronized void mo2036a() {
        this.f18930c = false;
        for (Runnable b : this.f18928a) {
            m12956b(b);
        }
    }

    /* renamed from: b */
    public final synchronized void mo2037b() {
        this.f18930c = true;
    }

    /* renamed from: a */
    final synchronized boolean m12958a(Runnable runnable) {
        boolean z;
        if (this.f18930c) {
            z = false;
        } else if (this.f18928a.remove(runnable)) {
            z = true;
        } else {
            throw new RuntimeException("Task not in queue of submitted tasks.");
        }
        return z;
    }

    /* renamed from: b */
    private final void m12956b(Runnable runnable) {
        this.f18929b.execute(new jln(this, runnable));
    }
}
