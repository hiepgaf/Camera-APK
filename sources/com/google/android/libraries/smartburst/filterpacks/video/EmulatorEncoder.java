package com.google.android.libraries.smartburst.filterpacks.video;

import android.graphics.Bitmap;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.jri;

/* compiled from: PG */
public class EmulatorEncoder implements VideoEncoder {
    public static final int BIT_RATE = 3000000;
    public static final int FRAME_RATE = 30;
    public static final int IFRAME_INTERVAL_SEC = 1;
    public long mEncodedFrameTimestampNs;
    public Encoder mEncoder;
    public MediaMuxer mMediaMuxer;
    public String mOutputFile;

    public void close() {
        this.mEncoder.close();
        this.mMediaMuxer.stop();
        this.mMediaMuxer.release();
    }

    private MediaFormat createMediaFormat(int i, int i2) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat.setInteger("color-format", 21);
        createVideoFormat.setInteger("bitrate", 3000000);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    private MediaMuxer createMediaMuxer(String str) {
        try {
            return new MediaMuxer(str, 0);
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
            stringBuilder.append("Cannot create MediaMuxer for file [");
            stringBuilder.append(str);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void encodeFrame(FrameImage2D frameImage2D, long j) {
        BufferInfo bufferInfo = new BufferInfo();
        ByteBuffer byteBuffer = (ByteBuffer) this.mEncoder.get();
        byteBuffer.clear();
        byteBuffer.rewind();
        Bitmap toBitmap = frameImage2D.toBitmap();
        int[] iArr = new int[(toBitmap.getWidth() * toBitmap.getHeight())];
        toBitmap.getPixels(iArr, 0, toBitmap.getWidth(), 0, 0, toBitmap.getWidth(), toBitmap.getHeight());
        byte[] bArr = new byte[((iArr.length * 3) / 2)];
        encodeYUV420SP(bArr, iArr, toBitmap.getWidth(), toBitmap.getHeight());
        byteBuffer.put(bArr);
        long j2 = this.mEncodedFrameTimestampNs;
        bufferInfo.presentationTimeUs = j2 / 1000;
        bufferInfo.size = bArr.length;
        bufferInfo.offset = 0;
        this.mEncodedFrameTimestampNs = j2 + j;
        this.mEncoder.onNewFrameAvailable(bufferInfo);
    }

    private static void encodeYUV420SP(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i2) {
            int i7 = i6;
            i6 = i5;
            i5 = i3;
            i3 = 0;
            while (i3 < i) {
                int i8 = iArr[i6];
                int i9 = (i8 >> 16) & Illuminant.kOther;
                int i10 = (i8 >> 8) & Illuminant.kOther;
                int i11 = i8 & Illuminant.kOther;
                int i12 = (((((i9 * -38) - (i10 * 74)) + (i11 * 112)) + 128) >> 8) + 128;
                int i13 = (((((i9 * 112) - (i10 * 94)) - (i11 * 18)) + 128) >> 8) + 128;
                i8 = i7 + 1;
                bArr[i7] = (byte) ((((((i9 * 66) + (i10 * ScriptIntrinsicBLAS.RsBlas_ctrmm)) + (i11 * 25)) + 128) >> 8) + 16);
                if (i4 % 2 == 0 && i6 % 2 == 0) {
                    i7 = i5 + 1;
                    bArr[i5] = (byte) i12;
                    i5 = i7 + 1;
                    bArr[i7] = (byte) i13;
                }
                i6++;
                i3++;
                i7 = i8;
            }
            i4++;
            i3 = i5;
            i5 = i6;
            i6 = i7;
        }
    }

    public long getDurationMs() {
        return this.mEncodedFrameTimestampNs / 1000000;
    }

    public void initialize(String str, int i, int i2) {
        boolean z;
        boolean z2 = true;
        jri.m13152b((Object) str);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        this.mOutputFile = str;
        this.mMediaMuxer = createMediaMuxer(this.mOutputFile);
        this.mEncoder = CPUVideoEncoder.newInstance();
        this.mEncoder.open(this.mMediaMuxer, createMediaFormat(i, i2));
        this.mEncodedFrameTimestampNs = 0;
    }

    private static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
