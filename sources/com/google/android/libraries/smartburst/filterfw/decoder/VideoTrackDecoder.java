package com.google.android.libraries.smartburst.filterfw.decoder;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;

@TargetApi(16)
/* compiled from: PG */
public abstract class VideoTrackDecoder extends TrackDecoder {
    public static final String LOG_TAG = "VideoTrackDecoder";
    public volatile boolean mFrameAvailable;
    public final Object mFrameMonitor = new Object();

    protected VideoTrackDecoder(int i, MediaFormat mediaFormat, Listener listener) {
        super(i, mediaFormat, listener);
        if (!DecoderUtil.isSupportedVideoFormat(mediaFormat)) {
            throw new IllegalArgumentException("VideoTrackDecoder can only be used with supported video formats");
        }
    }

    protected abstract void copyFrameDataTo(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler, int i);

    public void advance() {
        synchronized (this.mFrameMonitor) {
            this.mFrameAvailable = false;
            this.mFrameMonitor.notifyAll();
        }
    }

    public /* bridge */ /* synthetic */ boolean drainOutputBuffer() {
        return super.drainOutputBuffer();
    }

    public /* bridge */ /* synthetic */ boolean feedInput(MediaExtractor mediaExtractor) {
        return super.feedInput(mediaExtractor);
    }

    public void grabFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler, int i) {
        synchronized (this.mFrameMonitor) {
            if (this.mFrameAvailable) {
                copyFrameDataTo(frameImage2D, frameValue, scaler, i);
                return;
            }
            Log.w(LOG_TAG, "frame is not ready - the caller has to wait for a corresponding onDecodedFrameAvailable() call");
        }
    }

    public /* bridge */ /* synthetic */ void init() {
        super.init();
    }

    protected final void markFrameAvailable() {
        synchronized (this.mFrameMonitor) {
            this.mFrameAvailable = true;
            this.mFrameMonitor.notifyAll();
        }
    }

    protected static boolean needSwapDimension(int i) {
        switch (i) {
            case 0:
            case MediaDecoder.ROTATE_180 /*180*/:
                return false;
            case 90:
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                return true;
            default:
                throw new IllegalArgumentException("Unsupported rotation angle.");
        }
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public /* bridge */ /* synthetic */ void signalEndOfInput() {
        super.signalEndOfInput();
    }

    public boolean waitForFrameGrabs() {
        synchronized (this.mFrameMonitor) {
            while (this.mFrameAvailable) {
                try {
                    this.mFrameMonitor.wait();
                } catch (InterruptedException e) {
                    return false;
                }
            }
        }
        return true;
    }
}
