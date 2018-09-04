package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: ewp */
public final class ewp implements kwk {
    /* renamed from: a */
    public static final ewp f15667a = new ewp();

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        AtomicLong atomicLong;
        String str = new kpx().m5042a("mv-gyro-exec-%d").f8412a;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        if (str != null) {
            atomicLong = new AtomicLong(0);
        } else {
            atomicLong = null;
        }
        return (Executor) ktm.m13963a(Executors.newSingleThreadExecutor(new kpy(defaultThreadFactory, str, atomicLong)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
