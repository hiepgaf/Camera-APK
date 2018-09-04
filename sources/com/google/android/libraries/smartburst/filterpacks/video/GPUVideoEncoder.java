package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.google.android.libraries.smartburst.filterpacks.video.GLSurface.Builder;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class GPUVideoEncoder implements Encoder {
    public final BufferInfo mBufferInfo = new BufferInfo();
    public int mCurrentTrack;
    public MediaCodec mEncoder;
    public boolean mEndOfStreamSent = false;
    public final Builder mGLSurfaceBuilder;
    public MediaMuxer mMuxer;

    private GPUVideoEncoder(Builder builder) {
        this.mGLSurfaceBuilder = builder;
    }

    public void close() {
        while ((this.mBufferInfo.flags & 4) == 0) {
            sendEndOfStreamIfNecessary();
            drainQueue();
        }
        this.mEncoder.flush();
        this.mEncoder.release();
        this.mEncoder = null;
        this.mGLSurfaceBuilder.reset();
        this.mMuxer = null;
    }

    private void drainQueue() {
        int dequeueOutputBuffer;
        ByteBuffer[] outputBuffers = this.mEncoder.getOutputBuffers();
        while (true) {
            dequeueOutputBuffer = this.mEncoder.dequeueOutputBuffer(this.mBufferInfo, 0);
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        break;
                    }
                    this.mCurrentTrack = this.mMuxer.addTrack(this.mEncoder.getOutputFormat());
                    this.mMuxer.start();
                } else {
                    outputBuffers = this.mEncoder.getOutputBuffers();
                }
            }
        }
        ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
        BufferInfo bufferInfo = this.mBufferInfo;
        if ((bufferInfo.flags & 2) != 0) {
            bufferInfo.size = 0;
        }
        if (bufferInfo.size != 0) {
            this.mMuxer.writeSampleData(this.mCurrentTrack, byteBuffer, bufferInfo);
        }
        this.mEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
    }

    private void encodeFrame(BufferInfo bufferInfo) {
        GLSurface orBuild = this.mGLSurfaceBuilder.getOrBuild();
        orBuild.setPresentationTimeNs(bufferInfo.presentationTimeUs * 1000);
        orBuild.swapBuffers();
        drainQueue();
    }

    public GLSurface get() {
        return this.mGLSurfaceBuilder.getOrBuild();
    }

    public static Encoder newInstance(Builder builder) {
        return new GPUVideoEncoder(builder);
    }

    public void onEndOfStream() {
        sendEndOfStreamIfNecessary();
    }

    public void onNewFrameAvailable(BufferInfo bufferInfo) {
        encodeFrame(bufferInfo);
    }

    public void open(MediaMuxer mediaMuxer, MediaFormat mediaFormat) {
        this.mEndOfStreamSent = false;
        this.mMuxer = mediaMuxer;
        this.mEncoder = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.mEncoder.configure(mediaFormat, null, null, 1);
        this.mGLSurfaceBuilder.setSurface(this.mEncoder.createInputSurface());
        this.mEncoder.start();
    }

    private void sendEndOfStreamIfNecessary() {
        if (!this.mEndOfStreamSent) {
            this.mEncoder.signalEndOfInputStream();
            this.mEndOfStreamSent = true;
        }
    }
}
