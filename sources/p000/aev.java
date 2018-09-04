package p000;

import android.os.Process;

/* compiled from: PG */
/* renamed from: aev */
final class aev implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aet f364a;

    aev(aet aet) {
        this.f364a = aet;
    }

    public final void run() {
        Process.setThreadPriority(10);
        aet aet = this.f364a;
        while (true) {
            boolean z = aet.f359e;
            try {
                aet.f355a.obtainMessage(1, (aex) aet.f358d.remove()).sendToTarget();
                aew aew = aet.f360f;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
