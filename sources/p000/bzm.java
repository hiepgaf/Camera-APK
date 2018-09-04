package p000;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.EncodedBlobCallback;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bzm */
final class bzm extends EncodedBlobCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f11543a;
    /* renamed from: b */
    private final /* synthetic */ bze f11544b;

    bzm(bze bze, bzx bzx) {
        this.f11544b = bze;
        this.f11543a = bzx;
    }

    public final void Run(int i, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, int i2, int i3) {
        boolean z = true;
        bli.m863a(bze.f1734a, String.format(null, "JPEG ready. shotId = %d, resolution = %d x %d, %d bytes", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j)}));
        if (this.f11544b.f1752s != go.f5588z) {
            z = false;
        }
        jri.m13153b(z);
        jri.m13154b(this.f11543a.mo598d().mo2084b(), (Object) "Received final JPEG but no listener present");
        int i4 = (int) j;
        byte[] bArr = new byte[i4];
        BufferUtils.byteBufferViewOfNativePointer(sWIGTYPE_p_unsigned_char, i4).get(bArr);
        GcamModule.free_uint8_p(sWIGTYPE_p_unsigned_char);
        cad cad = (cad) this.f11543a.mo598d().mo2081a();
        bzn bzn = new bzn(ByteBuffer.wrap(bArr), i2, i3);
        bzo bzo = cad.f1788c.f11679a;
        fwa fwa = cad.f1786a;
        bzo.m1082a(fwa, cad.f1787b, fwa.f4752a.f4451g, bzn.f1756b, bzn.f1757c, bzn.f1755a.duplicate().array());
    }
}
