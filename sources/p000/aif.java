package p000;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: aif */
public final class aif implements ThreadFactory {
    /* renamed from: a */
    public final aih f490a;
    /* renamed from: b */
    public final boolean f491b;
    /* renamed from: c */
    private final String f492c;
    /* renamed from: d */
    private int f493d;

    public aif(String str, aih aih, boolean z) {
        this.f492c = str;
        this.f490a = aih;
        this.f491b = z;
    }

    public final synchronized Thread newThread(Runnable runnable) {
        Thread aig;
        String str = this.f492c;
        int i = this.f493d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 25);
        stringBuilder.append("glide-");
        stringBuilder.append(str);
        stringBuilder.append("-thread-");
        stringBuilder.append(i);
        aig = new aig(this, runnable, stringBuilder.toString());
        this.f493d++;
        return aig;
    }
}
