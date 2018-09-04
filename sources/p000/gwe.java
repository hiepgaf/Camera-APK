package p000;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: gwe */
public final class gwe implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new ijj(8, runnable, "IndicatorUpdater");
    }
}
