package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: aed */
public final class aed extends FilterInputStream {
    /* renamed from: a */
    private static final byte[] f346a = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
    /* renamed from: b */
    private static final int f347b = 31;
    /* renamed from: c */
    private final byte f348c;
    /* renamed from: d */
    private int f349d;

    public aed(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("Cannot add invalid orientation: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f348c = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i = this.f349d;
        if (i < 2 || i > f347b) {
            i = super.read();
        } else if (this.f349d == f347b) {
            i = this.f348c;
        } else {
            i = f346a[this.f349d - 2] & Illuminant.kOther;
        }
        if (i != -1) {
            this.f349d++;
        }
        return i;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        if (this.f349d > f347b) {
            read = super.read(bArr, i, i2);
        } else if (this.f349d == f347b) {
            bArr[i] = this.f348c;
            read = 1;
        } else {
            read = this.f349d;
            if (read < 2) {
                read = super.read(bArr, i, 2 - read);
            } else {
                read = Math.min(f347b - this.f349d, i2);
                System.arraycopy(f346a, this.f349d - 2, bArr, i, read);
            }
        }
        if (read > 0) {
            this.f349d += read;
        }
        return read;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f349d = (int) (((long) this.f349d) + skip);
        }
        return skip;
    }
}
