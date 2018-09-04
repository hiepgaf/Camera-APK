package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jav */
public final class jav implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jbj f7628a;
    /* renamed from: b */
    private final /* synthetic */ Callable f7629b;

    public jav(jbj jbj, Callable callable, jcc jcc) {
        this.f7628a = jbj;
        this.f7629b = callable;
    }

    public final void run() {
        try {
            this.f7628a.m12763a(jri.m13152b(this.f7629b.call()));
        } catch (Throwable e) {
            this.f7628a.m12762a(jar.m4390a(e));
        }
    }

    public final String toString() {
        return this.f7629b.toString();
    }
}
