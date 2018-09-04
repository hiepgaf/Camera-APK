package p000;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: cks */
final class cks implements ThreadFactory {
    cks() {
    }

    public final Thread newThread(Runnable runnable) {
        return new ijj(9, runnable, "PstPrcs");
    }
}
