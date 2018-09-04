package p000;

import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jio */
final class jio implements VideoFrameConsumer {
    /* renamed from: a */
    private long f18838a = -1;
    /* renamed from: b */
    private final /* synthetic */ jin f18839b;

    jio(jin jin) {
        this.f18839b = jin;
    }

    public final void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j) {
        if (this.f18838a == -1) {
            this.f18838a = j;
        }
        this.f18839b.f18835c.setFeatureValue(j, new Feature(jza.TIMESTAMP, ((float) (j - this.f18838a)) / 1000000.0f));
        videoFrameProvider.skipVideoFrame();
    }

    public final void onVideoStreamError(Exception exception) {
        jzt jzt = this.f18839b.f18833a;
        if (jzt != null) {
            jzt.mo2045a(exception);
        }
    }

    public final void onVideoStreamStarted() {
        this.f18838a = -1;
    }

    public final void onVideoStreamStopped() {
        synchronized (this.f18839b) {
            jin jin = this.f18839b;
            if (jin.f18834b) {
                jzt jzt = jin.f18833a;
                if (jzt != null) {
                    jzt.mo2046b();
                }
                this.f18839b.f18834b = false;
            }
        }
    }
}
