package p000;

import android.media.MediaMuxer;
import android.util.Log;

/* renamed from: ipg */
public final /* synthetic */ class ipg implements Runnable {
    /* renamed from: a */
    private final MediaMuxer f7278a;

    public ipg(MediaMuxer mediaMuxer) {
        this.f7278a = mediaMuxer;
    }

    public final void run() {
        MediaMuxer mediaMuxer = this.f7278a;
        try {
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable e) {
            Log.e("MediaMuxerMul", "Fail to stop previous media muxer", e);
        }
    }
}
