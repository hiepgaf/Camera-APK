package p000;

import android.os.Process;

/* renamed from: iab */
final class iab implements Runnable {
    /* renamed from: a */
    private final Runnable f6868a;
    /* renamed from: b */
    private final int f6869b = 0;

    public iab(Runnable runnable, int i) {
        this.f6868a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.f6869b);
        this.f6868a.run();
    }
}
