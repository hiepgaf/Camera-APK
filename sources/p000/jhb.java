package p000;

import android.media.MediaMuxer;
import android.util.Log;
import java.io.FileDescriptor;

/* renamed from: jhb */
final /* synthetic */ class jhb implements Runnable {
    /* renamed from: a */
    private final jgz f7828a;

    jhb(jgz jgz) {
        this.f7828a = jgz;
    }

    public final void run() {
        jgz jgz = this.f7828a;
        kbg b = kbg.m4744b((Integer) kow.m13625c(jgz.f18783c));
        kbg b2 = kbg.m4744b((Float) kow.m13625c(jgz.f18784d));
        kbg b3 = kbg.m4744b((Float) kow.m13625c(jgz.f18785e));
        jgw jgw = (jgw) kow.m13625c(jgz.f18782b);
        try {
            Object mediaMuxer;
            if (jgw.f7816a.mo2084b()) {
                mediaMuxer = new MediaMuxer((String) jgw.f7816a.mo2081a(), 0);
            } else {
                mediaMuxer = new MediaMuxer((FileDescriptor) jgw.f7817b.mo2081a(), 0);
            }
            if (b.mo2084b()) {
                mediaMuxer.setOrientationHint(((Integer) b.mo2081a()).intValue());
            }
            if (b2.mo2084b() && b3.mo2084b()) {
                mediaMuxer.setLocation(((Float) b2.mo2081a()).floatValue(), ((Float) b3.mo2081a()).floatValue());
            }
            jgz.f18786f.mo3557a(mediaMuxer);
        } catch (Throwable e) {
            Log.e("MuxerImpl", "Error trying to construct MediaMuxer.", e);
            jgz.f18786f.m17780a(e);
            throw new RuntimeException(e);
        }
    }
}
