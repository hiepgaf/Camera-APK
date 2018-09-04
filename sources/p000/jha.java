package p000;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* renamed from: jha */
final /* synthetic */ class jha implements Runnable {
    /* renamed from: a */
    private final jgz f7825a;
    /* renamed from: b */
    private final jhe f7826b;
    /* renamed from: c */
    private final kpw f7827c;

    jha(jgz jgz, jhe jhe, kpw kpw) {
        this.f7825a = jgz;
        this.f7826b = jhe;
        this.f7827c = kpw;
    }

    public final void run() {
        this.f7827c.mo3557a(Integer.valueOf(((MediaMuxer) kow.m13625c(this.f7825a.f18786f)).addTrack((MediaFormat) kow.m13625c(this.f7826b.f7832a))));
    }
}
