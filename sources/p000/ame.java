package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ame */
final class ame implements amd {
    /* renamed from: a */
    private final InputStream f9892a;

    ame(InputStream inputStream) {
        this.f9892a = inputStream;
    }

    /* renamed from: a */
    public final int mo107a() {
        return this.f9892a.read();
    }

    /* renamed from: b */
    public final int mo110b() {
        return ((this.f9892a.read() << 8) & 65280) | (this.f9892a.read() & Illuminant.kOther);
    }

    /* renamed from: c */
    public final short mo111c() {
        return this.f9892a.read() & Illuminant.kOther;
    }

    /* renamed from: a */
    public final int mo108a(byte[] bArr, int i) {
        int i2 = i;
        while (i2 > 0) {
            int read = this.f9892a.read(bArr, i - i2, i2);
            if (read == -1) {
                break;
            }
            i2 -= read;
        }
        return i - i2;
    }

    /* renamed from: a */
    public final long mo109a(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.f9892a.skip(j2);
            if (skip <= 0) {
                if (this.f9892a.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= skip;
            }
        }
        return j - j2;
    }
}
