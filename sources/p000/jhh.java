package p000;

import android.media.MediaMuxer;
import android.util.Log;
import java.util.concurrent.CancellationException;

/* renamed from: jhh */
final /* synthetic */ class jhh implements Runnable {
    /* renamed from: a */
    private final jhg f7834a;

    jhh(jhg jhg) {
        this.f7834a = jhg;
    }

    public final void run() {
        jhg jhg = this.f7834a;
        if (jhg.f18798b.isCancelled()) {
            Log.w("MuxerTrackStreamImpl", "Muxer cancelled. Closing track.");
            jhg.m12839a();
            return;
        }
        try {
            if (((Boolean) kow.m13625c(jhg.f18798b)).booleanValue()) {
                MediaMuxer mediaMuxer = (MediaMuxer) kow.m13625c(jhg.f18797a);
                int intValue = ((Integer) kow.m13625c(jhg.f18802f)).intValue();
                synchronized (jhg.f18804h) {
                    jgy jgy = (jgy) jhg.f18803g.pollFirst();
                    if (jgy == null) {
                        return;
                    } else if (jgy.m4478a()) {
                        jhg.m12839a();
                    } else if (!jhg.f18800d.isDone()) {
                        long j = jgy.f7819b.presentationTimeUs;
                        long j2 = jhg.f18805i;
                        if (jhg.m12838a(jhg.f18799c.f7833b, "oo.muxer.force_sequential")) {
                            if (j < j2) {
                                jgy.f7819b.presentationTimeUs = jhg.f18805i;
                            }
                            jhg.f18805i = jgy.f7819b.presentationTimeUs + 100;
                        }
                        try {
                            mediaMuxer.writeSampleData(intValue, jgy.f7818a, jgy.f7819b);
                        } catch (Throwable th) {
                            jhg.f18800d.m17780a(th);
                        }
                    }
                }
            } else {
                return;
            }
        } catch (CancellationException e) {
            Log.w("MuxerTrackStreamImpl", "Muxer cancelled. Closing track.");
            jhg.m12839a();
            return;
        }
    }
}
