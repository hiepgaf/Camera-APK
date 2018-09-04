package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: knp */
final class knp {
    /* renamed from: a */
    public static final knp f8379a = new knp(null, null);
    /* renamed from: b */
    public final Runnable f8380b;
    /* renamed from: c */
    public final Executor f8381c;
    public knp next;

    knp(Runnable runnable, Executor executor) {
        this.f8380b = runnable;
        this.f8381c = executor;
    }
}
