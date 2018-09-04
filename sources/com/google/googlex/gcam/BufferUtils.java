package com.google.googlex.gcam;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.jri;

/* compiled from: PG */
public class BufferUtils {
    private BufferUtils() {
    }

    private static native ByteBuffer byteBufferViewOfNativePointerImpl(long j, int i);

    private static native long getDirectBufferAddressImpl(Buffer buffer);

    private static native long getDirectBufferCapacityImpl(Buffer buffer);

    public static ByteBuffer byteBufferViewOfNativePointer(long j, int i) {
        boolean z;
        boolean z2 = true;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "ptr must not be 0.");
        if (i <= 0) {
            z2 = false;
        }
        jri.m13145a(z2, "capacity must be positive, got: %s", i);
        return byteBufferViewOfNativePointerImpl(j, i).order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer byteBufferViewOfNativePointer(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, int i) {
        jri.m13152b((Object) sWIGTYPE_p_unsigned_char);
        return byteBufferViewOfNativePointer(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), i);
    }

    public static void deleteNativeImage(InterleavedImageU16 interleavedImageU16) {
        jri.m13152b((Object) interleavedImageU16);
        interleavedImageU16.swigCMemOwn = true;
        interleavedImageU16.delete();
    }

    public static void deleteNativeImage(InterleavedImageU8 interleavedImageU8) {
        jri.m13152b((Object) interleavedImageU8);
        interleavedImageU8.swigCMemOwn = true;
        interleavedImageU8.delete();
    }

    public static void deleteNativeImage(YuvImage yuvImage) {
        jri.m13152b((Object) yuvImage);
        yuvImage.swigCMemOwn = true;
        yuvImage.delete();
    }

    public static long getDirectBufferAddress(Buffer buffer) {
        jri.m13152b((Object) buffer);
        return getDirectBufferAddressImpl(buffer);
    }

    public static long getDirectBufferCapacity(Buffer buffer) {
        jri.m13152b((Object) buffer);
        return getDirectBufferCapacityImpl(buffer);
    }

    public static long getNativePointer(ExifMetadata exifMetadata) {
        return ExifMetadata.getCPtr(exifMetadata);
    }

    public static long getNativePointer(FrameMetadata frameMetadata) {
        return FrameMetadata.getCPtr(frameMetadata);
    }

    public static long getNativePointer(InterleavedReadViewU8 interleavedReadViewU8) {
        return InterleavedReadViewU8.getCPtr(interleavedReadViewU8);
    }

    public static long getNativePointer(InterleavedWriteViewU8 interleavedWriteViewU8) {
        return InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8);
    }

    public static long getNativePointer(RawWriteView rawWriteView) {
        return RawWriteView.getCPtr(rawWriteView);
    }

    public static long getNativePointer(StaticMetadata staticMetadata) {
        return StaticMetadata.getCPtr(staticMetadata);
    }

    public static long getNativePointer(YuvReadView yuvReadView) {
        return YuvReadView.getCPtr(yuvReadView);
    }

    public static long getNativePointer(YuvWriteView yuvWriteView) {
        return YuvWriteView.getCPtr(yuvWriteView);
    }

    public static long getSwigPointerAddress(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        return SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char);
    }

    public static long getSwigPointerAddress(SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        return SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short);
    }

    public static SWIGTYPE_p_unsigned_char wrapNativePointerWithSwigUnsignedChar(long j) {
        return new SWIGTYPE_p_unsigned_char(j, false);
    }

    public static SWIGTYPE_p_unsigned_short wrapNativePointerWithSwigUnsignedShort(long j) {
        return new SWIGTYPE_p_unsigned_short(j, false);
    }
}
