package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jia */
public final class jia implements VideoFrameConsumer, VideoFrameProvider {
    /* renamed from: a */
    public final Set f18818a = khb.m4905f();
    /* renamed from: b */
    public final Map f18819b = khb.m4899d();
    /* renamed from: c */
    public final Map f18820c = khb.m4899d();
    /* renamed from: d */
    public final Map f18821d = khb.m4899d();
    /* renamed from: e */
    public volatile long f18822e = -1;
    /* renamed from: f */
    private final VideoFrameProvider f18823f;
    /* renamed from: g */
    private boolean f18824g = false;

    public jia(VideoFrameProvider videoFrameProvider) {
        this.f18823f = videoFrameProvider;
    }

    public final void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        synchronized (this) {
            if (!this.f18824g) {
                this.f18823f.addVideoFrameConsumer(this);
                this.f18824g = true;
            }
        }
        this.f18823f.addVideoFrameConsumer(videoFrameConsumer);
    }

    public final void close() {
        this.f18823f.close();
    }

    public final boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler) {
        boolean grabVideoFrame = this.f18823f.grabVideoFrame(frameImage2D, frameValue, scaler);
        synchronized (this) {
            List list = (List) this.f18819b.get(Thread.currentThread());
            if (list == null) {
                list = khb.m4885b();
                this.f18819b.put(Thread.currentThread(), list);
            }
            list.add(Long.valueOf(frameImage2D.getTimestamp()));
            this.f18821d.put(Thread.currentThread(), Integer.valueOf(Math.max(frameImage2D.getWidth(), frameImage2D.getHeight())));
        }
        return grabVideoFrame;
    }

    public final void onVideoFrameAvailable(VideoFrameProvider videoFrameProvider, long j) {
        synchronized (this) {
            this.f18818a.add(Long.valueOf(j));
        }
        videoFrameProvider.skipVideoFrame();
    }

    public final void onVideoStreamError(Exception exception) {
        Log.e("LoggingVideoStreamProvider", "Video stream error!", exception);
    }

    public final void onVideoStreamStarted() {
        this.f18822e = System.nanoTime();
    }

    public final void onVideoStreamStopped() {
    }

    public final void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.f18823f.removeVideoFrameConsumer(videoFrameConsumer);
    }

    public final void skipVideoFrame() {
        synchronized (this) {
            int intValue;
            Integer num = (Integer) this.f18820c.get(Thread.currentThread());
            Map map = this.f18820c;
            Thread currentThread = Thread.currentThread();
            if (num != null) {
                intValue = num.intValue() + 1;
            } else {
                intValue = 1;
            }
            map.put(currentThread, Integer.valueOf(intValue));
        }
        this.f18823f.skipVideoFrame();
    }

    public final String toString() {
        return this.f18823f.toString();
    }
}
