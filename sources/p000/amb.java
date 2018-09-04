package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: amb */
final class amb implements amd {
    /* renamed from: a */
    private final ByteBuffer f9891a;

    amb(ByteBuffer byteBuffer) {
        this.f9891a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public final int mo107a() {
        if (this.f9891a.remaining() <= 0) {
            return -1;
        }
        return this.f9891a.get();
    }

    /* renamed from: b */
    public final int mo110b() {
        return ((mo107a() << 8) & 65280) | (mo107a() & Illuminant.kOther);
    }

    /* renamed from: c */
    public final short mo111c() {
        return mo107a() & Illuminant.kOther;
    }

    /* renamed from: a */
    public final int mo108a(byte[] bArr, int i) {
        int min = Math.min(i, this.f9891a.remaining());
        if (min == 0) {
            return -1;
        }
        this.f9891a.get(bArr, 0, min);
        return min;
    }

    /* renamed from: a */
    public final long mo109a(long j) {
        int min = (int) Math.min((long) this.f9891a.remaining(), j);
        ByteBuffer byteBuffer = this.f9891a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }
}
