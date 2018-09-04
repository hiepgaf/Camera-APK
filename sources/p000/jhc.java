package p000;

import android.media.MediaMuxer;

/* renamed from: jhc */
final /* synthetic */ class jhc implements Runnable {
    /* renamed from: a */
    private final jgz f7829a;
    /* renamed from: b */
    private final kpk f7830b;

    jhc(jgz jgz, kpk kpk) {
        this.f7829a = jgz;
        this.f7830b = kpk;
    }

    public final void run() {
        jgz jgz = this.f7829a;
        if (!this.f7830b.isCancelled()) {
            MediaMuxer mediaMuxer = (MediaMuxer) kow.m13625c(jgz.f18786f);
            for (Runnable run : jgz.f18789i) {
                run.run();
            }
            jgz.f18789i.clear();
            mediaMuxer.start();
            jgz.f18787g.mo3557a(Boolean.valueOf(true));
        }
    }
}
