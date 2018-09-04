package p000;

import java.util.Set;

/* renamed from: exo */
public final /* synthetic */ class exo implements Runnable {
    /* renamed from: a */
    private final ird f4330a;
    /* renamed from: b */
    private final kwk f4331b;

    public exo(ird ird, kwk kwk) {
        this.f4330a = ird;
        this.f4331b = kwk;
    }

    public final void run() {
        ird ird = this.f4330a;
        kwk kwk = this.f4331b;
        ird.mo1903a("MICRO_ImageReaderModule_runningStartupTasks");
        for (Runnable runnable : (Set) kwk.mo345a()) {
            ird.mo1903a("MICRO_ImageReaderModule_runSingleTask");
            runnable.run();
            ird.mo1904b();
        }
        ird.mo1904b();
    }
}
