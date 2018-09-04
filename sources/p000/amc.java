package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: amc */
final class amc {
    /* renamed from: a */
    public final ByteBuffer f521a;

    amc(byte[] bArr, int i) {
        this.f521a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* renamed from: a */
    final short m332a(int i) {
        return m331a(i, 2) ? this.f521a.getShort(i) : (short) -1;
    }

    /* renamed from: b */
    final int m333b(int i) {
        return m331a(i, 4) ? this.f521a.getInt(i) : -1;
    }

    /* renamed from: a */
    private final boolean m331a(int i, int i2) {
        return this.f521a.remaining() - i >= i2;
    }
}
