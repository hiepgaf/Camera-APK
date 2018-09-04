package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: iyf */
final /* synthetic */ class iyf implements izr {
    /* renamed from: a */
    private final ExecutorService f18693a;

    iyf(ExecutorService executorService) {
        this.f18693a = executorService;
    }

    public final void close() {
        this.f18693a.shutdown();
    }
}
