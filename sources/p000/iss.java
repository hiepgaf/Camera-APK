package p000;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: iss */
public final class iss extends FilterInputStream {
    /* renamed from: a */
    public int f7391a = 0;
    /* renamed from: b */
    public final ByteBuffer f7392b = ByteBuffer.wrap(this.f7393c);
    /* renamed from: c */
    private final byte[] f7393c = new byte[8];

    protected iss(InputStream inputStream) {
        super(inputStream);
    }

    public final int read() {
        int i;
        int read = this.in.read();
        int i2 = this.f7391a;
        if (read >= 0) {
            i = 1;
        } else {
            i = 0;
        }
        this.f7391a = i + i2;
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        this.f7391a += Math.max(read, 0);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        this.f7391a += Math.max(read, 0);
        return read;
    }

    /* renamed from: a */
    public final int m4144a() {
        m4146a(this.f7393c, 4);
        this.f7392b.rewind();
        return this.f7392b.getInt();
    }

    /* renamed from: a */
    public final void m4146a(byte[] bArr, int i) {
        if (read(bArr, 0, i) != i) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final short m4147b() {
        m4146a(this.f7393c, 2);
        this.f7392b.rewind();
        return this.f7392b.getShort();
    }

    /* renamed from: c */
    public final long m4148c() {
        return ((long) m4144a()) & 4294967295L;
    }

    /* renamed from: a */
    public final void m4145a(ByteOrder byteOrder) {
        this.f7392b.order(byteOrder);
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.f7391a = (int) (((long) this.f7391a) + skip);
        return skip;
    }
}
