package p000;

import com.google.android.apps.camera.processing.ProcessingService;

/* compiled from: PG */
/* renamed from: geq */
public final class geq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ProcessingService f5115a;

    public geq(ProcessingService processingService) {
        this.f5115a = processingService;
    }

    public final void run() {
        synchronized (this.f5115a.f12276f) {
            ProcessingService processingService = this.f5115a;
            processingService.f12277g = true;
            if (processingService.f12278h) {
                bli.m863a(ProcessingService.f12271a, "Posting notification after timeout");
                this.f5115a.m8406a();
            }
        }
    }
}
