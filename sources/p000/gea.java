package p000;

import com.google.android.apps.camera.prewarm.NoOpPrewarmService;

/* compiled from: PG */
/* renamed from: gea */
public final class gea implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ NoOpPrewarmService f5109a;

    public gea(NoOpPrewarmService noOpPrewarmService) {
        this.f5109a = noOpPrewarmService;
    }

    public final void run() {
        NoOpPrewarmService noOpPrewarmService = this.f5109a;
        bli.m866b(NoOpPrewarmService.f2387a, "Prewarm timed out! This should not happen.");
        noOpPrewarmService.f2388b.mo1608i();
    }
}
