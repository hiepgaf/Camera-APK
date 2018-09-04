package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jdx */
public class jdx {
    static {
        jdx.class.getSimpleName();
    }

    private jdx() {
    }

    /* renamed from: a */
    public static jdo m4421a(jdo jdo) {
        return new jei(jdo);
    }

    /* renamed from: a */
    private static jdo m4422a(jdp jdp, Callable callable) {
        jaq a = jli.m12939a((Executor) jdp, callable);
        try {
            jli.m12953d(a);
            jdp.f23387a.m12763a(new jdk(jdp, a));
            return jdp;
        } catch (jar e) {
            throw new RuntimeException("Failed to create GLContext!", e.getCause());
        }
    }

    /* renamed from: a */
    public static jdo m4420a(Executor executor, jdg jdg, jfj jfj) {
        return jdx.m4422a(new jdp(executor), new jdy(jfj, jdg));
    }
}
