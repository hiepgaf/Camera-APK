package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ark */
public final class ark extends FilterInputStream {
    /* renamed from: a */
    private final long f910a;
    /* renamed from: b */
    private int f911b;

    public ark(InputStream inputStream, long j) {
        super(inputStream);
        this.f910a = j;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f910a - ((long) this.f911b), (long) this.in.available());
    }

    /* renamed from: a */
    private final int m626a(int i) {
        if (i >= 0) {
            this.f911b += i;
        } else {
            long j = this.f910a;
            int i2 = this.f911b;
            if (j - ((long) i2) > 0) {
                StringBuilder stringBuilder = new StringBuilder(87);
                stringBuilder.append("Failed to read all expected data, expected: ");
                stringBuilder.append(j);
                stringBuilder.append(", but read: ");
                stringBuilder.append(i2);
                throw new IOException(stringBuilder.toString());
            }
        }
        return i;
    }

    public final synchronized int read() {
        int read;
        int i;
        read = super.read();
        if (read >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        m626a(i);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        return m626a(super.read(bArr, i, i2));
    }
}
