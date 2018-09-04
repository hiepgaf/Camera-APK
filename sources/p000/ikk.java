package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ikk */
public final class ikk implements ThreadFactory {
    /* renamed from: a */
    private AtomicInteger f7054a = new AtomicInteger(0);
    /* renamed from: b */
    private final /* synthetic */ int f7055b;
    /* renamed from: c */
    private final /* synthetic */ String f7056c;

    public ikk(int i, String str) {
        this.f7055b = i;
        this.f7056c = str;
    }

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f7054a.incrementAndGet();
        int i = this.f7055b;
        String str = this.f7056c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(str);
        stringBuilder.append("-");
        stringBuilder.append(incrementAndGet);
        return new ijj(i, runnable, stringBuilder.toString());
    }
}
