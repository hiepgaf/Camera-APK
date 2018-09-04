package p000;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bzw */
public final class bzw implements iqo {
    /* renamed from: a */
    public final ByteBuffer f11554a;
    /* renamed from: b */
    public final int f11555b;
    /* renamed from: c */
    public final int f11556c;
    /* renamed from: d */
    private final SWIGTYPE_p_unsigned_char f11557d;

    public bzw(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, int i, int i2) {
        this.f11557d = sWIGTYPE_p_unsigned_char;
        this.f11555b = i;
        this.f11556c = i2;
        this.f11554a = BufferUtils.byteBufferViewOfNativePointer(sWIGTYPE_p_unsigned_char, (int) j);
    }

    public final void close() {
        GcamModule.delete_uint8_array(this.f11557d);
    }
}
