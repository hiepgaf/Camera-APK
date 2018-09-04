package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: kis */
public final class kis extends FilterInputStream {
    /* renamed from: a */
    private long f8317a;
    /* renamed from: b */
    private long f8318b = -1;

    public kis(InputStream inputStream, long j) {
        boolean z;
        super(inputStream);
        jri.m13152b((Object) inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "limit must be non-negative");
        this.f8317a = j;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f8317a);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f8318b = this.f8317a;
    }

    public final int read() {
        if (this.f8317a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f8317a--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f8317a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f8317a -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f8318b == -1) {
            throw new IOException("Mark not set");
        } else {
            this.in.reset();
            this.f8317a = this.f8318b;
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f8317a));
        this.f8317a -= skip;
        return skip;
    }
}
