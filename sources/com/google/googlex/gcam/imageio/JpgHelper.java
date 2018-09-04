package com.google.googlex.gcam.imageio;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.SWIGTYPE_p_p_unsigned_char;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import com.google.googlex.gcam.YuvReadView;
import java.nio.ByteBuffer;
import p000.kau;
import p000.kbg;

/* compiled from: PG */
public final class JpgHelper {
    private JpgHelper() {
    }

    private static kbg copyToByteArrayAndDestroyNativeState(boolean z, SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, long[] jArr) {
        if (z) {
            int i = (int) jArr[0];
            SWIGTYPE_p_unsigned_char uint8_p_p_value = GcamModule.uint8_p_p_value(sWIGTYPE_p_p_unsigned_char);
            ByteBuffer byteBufferViewOfNativePointer = BufferUtils.byteBufferViewOfNativePointer(uint8_p_p_value, i);
            Object obj = new byte[i];
            byteBufferViewOfNativePointer.get(obj);
            GcamModule.free_uint8_p(uint8_p_p_value);
            GcamModule.delete_uint8_p_p(sWIGTYPE_p_p_unsigned_char);
            return kbg.m4745c(obj);
        }
        GcamModule.delete_uint8_p_p(sWIGTYPE_p_p_unsigned_char);
        return kau.f19138a;
    }

    public static kbg encodeToJpegAsByteArray(InterleavedReadViewU8 interleavedReadViewU8) {
        SWIGTYPE_p_p_unsigned_char new_uint8_p_p = GcamModule.new_uint8_p_p();
        long[] jArr = new long[]{0};
        return copyToByteArrayAndDestroyNativeState(GcamModule.WriteJpgToMemory(new_uint8_p_p, jArr, interleavedReadViewU8), new_uint8_p_p, jArr);
    }

    public static kbg encodeToJpegAsByteArray(InterleavedReadViewU8 interleavedReadViewU8, int i) {
        SWIGTYPE_p_p_unsigned_char new_uint8_p_p = GcamModule.new_uint8_p_p();
        long[] jArr = new long[]{0};
        return copyToByteArrayAndDestroyNativeState(GcamModule.WriteJpgToMemory(new_uint8_p_p, jArr, interleavedReadViewU8, i), new_uint8_p_p, jArr);
    }

    public static kbg encodeToJpegAsByteArray(InterleavedReadViewU8 interleavedReadViewU8, int i, ExifMetadata exifMetadata) {
        SWIGTYPE_p_p_unsigned_char new_uint8_p_p = GcamModule.new_uint8_p_p();
        long[] jArr = new long[]{0};
        return copyToByteArrayAndDestroyNativeState(GcamModule.WriteJpgToMemory(new_uint8_p_p, jArr, interleavedReadViewU8, i, exifMetadata), new_uint8_p_p, jArr);
    }

    public static kbg encodeToJpegAsByteArray(YuvReadView yuvReadView) {
        SWIGTYPE_p_p_unsigned_char new_uint8_p_p = GcamModule.new_uint8_p_p();
        long[] jArr = new long[]{0};
        return copyToByteArrayAndDestroyNativeState(GcamModule.WriteJpgToMemory(new_uint8_p_p, jArr, yuvReadView), new_uint8_p_p, jArr);
    }

    public static kbg encodeToJpegAsByteArray(YuvReadView yuvReadView, int i) {
        SWIGTYPE_p_p_unsigned_char new_uint8_p_p = GcamModule.new_uint8_p_p();
        long[] jArr = new long[]{0};
        return copyToByteArrayAndDestroyNativeState(GcamModule.WriteJpgToMemory(new_uint8_p_p, jArr, yuvReadView, i), new_uint8_p_p, jArr);
    }

    public static kbg encodeToJpegAsByteArray(YuvReadView yuvReadView, int i, ExifMetadata exifMetadata) {
        SWIGTYPE_p_p_unsigned_char new_uint8_p_p = GcamModule.new_uint8_p_p();
        long[] jArr = new long[]{0};
        return copyToByteArrayAndDestroyNativeState(GcamModule.WriteJpgToMemory(new_uint8_p_p, jArr, yuvReadView, i, exifMetadata), new_uint8_p_p, jArr);
    }
}
