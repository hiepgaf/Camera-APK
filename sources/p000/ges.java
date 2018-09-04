package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.processing.ProcessingService;

/* compiled from: PG */
/* renamed from: ges */
public final class ges extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ ProcessingService f5116a;

    public ges(ProcessingService processingService) {
        this.f5116a = processingService;
    }

    public final void onReceive(Context context, Intent intent) {
        ProcessingService processingService;
        geu geu;
        if ("com.google.android.apps.camera.legacy.app.processing.PAUSE".equals(intent.getAction())) {
            processingService = this.f5116a;
            bli.m863a(ProcessingService.f12271a, "Pausing");
            synchronized (processingService.f12276f) {
                processingService.f12277g = false;
            }
            synchronized (processingService.f12273c) {
                processingService.f12275e = true;
                geu = processingService.f12274d;
                if (geu != null) {
                    geu.suspend();
                }
            }
        } else if ("com.google.android.apps.camera.legacy.app.processing.RESUME".equals(intent.getAction())) {
            processingService = this.f5116a;
            bli.m863a(ProcessingService.f12271a, "Resuming");
            synchronized (processingService.f12276f) {
                processingService.f12277g = true;
            }
            synchronized (processingService.f12273c) {
                processingService.f12275e = false;
                geu = processingService.f12274d;
                if (geu != null) {
                    geu.resume();
                }
            }
        }
    }
}
