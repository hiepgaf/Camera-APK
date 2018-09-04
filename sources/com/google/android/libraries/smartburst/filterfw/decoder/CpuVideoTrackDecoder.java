package com.google.android.libraries.smartburst.filterfw.decoder;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.SparseIntArray;
import com.google.android.libraries.smartburst.filterfw.ColorSpace;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.PixelUtils;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;
import p000.kqg;

@TargetApi(16)
/* compiled from: PG */
public class CpuVideoTrackDecoder extends VideoTrackDecoder {
    public boolean mCurrentIsKeyFrame;
    public long mCurrentPresentationTimeUs;
    public ByteBuffer mDecodedBuffer;
    public FrameConverter mFrameConverter;
    public final int mHeight;
    public ByteBuffer mRgbaBuffer;
    public final int mWidth;

    /* compiled from: PG */
    class FrameConverter {
        public static final String CROP_BOTTOM = "crop-bottom";
        public static final String CROP_LEFT = "crop-left";
        public static final String CROP_RIGHT = "crop-right";
        public static final String CROP_TOP = "crop-top";
        public static final String STRIDE = "stride";
        public final ByteBuffer mBuffer;
        public final int mColorFormat;
        public final int mCropBottom;
        public final int mCropLeft;
        public final int mCropRight;
        public final int mCropTop;
        public final int mHeight;
        public final int mStride;
        public final int mWidth;

        public FrameConverter(MediaFormat mediaFormat) {
            int integer;
            int i = 0;
            this.mColorFormat = mediaFormat.getInteger("color-format");
            this.mWidth = mediaFormat.getInteger("width");
            this.mHeight = mediaFormat.getInteger("height");
            if (mediaFormat.containsKey(CROP_LEFT)) {
                integer = mediaFormat.getInteger(CROP_LEFT);
            } else {
                integer = 0;
            }
            this.mCropLeft = integer;
            if (mediaFormat.containsKey(CROP_RIGHT)) {
                integer = mediaFormat.getInteger(CROP_RIGHT);
            } else {
                integer = this.mWidth - 1;
            }
            this.mCropRight = integer;
            if (mediaFormat.containsKey(CROP_TOP)) {
                integer = mediaFormat.getInteger(CROP_TOP);
            } else {
                integer = 0;
            }
            this.mCropTop = integer;
            if (mediaFormat.containsKey(CROP_BOTTOM)) {
                integer = mediaFormat.getInteger(CROP_BOTTOM);
            } else {
                integer = this.mHeight - 1;
            }
            this.mCropBottom = integer;
            if (mediaFormat.containsKey(STRIDE)) {
                i = mediaFormat.getInteger(STRIDE);
            }
            this.mStride = i;
            this.mBuffer = ByteBuffer.allocateDirect((this.mWidth * this.mHeight) << 2);
        }

        private void convertImage(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            int i = this.mColorFormat;
            switch (i) {
                case 16:
                    i = this.mStride;
                    if (i == 0) {
                        i = this.mWidth << 2;
                    }
                    ColorSpace.convertArgb8888ToRgba8888(byteBuffer, this.mBuffer, this.mWidth, this.mHeight, i);
                    break;
                case 19:
                    i = this.mStride;
                    if (i == 0) {
                        i = this.mWidth;
                    }
                    ColorSpace.convertYuv420pToRgba8888(byteBuffer, this.mBuffer, this.mWidth, this.mHeight, i);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder(38);
                    stringBuilder.append("Unsupported color format: ");
                    stringBuilder.append(i);
                    stringBuilder.append("!");
                    throw new RuntimeException(stringBuilder.toString());
            }
            ColorSpace.cropRgbaImage(this.mBuffer, byteBuffer2, this.mWidth, this.mHeight, this.mCropLeft, this.mCropTop, this.mCropRight, this.mCropBottom);
        }
    }

    protected CpuVideoTrackDecoder(int i, MediaFormat mediaFormat, Listener listener) {
        super(i, mediaFormat, listener);
        this.mWidth = mediaFormat.getInteger("width");
        this.mHeight = mediaFormat.getInteger("height");
    }

    private void convertCurrentFrame() {
        if (this.mRgbaBuffer == null) {
            this.mRgbaBuffer = ByteBuffer.allocateDirect((this.mWidth * this.mHeight) << 2);
        }
        if (this.mFrameConverter == null) {
            this.mFrameConverter = new FrameConverter(getMediaCodec().getOutputFormat());
        }
        this.mRgbaBuffer.rewind();
        this.mFrameConverter.convertImage(this.mDecodedBuffer, this.mRgbaBuffer);
    }

    protected void copyFrameDataTo(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler, int i) {
        boolean z;
        FrameImage2D asFrameImage2D;
        int i2 = this.mWidth;
        int i3 = this.mHeight;
        if (VideoTrackDecoder.needSwapDimension(i)) {
            i2 = this.mHeight;
            i3 = this.mWidth;
        }
        int[] iArr = new int[]{i2, i3};
        int[] scale = scaler.scale(i2, i3);
        if (scale[0] != i2) {
            z = true;
        } else if (scale[1] == i3) {
            z = false;
        } else {
            z = true;
        }
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 8);
        if (z) {
            asFrameImage2D = Frame.create(image2D, iArr).asFrameImage2D();
        } else {
            asFrameImage2D = frameImage2D;
        }
        frameImage2D.resize(scale);
        ByteBuffer lockBytes = asFrameImage2D.lockBytes(2);
        this.mRgbaBuffer.rewind();
        if (i == 0) {
            lockBytes.put(this.mRgbaBuffer);
        } else {
            copyRotate(this.mRgbaBuffer, lockBytes, i);
        }
        asFrameImage2D.unlock();
        if (z) {
            frameImage2D.setBitmap(Bitmap.createScaledBitmap(asFrameImage2D.toBitmap(), scale[0], scale[1], false));
            asFrameImage2D.release();
        }
        frameImage2D.setTimestamp(getTimestampNs());
        if (frameValue != null) {
            frameValue.setValue(new VideoFrameInfo(this.mCurrentIsKeyFrame));
            frameValue.setTimestamp(getTimestampNs());
        }
    }

    private void copyRotate(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        int i2;
        int i3;
        int i4;
        switch (i) {
            case 0:
                i2 = this.mWidth;
                i3 = 0;
                i4 = 1;
                break;
            case 90:
                i4 = this.mHeight;
                i3 = i4 - 1;
                i2 = -1;
                break;
            case MediaDecoder.ROTATE_180 /*180*/:
                int i5 = this.mWidth;
                i3 = (this.mHeight * i5) - 1;
                i2 = -i5;
                i4 = -1;
                break;
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                int i6 = this.mWidth;
                int i7 = this.mHeight;
                i3 = (i6 - 1) * i7;
                i4 = -i7;
                i2 = 1;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unsupported rotation ");
                stringBuilder.append(i);
                stringBuilder.append("!");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        PixelUtils.copyPixels(byteBuffer, byteBuffer2, this.mWidth, this.mHeight, i3, i4, i2);
    }

    private static MediaCodec findDecoderCodec(MediaFormat mediaFormat, int[] iArr) {
        TreeMap treeMap = new TreeMap();
        SparseIntArray intArrayToPriorityMap = intArrayToPriorityMap(iArr);
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String string = mediaFormat.getString("mime");
                if (new HashSet(Arrays.asList(codecInfoAt.getSupportedTypes())).contains(string)) {
                    for (int i2 : codecInfoAt.getCapabilitiesForType(string).colorFormats) {
                        if (intArrayToPriorityMap.indexOfKey(i2) >= 0) {
                            treeMap.put(Integer.valueOf(intArrayToPriorityMap.get(i2)), codecInfoAt.getName());
                        }
                    }
                }
            }
        }
        if (treeMap.isEmpty()) {
            return null;
        }
        MediaCodec createByCodecName;
        try {
            createByCodecName = MediaCodec.createByCodecName((String) treeMap.firstEntry().getValue());
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
            createByCodecName = null;
        }
        return createByCodecName;
    }

    public long getTimestampNs() {
        return this.mCurrentPresentationTimeUs * 1000;
    }

    protected MediaCodec initMediaCodec(MediaFormat mediaFormat) {
        MediaCodec findDecoderCodec = findDecoderCodec(mediaFormat, new int[]{16, 19});
        if (findDecoderCodec == null) {
            String valueOf = String.valueOf(mediaFormat);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
            stringBuilder.append("Could not find a suitable decoder for format: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
        findDecoderCodec.configure(mediaFormat, null, null, 0);
        return findDecoderCodec;
    }

    private static SparseIntArray intArrayToPriorityMap(int[] iArr) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i = 0; i < iArr.length; i++) {
            sparseIntArray.append(iArr[i], i);
        }
        return sparseIntArray;
    }

    protected boolean onDataAvailable(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, int i, BufferInfo bufferInfo, boolean z) {
        this.mCurrentPresentationTimeUs = bufferInfo.presentationTimeUs;
        this.mCurrentIsKeyFrame = z;
        this.mDecodedBuffer = byteBufferArr[i];
        convertCurrentFrame();
        markFrameAvailable();
        notifyListener();
        waitForFrameGrabs();
        mediaCodec.releaseOutputBuffer(i, false);
        return false;
    }
}
