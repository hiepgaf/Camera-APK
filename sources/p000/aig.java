package p000;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;

/* compiled from: PG */
/* renamed from: aig */
final class aig extends Thread {
    /* renamed from: a */
    private final /* synthetic */ aif f494a;

    aig(aif aif, Runnable runnable, String str) {
        this.f494a = aif;
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(9);
        if (this.f494a.f491b) {
            StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            this.f494a.f490a.mo87a(th);
        }
    }
}
