package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: iti */
public final class iti extends FilterOutputStream {
    /* renamed from: a */
    public final ByteBuffer f7460a = ByteBuffer.allocate(4);

    public iti(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    /* renamed from: a */
    public final iti m4206a(int i) {
        this.f7460a.rewind();
        this.f7460a.putInt(i);
        this.out.write(this.f7460a.array());
        return this;
    }

    /* renamed from: a */
    public final iti m4207a(short s) {
        this.f7460a.rewind();
        this.f7460a.putShort(s);
        this.out.write(this.f7460a.array(), 0, 2);
        return this;
    }
}
