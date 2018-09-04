package p000;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* renamed from: bbl */
public final class bbl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bbi f1062a;
    /* renamed from: b */
    private final /* synthetic */ CountDownLatch f1063b;

    public bbl(bbi bbi, CountDownLatch countDownLatch) {
        this.f1062a = bbi;
        this.f1063b = countDownLatch;
    }

    public final void run() {
        if (this.f1062a.mo2656b()) {
            this.f1063b.countDown();
        }
    }
}
