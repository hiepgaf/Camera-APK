package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: iyj */
final /* synthetic */ class iyj implements ThreadFactory {
    /* renamed from: a */
    public static final ThreadFactory f7555a = new iyj();

    private iyj() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "VFEPipeline");
    }
}
