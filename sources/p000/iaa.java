package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iaa */
public final class iaa implements ThreadFactory {
    /* renamed from: a */
    private final String f6865a;
    /* renamed from: b */
    private final AtomicInteger f6866b;
    /* renamed from: c */
    private final ThreadFactory f6867c;

    public iaa(String str) {
        this(str, (byte) 0);
    }

    private iaa(String str, byte b) {
        this.f6866b = new AtomicInteger();
        this.f6867c = Executors.defaultThreadFactory();
        this.f6865a = (String) htl.m3432b((Object) str, (Object) "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6867c.newThread(new iab(runnable, 0));
        String str = this.f6865a;
        int andIncrement = this.f6866b.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append("[");
        stringBuilder.append(andIncrement);
        stringBuilder.append("]");
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
