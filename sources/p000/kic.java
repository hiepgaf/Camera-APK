package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: kic */
abstract class kic extends kig {
    /* renamed from: a */
    private final ByteBuffer f19214a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    kic() {
    }

    /* renamed from: b */
    protected abstract void mo3247b(byte b);

    /* renamed from: a */
    public final kig mo2172a(byte b) {
        mo3247b(b);
        return this;
    }

    /* renamed from: a */
    public final kig mo2173a(char c) {
        this.f19214a.putChar(c);
        return m13549b();
    }

    /* renamed from: b */
    private final kig m13549b() {
        try {
            mo3246a(this.f19214a.array());
            return this;
        } finally {
            this.f19214a.clear();
        }
    }

    /* renamed from: a */
    protected void mo3246a(byte[] bArr) {
        for (int i = 0; i < 2; i++) {
            mo3247b(bArr[i]);
        }
    }
}
