package p000;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: ikl */
public final class ikl implements ThreadFactory {
    /* renamed from: a */
    private final /* synthetic */ int f7057a;
    /* renamed from: b */
    private final /* synthetic */ String f7058b;

    public ikl(int i, String str) {
        this.f7057a = i;
        this.f7058b = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new ijj(this.f7057a, runnable, this.f7058b);
    }
}
